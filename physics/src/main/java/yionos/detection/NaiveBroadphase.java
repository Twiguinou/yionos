package yionos.detection;

import org.joml.Vector3d;

import java.util.ArrayList;
import java.util.List;

import static yionos.utils.MathDefinitions.*;

public class NaiveBroadphase implements Broadphase
{
    private static final class IndexedHandle implements Handle
    {
        private final Vector3d m_volumeMin, m_volumeMax;
        private final Object m_data;
        private int index;

        public IndexedHandle(Vector3d volumeMin, Vector3d volumeMax, Object data)
        {
            this.m_volumeMin = volumeMin;
            this.m_volumeMax = volumeMax;
            this.m_data = data;
        }

        @Override
        public Vector3d volumeMin()
        {
            return this.m_volumeMin;
        }

        @Override
        public Vector3d volumeMax()
        {
            return this.m_volumeMax;
        }

        @Override
        public Object data()
        {
            return this.m_data;
        }

        @Override
        public int storageId()
        {
            return this.index;
        }
    }

    private final PairStorage m_pairStorage;
    private final List<IndexedHandle> m_handles = new ArrayList<>();

    public NaiveBroadphase(PairStorage pairStorage)
    {
        this.m_pairStorage = pairStorage;
    }

    private boolean isValidHandle(Handle handle)
    {
        return (handle instanceof IndexedHandle indexedHandle) && (indexedHandle.index < this.m_handles.size()) && (indexedHandle.index >= 0);
    }

    @Override
    public Handle createHandle(Vector3d volumeMin, Vector3d volumeMax, Object data)
    {
        assert isValidVolume(volumeMin, volumeMax);

        IndexedHandle handle = new IndexedHandle(new Vector3d(volumeMin), new Vector3d(volumeMax), data);

        handle.index = this.m_handles.size();
        this.m_handles.add(handle);

        return handle;
    }

    @Override
    public void deleteHandle(Handle handle)
    {
        assert this.isValidHandle(handle);

        for (IndexedHandle otherHandle : this.m_handles)
        {
            this.m_pairStorage.removeHandles(handle, otherHandle);
        }

        if (this.m_handles.size() > 1)
        {
            int index = ((IndexedHandle) handle).index;

            IndexedHandle newHandle = this.m_handles.removeLast();
            newHandle.index = index;

            this.m_handles.set(index, newHandle);
        }
        else
        {
            this.m_handles.clear();
        }
    }

    @Override
    public void updateBounds(Handle handle, Vector3d volumeMin, Vector3d volumeMax)
    {
        assert this.isValidHandle(handle) && isValidVolume(volumeMin, volumeMax);

        IndexedHandle indexedHandle = (IndexedHandle) handle;
        indexedHandle.m_volumeMin.set(volumeMin);
        indexedHandle.m_volumeMax.set(volumeMax);
    }

    @Override
    public PairStorage pairStorage()
    {
        return this.m_pairStorage;
    }

    @Override
    public void update()
    {
        for (int i = 0; i < this.m_handles.size() - 1; i++)
        {
            IndexedHandle handle1 = this.m_handles.get(i);
            for (int j = i + 1; j < this.m_handles.size(); j++)
            {
                IndexedHandle handle2 = this.m_handles.get(j);

                if (volumesOverlap(handle1.volumeMin(), handle1.volumeMax(), handle2.volumeMin(), handle2.volumeMax()))
                {
                    this.m_pairStorage.registerHandles(handle1, handle2);
                }
                else
                {
                    this.m_pairStorage.removeHandles(handle1, handle2);
                }
            }
        }
    }

    @Override
    public void removeHandles()
    {
        this.m_pairStorage.clear();
        this.m_handles.clear();
    }
}
