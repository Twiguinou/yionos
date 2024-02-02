package vma;

public final class VmaMemoryUsage
{private VmaMemoryUsage() {}

    public static final int VMA_MEMORY_USAGE_UNKNOWN = 0;
    public static final int VMA_MEMORY_USAGE_GPU_ONLY = 1;
    public static final int VMA_MEMORY_USAGE_CPU_ONLY = 2;
    public static final int VMA_MEMORY_USAGE_CPU_TO_GPU = 3;
    public static final int VMA_MEMORY_USAGE_GPU_TO_CPU = 4;
    public static final int VMA_MEMORY_USAGE_CPU_COPY = 5;
    public static final int VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED = 6;
    public static final int VMA_MEMORY_USAGE_AUTO = 7;
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE = 8;
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_HOST = 9;
    public static final int VMA_MEMORY_USAGE_MAX_ENUM = 2147483647;
}
