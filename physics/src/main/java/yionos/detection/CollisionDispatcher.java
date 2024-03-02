package yionos.detection;

import yionos.dynamics.geometries.RigidGeometry;
import yionos.utils.Transform;

public interface CollisionDispatcher
{
    boolean execute(RigidGeometry geometryA, RigidGeometry geometryB, Transform relativeTransformB);

    void execute(RigidGeometry geometryA, RigidGeometry geometryB, Transform relativeTransformB, CollisionManifold manifold);
}
