package yionos.detection.algorithms;

import org.joml.Quaterniond;
import org.joml.Vector3d;
import yionos.detection.CollisionManifold;
import yionos.dynamics.geometries.SphereGeometry;
import yionos.utils.Transform;

import static yionos.utils.MathDefinitions.*;

public class SpherePairCollisionAlgorithms
{
    public SpherePairCollisionAlgorithms() {}

    public static boolean test(SphereGeometry sphereA, SphereGeometry sphereB, Vector3d relativePosB)
    {
        double distanceSquared = relativePosB.lengthSquared();
        double radiusSum = sphereA.radius() + sphereB.radius();

        return radiusSum * radiusSum - distanceSquared > EPSILON;
    }

    public static void manifold(SphereGeometry sphereA, SphereGeometry sphereB, Transform relativePosB, CollisionManifold manifold)
    {
        double distanceSquared = relativePosB.position().lengthSquared();

        if (distanceSquared < EPSILON)
        {
            CollisionManifold.ContactInfo contact = manifold.push();

            //TODO
            //contact.normal.set(0.0, 1.0, 0.0);
            contact.penetration = sphereA.radius();

            contact.posA.set(0.0, sphereA.radius(), 0.0);
            contact.posB.set(0.0, -sphereB.radius(), 0.0);

            return;
        }

        double distance = sqrt(distanceSquared);
        double penetration = sphereA.radius() + sphereB.radius() - distance;

        if (penetration < EPSILON) return;

        CollisionManifold.ContactInfo contact = manifold.push();

        contact.penetration = penetration;
    }
}
