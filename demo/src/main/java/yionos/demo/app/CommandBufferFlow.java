package yionos.demo.app;

import vulkan.VkCommandBuffer;
import vulkan.VkDevice;
import yionos.demo.Disposable;
import yionos.demo.rendering.CommandPool;
import yionos.demo.rendering.VulkanException;

import java.util.ArrayDeque;
import java.util.Deque;

import static vulkan.VkCommandBufferLevel.*;

public class CommandBufferFlow implements Disposable
{
    private record CommandBufferAggregate(CommandPool pool, Deque<VkCommandBuffer> commandBuffers) {}

    private final CommandBufferAggregate[] m_aggregates;
    public final VkDevice device;

    public CommandBufferFlow(VkDevice device, int queueFamily, int frameCount) throws VulkanException
    {
        this.m_aggregates = new CommandBufferAggregate[frameCount];

        int i = -1;
        try
        {
            for (i = 0; i < frameCount; i++)
            {
                this.m_aggregates[i] = new CommandBufferAggregate(new CommandPool(device, 0, queueFamily), new ArrayDeque<>());
            }
        }
        catch (VulkanException e)
        {
            while(i >= 0)
            {
                this.m_aggregates[i].pool.dispose();
                --i;
            }

            throw e;
        }

        this.device = device;
    }

    public void reset(int frameIndex)
    {
        this.m_aggregates[frameIndex].pool.reset();
    }

    public VkCommandBuffer pool(int frameIndex)
    {
        VkCommandBuffer commandBuffer = this.m_aggregates[frameIndex].commandBuffers.poll();
        if (commandBuffer == null)
        {
            commandBuffer = this.m_aggregates[frameIndex].pool.allocate(VK_COMMAND_BUFFER_LEVEL_PRIMARY, 1)[0];
        }

        return commandBuffer;
    }

    public void offer(int frameIndex, VkCommandBuffer commandBuffer)
    {
        this.m_aggregates[frameIndex].commandBuffers.offer(commandBuffer);
    }

    @Override
    public void dispose()
    {
        for (CommandBufferAggregate aggregate : this.m_aggregates)
        {
            aggregate.pool.dispose();
            aggregate.commandBuffers.clear();
        }
    }
}
