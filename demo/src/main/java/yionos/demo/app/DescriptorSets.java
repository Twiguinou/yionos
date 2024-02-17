package yionos.demo.app;

import yionos.demo.rendering.DescriptorPool;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record DescriptorSets(MemorySegment objectBuffer)
{
    public static DescriptorSets create(DescriptorPool pool, DescriptorSetLayouts layouts)
    {
        MemorySegment objectBufferDescriptorSet;
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pSetLayouts = arena.allocate(ValueLayout.ADDRESS, layouts.objectBuffer());

            MemorySegment pDescriptorSet = arena.allocate(ValueLayout.ADDRESS);
            pool.allocateDescriptorSets(1, pSetLayouts, pDescriptorSet);
            objectBufferDescriptorSet = pDescriptorSet.get(ValueLayout.ADDRESS, 0);
        }

        return new DescriptorSets(objectBufferDescriptorSet);
    }
}
