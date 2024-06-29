package yionos.demo.rendering;

import vulkan.VkDevice;
import vulkan.VkPipelineLayoutCreateInfo;
import vulkan.VkPushConstantRange;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.List;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public class PipelineLayoutBuilder
{
    public record PushConstantRange(int stageFlags, int offset, int size)
    {
        public void write(VkPushConstantRange range)
        {
            range.stageFlags(this.stageFlags);
            range.offset(this.offset);
            range.size(this.size);
        }
    }

    private final int m_flags;
    private final List<PushConstantRange> m_pushConstants = new ArrayList<>();
    private final List<MemorySegment> m_layouts = new ArrayList<>();

    public PipelineLayoutBuilder(int flags)
    {
        this.m_flags = flags;
    }

    public PipelineLayoutBuilder addPushConstant(int stageFlags, int offset, int size)
    {
        this.m_pushConstants.add(new PushConstantRange(stageFlags, offset, size));
        return this;
    }

    public PipelineLayoutBuilder addSetLayout(MemorySegment setLayout)
    {
        this.m_layouts.add(setLayout);
        return this;
    }

    public MemorySegment build(VkDevice device) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pSetLayouts = arena.allocate(ADDRESS, this.m_layouts.size());
            for (int i = 0; i < this.m_layouts.size(); i++)
            {
                pSetLayouts.setAtIndex(ADDRESS, i, this.m_layouts.get(i));
            }

            MemorySegment pPushConstants = arena.allocate(VkPushConstantRange.gRecordLayout, this.m_pushConstants.size());
            for (int i = 0; i < this.m_pushConstants.size(); i++)
            {
                this.m_pushConstants.get(i).write(VkPushConstantRange.getAtIndex(pPushConstants, i));
            }

            VkPipelineLayoutCreateInfo layoutCreateInfo = new VkPipelineLayoutCreateInfo(arena);
            layoutCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);
            layoutCreateInfo.flags(this.m_flags);
            layoutCreateInfo.setLayoutCount(this.m_layouts.size());
            layoutCreateInfo.pSetLayouts(pSetLayouts);
            layoutCreateInfo.pushConstantRangeCount(this.m_pushConstants.size());
            layoutCreateInfo.pPushConstantRanges(pPushConstants);

            MemorySegment pLayout = arena.allocate(ADDRESS);
            VulkanException.check(vkCreatePipelineLayout(device, layoutCreateInfo.ptr(), NULL, pLayout), "Unable to create pipeline layout");
            return pLayout.get(ADDRESS, 0);
        }
    }
}
