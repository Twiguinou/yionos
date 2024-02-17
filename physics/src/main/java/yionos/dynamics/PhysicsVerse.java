package yionos.dynamics;

import org.joml.Quaterniond;
import org.joml.Vector3d;
import yionos.utils.Transform;

import java.util.ArrayList;
import java.util.List;

public class PhysicsVerse
{
    private final Vector3d m_gravity = new Vector3d();
    private final List<DynamicSolidObject> m_dynamicObjects = new ArrayList<>();

    public PhysicsVerse() {}

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

    public void update(double epsilon, int substeps)
    {
        for (DynamicSolidObject dynamicObject : this.m_dynamicObjects)
        {
            Vector3d appliedForce = dynamicObject.appliedForce();
            appliedForce.x += this.m_gravity.x * dynamicObject.mass();
            appliedForce.y += this.m_gravity.y * dynamicObject.mass();
            appliedForce.z += this.m_gravity.z * dynamicObject.mass();
        }

        double dt = epsilon / (double) substeps, inv_dt = 1.0 / dt;
        for (int i = 0; i < substeps; i++)
        {
            this.integrateVelocities(dt);
            this.computeVelocities(inv_dt);
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

    public void addSolidObject(SolidObject object)
    {
        if (object instanceof DynamicSolidObject dynamicObject)
        {
            this.m_dynamicObjects.add(dynamicObject);
        }
    }
}
