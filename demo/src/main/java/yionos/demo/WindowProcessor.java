package yionos.demo;

import glfw3.GLFWerrorfun;
import glfw3.GLFWframebuffersizefun;
import glfw3.GLFWkeyfun;
import glfw3.GLFWvidmode;
import glfw3.GLFWwindowfocusfun;
import jpgen.NativeTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import yionos.demo.rendering.VulkanException;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static glfw3.GLFW3.*;
import static java.lang.foreign.MemorySegment.NULL;

public class WindowProcessor implements Disposable
{
    public static final Logger gWindowLogger = LogManager.getLogger("Window Processor");

    private final MemorySegment m_handle;
    private final Arena m_stubArena = Arena.ofAuto();
    private int m_width, m_height;
    private boolean m_focused;

    public WindowProcessor(String title, int width, int height)
    {
        try (Arena arena = Arena.ofConfined())
        {
            glfwSetErrorCallback(((GLFWerrorfun) (error, description) ->
            {
                description = description.reinterpret(NativeTypes.UNCHECKED_CHAR_PTR.byteSize());
                gWindowLogger.error(STR."GLFW error (\{error}): \{description.getUtf8String(0)}");
            }).makeHandle(this.m_stubArena));
            glfwDefaultWindowHints();
            glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);
            glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
            glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
            this.m_handle = glfwCreateWindow(width, height, arena.allocateUtf8String(title), NULL, NULL);
            if (this.m_handle.equals(NULL))
            {
                throw new IllegalStateException("Unable to create GLFW window.");
            }

            glfwSetFramebufferSizeCallback(this.m_handle, ((GLFWframebuffersizefun) (_, newWidth, newHeight) ->
            {
                this.m_width = newWidth;
                this.m_height = newHeight;
            }).makeHandle(this.m_stubArena));
            glfwSetWindowFocusCallback(this.m_handle, ((GLFWwindowfocusfun) (_, focused) ->
                    this.m_focused = focused != GLFW_FALSE).makeHandle(this.m_stubArena));
            glfwSetKeyCallback(this.m_handle, ((GLFWkeyfun) (_, key, scancode, action, mods) ->
            {
                if (key == GLFW_KEY_ESCAPE && action == GLFW_PRESS)
                {
                    glfwSetWindowShouldClose(this.m_handle, GLFW_TRUE);
                }
            }).makeHandle(this.m_stubArena));

            this.m_width = width;
            this.m_height = height;

            MemorySegment monitor = glfwGetPrimaryMonitor();
            MemorySegment pVidMode = glfwGetVideoMode(monitor);
            if (!pVidMode.equals(NULL))
            {
                GLFWvidmode vidMode = new GLFWvidmode(pVidMode.reinterpret(GLFWvidmode.gStructLayout.byteSize()));
                MemorySegment pX = arena.allocate(ValueLayout.JAVA_INT), pY = arena.allocate(ValueLayout.JAVA_INT);
                glfwGetMonitorPos(monitor, pX, pY);

                int x = pX.get(ValueLayout.JAVA_INT, 0), y = pY.get(ValueLayout.JAVA_INT, 0);
                glfwSetWindowPos(this.m_handle, x + (vidMode.width() - width) / 2, y + (vidMode.height() - height) / 2);
            }

            this.m_focused = true;
        }
    }

    public static void terminateGlfw()
    {
        glfwTerminate();
    }

    public static String[] getVulkanExtensions() throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pExtensionCount = arena.allocate(ValueLayout.JAVA_INT);
            MemorySegment glfwExtensions = glfwGetRequiredInstanceExtensions(pExtensionCount);
            int extensionCount = pExtensionCount.get(ValueLayout.JAVA_INT, 0);
            if (extensionCount == 0)
            {
                throw new VulkanException("An error occurred while acquiring GLFW required extensions.");
            }

            glfwExtensions = glfwExtensions.reinterpret(ValueLayout.ADDRESS.byteSize() * extensionCount);
            String[] extensions = new String[extensionCount];
            for (int i = 0; i < extensionCount; i++)
            {
                extensions[i] = glfwExtensions.getAtIndex(ValueLayout.ADDRESS, i).reinterpret(NativeTypes.UNCHECKED_CHAR_PTR.byteSize()).getUtf8String(0);
            }

            return extensions;
        }
    }

    private MemorySegment resolveWindowMonitor()
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pMonitorCount = arena.allocate(ValueLayout.JAVA_INT);
            MemorySegment monitors = glfwGetMonitors(pMonitorCount);
            MemorySegment pX = arena.allocate(ValueLayout.JAVA_INT), pY = arena.allocateArray(ValueLayout.JAVA_INT);
            int monitorCount = pMonitorCount.get(ValueLayout.JAVA_INT, 0);

            glfwGetWindowPos(this.m_handle, pX, pY);
            int windowPx = pX.get(ValueLayout.JAVA_INT, 0), windowPy = pY.get(ValueLayout.JAVA_INT, 0);
            glfwGetWindowSize(this.m_handle, pX, pY);
            int windowSx = pX.get(ValueLayout.JAVA_INT, 0), windowSy = pY.get(ValueLayout.JAVA_INT, 0);

            MemorySegment bestMonitor = NULL;
            int bestOverlapArea = -1;
            for (int i = 0; i < monitorCount; i++)
            {
                MemorySegment monitor = monitors.getAtIndex(ValueLayout.ADDRESS, i);
                MemorySegment pVidMode = glfwGetVideoMode(monitor);
                if (pVidMode.equals(NULL))
                {
                    continue;
                }

                GLFWvidmode vidMode = new GLFWvidmode(pVidMode.reinterpret(GLFWvidmode.gStructLayout.byteSize()));
                glfwGetMonitorPos(monitor, pX, pY);
                int monitorPx = pX.get(ValueLayout.JAVA_INT, 0), monitorPy = pY.get(ValueLayout.JAVA_INT, 0);

                int overlapArea = Math.max(0, Math.min(windowPx + windowSx, vidMode.width() + monitorPx) - Math.max(windowPx, monitorPx)) *
                        Math.max(0, Math.min(windowPy + windowSy, vidMode.height() + monitorPy) - Math.max(windowPy, monitorPy));
                if (overlapArea > bestOverlapArea)
                {
                    bestMonitor = monitor;
                    bestOverlapArea = overlapArea;
                }
            }

            return bestMonitor;
        }
    }

    public void show()
    {
        glfwShowWindow(this.m_handle);
    }

    public void hide()
    {
        glfwHideWindow(this.m_handle);
    }

    public void beginRenderStage()
    {
        glfwPollEvents();
    }

    public void endRenderStage() {}

    public boolean shouldClose()
    {
        return glfwWindowShouldClose(this.m_handle) != GLFW_FALSE;
    }

    public boolean focused()
    {
        return this.m_focused;
    }

    public int createVulkanSurface(MemorySegment instance, MemorySegment allocator, MemorySegment surface)
    {
        return glfwCreateWindowSurface(instance, this.m_handle, allocator, surface);
    }

    public int width()
    {
        return this.m_width;
    }

    public int height()
    {
        return this.m_height;
    }

    @Override
    public void dispose()
    {
        glfwDestroyWindow(this.m_handle);
    }

    static
    {
        if (glfwInit() == GLFW_FALSE)
        {
            throw new IllegalStateException("GLFW initialization failed.");
        }
    }
}
