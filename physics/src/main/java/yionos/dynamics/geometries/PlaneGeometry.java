package yionos.dynamics.geometries;

import org.joml.Vector3d;

public record PlaneGeometry(Vector3d normal, double originOffset) implements InfiniteGeometry {}
