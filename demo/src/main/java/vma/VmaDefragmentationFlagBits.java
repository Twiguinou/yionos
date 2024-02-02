package vma;

public final class VmaDefragmentationFlagBits
{private VmaDefragmentationFlagBits() {}

    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT = 1;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT = 2;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT = 4;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT = 8;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK = 15;
    public static final int VMA_DEFRAGMENTATION_FLAG_BITS_MAX_ENUM = 2147483647;
}
