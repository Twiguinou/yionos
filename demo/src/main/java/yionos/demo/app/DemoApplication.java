package yionos.demo.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Matrix4d;
import org.joml.Vector3d;
import vulkan.VkDescriptorBufferInfo;
import vulkan.VkWriteDescriptorSet;
import yionos.demo.StackAllocator;
import yionos.demo.WindowProcessor;
import yionos.demo.app.scene.ObjectRenderer;
import yionos.demo.rendering.VulkanBuffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.time.Duration;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkDescriptorType.*;
import static vulkan.VkBufferUsageFlagBits.*;
import static vma.VmaMemoryUsage.*;
import static glfw3.GLFW3.*;
import static java.lang.foreign.MemorySegment.NULL;
import static yionos.utils.MathDefinitions.*;

public class DemoApplication
{
    private static final Logger gDemoLogger = LogManager.getLogger("Demo Application");
    private static final double gUpdateRate = 60.0;
    private static final double gFovRadians = radians(75.0);
    private static final double gNearPlaneDistance = 0.01, gFarPlaneDistance = 1000.0;
    private static final double gPhysicsTimeStep = 1.0 / gUpdateRate;
    private static final int gPhysicsSubstepCount = 20;

    public final WindowProcessor windowProc;
    private final VulkanRenderer m_renderer;
    private boolean m_running = false;
    private final WindowInputMap m_inputs;
    private final Camera m_camera;

    private final VulkanBuffer[] m_objectBuffers = new VulkanBuffer[VulkanRenderer.gFrameCount];

    public DemoApplication(WindowProcessor windowProc, int sampleCount)
    {
        final Runtime runtime = Runtime.getRuntime();
        gDemoLogger.info("JVM maximum memory size: {} MBs", (long)(runtime.maxMemory() / 1e+6));

        this.m_renderer = new VulkanRenderer(windowProc, sampleCount, true);
        this.m_camera = new Camera(new Vector3d(), new Vector3d(-30.0, 30.0, -60.0));
        this.m_camera.setProjection(gFovRadians, windowProc.width() / (double) windowProc.height(), gNearPlaneDistance, gFarPlaneDistance);

        this.m_inputs = new WindowInputMap(windowProc);
        windowProc.registerMouseWheelCallback((_, y) -> this.m_camera.translate(-y));

        this.windowProc = windowProc;

        try (Arena arena = Arena.ofConfined())
        {
            VkDescriptorBufferInfo descriptorBufferInfo = new VkDescriptorBufferInfo(arena);

            VkWriteDescriptorSet writeDescriptorSet = new VkWriteDescriptorSet(arena);
            writeDescriptorSet.sType(VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET);
            writeDescriptorSet.dstBinding(0);
            writeDescriptorSet.descriptorCount(1);
            writeDescriptorSet.descriptorType(VK_DESCRIPTOR_TYPE_STORAGE_BUFFER);
            writeDescriptorSet.pBufferInfo(descriptorBufferInfo.ptr());

            for (int i = 0; i < this.m_objectBuffers.length; i++)
            {
                this.m_objectBuffers[i] = new VulkanBuffer(this.m_renderer.logicalDevice().allocator(), 10000 * 16 * Float.BYTES, VK_BUFFER_USAGE_STORAGE_BUFFER_BIT, new int[] {this.m_renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_CPU_TO_GPU);

                descriptorBufferInfo.buffer(this.m_objectBuffers[i].handle());
                descriptorBufferInfo.offset(0);
                descriptorBufferInfo.range(this.m_objectBuffers[i].size());

                writeDescriptorSet.dstSet(this.m_renderer.descriptorSets(i).objectBuffer());

                vkUpdateDescriptorSets(this.m_renderer.logicalDevice().handle(), 1, writeDescriptorSet.ptr(), 0, NULL);
            }
        }

        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment ppData = arena.allocate(ValueLayout.ADDRESS);

            for (VulkanBuffer objectBuffer : this.m_objectBuffers)
            {
                objectBuffer.map(ppData);
                MemorySegment pData = ppData.get(ValueLayout.ADDRESS, 0).reinterpret(objectBuffer.size());

                Matrix4d transform = new Matrix4d();
                for (int x = 0; x < 100; x++)
                {
                    for (int y = 0; y < 100; y++)
                    {
                        transform.identity().translate(x - 50, 2.0, y - 50);
                        transform.get(pData.asSlice((x * 100 + y) * 16 * Float.BYTES).asByteBuffer().asFloatBuffer());
                    }
                }

                objectBuffer.unmap();
            }
        }
    }

