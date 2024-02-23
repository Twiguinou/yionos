package yionos.detection;

import org.joml.Quaterniond;
import yionos.dynamics.geometries.RigidGeometry;
import yionos.utils.Transform;

public interface CollisionAlgorithm<A extends RigidGeometry, B extends RigidGeometry>
{
    boolean execute(A geometryA, B geometryB, Quaterniond rotationA, Quaterniond rotationB, CollisionManifold manifold);

    default boolean castExecute(RigidGeometry geometryA, RigidGeometry geometryB, Quaterniond rotationA, Quaterniond rotationB, CollisionManifold manifold)
    {
        return this.execute((A) geometryA, (B) geometryB, rotationA, rotationB, manifold);
    }

    int dispatcherIndexA();

    int dispatcherIndexB();
}
