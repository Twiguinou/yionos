package yionos.detection;

import yionos.detection.algorithms.CuboidSphereCollisionAlgorithms;
import yionos.detection.algorithms.MinkowskiPortalRefinement;
import yionos.detection.algorithms.SpherePairCollisionAlgorithms;
import yionos.dynamics.geometries.ConvexHullGeometry;
import yionos.dynamics.geometries.CuboidGeometry;
import yionos.dynamics.geometries.RigidGeometry;
import yionos.dynamics.geometries.SphereGeometry;
import yionos.utils.Transform;

public class DefaultCollisionDispatcher implements CollisionDispatcher
{
    public DefaultCollisionDispatcher() {}

    private static Transform inverseTransform(Transform transform)
    {
        Transform inverse = new Transform();
        Transform.computeInverse(transform, inverse);
        return inverse;
    }

    @Override
    public boolean execute(RigidGeometry geometryA, RigidGeometry geometryB, Transform relativeTransformB)
    {
        return switch (geometryA)
        {
            case SphereGeometry sphereA -> switch (geometryB)
            {
                case SphereGeometry sphereB -> SpherePairCollisionAlgorithms.test(sphereA, sphereB, relativeTransformB.position());
                case CuboidGeometry cuboidB -> CuboidSphereCollisionAlgorithms.test(cuboidB, sphereA, inverseTransform(relativeTransformB).position());
                default -> throw new UnsupportedGeometryException(STR."Could not match geometry \{geometryA} with \{geometryB}");
            };
            case CuboidGeometry cuboidA -> switch (geometryB)
            {
                case SphereGeometry sphereB -> CuboidSphereCollisionAlgorithms.test(cuboidA, sphereB, relativeTransformB.position());
                default -> throw new UnsupportedGeometryException(STR."Could not match geometry \{geometryA} with \{geometryB}");
            };
            default -> throw new UnsupportedGeometryException(STR."Could not match geometry: \{geometryA}");
        };
    }

    @Override
    public void execute(RigidGeometry geometryA, RigidGeometry geometryB, Transform relativeTransformB, CollisionManifold manifold)
    {
        switch (geometryA)
        {
            case SphereGeometry sphereA ->
            {
                switch (geometryB)
                {
                    case SphereGeometry sphereB -> SpherePairCollisionAlgorithms.manifold(sphereA, sphereB, relativeTransformB, manifold);
                    case CuboidGeometry cuboidB -> CuboidSphereCollisionAlgorithms.manifold(cuboidB, sphereA, inverseTransform(relativeTransformB), manifold, true);
                    default -> throw new UnsupportedGeometryException(STR."Could not match geometry \{geometryA} with \{geometryB}");
                }
            }
            case CuboidGeometry cuboidA ->
            {
                switch (geometryB)
                {
                    case SphereGeometry sphereB -> CuboidSphereCollisionAlgorithms.manifold(cuboidA, sphereB, relativeTransformB, manifold, false);
                    default -> throw new UnsupportedGeometryException(STR."Could not match geometry \{geometryA} with \{geometryB}");
                }
            }
            case ConvexHullGeometry hullA ->
            {
                switch (geometryB)
                {
                    case ConvexHullGeometry hullB ->
                    {
                        CollisionManifold.ContactInfo contactInfo = manifold.push();
                        if (!MinkowskiPortalRefinement.manifold(hullA, new Transform(), hullB, relativeTransformB, contactInfo))
                        {
                            manifold.reset();
                        }
                    }
                    default -> throw new UnsupportedGeometryException(STR."Could not match geometry \{geometryA} with \{geometryB}");
                }
            }
            default -> throw new UnsupportedGeometryException(STR."Could not match geometry: \{geometryA}");
        }
    }

    @Override
    public void execute(RigidGeometry geometryA, Transform transformA, RigidGeometry geometryB, Transform transformB, CollisionManifold manifold)
    {
        switch (geometryA)
        {
            case ConvexHullGeometry hullA ->
            {
                switch (geometryB)
                {
                    case ConvexHullGeometry hullB ->
                    {
                        CollisionManifold.ContactInfo contactInfo = manifold.push();
                        if (!MinkowskiPortalRefinement.manifold(hullA, transformA, hullB, transformB, contactInfo))
                        {
                            manifold.reset();
                        }
                    }
                    default -> throw new UnsupportedGeometryException(STR."Could not match geometry \{geometryA} with \{geometryB}");
                }
            }
            default -> throw new UnsupportedGeometryException(STR."Could not match geometry: \{geometryA}");
        }
    }
}
