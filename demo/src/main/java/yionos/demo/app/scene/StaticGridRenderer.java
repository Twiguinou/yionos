package yionos.demo.app.scene;

import org.joml.Matrix4d;
import vulkan.VkCommandBuffer;
import yionos.demo.Disposable;
import yionos.demo.StackAllocator;
import yionos.demo.app.Camera;
import yionos.demo.app.MemoryUtil;
import yionos.demo.app.PipelineLayouts;
import yionos.demo.app.VulkanRenderer;
import yionos.demo.rendering.VulkanBuffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static vulkan.VulkanCore.*;
import static vulkan.VkIndexType.*;
import static vulkan.VkShaderStageFlagBits.*;
import static vulkan.VkBufferUsageFlagBits.*;
import static vma.VmaMemoryUsage.*;
import static java.lang.foreign.ValueLayout.*;

public class StaticGridRenderer implements Disposable
{
    private final PipelineLayouts pipelineLayouts;
    private final VulkanBuffer m_vertexBuffer, m_indexBuffer;

    public StaticGridRenderer(VulkanRenderer renderer)
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment vertices = arena.allocateFrom(JAVA_FLOAT,
                    -1.0f, -1.0f,
                    1.0f, -1.0f,
                    1.0f, 1.0f,
                    -1.0f, 1.0f);
            this.m_vertexBuffer = new VulkanBuffer(renderer.logicalDevice().allocator(), vertices.byteSize(), VK_BUFFER_USAGE_VERTEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_GPU_ONLY);
            this.m_vertexBuffer.upload(renderer.uploadCommandPool(), renderer.graphicsQueue(), vertices);

            MemorySegment indices = arena.allocateFrom(JAVA_INT,
                    0, 1, 2,
                    0, 2, 3,
                    2, 1, 0,
                    3, 2, 0);
            this.m_indexBuffer = new VulkanBuffer(renderer.logicalDevice().allocator(), indices.byteSize(), VK_BUFFER_USAGE_INDEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_GPU_ONLY);
            this.m_indexBuffer.upload(renderer.uploadCommandPool(), renderer.graphicsQueue(), indices);

            this.pipelineLayouts = renderer.pipelineLayouts();
        }
    }

    public void render(VkCommandBuffer commandBuffer, Camera camera, Matrix4d transform)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            vkCmdBindVertexBuffers(commandBuffer, 0, 1, arena.allocateFrom(ADDRESS, this.m_vertexBuffer.handle()), arena.allocateFrom(JAVA_LONG, 0));
            vkCmdBindIndexBuffer(commandBuffer, this.m_indexBuffer.handle(), 0, VK_INDEX_TYPE_UINT32);

            Matrix4d clippedTransform = new Matrix4d();
            camera.transformationMatrix(transform, clippedTransform);

            MemorySegment pushConstants = arena.allocate(JAVA_FLOAT, 20);
            MemoryUtil.getMatrix4dFloats(clippedTransform, pushConstants);
            pushConstants.setAtIndex(JAVA_FLOAT, 16, 1.0f);
            pushConstants.setAtIndex(JAVA_FLOAT, 17, 0.357f);
            pushConstants.setAtIndex(JAVA_FLOAT, 18, 0.357f);
            pushConstants.setAtIndex(JAVA_FLOAT, 19, 50.0f);

            vkCmdPushConstants(commandBuffer, this.pipelineLayouts.staticGrid(), VK_SHADER_STAGE_VERTEX_BIT, 0, (int) pushConstants.byteSize(), pushConstants);

            vkCmdDrawIndexed(commandBuffer, 12, 1, 0, 0, 0);
        }
    }

    @Override
    public void dispose()
    {
        this.m_indexBuffer.dispose();
        this.m_vertexBuffer.dispose();
    }
}
