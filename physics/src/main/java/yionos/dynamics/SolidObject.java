package yionos.dynamics;

import yionos.utils.Transform;

import javax.annotation.Nullable;

public class SolidObject
{
    private final Transform m_transform = new Transform();
    private @Nullable RigidGeometry m_geometry = null;

    public SolidObject() {}

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
}
