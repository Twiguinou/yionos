package yionos.demo.rendering;

import java.lang.foreign.MemorySegment;

public interface VulkanImage
{
    MemorySegment handle();

    MemorySegment view();
}
