package yionos.dynamics.geometries;

import org.joml.Matrix3d;
import org.joml.Quaterniond;
import org.joml.Vector3d;

/**
 * To perform faster checks when it comes to geometry matching, every geometry has to give out an index that is unique.
 * Here is a table that can be used when adding or modifying indices:
 * - 0: Sphere
 * - 1: Cuboid
 * - 2: Plane
 */
public sealed interface RigidGeometry permits InfiniteGeometry, CuboidGeometry, SphereGeometry
{
    void computeBoundingBox(Quaterniond rotation, Vector3d min, Vector3d max);

    void computeInertiaTensor(double mass, Matrix3d inertiaTensor);

    int dispatcherIndex();
}
