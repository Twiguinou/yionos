package yionos.demo.app.samples;

import org.joml.Matrix4d;
import vulkan.VkDescriptorBufferInfo;
import vulkan.VkWriteDescriptorSet;
import yionos.demo.StackAllocator;
import yionos.demo.app.Camera;
import yionos.demo.app.NuklearContext;
import yionos.demo.app.VulkanRenderer;
import yionos.demo.app.WindowInputMap;
import yionos.demo.app.scene.ObjectRenderer;
import yionos.demo.rendering.VulkanBuffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static nuklear.Nuklear.*;
import static nuklear.nk_panel_flags.*;
import static nuklear.nk_text_align.*;
import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkBufferUsageFlagBits.*;
import static vulkan.VkDescriptorType.*;
import static vma.VmaMemoryUsage.*;
import static java.lang.foreign.MemorySegment.NULL;

public class InstancingSample implements DemoSample
{
    private static final int MAX_DRAW_COUNT = 1000000;

    public final VulkanRenderer renderer;
    private final MemorySegment m_frameObjectDescriptorSets;
    private final VulkanBuffer[] m_objectBuffers = new VulkanBuffer[VulkanRenderer.gFrameCount];
    private int m_drawCount = MAX_DRAW_COUNT;

    public InstancingSample(VulkanRenderer renderer)
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pSetLayouts = arena.allocateArray(ValueLayout.ADDRESS, this.m_objectBuffers.length);
            for (int i = 0; i < this.m_objectBuffers.length; i++)
            {
                pSetLayouts.setAtIndex(ValueLayout.ADDRESS, i, renderer.descriptorSetLayouts().objectBuffer());
            }

            this.m_frameObjectDescriptorSets = Arena.ofAuto().allocateArray(ValueLayout.ADDRESS, this.m_objectBuffers.length);
            renderer.descriptorPool().allocateDescriptorSets(this.m_objectBuffers.length, pSetLayouts, this.m_frameObjectDescriptorSets);

            VkDescriptorBufferInfo descriptorBufferInfo = new VkDescriptorBufferInfo(arena);

            VkWriteDescriptorSet writeDescriptorSet = new VkWriteDescriptorSet(arena);
            writeDescriptorSet.sType(VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET);
            writeDescriptorSet.dstBinding(0);
            writeDescriptorSet.descriptorCount(1);
            writeDescriptorSet.descriptorType(VK_DESCRIPTOR_TYPE_STORAGE_BUFFER);
            writeDescriptorSet.pBufferInfo(descriptorBufferInfo.ptr());

            for (int i = 0; i < this.m_objectBuffers.length; i++)
            {
                this.m_objectBuffers[i] = new VulkanBuffer(renderer.logicalDevice().allocator(), MAX_DRAW_COUNT * 16 * Float.BYTES, VK_BUFFER_USAGE_STORAGE_BUFFER_BIT, new int[] {renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_CPU_TO_GPU);

                descriptorBufferInfo.buffer(this.m_objectBuffers[i].handle());
                descriptorBufferInfo.offset(0);
                descriptorBufferInfo.range(this.m_objectBuffers[i].size());

                writeDescriptorSet.dstSet(this.m_frameObjectDescriptorSets.getAtIndex(ValueLayout.ADDRESS, i));

                vkUpdateDescriptorSets(renderer.logicalDevice().handle(), 1, writeDescriptorSet.ptr(), 0, NULL);
            }
        }

        this.renderer = renderer;
    }

    @Override
    public void initSimulation() {}

    @Override
    public void handleInputs(WindowInputMap inputs) {}

    @Override
    public void update() {}

    double epsilon = 0;

    @Override
    public void render(Camera camera)
    {
        int frame = this.renderer.currentFrame();
        VulkanBuffer buffer = this.m_objectBuffers[frame];

        try (Arena arena = StackAllocator.stackPush())
        {
            MemorySegment ppData = arena.allocate(ValueLayout.ADDRESS);
            buffer.map(ppData);
            MemorySegment pData = ppData.get(ValueLayout.ADDRESS, 0).reinterpret(buffer.size());

            Matrix4d transform = new Matrix4d();

            epsilon = (epsilon + 0.00001) % Math.PI;

            int objectIndex = 0;
            outer: for (int x = 0; x < 100; x++)
            {
                for (int y = 0; y < 100; y++)
                {
                    for (int z = 0; z < 100; z++)
                    {
                        if (objectIndex >= this.m_drawCount)
                        {
                            break outer;
                        }

                        transform.translation(x * 2 - 100, Math.sin(epsilon * x * z) + y * 2 - 100, z * 2 - 100);

                        transform.get(pData.asSlice((long) objectIndex * 16 * Float.BYTES).asByteBuffer().asFloatBuffer());
                        ++objectIndex;
                    }
                }
            }

            buffer.unmap();
        }

        this.renderer.bindGraphicsPipeline(this.renderer.pipelines().objectDebugInstanced());
        this.renderer.bindGraphicsDescriptorSets(this.renderer.pipelineLayouts().objectDebugInstanced(), 0, 1, this.m_frameObjectDescriptorSets.asSlice(frame * ValueLayout.ADDRESS.byteSize()), 0, NULL);
        this.renderer.renderObjectsInstanced(camera, this.m_drawCount, ObjectRenderer.Type.CUBE);
    }

    @Override
    public void arrangeOverlay(NuklearContext context)
    {
        try (Arena arena = StackAllocator.stackPush())
        {
            if (nk_begin(context.pContext(), arena.allocateUtf8String("Scene configuration"), nk_rect(arena, 20, 300, 230, 250),
                    NK_WINDOW_BORDER | NK_WINDOW_MOVABLE | NK_WINDOW_TITLE | NK_WINDOW_MINIMIZABLE) != 0)
            {
                nk_layout_row_dynamic(context.pContext(), 20, 2);
                nk_label(context.pContext(), arena.allocateUtf8String("Draw count:"), NK_TEXT_ALIGN_LEFT);
                MemorySegment pCount = arena.allocate(ValueLayout.JAVA_INT, this.m_drawCount);
                if (nk_slider_int(context.pContext(), 0, pCount, MAX_DRAW_COUNT, 100000) != 0)
                {
                    this.m_drawCount = pCount.get(ValueLayout.JAVA_INT, 0);
                }
            }

            nk_end(context.pContext());
        }
    }

    @Override
    public void dispose()
    {
        this.renderer.deviceWaitIdle();
        for (VulkanBuffer objectBuffer : this.m_objectBuffers)
        {
            objectBuffer.dispose();
        }

        renderer.descriptorPool().freeDescriptorSets(this.m_objectBuffers.length, this.m_frameObjectDescriptorSets);
    }
}
