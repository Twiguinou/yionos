package yionos.detection;

public interface PairStorage extends Iterable<Broadphase.Pair>
{
    interface PairConsumer
    {
        void accept(Broadphase.Pair pair);
    }

    Broadphase.Pair registerHandles(Broadphase.Handle first, Broadphase.Handle second);

    int pairCount();

    void removeHandles(Broadphase.Handle first, Broadphase.Handle second);

    boolean contains(Broadphase.Handle first, Broadphase.Handle second);

    void processPairs(PairConsumer consumer);

    void clear();
}
