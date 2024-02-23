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
import yionos.detection.IndexedCollisionDispatcher;
import yionos.detection.HashtablePairStorage;
import yionos.detection.SweepAndPruneBroadphase;
import yionos.dynamics.DynamicSolidObject;
import yionos.dynamics.PhysicsVerse;
import yionos.dynamics.SolidObject;
import yionos.dynamics.geometries.PlaneGeometry;
import yionos.dynamics.geometries.SphereGeometry;

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
    private enum StepType
    {
        Single,
        Auto,
        None
    }

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

    private final MemorySegment m_frameObjectDescriptorSets;
    private final VulkanBuffer[] m_objectBuffers = new VulkanBuffer[VulkanRenderer.gFrameCount];

    private StepType m_stepType = StepType.Auto;
    private final PhysicsVerse m_physicsVerse;

    public DemoApplication(WindowProcessor windowProc, int sampleCount)
    {
        final Runtime runtime = Runtime.getRuntime();
        gDemoLogger.info("JVM maximum memory size: {} MBs", (long)(runtime.maxMemory() / 1e+6));

        this.m_renderer = new VulkanRenderer(windowProc, sampleCount, true);
        this.m_camera = new Camera(new Vector3d(), new Vector3d(-15.0, 15.0, -30.0));
        this.setCameraProjection(windowProc.width(), windowProc.height());

        this.m_inputs = new WindowInputMap(windowProc);
        windowProc.registerMouseWheelCallback((_, y) -> this.m_camera.translate(-y));
        windowProc.registerSizeCallback(this::setCameraProjection);

        this.windowProc = windowProc;

        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pSetLayouts = arena.allocateArray(ValueLayout.ADDRESS, 2);
            pSetLayouts.setAtIndex(ValueLayout.ADDRESS, 0, this.m_renderer.descriptorSetLayouts().objectBuffer());
            pSetLayouts.setAtIndex(ValueLayout.ADDRESS, 1, this.m_renderer.descriptorSetLayouts().objectBuffer());

            this.m_frameObjectDescriptorSets = Arena.ofAuto().allocateArray(ValueLayout.ADDRESS, 2);
            this.m_renderer.descriptorPool().allocateDescriptorSets(2, pSetLayouts, this.m_frameObjectDescriptorSets);
        }

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
                this.m_objectBuffers[i] = new VulkanBuffer(this.m_renderer.logicalDevice().allocator(), 1000000 * 16 * Float.BYTES, VK_BUFFER_USAGE_STORAGE_BUFFER_BIT, new int[] {this.m_renderer.graphicsQueue().family()}, VMA_MEMORY_USAGE_CPU_TO_GPU);

                descriptorBufferInfo.buffer(this.m_objectBuffers[i].handle());
                descriptorBufferInfo.offset(0);
                descriptorBufferInfo.range(this.m_objectBuffers[i].size());

                writeDescriptorSet.dstSet(this.m_frameObjectDescriptorSets.getAtIndex(ValueLayout.ADDRESS, i));

                vkUpdateDescriptorSets(this.m_renderer.logicalDevice().handle(), 1, writeDescriptorSet.ptr(), 0, NULL);
            }
        }

        //NaiveBroadphase broadphase = new NaiveBroadphase(new HashtablePairStorage())
        SweepAndPruneBroadphase broadphase = new SweepAndPruneBroadphase(new HashtablePairStorage());
        IndexedCollisionDispatcher collisionDispatcher = new IndexedCollisionDispatcher();
        this.m_physicsVerse = new PhysicsVerse(broadphase, collisionDispatcher);
        this.m_physicsVerse.gravity().set(0.0, -0.9, 0.0);

        this.initSimulation();
    }

    private void setCameraProjection(int width, int height)
    {
        this.m_camera.setProjection(gFovRadians, width / (double) height, gNearPlaneDistance, gFarPlaneDistance);
    }

    private void initSimulation()
    {
        this.m_physicsVerse.clearScene();

        SolidObject floor = new SolidObject();
        floor.friction(0.8);
        floor.restitution(0.5);

        floor.setGeometry(new PlaneGeometry(new Vector3d(0.0, -1.0, 0.0), 0.0));

        this.m_physicsVerse.addSolidObject(floor);

        SphereGeometry sphere = new SphereGeometry(0.5);

        for (int x = -4; x < 5; x++)
        {
            for (int y = -4; y < 5; y++)
            {
                for (int z = -4; z < 5; z++)
                {
                    DynamicSolidObject object = new DynamicSolidObject(1.0, sphere);
                    object.worldTransform().position().set(x * 2, y + 6, z * 2);

                    object.friction(0.7);
                    object.restitution(0.3);

                    this.m_physicsVerse.addSolidObject(object);

                    DynamicSolidObject projectile = new DynamicSolidObject(10.0, sphere);
                    projectile.worldTransform().position().set(x * 2 + Math.random() - 0.5, y + 20 + 6, z * 2 - Math.random() + 0.5);

                    projectile.applyCentralImpulse(new Vector3d(0, -50, 0));

                    projectile.friction(0.6);
                    projectile.restitution(0.3);

                    this.m_physicsVerse.addSolidObject(projectile);
                }
            }
        }
    }

    private void handleInputs()
    {
        if (this.m_inputs.keyToggled(GLFW_KEY_ESCAPE)) this.m_running = false;
        if (this.m_inputs.keyToggled(GLFW_KEY_C)) this.m_camera.reset();
        if (this.m_inputs.keyToggledWithMods(GLFW_KEY_ENTER, GLFW_MOD_ALT)) this.windowProc.toggleFullscreen();
        if (this.m_inputs.keyToggled(GLFW_KEY_S)) this.m_stepType = (this.m_stepType == StepType.Auto ? StepType.None : StepType.Auto);
        if ((this.m_inputs.keyToggled(GLFW_KEY_T) || this.m_inputs.keyAction(GLFW_KEY_T) == GLFW_REPEAT) && this.m_stepType != StepType.Auto) this.m_stepType = StepType.Single;
        if (this.m_inputs.keyToggled(GLFW_KEY_R)) this.initSimulation();

        double mouseMoveX = this.m_inputs.displacementX(), mouseMoveY = this.m_inputs.displacementY();
        if (mouseMoveX != 0.0 || mouseMoveY != 0.0)
        {
            double interactionX = mouseMoveX * -0.001, interactionY = mouseMoveY * -0.001;
            if (this.m_inputs.mouseAction(0) == GLFW_PRESS) this.m_camera.rotate(interactionX * 5.0, interactionY * 5.0);
            else if (this.m_inputs.mouseAction(1) == GLFW_PRESS) this.m_camera.moveTarget(interactionX, interactionY);
        }
    }

    public void run()
    {
        this.m_running = true;
        this.windowProc.show();

        long stamp = System.nanoTime();
        long nrate = (long) ((1.0 / gUpdateRate) * (1e+9));
        long nrate_epsilon = nrate / 10;

        while (this.m_running)
        {
            long frame = System.nanoTime(), elapsed = frame - stamp;
            if (elapsed < nrate)
            {
                if (nrate - elapsed > nrate_epsilon)
                {
                    try
                    {
                        Thread.yield();
                        Thread.sleep(Duration.ofNanos((nrate - elapsed) / 4));
                    }
                    catch (InterruptedException e)
                    {
                        gDemoLogger.error(e);
                    }
                }

                Thread.onSpinWait();
                continue;
            }

            stamp = frame;

            Runtime runtime = Runtime.getRuntime();
            long usedMemory = (long) ((runtime.totalMemory() - runtime.freeMemory()) / (1e+6));
            this.windowProc.title(STR."yionos -- Current memory usage: \{usedMemory} MBs");

            if (this.m_stepType == StepType.Auto)
            {
                this.m_physicsVerse.update(gPhysicsTimeStep, gPhysicsSubstepCount);
            }
            else if (this.m_stepType == StepType.Single)
            {
                this.m_physicsVerse.update(gPhysicsTimeStep, gPhysicsSubstepCount);
                this.m_stepType = StepType.None;
            }

            this.windowProc.beginRenderStage();
            if (!this.windowProc.shouldClose())
            {
                if (this.windowProc.width() != 0 && this.windowProc.height() != 0)
                {
                    this.handleInputs();
                    this.m_inputs.trace();

                    this.m_camera.updateViewMatrix();
                    this.m_renderer.beginRenderFrame();

                    if (!this.m_physicsVerse.dynamicObjects().isEmpty())
                    {
                        try (Arena arena = StackAllocator.stackPush())
                        {
                            MemorySegment ppData = arena.allocate(ValueLayout.ADDRESS);

                            this.m_objectBuffers[this.m_renderer.currentFrame()].map(ppData);
                            MemorySegment pData = ppData.get(ValueLayout.ADDRESS, 0).reinterpret(this.m_objectBuffers[this.m_renderer.currentFrame()].size());

                            Matrix4d transform = new Matrix4d();
                            for (int i = 0; i < this.m_physicsVerse.dynamicObjects().size(); i++)
                            {
                                this.m_physicsVerse.dynamicObjects().get(i).worldTransform().computeModelMatrix(transform);
                                transform.get(pData.asSlice((long) i * Float.BYTES * 16).asByteBuffer().asFloatBuffer());
                            }

                            this.m_objectBuffers[this.m_renderer.currentFrame()].unmap();
                        }

                        this.m_renderer.bindGraphicsPipeline(this.m_renderer.pipelines().objectDebugInstanced());
                        this.m_renderer.bindGraphicsDescriptorSets(this.m_renderer.pipelineLayouts().objectDebugInstanced(), 0, 1, this.pObjectDescriptorSet(this.m_renderer.currentFrame()), 0, NULL);
                        this.m_renderer.renderObjectsInstanced(this.m_camera, this.m_physicsVerse.dynamicObjects().size(), ObjectRenderer.Type.SPHERE);
                    }

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

    private MemorySegment pObjectDescriptorSet(int frame)
    {
        return this.m_frameObjectDescriptorSets.asSlice(ValueLayout.ADDRESS.byteSize() * frame);
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
