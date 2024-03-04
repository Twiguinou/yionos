package yionos.dynamics;

import org.joml.Quaterniond;
import org.joml.Vector3d;
import yionos.detection.Broadphase;
import yionos.detection.CollisionDispatcher;
import yionos.detection.CollisionManifold;
import yionos.dynamics.geometries.InfiniteGeometry;
import yionos.utils.Transform;

import java.util.ArrayList;
import java.util.List;

import static yionos.utils.MathDefinitions.*;

public class PhysicsVerse
{
    private final Broadphase m_broadphase;
    private final CollisionDispatcher m_collisionDispatcher;
    private final Vector3d m_gravity = new Vector3d();
    private final List<DynamicSolidObject> m_dynamicObjects = new ArrayList<>();
    private final List<SolidObject> m_staticObjects = new ArrayList<>();
    private final List<SolidObject> m_infiniteObjects = new ArrayList<>();

    public PhysicsVerse(Broadphase broadphase, CollisionDispatcher collisionDispatcher)
    {
        this.m_broadphase = broadphase;
        this.m_collisionDispatcher = collisionDispatcher;
    }

    private static void updateObjectTensors(SolidObject object)
    {
        if (object instanceof DynamicSolidObject dynamicObject)
        {
            dynamicObject.computeDynamicInertiaTensor();
        }
    }

    private static double computeGeneralizedInverseMass(SolidObject object, Vector3d r, Vector3d n)
    {
        if (object instanceof DynamicSolidObject dynamicObject)
        {
            Vector3d r_c_n = r.cross(n, new Vector3d());
            return dynamicObject.inverseMass() + r_c_n.dot(dynamicObject.dynamicInverseInertiaTensor().transform(r_c_n, new Vector3d()));
        }

        return 0.0;
    }

    private static double computeLagrangeUpdate(double lambda, double c, double w, double compliance, double inv_dt)
    {
        if (w < EPSILON) return 0.0;

        double tildeCompliance = compliance * inv_dt * inv_dt;
        return -(c + tildeCompliance * lambda) / (w + tildeCompliance);
    }

    private static void applyPositionalCorrection(SolidObject object1, SolidObject object2, double deltaLagrange, Vector3d dir, Vector3d r1, Vector3d r2)
    {
        if (Math.abs(deltaLagrange) < EPSILON) return;

        Vector3d p = dir.mul(deltaLagrange, new Vector3d());
        Vector3d v = new Vector3d();
        Quaterniond deltaRotation = new Quaterniond();

        if (object1 instanceof DynamicSolidObject dynamicObject1)
        {
            Transform transform1 = dynamicObject1.worldTransform();

            transform1.position().add(p.mul(dynamicObject1.inverseMass(), v));

            dynamicObject1.dynamicInverseInertiaTensor().transform(r1.cross(p, v)).mul(0.5);
            deltaRotation.x = v.x;
            deltaRotation.y = v.y;
            deltaRotation.z = v.z;
            deltaRotation.mul(transform1.rotation());

            transform1.rotation().add(deltaRotation).normalize();
        }

        if (object2 instanceof DynamicSolidObject dynamicObject2)
        {
            Transform transform2 = dynamicObject2.worldTransform();

            transform2.position().sub(p.mul(dynamicObject2.inverseMass(), v));

            dynamicObject2.dynamicInverseInertiaTensor().transform(r2.cross(p, v)).mul(-0.5);
            deltaRotation.x = v.x;
            deltaRotation.y = v.y;
            deltaRotation.z = v.z;
            deltaRotation.mul(transform2.rotation());

            transform2.rotation().add(deltaRotation).normalize();
        }
    }

    private static double computeKineticFriction(double tangentVelocity, double w, double coefficient, double normalLagrange, double inv_dt)
    {
        double normalImpulse = normalLagrange * inv_dt;
        return Math.min(-coefficient * Math.abs(normalImpulse), tangentVelocity / w);
    }

