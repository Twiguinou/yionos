package yionos.dynamics;

import org.joml.Matrix3d;
import org.joml.Quaterniond;
import org.joml.Vector3d;

public interface RigidGeometry
{
    void computeBoundingBox(Quaterniond rotation, Vector3d min, Vector3d max);

    void computeInertiaTensor(double mass, Matrix3d inertiaTensor);
}
