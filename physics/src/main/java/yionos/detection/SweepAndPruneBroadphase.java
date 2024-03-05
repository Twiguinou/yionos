package yionos.detection;

import com.zaxxer.sparsebits.SparseBitSet;
import org.joml.Vector3d;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static yionos.utils.MathDefinitions.*;

public class SweepAndPruneBroadphase implements Broadphase
{
    private final class Axis
    {
        static final class Endpoint
        {
            double value;
            int id;
            boolean end;
        }

        interface OverlappingConsumer
        {
            void accept(int id1, int id2);
        }

        private final List<Endpoint> m_endpoints = new ArrayList<>();
        private final SparseBitSet m_overlapping = new SparseBitSet();
        private final SparseBitSet m_searchBits = new SparseBitSet();

        Axis() {}

        void clear()
        {
            this.m_endpoints.clear();
            this.m_overlapping.clear();
            this.m_searchBits.clear();
        }

        private void sortEndpoints()
        {
            for (int i = 1; i < this.m_endpoints.size(); i++)
            {
                Endpoint x = this.m_endpoints.get(i);

                int j = i;
                while ((j > 0) && (x.value < this.m_endpoints.get(j - 1).value))
                {
                    this.m_endpoints.set(j, this.m_endpoints.get(j - 1));
                    --j;
                }

                this.m_endpoints.set(j, x);
            }
        }

        void findOverlaps()
        {
            this.m_overlapping.clear();
            this.m_searchBits.clear();

            this.sortEndpoints();

            for (Endpoint endpoint : this.m_endpoints)
            {
                if (endpoint.end)
                {
                    this.m_searchBits.clear(endpoint.id);

                    int i = -1;
                    while ((i = this.m_searchBits.nextSetBit(i + 1)) != -1)
                    {
                        int key = SweepAndPruneBroadphase.this.pairKey(endpoint.id, i);
                        this.m_overlapping.set(key);
                    }

                    continue;
                }

                this.m_searchBits.set(endpoint.id);
            }
        }

        void forEachOverlapping(OverlappingConsumer consumer)
        {
            int i = -1;
            while ((i = this.m_overlapping.nextSetBit(i + 1)) != -1)
            {
                int id1 = i / SweepAndPruneBroadphase.this.m_handles.size();
                int id2 = i % SweepAndPruneBroadphase.this.m_handles.size();

                consumer.accept(id1, id2);
            }
        }

        void addEndpoint(Endpoint endpoint)
        {
            this.m_endpoints.add(endpoint);
        }

        void removeEndpoints(int id)
        {
            this.m_endpoints.removeIf(endpoint -> endpoint.id == id);
        }
    }

    private static final class SAPHandle implements Handle
    {
        private final Axis.Endpoint[] m_minEndpoints = new Axis.Endpoint[3];
        private final Axis.Endpoint[] m_maxEndpoints = new Axis.Endpoint[3];
        private final Vector3d m_volumeMin, m_volumeMax;
        private final Object m_data;
        private int index;

        public SAPHandle(Vector3d volumeMin, Vector3d volumeMax, Object data)
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

    private final Axis[] m_axes = new Axis[3];
    private final List<SAPHandle> m_handles = new ArrayList<>();
    private final PairStorage m_pairStorage;

    public SweepAndPruneBroadphase(PairStorage pairStorage)
    {
        this.m_pairStorage = pairStorage;

        for (int i = 0; i < 3; i++)
        {
            this.m_axes[i] = new Axis();
        }
    }

    private int pairKey(int id1, int id2)
    {
        if (id1 > id2)
        {
            int t = id1;
            id1 = id2;
            id2 = t;
        }

        return id1 * this.m_handles.size() + id2;
    }

    private boolean isValidHandle(Handle handle)
    {
        return (handle instanceof SAPHandle sapHandle) && (sapHandle.index < this.m_handles.size()) && (sapHandle.index >= 0);
    }

    @Override
    public Handle createHandle(Vector3d volumeMin, Vector3d volumeMax, Object data)
    {
        assert isValidVolume(volumeMin, volumeMax);

        SAPHandle handle = new SAPHandle(new Vector3d(volumeMin), new Vector3d(volumeMax), data);

        handle.index = this.m_handles.size();
        this.m_handles.add(handle);

        for (int i = 0; i < 3; i++)
        {
            Axis.Endpoint minEndpoint = new Axis.Endpoint();
            minEndpoint.value = volumeMin.x;
            minEndpoint.end = false;
            minEndpoint.id = handle.index;

            Axis.Endpoint maxEndpoint = new Axis.Endpoint();
            maxEndpoint.value = volumeMax.x;
            maxEndpoint.end = true;
            maxEndpoint.id = handle.index;

            this.m_axes[i].addEndpoint(minEndpoint);
            this.m_axes[i].addEndpoint(maxEndpoint);

            handle.m_minEndpoints[i] = minEndpoint;
            handle.m_maxEndpoints[i] = maxEndpoint;
        }

        return handle;
    }

    @Override
    public void deleteHandle(Handle handle)
    {
        assert this.isValidHandle(handle);

        for (SAPHandle otherHandle : this.m_handles)
        {
            this.m_pairStorage.removeHandles(handle, otherHandle);
        }

        int index = ((SAPHandle) handle).index;

        for (int i = 0; i < 3; i++)
        {
            this.m_axes[i].removeEndpoints(index);
        }

        if (this.m_handles.size() > 1)
        {
            SAPHandle newHandle = this.m_handles.removeLast();
            newHandle.index = index;

            for (int i = 0; i < 3; i++)
            {
                newHandle.m_minEndpoints[i].id = index;
                newHandle.m_maxEndpoints[i].id = index;
            }

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

        SAPHandle sapHandle = (SAPHandle) handle;

        for (int i = 0; i < 3; i++)
        {
            sapHandle.m_minEndpoints[i].value = volumeMin.get(i);
            sapHandle.m_maxEndpoints[i].value = volumeMax.get(i);
        }

        sapHandle.m_volumeMin.set(volumeMin);
        sapHandle.m_volumeMax.set(volumeMax);
    }

    @Override
    public PairStorage pairStorage()
    {
        return this.m_pairStorage;
    }

    @Override
    public void update()
    {
        this.m_pairStorage.clear();

        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor())
        {
            for (Axis axis : this.m_axes)
            {
                executor.submit(axis::findOverlaps);
            }
        }

        this.m_axes[0].m_overlapping.and(this.m_axes[1].m_overlapping);
        this.m_axes[0].m_overlapping.and(this.m_axes[2].m_overlapping);

        this.m_axes[0].forEachOverlapping((id1, id2) ->
        {
            SAPHandle handle1 = this.m_handles.get(id1);
            SAPHandle handle2 = this.m_handles.get(id2);

            this.m_pairStorage.registerHandles(handle1, handle2);
        });
    }

    @Override
    public void removeHandles()
    {
        this.m_pairStorage.clear();
        this.m_handles.clear();

        for (Axis axis : this.m_axes)
        {
            axis.clear();
        }
    }
}
