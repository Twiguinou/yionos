package yionos.demo.rendering;

import jpgen.NativeTypes;
import vulkan.VkDevice;
import vulkan.VkShaderModuleCreateInfo;
import yionos.demo.Disposable;

import javax.annotation.Nullable;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static shaderc.Shaderc.*;
import static shaderc.shaderc_shader_kind.*;
import static shaderc.shaderc_optimization_level.*;
import static shaderc.shaderc_compilation_status.*;
import static vulkan.VkShaderStageFlagBits.*;
import static vulkan.VkStructureType.*;
import static java.lang.foreign.MemorySegment.NULL;

public class ShaderModule implements Disposable
{
    public record CompilationTask(String filename, boolean optimize) {}

    private final MemorySegment m_handle;
    private final int m_stage;
    public final VkDevice device;
    private final String m_entryPoint;

    public ShaderModule(VkDevice device, int stage, String entryPoint, MemorySegment dataBytes, @Nullable CompilationTask compilation) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            MemorySegment pCode, shadercResult;
            if (compilation != null)
            {
                MemorySegment compiler = shaderc_compiler_initialize();
                if (compiler.equals(NULL))
                {
                    throw new VulkanException("Failed to create shaderc compiler");
                }

                MemorySegment options = shaderc_compile_options_initialize();
                if (options.equals(NULL))
                {
                    shaderc_compiler_release(compiler);
                    throw new VulkanException("Failed to create shaderc options");
                }

                int shaderc_stage = mapShaderStage(stage);
                if (shaderc_stage == shaderc_vertex_shader) shaderc_compile_options_set_invert_y(options, true);
                if (compilation.optimize)
                {
                    shaderc_compile_options_set_optimization_level(options, shaderc_optimization_level_performance);
                }

                shadercResult = shaderc_compile_into_spv(compiler, dataBytes, dataBytes.byteSize(), shaderc_stage, arena.allocateUtf8String(compilation.filename),
                        arena.allocateUtf8String(entryPoint), options);
                shaderc_compile_options_release(options);
                shaderc_compiler_release(compiler);
                if (shadercResult.equals(NULL))
                {
                    throw new VulkanException(STR."Failed to compile shader: \{compilation.filename}");
                }

                if (shaderc_result_get_compilation_status(shadercResult) != shaderc_compilation_status_success)
                {
                    String errorLog = shaderc_result_get_error_message(shadercResult).reinterpret(NativeTypes.UNCHECKED_CHAR_PTR.byteSize()).getUtf8String(0);
                    throw new VulkanException(STR."Failed to compile shader{\{compilation.filename}} -> \{errorLog}");
                }

                pCode = shaderc_result_get_bytes(shadercResult).reinterpret(shaderc_result_get_length(shadercResult));
            }
            else
            {
                pCode = dataBytes;
                shadercResult = NULL;
            }

            VkShaderModuleCreateInfo shaderModuleCreateInfo = new VkShaderModuleCreateInfo(arena);
            shaderModuleCreateInfo.sType(VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO);
            shaderModuleCreateInfo.pNext(NULL);
            shaderModuleCreateInfo.flags(0);
            shaderModuleCreateInfo.codeSize(pCode.byteSize());
            shaderModuleCreateInfo.pCode(pCode);

            MemorySegment pModule = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(vkCreateShaderModule(device, shaderModuleCreateInfo.ptr(), NULL, pModule), "Unable to create shader module");
            this.m_handle = pModule.get(ValueLayout.ADDRESS, 0);

            if (!shadercResult.equals(NULL))
            {
                shaderc_result_release(shadercResult);
            }

            this.m_stage = stage;
            this.device = device;
            this.m_entryPoint = entryPoint;
        }
    }

    private static int mapShaderStage(int stage) throws VulkanException
    {
        return switch (stage)
        {
            case VK_SHADER_STAGE_VERTEX_BIT -> shaderc_vertex_shader;
            case VK_SHADER_STAGE_FRAGMENT_BIT -> shaderc_fragment_shader;
            case VK_SHADER_STAGE_GEOMETRY_BIT -> shaderc_geometry_shader;
            case VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT -> shaderc_tess_control_shader;
            case VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT -> shaderc_tess_evaluation_shader;
            case VK_SHADER_STAGE_COMPUTE_BIT -> shaderc_compute_shader;
            default -> throw new VulkanException(STR."Unsupported shader stage: \{stage}");
        };
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
