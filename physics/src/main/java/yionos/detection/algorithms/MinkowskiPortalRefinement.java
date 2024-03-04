package yionos.detection.algorithms;

import org.joml.Vector3d;
import yionos.detection.CollisionManifold;
import yionos.dynamics.geometries.ConvexHullGeometry;
import yionos.utils.Transform;

import static yionos.utils.MathDefinitions.*;

public final class MinkowskiPortalRefinement
{private MinkowskiPortalRefinement() {}

    private static final Vector3d VEC3D_ZERO = new Vector3d();

    private static Vector3d supportPoint(ConvexHullGeometry hull, Transform transform, Vector3d direction)
    {
        Vector3d v = new Vector3d();

        double maxDot = Double.NEGATIVE_INFINITY;
        Vector3d selected = new Vector3d();
        for (Vector3d vertex : hull.vertices())
        {
            double d = vertex.rotate(transform.rotation(), v).add(transform.position()).dot(direction);
            if (d > maxDot)
            {
                maxDot = d;
                selected.set(v);
            }
        }

        return selected;
    }

    private static Vector3d supportPointOfMinkowskiDifference(ConvexHullGeometry hullA, Transform transformA, ConvexHullGeometry hullB, Transform transformB, Vector3d direction)
    {
        Vector3d supportA = supportPoint(hullA, transformA, direction);
        Vector3d supportB = supportPoint(hullB, transformB, direction.negate(new Vector3d()));

        return supportA.sub(supportB);
    }

    public static boolean manifold(ConvexHullGeometry hullA, Transform transformA, ConvexHullGeometry hullB, Transform transformB, CollisionManifold.ContactInfo contact)
    {
        Vector3d v0 = transformB.position().sub(transformA.position(), new Vector3d());

        if (v0.equals(VEC3D_ZERO, EPSILON))
        {
            v0.set(EPSILON, 0.0, 0.0);
        }

        Vector3d n = v0.negate(new Vector3d());
        Vector3d v11 = supportPoint(hullA, transformA, n.negate(new Vector3d()));
        Vector3d v12 = supportPoint(hullB, transformB, n);
        Vector3d v1 = v12.sub(v11, new Vector3d());

        if (v1.dot(n) <= 0.0)
        {
            contact.normalA.set(n);
            return false;
        }

        v1.cross(v0, n);
        if (n.equals(VEC3D_ZERO, EPSILON))
        {
            v1.sub(v0, n);
            n.normalize();

            contact.normalA.set(n);
            contact.posA.set(v11);
            contact.posB.set(v12);

            return true;
        }

        Vector3d v21 = supportPoint(hullA, transformA, n.negate(new Vector3d()));
        Vector3d v22 = supportPoint(hullB, transformB, n);
        Vector3d v2 = v22.sub(v21, new Vector3d());
        if (v2.dot(n) <= 0.0)
        {
            contact.normalA.set(n);
            return false;
        }

        v1.sub(v0, n).cross(v2.sub(v0, new Vector3d()));
        double dist = n.dot(v0);

        if (dist > 0.0)
        {
            Vector3d temp = new Vector3d();

            temp.set(v1);
            v1.set(v2);
            v2.set(temp);

            temp.set(v11);
            v11.set(v21);
            v21.set(temp);

            temp.set(v12);
            v12.set(v22);
            v22.set(temp);

            n.negate();
        }

        for (int i = 0; i < 100; i++)
        {
            Vector3d v31 = supportPoint(hullA, transformA, n.negate(new Vector3d()));
            Vector3d v32 = supportPoint(hullB, transformB, n);
            Vector3d v3 = v32.sub(v31, new Vector3d());
            if (v3.dot(n) <= 0.0)
            {
                contact.normalA.set(n);
                return false;
            }

            if (v1.cross(v3, new Vector3d()).dot(v0) < 0.0)
            {
                v2.set(v3);
                v21.set(v31);
                v22.set(v32);
                v1.sub(v0, n).cross(v3.sub(v0, new Vector3d()));
                continue;
            }

            if (v3.cross(v2, new Vector3d()).dot(v0) < 0.0)
            {
                v1.set(v3);
                v11.set(v31);
                v12.set(v32);
                v3.sub(v0, n).cross(v2.sub(v0, new Vector3d()));
                continue;
            }

            boolean hit = false;

            for (int j = 0; j < 300; j++)
            {

                v2.sub(v1, n).cross(v3.sub(v1, new Vector3d()));
                if (n.equals(VEC3D_ZERO, EPSILON))
                {
                    throw new IllegalStateException();
                }

                n.normalize();

                double d = n.dot(v1);

                if (d >= 0.0)
                {
                    contact.normalA.set(n);

                    double b0 = v1.cross(v2, new Vector3d()).dot(v3);
                    double b1 = v3.cross(v2, new Vector3d()).dot(v0);
                    double b2 = v0.cross(v1, new Vector3d()).dot(v3);
                    double b3 = v2.cross(v1, new Vector3d()).dot(v0);

                    double sum = b0 + b1 + b2 + b3;

                    if (sum <= 0.0)
                    {
                        b0 = 0.0;
                        b1 = v2.cross(v3, new Vector3d()).dot(n);
                        b2 = v3.cross(v1, new Vector3d()).dot(n);
                        b3 = v1.cross(v2, new Vector3d()).dot(n);

                        sum = b1 + b2 + b3;
                    }

                    double inv = 1.0 / sum;

                    transformA.position().mul(b0, contact.posA).add(v11.mul(b1, new Vector3d())).add(v21.mul(b2, new Vector3d())).add(v31.mul(b3, new Vector3d())).mul(inv);
                    transformB.position().mul(b0, contact.posB).add(v12.mul(b1, new Vector3d())).add(v22.mul(b2, new Vector3d())).add(v32.mul(b3, new Vector3d())).mul(inv);

                    hit = true;
                }

                Vector3d v41 = supportPoint(hullA, transformA, n.negate(new Vector3d()));
                Vector3d v42 = supportPoint(hullB, transformB, n);
                Vector3d v4 = v42.sub(v41, new Vector3d());

                double delta = v4.sub(v3, new Vector3d()).dot(n);
                double separation = -v4.dot(n);

                if (delta <= EPSILON || separation >= 0.0)
                {
                    contact.normalA.set(n);
                    return hit;
                }

                double d1 = v4.cross(v1, new Vector3d()).dot(v0);
                double d2 = v4.cross(v2, new Vector3d()).dot(v0);
                double d3 = v4.cross(v3, new Vector3d()).dot(v0);

                if (d1 < 0.0)
                {
                    if (d2 < 0.0)
                    {
                        v1.set(v4);
                        v11.set(v41);
                        v12.set(v42);
                    }
                    else
                    {
                        v3.set(v4);
                        v31.set(v41);
                        v32.set(v42);
                    }
                }
                else
                {
                    if (d3 < 0.0)
                    {
                        v2.set(v4);
                        v21.set(v41);
                        v22.set(v42);
                    }
                    else
                    {
                        v1.set(v4);
                        v11.set(v41);
                        v12.set(v42);
                    }
                }
            }
        }

        return false;
    }
}