    private static void computeRestitution(Vector3d normal, double normalVelocity, double preNormalVelocity, double coefficient, double threshold, double inv_dt, Vector3d restitution)
    {
        if (normalVelocity * normalVelocity * inv_dt * inv_dt < threshold)
        {
            coefficient = 0.0;
        }

        normal.mul(-normalVelocity + Math.min(-coefficient * preNormalVelocity, 0.0), restitution);
    }

    public Vector3d gravity()
    {
        return this.m_gravity;
    }

    private void integrateVelocities(double dt)
    {
        Vector3d v = new Vector3d();
        Quaterniond q = new Quaterniond();
        for (DynamicSolidObject dynamicObject : this.m_dynamicObjects)
        {
            Transform transform = dynamicObject.worldTransform();
            Vector3d linearVelocity = dynamicObject.linearVelocity();
            Vector3d angularVelocity = dynamicObject.angularVelocity();


            dynamicObject.previousWorldTransform().set(transform);
            dynamicObject.computeDynamicInertiaTensor();

            linearVelocity.add(dynamicObject.appliedForce().mul(dynamicObject.inverseMass() * dt, v));
            transform.position().add(linearVelocity.mul(dt, v));

            dynamicObject.dynamicInertiaTensor().transform(angularVelocity, v);
            angularVelocity.cross(v, v);
            dynamicObject.appliedTorque().sub(v, v);
            angularVelocity.add(dynamicObject.dynamicInverseInertiaTensor().transform(v).mul(dt));

            q.set(angularVelocity.x, angularVelocity.y, angularVelocity.z, 0.0);
            q.mul(transform.rotation()).mul(dt * 0.5);
            transform.rotation().add(q).normalize();
        }
    }

    private void computeVelocities(double inv_dt)
    {
        double inv_dtx2 = inv_dt * 2.0;
        Quaterniond q = new Quaterniond();
        for (DynamicSolidObject dynamicObject : this.m_dynamicObjects)
        {
            Transform transform = dynamicObject.worldTransform();
            Transform previousTransform = dynamicObject.previousWorldTransform();

            dynamicObject.previousLinearVelocity().set(dynamicObject.linearVelocity());
            dynamicObject.previousAngularVelocity().set(dynamicObject.angularVelocity());

            transform.position().sub(previousTransform.position(), dynamicObject.linearVelocity()).mul(inv_dt);

            Vector3d angularVelocity = dynamicObject.angularVelocity();

            previousTransform.rotation().conjugate(q);
            transform.rotation().mul(q, q);

            angularVelocity.x = q.x * inv_dtx2;
            angularVelocity.y = q.y * inv_dtx2;
            angularVelocity.z = q.z * inv_dtx2;
            if (q.w < 0.0)
            {
                angularVelocity.negate();
            }
        }
    }

