package yionos.demo.rendering;

import vulkan.VkDevice;
import vulkan.VkShaderModuleCreateInfo;
import yionos.demo.Disposable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemorySegment.NULL;

public class ShaderModule implements Disposable
{
    private final MemorySegment m_handle;
    private final int m_stage;
    public final VkDevice device;
    private final String m_entryPoint;

    public ShaderModule(VkDevice device, int stage, String entryPoint, MemorySegment dataBytes) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            VkShaderModuleCreateInfo shaderModuleCreateInfo = new VkShaderModuleCreateInfo(arena);
            shaderModuleCreateInfo.sType(VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO);
            shaderModuleCreateInfo.codeSize(dataBytes.byteSize());
            shaderModuleCreateInfo.pCode(dataBytes);

            MemorySegment pModule = arena.allocate(ADDRESS);
            VulkanException.check(vkCreateShaderModule(device, shaderModuleCreateInfo.ptr(), NULL, pModule), "Unable to create shader module");
            this.m_handle = pModule.get(ADDRESS, 0);

            this.m_stage = stage;
            this.device = device;
            this.m_entryPoint = entryPoint;
        }
    }

    public MemorySegment handle()
    {
        return this.m_handle;
    }

    public int stage()
    {
        return this.m_stage;
    }

    public String entryPoint()
    {
        return this.m_entryPoint;
    }

    @Override
    public void dispose()
    {
        vkDestroyShaderModule(this.device, this.m_handle, NULL);
    }
}
