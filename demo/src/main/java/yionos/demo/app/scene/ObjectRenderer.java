package yionos.demo.app.scene;

import org.joml.Matrix4d;
import org.joml.Vector4d;
import vulkan.VkCommandBuffer;
import yionos.demo.Disposable;
import yionos.demo.StackAllocator;
import yionos.demo.app.Camera;
import yionos.demo.app.MemoryUtil;
import yionos.demo.app.PipelineLayouts;
import yionos.demo.app.VulkanRenderer;
import yionos.demo.app.data.OBJModel;
import yionos.demo.app.data.ParsedModels;
import yionos.demo.rendering.VulkanBuffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Arrays;

import static vulkan.VulkanCore.*;
import static vulkan.VkIndexType.*;
import static vulkan.VkShaderStageFlagBits.*;
import static vulkan.VkBufferUsageFlagBits.*;
import static vma.VmaMemoryUsage.*;
import static java.lang.foreign.ValueLayout.*;

public class ObjectRenderer implements Disposable
{
    public enum Type
    {
        CUBE(ParsedModels.gCubeModel),
        SPHERE(ParsedModels.gIcosphereModel);

        private final OBJModel.Mesh modelMesh;

        Type(OBJModel model)
        {
            this.modelMesh = Arrays.stream(model.meshes()).findAny().orElseThrow();
        }
    }

    public record MeshColors(Vector4d lightColor, Vector4d darkColor, Vector4d borderColor) {}

    public final PipelineLayouts pipelineLayouts;
    private final VulkanBuffer m_vertexBuffer, m_indexBuffer;
    private final int m_indexCount;

    public ObjectRenderer(VulkanRenderer renderer, Type type)
    {
        try (Arena arena = Arena.ofConfined())
        {
            OBJModel.Mesh mainMesh = type.modelMesh;

            MemorySegment vertices = arena.allocate(JAVA_FLOAT, (long) mainMesh.vertices().length * 3);
            for (int i = 0; i < mainMesh.vertices().length; i++)
            {
                vertices.setAtIndex(JAVA_FLOAT, (long) i * 3, mainMesh.vertices()[i].x);
                vertices.setAtIndex(JAVA_FLOAT, (long) i * 3 + 1, mainMesh.vertices()[i].y);
                vertices.setAtIndex(JAVA_FLOAT, (long) i * 3 + 2, mainMesh.vertices()[i].z);
            }

            this.m_vertexBuffer = new VulkanBuffer(renderer.logicalDevice().allocator(), vertices.byteSize(), VK_BUFFER_USAGE_VERTEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_GPU_ONLY);
            this.m_vertexBuffer.upload(renderer.uploadCommandPool(), renderer.graphicsQueue(), vertices);

            this.m_indexCount = mainMesh.faces().length * 3;
            MemorySegment indices = arena.allocate(JAVA_INT, this.m_indexCount);
            for (int i = 0; i < mainMesh.faces().length; i++)
            {
                indices.setAtIndex(JAVA_INT, (long) i * 3, mainMesh.faces()[i].x);
                indices.setAtIndex(JAVA_INT, (long) i * 3 + 1, mainMesh.faces()[i].y);
                indices.setAtIndex(JAVA_INT, (long) i * 3 + 2, mainMesh.faces()[i].z);
            }

            this.m_indexBuffer = new VulkanBuffer(renderer.logicalDevice().allocator(), indices.byteSize(), VK_BUFFER_USAGE_INDEX_BUFFER_BIT | VK_BUFFER_USAGE_TRANSFER_DST_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_GPU_ONLY);
            this.m_indexBuffer.upload(renderer.uploadCommandPool(), renderer.graphicsQueue(), indices);

            this.pipelineLayouts = renderer.pipelineLayouts();
        }
    }

    public void render(VkCommandBuffer commandBuffer, Camera camera, Matrix4d transform, MeshColors colors)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            vkCmdBindVertexBuffers(commandBuffer, 0, 1, arena.allocateFrom(ADDRESS, this.m_vertexBuffer.handle()), arena.allocateFrom(JAVA_LONG, 0));
            vkCmdBindIndexBuffer(commandBuffer, this.m_indexBuffer.handle(), 0, VK_INDEX_TYPE_UINT32);

            Matrix4d clippedTransform = new Matrix4d();
            camera.transformationMatrix(transform, clippedTransform);

            MemorySegment vertexPushConstants = arena.allocate(JAVA_FLOAT, 16);
            MemoryUtil.getMatrix4dFloats(clippedTransform, vertexPushConstants);

            MemorySegment fragmentPushConstants = arena.allocate(JAVA_FLOAT, 12);
            MemoryUtil.getVector4dFloats(colors.lightColor, fragmentPushConstants);
            MemoryUtil.getVector4dFloats(colors.darkColor, fragmentPushConstants.asSlice(4 * Float.BYTES));
            MemoryUtil.getVector4dFloats(colors.borderColor, fragmentPushConstants.asSlice(8 * Float.BYTES));

            vkCmdPushConstants(commandBuffer, this.pipelineLayouts.objectDebug(), VK_SHADER_STAGE_VERTEX_BIT, 0, (int) vertexPushConstants.byteSize(), vertexPushConstants);
            vkCmdPushConstants(commandBuffer, this.pipelineLayouts.objectDebug(), VK_SHADER_STAGE_FRAGMENT_BIT, (int) vertexPushConstants.byteSize(), (int) fragmentPushConstants.byteSize(), fragmentPushConstants);

            vkCmdDrawIndexed(commandBuffer, this.m_indexCount, 1, 0, 0, 0);
        }
    }

    public void renderInstanced(VkCommandBuffer commandBuffer, Camera camera, int count)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            vkCmdBindVertexBuffers(commandBuffer, 0, 1, arena.allocateFrom(ADDRESS, this.m_vertexBuffer.handle()), arena.allocateFrom(JAVA_LONG, 0));
            vkCmdBindIndexBuffer(commandBuffer, this.m_indexBuffer.handle(), 0, VK_INDEX_TYPE_UINT32);

            MemorySegment pushConstants = arena.allocate(JAVA_FLOAT, 16);
            MemoryUtil.getMatrix4dFloats(camera.viewMatrix(), pushConstants);

            vkCmdPushConstants(commandBuffer, this.pipelineLayouts.objectDebugInstanced(), VK_SHADER_STAGE_VERTEX_BIT, 0, (int) pushConstants.byteSize(), pushConstants);

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