    private void solvePositions(List<CollisionManifold> manifolds, double inv_dt)
    {
        for (CollisionManifold manifold : manifolds)
        {
            for (int i = 0; i < manifold.contactCount(); i++)
            {
                CollisionManifold.ContactInfo contact = manifold.contact(i);

                Vector3d normal = contact.normalA.rotate(manifold.object1.worldTransform().rotation(), new Vector3d());

                Vector3d r1 = contact.posA.rotate(manifold.object1.worldTransform().rotation(), new Vector3d());
                Vector3d r2 = contact.posB.rotate(manifold.object2.worldTransform().rotation(), new Vector3d());

                // initial non-penetration position constraint
                updateObjectTensors(manifold.object1);
                updateObjectTensors(manifold.object2);

                double w1 = computeGeneralizedInverseMass(manifold.object1, r1, normal);
                double w2 = computeGeneralizedInverseMass(manifold.object2, r2, normal);

                double deltaLagrange = computeLagrangeUpdate(manifold.normalLagrange, contact.penetration, w1 + w2, 0.0, inv_dt);
                manifold.normalLagrange += deltaLagrange;

                applyPositionalCorrection(manifold.object1, manifold.object2, deltaLagrange, normal, r1, r2);

                // additional position constraint for friction
                contact.normalA.rotate(manifold.object1.worldTransform().rotation(), normal);

                contact.posA.rotate(manifold.object1.worldTransform().rotation(), r1);
                contact.posB.rotate(manifold.object2.worldTransform().rotation(), r2);

                Vector3d deltaP1 = new Vector3d();
                if (manifold.object1 instanceof DynamicSolidObject dynamicObject1)
                {
                    dynamicObject1.relativePointVelocity(r1, deltaP1);
                }

                Vector3d deltaP2 = new Vector3d();
                if (manifold.object2 instanceof DynamicSolidObject dynamicObject2)
                {
                    dynamicObject2.relativePointVelocity(r2, deltaP2);
                }

                Vector3d deltaP = deltaP1.sub(deltaP2, new Vector3d());
                Vector3d deltaPTangent = normal.mul(-deltaP.dot(normal), new Vector3d()).add(deltaP);

                double slidingLengthSquared = deltaPTangent.lengthSquared();
                if (slidingLengthSquared < EPSILON)
                {
                    continue;
                }

                double slidingLength = sqrt(slidingLengthSquared);
                if (slidingLength > (manifold.object1.friction() + manifold.object2.friction()) * contact.penetration)
                {
                    continue;
                }

                Vector3d tangent = deltaPTangent.div(slidingLength, new Vector3d());

                updateObjectTensors(manifold.object1);
                updateObjectTensors(manifold.object2);

                w1 = computeGeneralizedInverseMass(manifold.object1, r1, normal);
                w2 = computeGeneralizedInverseMass(manifold.object2, r2, normal);

                deltaLagrange = computeLagrangeUpdate(manifold.tangentLagrange, slidingLength, w1 + w2, 0.0, inv_dt);
                manifold.tangentLagrange += deltaLagrange;

                applyPositionalCorrection(manifold.object1, manifold.object2, deltaLagrange, tangent, r1, r2);
            }
        }
    }

    private void solveVelocities(List<CollisionManifold> manifolds, double inv_dt)
    {
        for (CollisionManifold manifold : manifolds)
        {
            if (manifold.normalLagrange < EPSILON)
            {
                continue;
            }

            for (int i = 0; i < manifold.contactCount(); i++)
            {
                CollisionManifold.ContactInfo contact = manifold.contact(i);

                Vector3d normal = contact.normalA.rotate(manifold.object1.worldTransform().rotation(), new Vector3d());

                Vector3d r1 = contact.posA.rotate(manifold.object1.worldTransform().rotation(), new Vector3d());
                Vector3d r2 = contact.posB.rotate(manifold.object2.worldTransform().rotation(), new Vector3d());

                Vector3d previousContactVelocity1 = new Vector3d(), contactVelocity1 = new Vector3d();
                if (manifold.object1 instanceof DynamicSolidObject dynamicObject1)
                {
                    dynamicObject1.relativePointPreviousVelocity(r1, previousContactVelocity1);
                    dynamicObject1.relativePointVelocity(r1, contactVelocity1);
                }

                Vector3d previousContactVelocity2 = new Vector3d(), contactVelocity2 = new Vector3d();
                if (manifold.object2 instanceof DynamicSolidObject dynamicObject2)
                {
                    dynamicObject2.relativePointPreviousVelocity(r2, previousContactVelocity2);
                    dynamicObject2.relativePointVelocity(r2, contactVelocity2);
                }

                Vector3d previousRelativeVelocity = previousContactVelocity1.sub(previousContactVelocity2, new Vector3d());
                Vector3d relativeVelocity = contactVelocity1.sub(contactVelocity2, new Vector3d());
                double previousNormalVelocity = normal.dot(previousRelativeVelocity);
                double normalVelocity = normal.dot(relativeVelocity);

                Vector3d tangentVelocity = normal.mul(-normalVelocity, new Vector3d()).add(relativeVelocity);
                double tangentSpeedSquared = tangentVelocity.lengthSquared();

                updateObjectTensors(manifold.object1);
                updateObjectTensors(manifold.object2);

                Vector3d p = new Vector3d();

                Vector3d restitution = new Vector3d();
                computeRestitution(normal, normalVelocity, previousNormalVelocity, manifold.object1.restitution() * manifold.object2.restitution(), this.m_gravity.lengthSquared(), inv_dt, restitution);
                if (restitution.lengthSquared() > EPSILON)
                {
                    double w1 = computeGeneralizedInverseMass(manifold.object1, r1, normal);
                    double w2 = computeGeneralizedInverseMass(manifold.object2, r2, normal);
                    p.add(restitution.div(w1 + w2));
                }

                if (tangentSpeedSquared > EPSILON)
                {
                    double tangentSpeed = sqrt(tangentSpeedSquared);
                    Vector3d tangent = tangentVelocity.div(tangentSpeed, new Vector3d());
                    double w1 = computeGeneralizedInverseMass(manifold.object1, r1, tangent);
                    double w2 = computeGeneralizedInverseMass(manifold.object2, r2, tangent);

                    double frictionImpulse = computeKineticFriction(tangentSpeed, w1 + w2, manifold.object1.friction() + manifold.object2.friction(), manifold.normalLagrange, inv_dt);
                    p.add(tangent.mul(frictionImpulse));
                }

                if (manifold.object1 instanceof DynamicSolidObject dynamicObject1)
                {
                    dynamicObject1.applyImpulse(p, r1);
                }

                if (manifold.object2 instanceof DynamicSolidObject dynamicObject2)
                {
                    dynamicObject2.applyImpulse(p.negate(), r2);
                }
            }
        }
    }

