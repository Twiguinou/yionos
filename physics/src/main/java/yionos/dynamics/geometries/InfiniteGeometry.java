package yionos.dynamics.geometries;

import org.joml.Matrix3d;
import org.joml.Quaterniond;
import org.joml.Vector3d;

public sealed interface InfiniteGeometry extends RigidGeometry permits PlaneGeometry
{
    @Override
    default void computeBoundingBox(Quaterniond rotation, Vector3d min, Vector3d max)
    {
        min.set(Double.MIN_VALUE);
        max.set(Double.MAX_VALUE);
    }

    @Override
    default void computeInertiaTensor(double mass, Matrix3d inertiaTensor)
    {
        throw new UnsupportedOperationException();
    }
}
