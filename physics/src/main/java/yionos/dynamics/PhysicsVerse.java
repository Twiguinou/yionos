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

    private static double computeGeneralizedInverseMass(SolidObject object, Vector3d point, Vector3d dir)
    {
        if (object instanceof DynamicSolidObject dynamicObject)
        {
            Vector3d c = point.cross(dir, new Vector3d());
            return dynamicObject.inverseMass() + c.dot(dynamicObject.dynamicInverseInertiaTensor().transform(c, new Vector3d()));
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

    private static void computeKineticFriction(Vector3d tangentVelocity, double coefficient, double normalLagrange, double inv_dt, Vector3d friction)
    {
        double tangentMagnitude = tangentVelocity.lengthSquared();
        if (tangentMagnitude < 1e-8)
        {
            friction.zero();
        }

        tangentVelocity.mul(-coefficient * Math.abs(normalLagrange) * inv_dt / Math.sqrt(tangentMagnitude), friction);
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

                Transform transform1 = manifold.object1.worldTransform(), transform2 = manifold.object2.worldTransform();

                Vector3d qr1 = new Vector3d(), qr2 = new Vector3d();
                double deltaLagrange, w1, w2;

                qr1.set(contact.pos);
                contact.pos.add(transform1.position(), qr2).sub(transform2.position());

                // initial non-penetration position constraint
                updateObjectTensors(manifold.object1);
                updateObjectTensors(manifold.object2);

                w1 = computeGeneralizedInverseMass(manifold.object1, qr1, contact.normal);
                w2 = computeGeneralizedInverseMass(manifold.object2, qr2, contact.normal);

                deltaLagrange = computeLagrangeUpdate(0.0, contact.penetration, w1 + w2, 0.0, inv_dt);

                applyPositionalCorrection(manifold.object1, manifold.object2, deltaLagrange, contact.normal, qr1, qr2);

                // static friction position constraint
                qr1.set(contact.pos);
                contact.pos.add(transform1.position(), qr2).sub(transform2.position());

                Vector3d v = new Vector3d();

                Vector3d deltaP1 = new Vector3d();
                if (manifold.object1 instanceof DynamicSolidObject dynamicObject1)
                {
                    Transform previousTransform1 = dynamicObject1.previousWorldTransform();
                    transform1.position().sub(previousTransform1.position(), deltaP1).add(qr1).sub(contact.pos.add(transform1.position(), v).sub(previousTransform1.position()));
                }

                Vector3d deltaP2 = new Vector3d();
                if (manifold.object2 instanceof DynamicSolidObject dynamicObject2)
                {
                    Transform previousTransform2 = dynamicObject2.previousWorldTransform();
                    transform2.position().sub(previousTransform2.position(), deltaP2).add(qr2).sub(contact.pos.add(transform1.position(), v).sub(previousTransform2.position()));
                }

                deltaP1.sub(deltaP2, v); // delta p
                v.sub(contact.normal.mul(v.dot(contact.normal), new Vector3d())); // delta p tangent

                double slidingLength = v.length();
                if (slidingLength < EPSILON)
                {
                    continue;
                }

                double staticCoefficient = manifold.object1.friction() * manifold.object2.friction();

                if (slidingLength < staticCoefficient * contact.penetration)
                {
                    v.div(slidingLength); // tangent

                    updateObjectTensors(manifold.object1);
                    updateObjectTensors(manifold.object2);

                    w1 = computeGeneralizedInverseMass(manifold.object1, qr1, v);
                    w2 = computeGeneralizedInverseMass(manifold.object2, qr2, v);

                    deltaLagrange = computeLagrangeUpdate(0.0, slidingLength, w1 + w2, 0.0, inv_dt);

                    applyPositionalCorrection(manifold.object1, manifold.object2, deltaLagrange, v, qr1, qr2);
                }
            }
        }
    }

    private void solveVelocities(List<CollisionManifold> manifolds, double inv_dt)
    {
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
        this.m_collisionDispatcher.allocateManifolds(
                this.m_infiniteObjects.size() * this.m_dynamicObjects.size()
                + this.m_broadphase.pairStorage().pairCount()
        );

        int manifoldIndex = 0;

        for (SolidObject collider : this.m_infiniteObjects)
        {
            for (DynamicSolidObject dynamicObject : this.m_dynamicObjects)
            {
                CollisionManifold manifold = this.m_collisionDispatcher.getManifold(manifoldIndex);
                if (this.m_collisionDispatcher.execute(collider, dynamicObject, manifold))
                {
                    ++manifoldIndex;
                    manifolds.add(manifold);
                }
            }
        }

        for (Broadphase.Pair pair : this.m_broadphase.pairStorage())
        {
            SolidObject object1 = (SolidObject) pair.first().data(), object2 = (SolidObject) pair.second().data();

            if (object1.geometry().dispatcherIndex() > object2.geometry().dispatcherIndex())
            {
                SolidObject t = object1;
                object1 = object2;
                object2 = t;
            }

            CollisionManifold manifold = this.m_collisionDispatcher.getManifold(manifoldIndex);
            if (this.m_collisionDispatcher.execute(object1, object2, manifold))
            {
                ++manifoldIndex;
                manifolds.add(manifold);
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
        }
        else if (object.geometry() instanceof InfiniteGeometry)
        {
            object.worldId = this.m_infiniteObjects.size();
            this.m_infiniteObjects.add(object);

            object.broadphaseHandle = null;
        }
        else
        {
            object.worldId = this.m_staticObjects.size();
            this.m_staticObjects.add(object);

            Vector3d min = new Vector3d(), max = new Vector3d();
            object.computeVolume(min, max);
            fattenVolume(min, max, 0.1);

            object.broadphaseHandle = this.m_broadphase.createHandle(min, max, object);
        }
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
        }
        else
        {
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
