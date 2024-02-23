package yionos.detection;

import yionos.detection.algorithms.PlaneSphereCollisionAlgorithm;
import yionos.detection.algorithms.SpherePairCollisionAlgorithm;
import yionos.dynamics.geometries.RigidGeometry;
import yionos.utils.Transform;

import java.util.ArrayList;
import java.util.List;

public class IndexedCollisionDispatcher implements CollisionDispatcher
{
    private final CollisionAlgorithm<?, ?>[][] m_algorithms;
    private final List<CollisionManifold> m_manifolds = new ArrayList<>();

    public IndexedCollisionDispatcher()
    {
        this.m_algorithms = buildTable(List.of(
                new SpherePairCollisionAlgorithm(),
                new PlaneSphereCollisionAlgorithm()
        ));
    }

    private static CollisionAlgorithm<?, ?>[][] buildTable(List<CollisionAlgorithm<?, ?>> algorithms)
    {
        if (algorithms.isEmpty())
        {
            return new CollisionAlgorithm[0][0];
        }

        int maxIndexA = algorithms.stream().mapToInt(CollisionAlgorithm::dispatcherIndexA).max().orElseThrow();
        int maxIndexB = algorithms.stream().mapToInt(CollisionAlgorithm::dispatcherIndexB).max().orElseThrow();

        CollisionAlgorithm<?, ?>[][] table = new CollisionAlgorithm[maxIndexA + 1][maxIndexB + 1];

        for (CollisionAlgorithm<?, ?> algorithm : algorithms)
        {
            table[algorithm.dispatcherIndexA()][algorithm.dispatcherIndexB()] = algorithm;
        }

        return table;
    }

    @Override
    public boolean execute(RigidGeometry geometry1, RigidGeometry geometry2, Transform transform1, Transform transform2, CollisionManifold manifold)
    {
        CollisionAlgorithm<?, ?> algorithm = this.m_algorithms[geometry1.dispatcherIndex()][geometry2.dispatcherIndex()];
        if (algorithm == null)
        {
            return false;
        }

        transform2.position().sub(transform1.position(), manifold.colliderPos);

        return algorithm.castExecute(geometry1, geometry2, transform1.rotation(), transform2.rotation(), manifold);
    }

    @Override
    public void allocateManifolds(int count)
    {
        while (this.m_manifolds.size() < count)
        {
            this.m_manifolds.add(new CollisionManifold());
        }
    }

    @Override
    public CollisionManifold getManifold(int index)
    {
        assert (index < this.m_manifolds.size()) && (index >= 0);

        CollisionManifold manifold = this.m_manifolds.get(index);
        manifold.reset();

        return manifold;
    }
}
