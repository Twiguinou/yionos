package yionos.detection.algorithms;

import org.joml.Quaterniond;
import yionos.detection.CollisionAlgorithm;
import yionos.detection.CollisionManifold;
import yionos.dynamics.geometries.SphereGeometry;

import static yionos.utils.MathDefinitions.*;

public class SpherePairCollisionAlgorithm implements CollisionAlgorithm<SphereGeometry, SphereGeometry>
{
    public SpherePairCollisionAlgorithm() {}

    @Override
    public boolean execute(SphereGeometry sphere1, SphereGeometry sphere2, Quaterniond rotationA, Quaterniond rotationB, CollisionManifold manifold)
    {
        double distanceSquared = manifold.colliderPos.lengthSquared();

        /*
         * In this case the two spheres almost share the same position, any contact point is good.
         */
        if (distanceSquared < EPSILON)
        {
            CollisionManifold.ContactInfo contact = manifold.push();

            contact.normal.set(0.0, 1.0, 0.0);
            contact.penetration = sphere1.radius();
            contact.pos.set(0.0, sphere1.radius(), 0.0);

            return true;
        }

        double distance = sqrt(distanceSquared);
        double penetration = sphere1.radius() + sphere2.radius() - distance;

        if (penetration < EPSILON)
        {
            return false;
        }

        /*
         * As a contact point is returned the point lying both on the normal and the surface of sphere1.
         */
        CollisionManifold.ContactInfo contact = manifold.push();

        manifold.colliderPos.div(distance, contact.normal);
        contact.penetration = penetration;
        contact.normal.mul(sphere1.radius(), contact.pos);

        return true;
    }

    @Override
    public int dispatcherIndexA()
    {
        return 0;
    }

    @Override
    public int dispatcherIndexB()
    {
        return 0;
    }
}
