package yionos.detection.algorithms;

import org.joml.Quaterniond;
import org.joml.Vector3d;
import yionos.detection.CollisionManifold;
import yionos.dynamics.geometries.CuboidGeometry;
import yionos.dynamics.geometries.SphereGeometry;
import yionos.utils.Transform;

import static yionos.utils.MathDefinitions.*;

public final class CuboidSphereCollisionAlgorithms
{private CuboidSphereCollisionAlgorithms() {}

    public static boolean test(CuboidGeometry cuboid, SphereGeometry sphere, Vector3d relativePosB)
    {
        Vector3d projected = cuboid.halfExtents().negate(new Vector3d())
                .max(relativePosB)
                .min(cuboid.halfExtents());

        return sphere.radiusSquared() - projected.distanceSquared(relativePosB) > EPSILON;
    }

    public static void manifold(CuboidGeometry cuboid, SphereGeometry sphere, Transform relativeTransformB, CollisionManifold manifold, boolean swapped)
    {
        Vector3d projected = cuboid.halfExtents().negate(new Vector3d())
                .max(relativeTransformB.position())
                .min(cuboid.halfExtents());

        double g = projected.distanceSquared(relativeTransformB.position());
        if (g > sphere.radiusSquared() - EPSILON)
        {
            return;
        }

        CollisionManifold.ContactInfo contact = manifold.push();

        Vector3d projectedAbsolute = projected.absolute(new Vector3d());
        int normalComponent = projectedAbsolute.maxComponent();
        double axisExtent = cuboid.halfExtents().get(normalComponent), axisProjection = projected.get(normalComponent);

        if (g < EPSILON)
        {
            contact.penetration = axisExtent - projectedAbsolute.get(normalComponent) + sphere.radius();
            contact.posA.set(projected).setComponent(normalComponent, Math.copySign(axisExtent, axisProjection));
        }
        else
        {
            contact.penetration = sphere.radius() - sqrt(g);
            contact.posA.set(projected);
        }

        contact.normalA.zero().setComponent(normalComponent, Math.signum(axisProjection));

        contact.normalA.negate(contact.normalB).rotate(relativeTransformB.rotation().conjugate(new Quaterniond()));
        contact.normalB.mul(sphere.radius(), contact.posB);

        if (swapped)
        {
            Vector3d temp = new Vector3d();

            temp.set(contact.posA);
            contact.posA.set(contact.posB);
            temp.get(contact.posB);

            temp.set(contact.normalA);
            contact.normalA.set(contact.normalB);
            temp.get(contact.normalB);
        }
    }
}
