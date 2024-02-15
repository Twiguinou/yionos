package yionos.demo.app;

import vulkan.VkDevice;
import yionos.demo.Disposable;
import yionos.demo.rendering.ShaderModule;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import static vulkan.VkShaderStageFlagBits.*;
import static yionos.demo.rendering.VulkanHelpers.*;

public record Shaders(ShaderModule gridVertex, ShaderModule gridFragment, ShaderModule objectDebugVertex, ShaderModule objectDebugFragment) implements Disposable
{
    private static ShaderModule loadShader(VkDevice device, String filename, int stage)
    {
        try(InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream(STR."shaders/\{filename}"))
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
        ShaderModule gridVertex = loadShader(device, "grid-vs.glsl", VK_SHADER_STAGE_VERTEX_BIT);
        ShaderModule gridFragment = loadShader(device, "grid-fs.glsl", VK_SHADER_STAGE_FRAGMENT_BIT);

        ShaderModule objectDebugVertex = loadShader(device, "object-debug-vs.glsl", VK_SHADER_STAGE_VERTEX_BIT);
        ShaderModule objectDebugFragment = loadShader(device, "object-debug-fs.glsl", VK_SHADER_STAGE_FRAGMENT_BIT);

        return new Shaders(gridVertex, gridFragment, objectDebugVertex, objectDebugFragment);
    }

    @Override
    public void dispose()
    {
        this.gridVertex.dispose();
        this.gridFragment.dispose();

        this.objectDebugVertex.dispose();
        this.objectDebugFragment.dispose();
    }
}
