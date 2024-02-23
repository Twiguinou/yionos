package yionos.dynamics;

import org.joml.Matrix3d;
import org.joml.Vector3d;
import yionos.dynamics.geometries.InfiniteGeometry;
import yionos.dynamics.geometries.RigidGeometry;
import yionos.utils.Transform;

public class DynamicSolidObject extends SolidObject
{
    private final Vector3d m_linearVelocity = new Vector3d(), m_previousLinearVelocity = new Vector3d();
    private final Vector3d m_angularVelocity = new Vector3d(), m_previousAngularVelocity = new Vector3d();
    private final Vector3d m_appliedForce = new Vector3d();
    private final Vector3d m_appliedTorque = new Vector3d();
    private final Transform m_previousTransform = new Transform();
    private double m_mass, m_inverseMass;
    private final Matrix3d m_inertiaTensor = new Matrix3d(), m_inverseInertiaTensor = new Matrix3d();
    private final Matrix3d m_dynamicInertiaTensor = new Matrix3d(), m_dynamicInverseInertiaTensor = new Matrix3d();

    public DynamicSolidObject(double mass, RigidGeometry geometry)
    {
        this.setMassInternal(mass);
        this.setGeometry(geometry);
    }

    @Override
    public void setGeometry(RigidGeometry geometry)
    {
        if (geometry == null || geometry instanceof InfiniteGeometry)
        {
            throw new IllegalArgumentException("Invalid geometry provided for rigid body.");
        }

        super.setGeometry(geometry);
        this.computeInertiaTensor();
    }

    public double mass()
    {
        return this.m_mass;
    }

    public double inverseMass()
    {
        return this.m_inverseMass;
    }

    public void setMass(double mass)
    {
        this.setMassInternal(mass);
        this.computeInertiaTensor();
    }

    private void setMassInternal(double mass)
    {
        if (mass <= 0.0)
        {
            throw new IllegalArgumentException("Rigid bodies cannot have negative or zero mass.");
        }

        this.m_mass = mass;
        this.m_inverseMass = 1.0 / mass;
    }

    public Vector3d linearVelocity()
    {
        return this.m_linearVelocity;
    }

    public Vector3d previousLinearVelocity()
    {
        return this.m_previousLinearVelocity;
    }

    public Vector3d angularVelocity()
    {
        return this.m_angularVelocity;
    }

    public Vector3d previousAngularVelocity()
    {
        return this.m_previousAngularVelocity;
    }

    public void relativePointVelocity(Vector3d point, Vector3d velocity)
    {
        this.m_angularVelocity.cross(point, velocity).add(this.m_linearVelocity);
    }

    public Transform previousWorldTransform()
    {
        return this.m_previousTransform;
    }

    public Vector3d appliedForce()
    {
        return this.m_appliedForce;
    }

    public Vector3d appliedTorque()
    {
        return this.m_appliedTorque;
    }

    public void applyCentralForce(Vector3d force)
    {
        this.m_appliedForce.add(force);
    }

    public void applyCentralImpulse(Vector3d impulse)
    {
        this.m_linearVelocity.add(impulse.mul(this.m_inverseMass, new Vector3d()));
    }

    public void applyImpulse(Vector3d impulse, Vector3d position)
    {
        Vector3d v = new Vector3d();

        this.m_linearVelocity.add(impulse.mul(this.m_inverseMass, v));
        this.m_angularVelocity.add(this.m_inverseInertiaTensor.transform(position.cross(impulse, v)));
    }

    public Matrix3d inertiaTensor()
    {
        return this.m_inertiaTensor;
    }

    public Matrix3d inverseInertiaTensor()
    {
        return this.m_inverseInertiaTensor;
    }

    public Matrix3d dynamicInertiaTensor()
    {
        return this.m_dynamicInertiaTensor;
    }

    public Matrix3d dynamicInverseInertiaTensor()
    {
        return this.m_dynamicInverseInertiaTensor;
    }

    private void computeInertiaTensor()
    {
        this.geometry().computeInertiaTensor(this.m_mass, this.m_inertiaTensor);
        this.m_inertiaTensor.invert(this.m_inverseInertiaTensor);
    }

    public void computeDynamicInertiaTensor()
    {
        Matrix3d rotationMatrix = new Matrix3d().rotation(this.worldTransform().rotation());
        Matrix3d transposedRotationMatrix = rotationMatrix.transpose(new Matrix3d());

        rotationMatrix.mul(this.m_inertiaTensor, this.m_dynamicInertiaTensor);
        this.m_dynamicInertiaTensor.mul(transposedRotationMatrix);

        rotationMatrix.mul(this.m_inverseInertiaTensor, this.m_dynamicInverseInertiaTensor);
        this.m_dynamicInverseInertiaTensor.mul(transposedRotationMatrix);
    }
}