    public Broadphase broadphase()
    {
        return this.m_broadphase;
    }

    public CollisionDispatcher collisionDispatcher()
    {
        return this.m_collisionDispatcher;
    }

    private void queryCollisionManifolds(List<CollisionManifold> manifolds)
    {
        for (Broadphase.Pair pair : this.m_broadphase.pairStorage())
        {
            SolidObject A = (SolidObject) pair.first().data(), B = (SolidObject) pair.second().data();

            if (A instanceof DynamicSolidObject || B instanceof DynamicSolidObject)
            {
                CollisionManifold manifold = new CollisionManifold();
                Transform relativeTransformB = new Transform();
                Transform.computeRelative(A.worldTransform(), B.worldTransform(), relativeTransformB);

                this.m_collisionDispatcher.execute(A.geometry(), B.geometry(), relativeTransformB, manifold);
                if (manifold.contactCount() > 0)
                {
                    manifold.object1 = A;
                    manifold.object2 = B;
                    manifolds.add(manifold);
                }
            }
        }
    }

    public void update(double epsilon, int substeps)
    {
        for (DynamicSolidObject dynamicObject : this.m_dynamicObjects)
        {
            Vector3d appliedForce = dynamicObject.appliedForce();
            appliedForce.x += this.m_gravity.x * dynamicObject.mass();
            appliedForce.y += this.m_gravity.y * dynamicObject.mass();
            appliedForce.z += this.m_gravity.z * dynamicObject.mass();

            Vector3d min = new Vector3d(), max = new Vector3d();
            dynamicObject.computeVolume(min, max);
            fattenVolume(min, max, 0.1);

            this.m_broadphase.updateBounds(dynamicObject.broadphaseHandle, min, max);
        }

        List<CollisionManifold> manifolds = new ArrayList<>();

        this.m_broadphase.update();

        double dt = epsilon / (double) substeps, inv_dt = 1.0 / dt;
        for (int i = 0; i < substeps; i++)
        {
            this.integrateVelocities(dt);

            manifolds.clear();
            this.queryCollisionManifolds(manifolds);

            this.solvePositions(manifolds, inv_dt);

            if (!manifolds.isEmpty())
            {
                this.computeVelocities(inv_dt);
            }

            this.solveVelocities(manifolds, inv_dt);
        }

        for (DynamicSolidObject dynamicObject : this.m_dynamicObjects)
        {
            dynamicObject.appliedForce().zero();
            dynamicObject.appliedTorque().zero();
        }
    }

