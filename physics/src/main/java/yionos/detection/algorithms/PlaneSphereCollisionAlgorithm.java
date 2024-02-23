package yionos.detection.algorithms;

import org.joml.Quaterniond;
import yionos.detection.CollisionAlgorithm;
import yionos.detection.CollisionManifold;
import yionos.dynamics.geometries.PlaneGeometry;
import yionos.dynamics.geometries.SphereGeometry;

import static yionos.utils.MathDefinitions.*;

public class PlaneSphereCollisionAlgorithm implements CollisionAlgorithm<PlaneGeometry, SphereGeometry>
{
    public PlaneSphereCollisionAlgorithm() {}

    @Override
    public boolean execute(PlaneGeometry plane, SphereGeometry sphere, Quaterniond rotationA, Quaterniond rotationB, CollisionManifold manifold)
    {
        double alpha = plane.originOffset() - manifold.colliderPos.dot(plane.normal());
        double penetration = sphere.radius() - Math.abs(alpha);

        if (penetration < EPSILON)
        {
            return false;
        }

        CollisionManifold.ContactInfo contact = manifold.push();

        contact.penetration = penetration;
        contact.normal.set(plane.normal());

        contact.normal.mul(-alpha, contact.pos);
        contact.pos.add(manifold.colliderPos);

        return true;
    }

    @Override
    public int dispatcherIndexA()
    {
        return 2;
    }

    @Override
    public int dispatcherIndexB()
    {
        return 0;
    }
}
