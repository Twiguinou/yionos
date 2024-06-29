package yionos.demo;

import glfw3.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import yionos.demo.rendering.VulkanException;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.List;

import static glfw3.GLFW3.*;
import static stb.image.StbImage.*;
import static java.lang.foreign.ValueLayout.*;
import static jpgen.NativeTypes.UNBOUNDED_POINTER;
import static java.lang.foreign.MemorySegment.NULL;

public class WindowProcessor implements Disposable
{
    public interface SizeCallback {void invoke(int width, int height);}
    public interface MousePosCallback {void invoke(double x, double y);}
    public interface MouseButtonCallback {void invoke(int button, int action, int mods);}
    public interface MouseWheelCallback {void invoke(double x, double y);}
    public interface KeyInputCallback {void invoke(int key, int scancode, int action, int mods);}

    private record FullscreenData(int width, int height, int posX, int posY) {}

    public static final Logger gWindowLogger = LogManager.getLogger("Window Processor");

    private final MemorySegment m_handle;
    private final Arena m_stubArena = Arena.ofConfined();
    private int m_width, m_height;
    private boolean m_focused;
    private @Nullable FullscreenData m_fullscreenSaver = null;
    private String m_title = "";

    private final List<SizeCallback> m_sizeCallbacks = new ArrayList<>();
    private final List<MousePosCallback> m_mousePosCallbacks = new ArrayList<>();
    private final List<MouseButtonCallback> m_mouseButtonCallbacks = new ArrayList<>();
    private final List<MouseWheelCallback> m_mouseWheelCallbacks = new ArrayList<>();
    private final List<KeyInputCallback> m_keyInputCallbacks = new ArrayList<>();

    public WindowProcessor(String title, int width, int height)
    {
        if (glfwInit() == GLFW_FALSE)
        {
            throw new IllegalStateException("GLFW initialization failed.");
        }

        gWindowLogger.info("GLFW version: {}", glfwGetVersionString().getString(0));

        try (Arena arena = Arena.ofConfined())
        {
            glfwSetErrorCallback(((GLFWerrorfun) (error, description) ->
                    gWindowLogger.error("GLFW error ({}): {}", error, description.getString(0))
            ).makeHandle(this.m_stubArena));

            glfwDefaultWindowHints();
            glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);
            glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
            glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);

            this.m_handle = glfwCreateWindow(width, height, arena.allocateFrom(title), NULL, NULL);
            if (this.m_handle.equals(NULL))
            {
                throw new IllegalStateException("Unable to create GLFW window.");
            }

            glfwSetFramebufferSizeCallback(this.m_handle, ((GLFWframebuffersizefun) (_, newWidth, newHeight) ->
            {
                this.m_width = newWidth;
                this.m_height = newHeight;
                this.m_sizeCallbacks.forEach(callback -> callback.invoke(newWidth, newHeight));
            }).makeHandle(this.m_stubArena));

            glfwSetWindowFocusCallback(this.m_handle, ((GLFWwindowfocusfun) (_, focused) ->
                    this.m_focused = focused != GLFW_FALSE).makeHandle(this.m_stubArena));
            glfwSetKeyCallback(this.m_handle, ((GLFWkeyfun) (_, key, scancode, action, mods) ->
                    this.m_keyInputCallbacks.forEach(callback -> callback.invoke(key, scancode, action, mods))).makeHandle(this.m_stubArena));
            glfwSetCursorPosCallback(this.m_handle, ((GLFWcursorposfun) (_, mouseX, mouseY) ->
                    this.m_mousePosCallbacks.forEach(callback -> callback.invoke(mouseX, mouseY))).makeHandle(this.m_stubArena));
            glfwSetMouseButtonCallback(this.m_handle, ((GLFWmousebuttonfun) (_, button, action, mods) ->
                    this.m_mouseButtonCallbacks.forEach(callback -> callback.invoke(button, action, mods))).makeHandle(this.m_stubArena));
            glfwSetScrollCallback(this.m_handle, ((GLFWscrollfun) (_, xOffset, yOffset) ->
                    this.m_mouseWheelCallbacks.forEach(callback -> callback.invoke(xOffset, yOffset))).makeHandle(this.m_stubArena));

            this.m_width = width;
            this.m_height = height;