    public List<DynamicSolidObject> dynamicObjects()
    {
        return this.m_dynamicObjects;
    }

    public List<SolidObject> staticObjects()
    {
        return this.m_staticObjects;
    }

    public List<SolidObject> infiniteObjects()
    {
        return this.m_infiniteObjects;
    }

    public void addSolidObject(SolidObject object)
    {
        assert object.geometry() != null;

        if (object instanceof DynamicSolidObject dynamicObject)
        {
            dynamicObject.worldId = this.m_dynamicObjects.size();
            this.m_dynamicObjects.add(dynamicObject);

            Vector3d min = new Vector3d(), max = new Vector3d();
            dynamicObject.computeVolume(min, max);
            fattenVolume(min, max, 0.1);

            dynamicObject.broadphaseHandle = this.m_broadphase.createHandle(min, max, dynamicObject);

            return;
        }
        else if (object.geometry() instanceof InfiniteGeometry)
        {
            object.worldId = this.m_infiniteObjects.size();
            this.m_infiniteObjects.add(object);

            object.broadphaseHandle = null;

            return;
        }

        object.worldId = this.m_staticObjects.size();
        this.m_staticObjects.add(object);

        Vector3d min = new Vector3d(), max = new Vector3d();
        object.computeVolume(min, max);
        fattenVolume(min, max, 0.1);

        object.broadphaseHandle = this.m_broadphase.createHandle(min, max, object);
    }

    public void removeSolidObject(SolidObject object)
    {
        if (object instanceof DynamicSolidObject dynamicObject)
        {
            assert (dynamicObject.worldId < this.m_dynamicObjects.size()) && (dynamicObject.worldId >= 0) && (dynamicObject.broadphaseHandle != null);

            if (this.m_dynamicObjects.size() > 1)
            {
                DynamicSolidObject newObject = this.m_dynamicObjects.removeLast();

                newObject.worldId = dynamicObject.worldId;
                this.m_dynamicObjects.set(dynamicObject.worldId, newObject);
            }
            else
            {
                this.m_dynamicObjects.removeLast();
            }

            dynamicObject.worldId = -1;
            this.m_broadphase.deleteHandle(dynamicObject.broadphaseHandle);
            dynamicObject.broadphaseHandle = null;

            return;
        }
        else if (object.geometry() instanceof InfiniteGeometry)
        {
            assert (object.worldId < this.m_infiniteObjects.size()) && (object.worldId >= 0);

            if (this.m_infiniteObjects.size() > 1)
            {
                SolidObject newObject = this.m_infiniteObjects.removeLast();

                newObject.worldId = object.worldId;
                this.m_infiniteObjects.set(object.worldId, newObject);
            }
            else
            {
                this.m_infiniteObjects.removeLast();
            }

            object.worldId = -1;

            return;
        }

        assert (object.worldId < this.m_staticObjects.size()) && (object.worldId >= 0) && (object.broadphaseHandle != null);

        if (this.m_staticObjects.size() > 1)
        {
            SolidObject newObject = this.m_staticObjects.removeLast();

            newObject.worldId = object.worldId;
            this.m_staticObjects.set(object.worldId, newObject);
        }
        else
        {
            this.m_staticObjects.removeLast();
        }

        object.worldId = -1;
        this.m_broadphase.deleteHandle(object.broadphaseHandle);
        object.broadphaseHandle = null;
    }

    public void clearScene()
    {
        this.m_broadphase.removeHandles();

        for (DynamicSolidObject dynamicObject : this.m_dynamicObjects)
        {
            dynamicObject.broadphaseHandle = null;
            dynamicObject.worldId = -1;
        }

        for (SolidObject object : this.m_staticObjects)
        {
            object.broadphaseHandle = null;
            object.worldId = -1;
        }

        for (SolidObject object : this.m_infiniteObjects)
        {
            object.worldId = -1;
        }

        this.m_dynamicObjects.clear();
        this.m_infiniteObjects.clear();
        this.m_staticObjects.clear();
    }
}