    private void handleInputs()
    {
        if (this.m_inputs.keyToggled(GLFW_KEY_ESCAPE)) this.m_running = false;
        if (this.m_inputs.keyToggled(GLFW_KEY_C)) this.m_camera.reset();
        if (this.m_inputs.keyToggledWithMods(GLFW_KEY_ENTER, GLFW_MOD_ALT)) this.windowProc.toggleFullscreen();

        double mouseMoveX = this.m_inputs.displacementX(), mouseMoveY = this.m_inputs.displacementY();
        if (mouseMoveX != 0.0 || mouseMoveY != 0.0)
        {
            double interactionX = mouseMoveX * -0.001, interactionY = mouseMoveY * -0.001;
            if (this.m_inputs.mouseAction(0) == GLFW_PRESS) this.m_camera.rotate(interactionX * 5.0, interactionY * 5.0);
            else if (this.m_inputs.mouseAction(1) == GLFW_PRESS) this.m_camera.moveTarget(interactionX, interactionY);
        }
    }

    double theta = 0;

    public void run()
    {
        this.m_running = true;
        this.windowProc.show();

        long stamp = System.nanoTime();
        long nrate = (long) ((1.0 / gUpdateRate) * (1e+9));
        long nrate_epsilon = nrate / 10;

        while (this.m_running)
        {
            long frame = System.nanoTime();
            if (frame - stamp < nrate)
            {
                if (nrate - frame + stamp > nrate_epsilon)
                {
                    try
                    {
                        Thread.yield();
                        Thread.sleep(Duration.ofNanos(1000L));
                    }
                    catch (InterruptedException e)
                    {
                        gDemoLogger.error(e);
                    }
                }

                continue;
            }

            stamp = frame;

            Runtime runtime = Runtime.getRuntime();
            long usedMemory = (long) ((runtime.totalMemory() - runtime.freeMemory()) / (1e+6));
            this.windowProc.title(STR."yionos -- Current memory usage: \{usedMemory} MBs");

            this.windowProc.beginRenderStage();
            if (!this.windowProc.shouldClose())
            {
                if (this.windowProc.width() != 0 && this.windowProc.height() != 0)
                {
                    this.handleInputs();
                    this.m_inputs.trace();

                    this.m_camera.updateViewMatrix();
                    this.m_renderer.beginRenderFrame();

                    theta = (theta + 0.01) % (Math.PI * 2);

                    try (Arena arena = StackAllocator.stackPush())
                    {
                        MemorySegment ppData = arena.allocate(ValueLayout.ADDRESS);

                        this.m_objectBuffers[this.m_renderer.currentFrame()].map(ppData);
                        MemorySegment pData = ppData.get(ValueLayout.ADDRESS, 0).reinterpret(this.m_objectBuffers[this.m_renderer.currentFrame()].size());

                        Matrix4d transform = new Matrix4d();
                        for (int x = 0; x < 100; x++)
                        {
                            for (int y = 0; y < 100; y++)
                            {
                                transform.identity().translate(x - 50, Math.sin(theta + x * y) * 50, y - 50);
                                transform.get(pData.asSlice((x * 100 + y) * 16 * Float.BYTES).asByteBuffer().asFloatBuffer());
                            }
                        }

                        this.m_objectBuffers[this.m_renderer.currentFrame()].unmap();
                    }

                    this.m_renderer.bindGraphicsPipeline(this.m_renderer.pipelines().objectDebugInstanced());
                    this.m_renderer.renderObjectsInstanced(this.m_camera, 10000, ObjectRenderer.Type.CUBE);

                    this.m_renderer.bindGraphicsPipeline(this.m_renderer.pipelines().staticGrid());
                    this.m_renderer.renderStaticGrid(this.m_camera, new Matrix4d());

                    this.m_renderer.endRenderFrame();
                }
            }
            else
            {
                this.m_running = false;
            }

            this.windowProc.endRenderStage();
        }

        this.destroy();
    }

    public void destroy()
    {
        this.m_renderer.deviceWaitIdle();
        for (VulkanBuffer objectBuffer : this.m_objectBuffers)
        {
            objectBuffer.dispose();
        }

        this.m_renderer.destroy();
        this.windowProc.dispose();
    }
}
