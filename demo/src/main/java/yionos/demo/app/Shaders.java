package yionos.demo.app;

import vulkan.VkDevice;
import yionos.demo.Disposable;
import yionos.demo.rendering.ShaderModule;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import static vulkan.VkShaderStageFlagBits.*;
import static yionos.demo.rendering.VulkanHelpers.*;

public record Shaders(Graphics grid, Graphics objectDebug, Graphics objectDebugInstanced, Graphics nuklearOverlay) implements Disposable
{
    public record Graphics(ShaderModule vertex, ShaderModule fragment) implements Disposable
    {
        public Graphics(VkDevice device, String vertexPath, String fragmentPath)
        {
            this(loadShader(device, vertexPath, VK_SHADER_STAGE_VERTEX_BIT), loadShader(device, fragmentPath, VK_SHADER_STAGE_FRAGMENT_BIT));
        }

        @Override
        public void dispose()
        {
            this.vertex.dispose();
            this.fragment.dispose();
        }
    }

    private static ShaderModule loadShader(VkDevice device, String filename, int stage)
    {
        try(InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(String.format("shaders/%s", filename)))
        {
            if (input == null)
            {
                throw new FileNotFoundException(filename);
            }

            return loadShaderFromStream(device, filename, input, stage);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static Shaders create(VkDevice device)
    {
        Graphics gridShaders = new Graphics(device, "grid-vs.glsl", "grid-fs.glsl");
        Graphics objectDebugShaders = new Graphics(device, "object-debug-vs.glsl", "object-debug-fs.glsl");
        Graphics objectDebugInstancedShaders = new Graphics(device, "object-debug-instanced-vs.glsl", "object-debug-instanced-fs.glsl");
        Graphics nuklearOverlayShaders = new Graphics(device, "nuklear-overlay-vs.glsl", "nuklear-overlay-fs.glsl");

        return new Shaders(gridShaders, objectDebugShaders, objectDebugInstancedShaders, nuklearOverlayShaders);
    }

    @Override
    public void dispose()
    {
        this.grid.dispose();
        this.objectDebug.dispose();
        this.objectDebugInstanced.dispose();
        this.nuklearOverlay.dispose();
    }
}
