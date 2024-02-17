package yionos.dynamics.geometries;

import org.joml.Matrix3d;
import org.joml.Quaterniond;
import org.joml.Vector3d;
import yionos.dynamics.RigidGeometry;

public class CuboidGeometry implements RigidGeometry
{
    @Override
    public void computeBoundingBox(Quaterniond rotation, Vector3d min, Vector3d max)
    {
    }

    @Override
    public void computeInertiaTensor(double mass, Matrix3d inertiaTensor)
    {
    }
}
