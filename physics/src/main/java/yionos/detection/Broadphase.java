package yionos.detection;

import org.joml.Vector3d;

public interface Broadphase
{
    interface Handle
    {
        Vector3d volumeMin();

        Vector3d volumeMax();

        Object data();

        int storageId();
    }

    interface Pair
    {
        Handle first();

        Handle second();
    }

    Handle createHandle(Vector3d volumeMin, Vector3d volumeMax, Object data);

    void deleteHandle(Handle handle);

    void updateBounds(Handle handle, Vector3d volumeMin, Vector3d volumeMax);

    PairStorage pairStorage();

    void update();

    void removeHandles();
}
