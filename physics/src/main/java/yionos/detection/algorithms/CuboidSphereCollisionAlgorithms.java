package yionos.detection.algorithms;

import org.joml.Vector3d;
import yionos.detection.CollisionManifold;
import yionos.dynamics.geometries.CuboidGeometry;
import yionos.dynamics.geometries.SphereGeometry;
import yionos.utils.Transform;

import static yionos.utils.MathDefinitions.*;

public class CuboidSphereCollisionAlgorithms
{
    public CuboidSphereCollisionAlgorithms() {}

    public static boolean test(CuboidGeometry cuboid, SphereGeometry sphere, Vector3d relativePosB)
    {
        Vector3d projected = cuboid.halfExtents().negate(new Vector3d())
                .max(relativePosB)
                .min(cuboid.halfExtents());

        return sphere.radiusSquared() - projected.distanceSquared(relativePosB) > EPSILON;
    }

    public static void manifold(CuboidGeometry cuboid, SphereGeometry sphere, Transform relativeTransformB, CollisionManifold manifold)
    {
        Vector3d projected = cuboid.halfExtents().negate(new Vector3d())
                .max(relativeTransformB.position())
                .min(cuboid.halfExtents());

        double distanceSquared = projected.lengthSquared();

        if (distanceSquared < EPSILON)
        {
            CollisionManifold.ContactInfo contact = manifold.push();

            contact.penetration = cuboid.halfExtents().get(cuboid.halfExtents().minComponent());

            return;
        }
    }
}
