package yionos.dynamics;

import org.joml.Vector3d;
import yionos.detection.Broadphase;
import yionos.dynamics.geometries.RigidGeometry;
import yionos.utils.Transform;

import javax.annotation.Nullable;

public class SolidObject
{
    private final Transform m_transform = new Transform();
    private @Nullable RigidGeometry m_geometry = null;
    public @Nullable Broadphase.Handle broadphaseHandle = null;
    public int worldId;
    private double m_friction, m_restitution;

    public SolidObject() {}

    public double friction()
    {
        return this.m_friction;
    }

    public void friction(double value)
    {
        this.m_friction = value;
    }

    public double restitution()
    {
        return this.m_restitution;
    }

    public void restitution(double value)
    {
        this.m_restitution = value;
    }

    public @Nullable RigidGeometry geometry()
    {
        return this.m_geometry;
    }

    public void setGeometry(@Nullable RigidGeometry geometry)
    {
        this.m_geometry = geometry;
    }

    public Transform worldTransform()
    {
        return this.m_transform;
    }

    public void computeVolume(Vector3d min, Vector3d max)
    {
        if (this.m_geometry == null) return;

        this.m_geometry.computeBoundingBox(this.m_transform.rotation(), min, max);
        min.add(this.m_transform.position());
        max.add(this.m_transform.position());
    }
}
