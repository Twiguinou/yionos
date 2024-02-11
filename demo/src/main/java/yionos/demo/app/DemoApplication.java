package yionos.demo.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Vector3d;
import yionos.demo.WindowProcessor;

import java.time.Duration;

import static glfw3.GLFW3.*;
import static yionos.MathDefinitions.*;

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

    public DemoApplication(WindowProcessor windowProc, int sampleCount)
    {
        final Runtime runtime = Runtime.getRuntime();
        gDemoLogger.info("JVM maximum memory size: {} MBs", (long)(runtime.maxMemory() / 1e+6));

        this.m_renderer = new VulkanRenderer(windowProc, sampleCount, false);
        this.m_camera = new Camera(new Vector3d(), new Vector3d(7.0, 3.0, 2.0));
        this.m_camera.setProjection(gFovRadians, windowProc.width() / (double) windowProc.height(), gNearPlaneDistance, gFarPlaneDistance);

        this.m_inputs = new WindowInputMap(windowProc);
        windowProc.registerMouseWheelCallback((_, y) -> this.m_camera.translate(-y));

        this.windowProc = windowProc;
    }

    private void handleInputs()
    {
        if (this.m_inputs.keyToggled(GLFW_KEY_ESCAPE)) this.m_running = false;
        if (this.m_inputs.keyToggled(GLFW_KEY_F)) this.windowProc.toggleFullscreen();

        double mouseMoveX = this.m_inputs.displacementX(), mouseMoveY = this.m_inputs.displacementY();
        if (mouseMoveX != 0.0 || mouseMoveY != 0.0)
        {
            if (this.m_inputs.mouseInput(0) == GLFW_PRESS) this.m_camera.rotate(mouseMoveX * 0.005, mouseMoveY * -0.005);
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

                    this.m_renderer.beginRenderFrame();

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
        this.m_renderer.destroy();
        this.windowProc.dispose();
    }
}