            try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("icon.png"))
            {
                if (inputStream == null)
                {
                    gWindowLogger.warn("Could not find window icon file.");
                }
                else
                {
                    MemorySegment iconRawData = arena.allocateFrom(JAVA_BYTE, inputStream.readAllBytes());

                    GLFWimage iconImage = new GLFWimage(arena);
                    iconImage.pixels(stbi_load_from_memory(iconRawData, (int) iconRawData.byteSize(), iconImage.$width(), iconImage.$height(), NULL, STBI_rgb_alpha));
                    glfwSetWindowIcon(this.m_handle, 1, iconImage.ptr());

                    stbi_image_free(iconImage.pixels());
                }
            }
            catch (IOException e)
            {
                gWindowLogger.error("Failed to load window icon: {}", e.toString());
            }

            MemorySegment monitor = glfwGetPrimaryMonitor();
            GLFWvidmode vidMode = new GLFWvidmode(glfwGetVideoMode(monitor));
            if (!vidMode.ptr().equals(NULL))
            {
                MemorySegment pX = arena.allocate(JAVA_INT), pY = arena.allocate(JAVA_INT);
                glfwGetMonitorPos(monitor, pX, pY);

                int x = pX.get(JAVA_INT, 0), y = pY.get(JAVA_INT, 0);
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
            MemorySegment pExtensionCount = arena.allocate(JAVA_INT);
            MemorySegment glfwExtensions = glfwGetRequiredInstanceExtensions(pExtensionCount);
            int extensionCount = pExtensionCount.get(JAVA_INT, 0);
            if (extensionCount == 0)
            {
                throw new VulkanException("An error occurred while acquiring GLFW required extensions.");
            }

            String[] extensions = new String[extensionCount];
            for (int i = 0; i < extensionCount; i++)
            {
                extensions[i] = glfwExtensions.getAtIndex(UNBOUNDED_POINTER, i).getString(0);
            }

            return extensions;
        }
    }

    private MemorySegment resolveWindowMonitor()
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pMonitorCount = arena.allocate(JAVA_INT);
            MemorySegment monitors = glfwGetMonitors(pMonitorCount);
            MemorySegment pX = arena.allocate(JAVA_INT), pY = arena.allocate(JAVA_INT);
            int monitorCount = pMonitorCount.get(JAVA_INT, 0);

            glfwGetWindowPos(this.m_handle, pX, pY);
            int windowPx = pX.get(JAVA_INT, 0), windowPy = pY.get(JAVA_INT, 0);
            glfwGetWindowSize(this.m_handle, pX, pY);
            int windowSx = pX.get(JAVA_INT, 0), windowSy = pY.get(JAVA_INT, 0);

            MemorySegment bestMonitor = NULL;
            int bestOverlapArea = -1;
            for (int i = 0; i < monitorCount; i++)
            {
                MemorySegment monitor = monitors.getAtIndex(ADDRESS, i);
                GLFWvidmode vidMode = new GLFWvidmode(glfwGetVideoMode(monitor));
                if (vidMode.ptr().equals(NULL))
                {
                    continue;
                }

                glfwGetMonitorPos(monitor, pX, pY);
                int monitorPx = pX.get(JAVA_INT, 0), monitorPy = pY.get(JAVA_INT, 0);

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

    public void toggleFullscreen()
    {
        if (this.m_fullscreenSaver != null)
        {
            glfwSetWindowMonitor(this.m_handle, NULL, this.m_fullscreenSaver.posX, this.m_fullscreenSaver.posY, this.m_fullscreenSaver.width, this.m_fullscreenSaver.height, 0);
            this.m_fullscreenSaver = null;
            return;
        }

        MemorySegment monitor = this.resolveWindowMonitor();
        if (monitor.equals(NULL))
        {
            monitor = glfwGetPrimaryMonitor();
        }

        GLFWvidmode vidMode = new GLFWvidmode(glfwGetVideoMode(monitor));
        if (!vidMode.ptr().equals(NULL))
        {
            try (Arena arena = Arena.ofConfined())
            {
                MemorySegment posX = arena.allocate(JAVA_INT), posY = arena.allocate(JAVA_INT);
                glfwGetWindowPos(this.m_handle, posX, posY);
                this.m_fullscreenSaver = new FullscreenData(this.m_width, this.m_height, posX.get(JAVA_INT, 0), posY.get(JAVA_INT, 0));
            }

            glfwSetWindowMonitor(this.m_handle, monitor, 0, 0, vidMode.width(), vidMode.height(), 0);
        }
    }

    public String title()
    {
        return this.m_title;
    }

    public void title(String title)
    {
        if (title.equals(this.m_title)) return;

        try (Arena arena = Arena.ofConfined())
        {
            glfwSetWindowTitle(this.m_handle, arena.allocateFrom(title));
            this.m_title = title;
        }
    }

    public void registerSizeCallback(SizeCallback callback) {this.m_sizeCallbacks.add(callback);}
    public void registerMousePosCallback(MousePosCallback callback) {this.m_mousePosCallbacks.add(callback);}
    public void registerMouseWheelCallback(MouseWheelCallback callback) {this.m_mouseWheelCallbacks.add(callback);}
    public void registerMouseButtonCallback(MouseButtonCallback callback) {this.m_mouseButtonCallbacks.add(callback);}
    public void registerKeyInputCallback(KeyInputCallback callback) {this.m_keyInputCallbacks.add(callback);}

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
        this.m_stubArena.close();
    }
}
