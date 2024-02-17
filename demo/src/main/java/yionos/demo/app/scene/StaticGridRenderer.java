package yionos.demo.app.scene;

import org.joml.Matrix4d;
import vulkan.VkCommandBuffer;
import yionos.demo.Disposable;
import yionos.demo.StackAllocator;
import yionos.demo.app.Camera;
import yionos.demo.app.VulkanRenderer;
import yionos.demo.rendering.VulkanBuffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static vulkan.VkIndexType.*;
import static vulkan.VkShaderStageFlagBits.*;
import static vulkan.VkBufferUsageFlagBits.*;
import static vma.VmaMemoryUsage.*;

public class StaticGridRenderer implements Disposable
{
    public final VulkanRenderer vulkanRenderer;
    private final VulkanBuffer m_vertexBuffer, m_indexBuffer;

    public StaticGridRenderer(VulkanRenderer renderer)
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment vertices = arena.allocateArray(ValueLayout.JAVA_FLOAT,
                    -1.0f, -1.0f,
                    1.0f, -1.0f,
                    1.0f, 1.0f,
                    -1.0f, 1.0f);
            this.m_vertexBuffer = new VulkanBuffer(renderer.logicalDevice().allocator(), vertices.byteSize(), VK_BUFFER_USAGE_VERTEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_GPU_ONLY);
            this.m_vertexBuffer.upload(renderer.uploadCommandPool(), renderer.transferQueue(), vertices);

            MemorySegment indices = arena.allocateArray(ValueLayout.JAVA_INT,
                    0, 1, 2,
                    0, 2, 3,
                    2, 1, 0,
                    3, 2, 0);
            this.m_indexBuffer = new VulkanBuffer(renderer.logicalDevice().allocator(), indices.byteSize(), VK_BUFFER_USAGE_INDEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_GPU_ONLY);
            this.m_indexBuffer.upload(renderer.uploadCommandPool(), renderer.transferQueue(), indices);

            this.vulkanRenderer = renderer;
        }
    }

    public void render(VkCommandBuffer commandBuffer, Camera camera, Matrix4d transform)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            vkCmdBindVertexBuffers(commandBuffer, 0, 1, arena.allocate(ValueLayout.ADDRESS, this.m_vertexBuffer.handle()), arena.allocate(ValueLayout.JAVA_LONG, 0));
            vkCmdBindIndexBuffer(commandBuffer, this.m_indexBuffer.handle(), 0, VK_INDEX_TYPE_UINT32);

            Matrix4d clippedTransform = new Matrix4d();
            camera.transformationMatrix(transform, clippedTransform);

            MemorySegment pushConstants = arena.allocateArray(ValueLayout.JAVA_FLOAT, 20);
            clippedTransform.get(pushConstants.asByteBuffer().asFloatBuffer());
            pushConstants.setAtIndex(ValueLayout.JAVA_FLOAT, 16, 0.267f);
            pushConstants.setAtIndex(ValueLayout.JAVA_FLOAT, 17, 0.533f);
            pushConstants.setAtIndex(ValueLayout.JAVA_FLOAT, 18, 0.749f);
            pushConstants.setAtIndex(ValueLayout.JAVA_FLOAT, 19, 50.0f);

            vkCmdPushConstants(commandBuffer, this.vulkanRenderer.pipelineLayouts().staticGrid(), VK_SHADER_STAGE_VERTEX_BIT, 0, (int) pushConstants.byteSize(), pushConstants);

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
