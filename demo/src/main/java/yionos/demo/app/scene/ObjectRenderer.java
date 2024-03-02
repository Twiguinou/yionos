package yionos.demo.app.scene;

import org.joml.Matrix4d;
import org.joml.Vector4d;
import vulkan.VkCommandBuffer;
import yionos.demo.Disposable;
import yionos.demo.StackAllocator;
import yionos.demo.app.Camera;
import yionos.demo.app.VulkanRenderer;
import yionos.demo.app.data.OBJLoader;
import yionos.demo.app.data.OBJModel;
import yionos.demo.rendering.VulkanBuffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

import static vulkan.VulkanCore.*;
import static vulkan.VkIndexType.*;
import static vulkan.VkShaderStageFlagBits.*;
import static vulkan.VkBufferUsageFlagBits.*;
import static vma.VmaMemoryUsage.*;

public class ObjectRenderer implements Disposable
{
    public enum Type
    {
        CUBE("cube.obj"),
        SPHERE("icosphere.obj");

        private final String modelFile;

        Type(String modelFile)
        {
            this.modelFile = modelFile;
        }
    }

    public record MeshColors(Vector4d lightColor, Vector4d darkColor, Vector4d borderColor) {}

    public final VulkanRenderer vulkanRenderer;
    private final VulkanBuffer m_vertexBuffer, m_indexBuffer;
    private final int m_indexCount;

    public ObjectRenderer(VulkanRenderer renderer, Type type)
    {
        try (Arena arena = Arena.ofConfined())
        {
            OBJLoader loader = new OBJLoader("models");
            OBJModel.Mesh mainMesh = Arrays.stream(loader.parseGeometry(type.modelFile).meshes()).findAny().orElseThrow();

            MemorySegment vertices = arena.allocateArray(ValueLayout.JAVA_FLOAT, (long) mainMesh.vertices().length * 3);
            for (int i = 0; i < mainMesh.vertices().length; i++)
            {
                vertices.setAtIndex(ValueLayout.JAVA_FLOAT, (long) i * 3, mainMesh.vertices()[i].x);
                vertices.setAtIndex(ValueLayout.JAVA_FLOAT, (long) i * 3 + 1, mainMesh.vertices()[i].y);
                vertices.setAtIndex(ValueLayout.JAVA_FLOAT, (long) i * 3 + 2, mainMesh.vertices()[i].z);
            }

            this.m_vertexBuffer = new VulkanBuffer(renderer.logicalDevice().allocator(), vertices.byteSize(), VK_BUFFER_USAGE_VERTEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_GPU_ONLY);
            this.m_vertexBuffer.upload(renderer.uploadCommandPool(), renderer.graphicsQueue(), vertices);

            this.m_indexCount = mainMesh.faces().length * 3;
            MemorySegment indices = arena.allocateArray(ValueLayout.JAVA_INT, this.m_indexCount);
            for (int i = 0; i < mainMesh.faces().length; i++)
            {
                indices.setAtIndex(ValueLayout.JAVA_INT, (long) i * 3, mainMesh.faces()[i].x);
                indices.setAtIndex(ValueLayout.JAVA_INT, (long) i * 3 + 1, mainMesh.faces()[i].y);
                indices.setAtIndex(ValueLayout.JAVA_INT, (long) i * 3 + 2, mainMesh.faces()[i].z);
            }

            this.m_indexBuffer = new VulkanBuffer(renderer.logicalDevice().allocator(), indices.byteSize(), VK_BUFFER_USAGE_INDEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_GPU_ONLY);
            this.m_indexBuffer.upload(renderer.uploadCommandPool(), renderer.graphicsQueue(), indices);

            this.vulkanRenderer = renderer;
        }
    }

    public void render(VkCommandBuffer commandBuffer, Camera camera, Matrix4d transform, MeshColors colors)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            vkCmdBindVertexBuffers(commandBuffer, 0, 1, arena.allocate(ValueLayout.ADDRESS, this.m_vertexBuffer.handle()), arena.allocate(ValueLayout.JAVA_LONG, 0));
            vkCmdBindIndexBuffer(commandBuffer, this.m_indexBuffer.handle(), 0, VK_INDEX_TYPE_UINT32);

            Matrix4d clippedTransform = new Matrix4d();
            camera.transformationMatrix(transform, clippedTransform);

            MemorySegment vertexPushConstants = arena.allocateArray(ValueLayout.JAVA_FLOAT, 16);
            clippedTransform.get(vertexPushConstants.asByteBuffer().asFloatBuffer());

            MemorySegment fragmentPushConstants = arena.allocateArray(ValueLayout.JAVA_FLOAT, 12);
            colors.lightColor.get(fragmentPushConstants.asByteBuffer().asFloatBuffer());
            colors.darkColor.get(fragmentPushConstants.asSlice(4 * Float.BYTES).asByteBuffer().asFloatBuffer());
            colors.borderColor.get(fragmentPushConstants.asSlice(8 * Float.BYTES).asByteBuffer().asFloatBuffer());

            vkCmdPushConstants(commandBuffer, this.vulkanRenderer.pipelineLayouts().objectDebug(), VK_SHADER_STAGE_VERTEX_BIT, 0, (int) vertexPushConstants.byteSize(), vertexPushConstants);
            vkCmdPushConstants(commandBuffer, this.vulkanRenderer.pipelineLayouts().objectDebug(), VK_SHADER_STAGE_FRAGMENT_BIT, (int) vertexPushConstants.byteSize(), (int) fragmentPushConstants.byteSize(), fragmentPushConstants);

            vkCmdDrawIndexed(commandBuffer, this.m_indexCount, 1, 0, 0, 0);
        }
    }

    public void renderInstanced(VkCommandBuffer commandBuffer, Camera camera, int count)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            vkCmdBindVertexBuffers(commandBuffer, 0, 1, arena.allocate(ValueLayout.ADDRESS, this.m_vertexBuffer.handle()), arena.allocate(ValueLayout.JAVA_LONG, 0));
            vkCmdBindIndexBuffer(commandBuffer, this.m_indexBuffer.handle(), 0, VK_INDEX_TYPE_UINT32);

            MemorySegment pushConstants = arena.allocateArray(ValueLayout.JAVA_FLOAT, 16);
            camera.viewMatrix().get(pushConstants.asByteBuffer().asFloatBuffer());

            vkCmdPushConstants(commandBuffer, this.vulkanRenderer.pipelineLayouts().objectDebugInstanced(), VK_SHADER_STAGE_VERTEX_BIT, 0, (int) pushConstants.byteSize(), pushConstants);

            vkCmdDrawIndexed(commandBuffer, this.m_indexCount, count, 0, 0, 0);
        }
    }

    @Override
    public void dispose()
    {
        this.m_indexBuffer.dispose();
        this.m_vertexBuffer.dispose();
    }
}
