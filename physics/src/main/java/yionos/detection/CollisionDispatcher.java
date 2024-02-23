package yionos.detection;

import yionos.dynamics.geometries.RigidGeometry;
import yionos.dynamics.SolidObject;
import yionos.utils.Transform;

public interface CollisionDispatcher
{
    boolean execute(RigidGeometry geometry1, RigidGeometry geometry2, Transform transform1, Transform transform2, CollisionManifold manifold);

    default boolean execute(SolidObject object1, SolidObject object2, CollisionManifold manifold)
    {
        assert (object1.geometry() != null) && (object2.geometry() != null);

        manifold.object1 = object1;
        manifold.object2 = object2;

        return execute(object1.geometry(), object2.geometry(), object1.worldTransform(), object2.worldTransform(), manifold);
    }

    void allocateManifolds(int count);

    CollisionManifold getManifold(int index);
}
