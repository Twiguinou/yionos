package yionos.detection;

import speiger.src.collections.longs.maps.impl.hash.Long2ObjectOpenHashMap;
import speiger.src.collections.longs.maps.interfaces.Long2ObjectMap;

import java.util.Iterator;

public class HashtablePairStorage implements PairStorage
{
    private record SimplePair(Broadphase.Handle first, Broadphase.Handle second) implements Broadphase.Pair {}

    private final Long2ObjectMap<Broadphase.Pair> m_storage = new Long2ObjectOpenHashMap<>();

    public HashtablePairStorage() {}

    private static long hash(int i1, int i2)
    {
        long li1, li2;
        if (i1 > i2)
        {
            li1 = i2;
            li2 = i1;
        }
        else
        {
            li1 = i1;
            li2 = i2;
        }

        return (li1 << 32) | li2;
    }

    @Override
    public Broadphase.Pair registerHandles(Broadphase.Handle first, Broadphase.Handle second)
    {
        long key = hash(first.storageId(), second.storageId());
        return this.m_storage.computeIfAbsent(key, _ -> new SimplePair(first, second));
    }

    @Override
    public int pairCount()
    {
        return this.m_storage.size();
    }

    @Override
    public Iterator<Broadphase.Pair> iterator()
    {
        return this.m_storage.values().iterator();
    }

    @Override
    public void removeHandles(Broadphase.Handle first, Broadphase.Handle second)
    {
        long key = hash(first.storageId(), second.storageId());
        this.m_storage.remove(key);
    }

    @Override
    public boolean contains(Broadphase.Handle first, Broadphase.Handle second)
    {
        long key = hash(first.storageId(), second.storageId());
        return this.m_storage.containsKey(key);
    }

    @Override
    public void processPairs(PairConsumer consumer)
    {
        this.m_storage.values().forEach(consumer::accept);
    }

    @Override
    public void clear()
    {
        this.m_storage.clear();
    }
}
