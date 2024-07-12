package yionos.demo.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Matrix4d;
import org.joml.Vector3d;
import yionos.demo.WindowProcessor;
import yionos.demo.app.samples.DemoSample;

import java.lang.foreign.Arena;
import java.lang.foreign.SegmentAllocator;
import java.time.Duration;

import static glfw3.GLFW3.*;
import static nuklear.Nuklear.*;
import static nuklear.Nuklear.nk_end;
import static nuklear.nk_panel_flags.*;
import static yionos.utils.MathDefinitions.*;
import static java.lang.foreign.ValueLayout.*;

public class DemoApplication
{
    private static final Logger gDemoLogger = LogManager.getLogger("Demo Application");
    private static final double gUpdateRate = 60.0;
    private static final double gFovRadians = radians(75.0);
    private static final double gNearPlaneDistance = 0.01, gFarPlaneDistance = 1000.0;

    public final WindowProcessor windowProc;
    private final VulkanRenderer m_renderer;
    private boolean m_running = false;
    private final WindowInputMap m_inputs;
    private final Camera m_camera;
    private final NuklearContext m_overlayContext;
    private DemoSample m_runningSample;
    private boolean m_silentMouseInputs = false;
    private final DemoSample.Supplier[] m_samples;

    public DemoApplication(WindowProcessor windowProc, int msaaSampleCount, DemoSample.Supplier[] samples, DemoSample.Supplier initialSample)
    {
        final Runtime runtime = Runtime.getRuntime();
        gDemoLogger.info("JVM maximum memory size: {} MBs", (long)(runtime.maxMemory() / 1e+6));

        this.m_renderer = new VulkanRenderer(windowProc, msaaSampleCount, true);
        this.m_camera = new Camera(new Vector3d(), new Vector3d(-5.0, 5.0, -7.0));
        this.setCameraProjection(windowProc.width(), windowProc.height());

        this.m_inputs = new WindowInputMap(windowProc);
        windowProc.registerMouseWheelCallback((_, y) ->
        {
            if (!this.m_silentMouseInputs)
            {
                this.m_camera.translate(-y);
            }
        });
        windowProc.registerSizeCallback(this::setCameraProjection);

        this.m_overlayContext = new NuklearContext(this.m_renderer);

        this.windowProc = windowProc;

        this.m_samples = samples;
        this.m_runningSample = initialSample.get(this.m_renderer);
        this.m_runningSample.initSimulation();
    }

    private void setCameraProjection(int width, int height)
    {
        this.m_camera.setProjection(gFovRadians, width / (double) height, gNearPlaneDistance, gFarPlaneDistance);
    }

    private void handleInputs()
    {
        if (this.m_inputs.keyToggled(GLFW_KEY_ESCAPE)) this.m_running = false;
        if (this.m_inputs.keyToggled(GLFW_KEY_C)) this.m_camera.reset();
        if (this.m_inputs.keyToggledWithMods(GLFW_KEY_ENTER, GLFW_MOD_ALT)) this.windowProc.toggleFullscreen();
        if (this.m_inputs.keyToggled(GLFW_KEY_R)) this.m_runningSample.initSimulation();

        if (!this.m_silentMouseInputs)
        {
            double mouseMoveX = this.m_inputs.displacementX(), mouseMoveY = this.m_inputs.displacementY();
            if (mouseMoveX != 0.0 || mouseMoveY != 0.0)
            {
                double interactionX = mouseMoveX * -0.001, interactionY = mouseMoveY * -0.001;
                if (this.m_inputs.mouseAction(0) == GLFW_PRESS) this.m_camera.rotate(interactionX * 5.0, interactionY * 5.0);
                else if (this.m_inputs.mouseAction(1) == GLFW_PRESS) this.m_camera.moveTarget(interactionX, interactionY);
            }
        }

        this.m_runningSample.handleInputs(this.m_inputs);
    }

    private void arrangeSamplesOverlay()
    {
        try (Arena arena = Arena.ofConfined())
        {
            if (nk_begin(this.m_overlayContext.pContext(), arena.allocateFrom("Available samples"), nk_rect(arena, 20, 20, 230, 250),
                    NK_WINDOW_BORDER | NK_WINDOW_MOVABLE | NK_WINDOW_TITLE | NK_WINDOW_MINIMIZABLE) != 0)
            {
                SegmentAllocator bufferAllocator = SegmentAllocator.prefixAllocator(arena.allocate(JAVA_CHAR, 128));
                for (DemoSample.Supplier sampleSupplier : this.m_samples)
                {
                    nk_layout_row_dynamic(this.m_overlayContext.pContext(), 25, 1);
                    if (nk_button_label(this.m_overlayContext.pContext(), bufferAllocator.allocateFrom(sampleSupplier.identifier())) != 0)
                    {
                        this.m_runningSample.dispose();
                        this.m_runningSample = sampleSupplier.get(this.m_renderer);
                        this.m_runningSample.initSimulation();
                    }
                }
            }

            nk_end(this.m_overlayContext.pContext());
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
            this.windowProc.title(String.format("yionos -- Current memory usage: %d MBs", usedMemory));

            this.m_runningSample.update();

            this.windowProc.beginRenderStage();
            if (!this.windowProc.shouldClose())
            {
                if (this.windowProc.width() != 0 && this.windowProc.height() != 0)
                {
                    this.m_overlayContext.updateInputs(this.m_inputs);
                    this.arrangeSamplesOverlay();
                    this.m_runningSample.arrangeOverlay(this.m_overlayContext);
                    this.m_silentMouseInputs = nk_window_is_any_hovered(this.m_overlayContext.pContext()) != 0;

                    this.handleInputs();
                    this.m_inputs.trace();

                    this.m_camera.updateViewMatrix();
                    this.m_renderer.beginRenderFrame();

                    this.m_runningSample.render(this.m_camera);

                    this.m_renderer.bindGraphicsPipeline(this.m_renderer.pipelines().staticGrid());
                    this.m_renderer.renderStaticGrid(this.m_camera, new Matrix4d());

                    // Don't miss this!
                    this.m_overlayContext.render(this.windowProc.width(), this.windowProc.height());

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

        this.m_runningSample.dispose();

        this.m_overlayContext.dispose();

        this.m_renderer.dispose();
        this.windowProc.dispose();
    }
}
