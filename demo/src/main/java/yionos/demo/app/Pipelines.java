package yionos.demo.app;

import vulkan.*;
import yionos.demo.Disposable;
import yionos.demo.rendering.LogicalDevice;
import yionos.demo.rendering.VulkanException;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static vulkan.VkBlendFactor.*;
import static vulkan.VkBlendOp.*;
import static vulkan.VkColorComponentFlagBits.*;
import static vulkan.VkCompareOp.*;
import static vulkan.VkCullModeFlagBits.*;
import static vulkan.VkFrontFace.*;
import static vulkan.VkLogicOp.*;
import static vulkan.VkPolygonMode.*;
import static vulkan.VkPrimitiveTopology.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkDynamicState.*;
import static vulkan.VkFormat.*;
import static vulkan.VkVertexInputRate.*;
import static java.lang.foreign.MemorySegment.NULL;

public record Pipelines(LogicalDevice logicalDevice,
                        MemorySegment staticGrid,
                        MemorySegment objectDebug, MemorySegment objectDebugWireframe, MemorySegment objectDebugInstanced,
                        MemorySegment nuklearOverlay) implements Disposable
{
    private static VkGraphicsPipelineCreateInfo makeGraphicsPrototype(SegmentAllocator allocator, MemorySegment layout, MemorySegment renderPass, int sampleCount, Shaders.Graphics shaders)
    {
        VkPipelineVertexInputStateCreateInfo vertexInputStateCreateInfo = new VkPipelineVertexInputStateCreateInfo(allocator);
        vertexInputStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);

        VkPipelineInputAssemblyStateCreateInfo inputAssemblyStateCreateInfo = new VkPipelineInputAssemblyStateCreateInfo(allocator);
        inputAssemblyStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO);
        inputAssemblyStateCreateInfo.topology(VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST);
        inputAssemblyStateCreateInfo.primitiveRestartEnable(VK_FALSE);

        VkPipelineTessellationStateCreateInfo tessellationStateCreateInfo = new VkPipelineTessellationStateCreateInfo(allocator);
        tessellationStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO);

        VkPipelineViewportStateCreateInfo viewportStateCreateInfo = new VkPipelineViewportStateCreateInfo(allocator);
        viewportStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO);
        viewportStateCreateInfo.viewportCount(1);
        viewportStateCreateInfo.scissorCount(1);

        VkPipelineRasterizationStateCreateInfo rasterizationStateCreateInfo = new VkPipelineRasterizationStateCreateInfo(allocator);
        rasterizationStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO);
        rasterizationStateCreateInfo.depthClampEnable(VK_TRUE);
        rasterizationStateCreateInfo.rasterizerDiscardEnable(VK_FALSE);
        rasterizationStateCreateInfo.polygonMode(VK_POLYGON_MODE_FILL);
        rasterizationStateCreateInfo.cullMode(VK_CULL_MODE_BACK_BIT);
        rasterizationStateCreateInfo.frontFace(VK_FRONT_FACE_COUNTER_CLOCKWISE);
        rasterizationStateCreateInfo.depthBiasEnable(VK_FALSE);
        rasterizationStateCreateInfo.lineWidth(1.0f);

        VkPipelineMultisampleStateCreateInfo multisampleStateCreateInfo = new VkPipelineMultisampleStateCreateInfo(allocator);
        multisampleStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO);
        multisampleStateCreateInfo.rasterizationSamples(1);
        multisampleStateCreateInfo.sampleShadingEnable(VK_TRUE);
        multisampleStateCreateInfo.minSampleShading(1.0f);
        multisampleStateCreateInfo.rasterizationSamples(sampleCount);
        multisampleStateCreateInfo.alphaToCoverageEnable(VK_FALSE);
        multisampleStateCreateInfo.alphaToOneEnable(VK_FALSE);

        VkPipelineDepthStencilStateCreateInfo depthStencilStateCreateInfo = new VkPipelineDepthStencilStateCreateInfo(allocator);
        depthStencilStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO);
        depthStencilStateCreateInfo.depthTestEnable(VK_TRUE);
        depthStencilStateCreateInfo.depthWriteEnable(VK_TRUE);
        depthStencilStateCreateInfo.depthCompareOp(VK_COMPARE_OP_LESS_OR_EQUAL);
        depthStencilStateCreateInfo.depthBoundsTestEnable(VK_FALSE);
        depthStencilStateCreateInfo.minDepthBounds(0.0f);
        depthStencilStateCreateInfo.maxDepthBounds(1.0f);

        VkPipelineColorBlendAttachmentState colorBlendAttachmentState = new VkPipelineColorBlendAttachmentState(allocator);
        colorBlendAttachmentState.colorWriteMask(VK_COLOR_COMPONENT_R_BIT | VK_COLOR_COMPONENT_G_BIT | VK_COLOR_COMPONENT_B_BIT | VK_COLOR_COMPONENT_A_BIT);
        colorBlendAttachmentState.blendEnable(VK_TRUE);
        colorBlendAttachmentState.srcColorBlendFactor(VK_BLEND_FACTOR_SRC_ALPHA);
        colorBlendAttachmentState.dstColorBlendFactor(VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA);
        colorBlendAttachmentState.colorBlendOp(VK_BLEND_OP_ADD);
        colorBlendAttachmentState.srcAlphaBlendFactor(VK_BLEND_FACTOR_ONE);
        colorBlendAttachmentState.dstAlphaBlendFactor(VK_BLEND_FACTOR_ZERO);
        colorBlendAttachmentState.alphaBlendOp(VK_BLEND_OP_ADD);

        VkPipelineColorBlendStateCreateInfo colorBlendStateCreateInfo = new VkPipelineColorBlendStateCreateInfo(allocator);
        colorBlendStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO);
        colorBlendStateCreateInfo.logicOpEnable(VK_FALSE);
        colorBlendStateCreateInfo.logicOp(VK_LOGIC_OP_COPY);
        colorBlendStateCreateInfo.blendConstants(0, 1.0f);
        colorBlendStateCreateInfo.blendConstants(1, 1.0f);
        colorBlendStateCreateInfo.blendConstants(2, 1.0f);
        colorBlendStateCreateInfo.blendConstants(3, 1.0f);
        colorBlendStateCreateInfo.attachmentCount(1);
        colorBlendStateCreateInfo.pAttachments(colorBlendAttachmentState.ptr());

        VkPipelineDynamicStateCreateInfo dynamicStateCreateInfo = new VkPipelineDynamicStateCreateInfo(allocator);
        dynamicStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO);
        dynamicStateCreateInfo.dynamicStateCount(2);
        dynamicStateCreateInfo.pDynamicStates(allocator.allocateArray(ValueLayout.JAVA_INT, VK_DYNAMIC_STATE_VIEWPORT, VK_DYNAMIC_STATE_SCISSOR));

        VkPipelineLayoutCreateInfo layoutCreateInfo = new VkPipelineLayoutCreateInfo(allocator);
        layoutCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);

        VkGraphicsPipelineCreateInfo pipelineCreateInfo = new VkGraphicsPipelineCreateInfo(allocator);
        pipelineCreateInfo.sType(VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO);
        pipelineCreateInfo.pVertexInputState(vertexInputStateCreateInfo.ptr());
        pipelineCreateInfo.pInputAssemblyState(inputAssemblyStateCreateInfo.ptr());
        pipelineCreateInfo.pTessellationState(tessellationStateCreateInfo.ptr());
        pipelineCreateInfo.pViewportState(viewportStateCreateInfo.ptr());
        pipelineCreateInfo.pRasterizationState(rasterizationStateCreateInfo.ptr());
        pipelineCreateInfo.pMultisampleState(multisampleStateCreateInfo.ptr());
        pipelineCreateInfo.pDepthStencilState(depthStencilStateCreateInfo.ptr());
        pipelineCreateInfo.pColorBlendState(colorBlendStateCreateInfo.ptr());
        pipelineCreateInfo.pDynamicState(dynamicStateCreateInfo.ptr());
        pipelineCreateInfo.layout(layout);
        pipelineCreateInfo.renderPass(renderPass);
        pipelineCreateInfo.subpass(0);
        pipelineCreateInfo.basePipelineIndex(-1);

        MemorySegment pStages = allocator.allocateArray(VkPipelineShaderStageCreateInfo.gStructLayout, 2);

        VkPipelineShaderStageCreateInfo vertexShaderStage = VkPipelineShaderStageCreateInfo.getAtIndex(pStages, 0);
        vertexShaderStage.sType(VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO);
        vertexShaderStage.stage(shaders.vertex().stage());
        vertexShaderStage.module(shaders.vertex().handle());
        vertexShaderStage.pName(allocator.allocateUtf8String(shaders.vertex().entryPoint()));

        VkPipelineShaderStageCreateInfo fragmentShaderStage = VkPipelineShaderStageCreateInfo.getAtIndex(pStages, 1);
        fragmentShaderStage.sType(VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO);
        fragmentShaderStage.stage(shaders.fragment().stage());
        fragmentShaderStage.module(shaders.fragment().handle());
        fragmentShaderStage.pName(allocator.allocateUtf8String(shaders.fragment().entryPoint()));

        pipelineCreateInfo.stageCount(2);
        pipelineCreateInfo.pStages(pStages);

        return pipelineCreateInfo;
    }

    private static MemorySegment buildGraphicsPipeline(SegmentAllocator allocator, VkDevice device, MemorySegment pPipelineCreateInfo) throws VulkanException
    {
        MemorySegment pPipeline = allocator.allocate(ValueLayout.ADDRESS);
        VulkanException.check(vkCreateGraphicsPipelines(device, NULL, 1, pPipelineCreateInfo, NULL, pPipeline), "Unable to create graphics pipeline");
        return pPipeline.get(ValueLayout.ADDRESS, 0);
    }

    private static void appendLineDynamicState(SegmentAllocator allocator, VkGraphicsPipelineCreateInfo pipelineCreateInfo)
    {
        VkPipelineDynamicStateCreateInfo dynamicStateCreateInfo = new VkPipelineDynamicStateCreateInfo(pipelineCreateInfo.pDynamicState().reinterpret(VkPipelineDynamicStateCreateInfo.gStructLayout.byteSize()));

        MemorySegment oldDynamicStates = dynamicStateCreateInfo.pDynamicStates().reinterpret(ValueLayout.JAVA_INT.byteSize() * dynamicStateCreateInfo.dynamicStateCount());

        boolean hasDynamicLineWidth = false;
        for (int i = 0; i < dynamicStateCreateInfo.dynamicStateCount(); i++)
        {
            if (oldDynamicStates.getAtIndex(ValueLayout.JAVA_INT, i) == VK_DYNAMIC_STATE_LINE_WIDTH)
            {
                hasDynamicLineWidth = true;
                break;
            }
        }

        if (!hasDynamicLineWidth)
        {
            MemorySegment dynamicStates = allocator.allocateArray(ValueLayout.JAVA_INT, dynamicStateCreateInfo.dynamicStateCount() + 1);
            dynamicStates.copyFrom(oldDynamicStates);
            dynamicStates.setAtIndex(ValueLayout.JAVA_INT, dynamicStateCreateInfo.dynamicStateCount(), VK_DYNAMIC_STATE_LINE_WIDTH);

            dynamicStateCreateInfo.dynamicStateCount(dynamicStateCreateInfo.dynamicStateCount() + 1);
            dynamicStateCreateInfo.pDynamicStates(dynamicStates);
        }
    }

    public static Pipelines create(LogicalDevice logicalDevice, MemorySegment renderPass, PipelineLayouts layouts, Shaders shaders, int sampleCount)
    {
        boolean hasWireframes = logicalDevice.physicalDevice.features().fillModeNonSolid() != VK_FALSE;
        boolean wideLines = logicalDevice.physicalDevice.features().wideLines() != VK_FALSE;

        MemorySegment staticGridPipeline;
        try (Arena arena = Arena.ofConfined())
        {
            VkGraphicsPipelineCreateInfo pipelineCreateInfo = makeGraphicsPrototype(arena, layouts.staticGrid(), renderPass, sampleCount, shaders.grid());

            VkVertexInputBindingDescription binding0 = new VkVertexInputBindingDescription(arena);
            binding0.binding(0);
            binding0.stride(2 * Float.BYTES);
            binding0.inputRate(VK_VERTEX_INPUT_RATE_VERTEX);

            VkVertexInputAttributeDescription attribute0 = new VkVertexInputAttributeDescription(arena);
            attribute0.location(0);
            attribute0.format(VK_FORMAT_R32G32_SFLOAT);
            attribute0.offset(0);

            VkPipelineVertexInputStateCreateInfo vertexInputStateCreateInfo = new VkPipelineVertexInputStateCreateInfo(pipelineCreateInfo.pVertexInputState().reinterpret(VkPipelineVertexInputStateCreateInfo.gStructLayout.byteSize()));
            vertexInputStateCreateInfo.vertexBindingDescriptionCount(1);
            vertexInputStateCreateInfo.pVertexBindingDescriptions(binding0.ptr());
            vertexInputStateCreateInfo.vertexAttributeDescriptionCount(1);
            vertexInputStateCreateInfo.pVertexAttributeDescriptions(attribute0.ptr());

            staticGridPipeline = buildGraphicsPipeline(arena, logicalDevice.handle(), pipelineCreateInfo.ptr());
        }

        MemorySegment objectDebugPipeline, objectDebugWireframePipeline;
        try (Arena arena = Arena.ofConfined())
        {
            VkGraphicsPipelineCreateInfo pipelineCreateInfo = makeGraphicsPrototype(arena, layouts.objectDebug(), renderPass, sampleCount, shaders.objectDebug());

            VkVertexInputBindingDescription binding0 = new VkVertexInputBindingDescription(arena);
            binding0.binding(0);
            binding0.stride(3 * Float.BYTES);
            binding0.inputRate(VK_VERTEX_INPUT_RATE_VERTEX);

            VkVertexInputAttributeDescription attribute0 = new VkVertexInputAttributeDescription(arena);
            attribute0.location(0);
            attribute0.format(VK_FORMAT_R32G32B32_SFLOAT);
            attribute0.offset(0);

            VkPipelineVertexInputStateCreateInfo vertexInputStateCreateInfo = new VkPipelineVertexInputStateCreateInfo(pipelineCreateInfo.pVertexInputState().reinterpret(VkPipelineVertexInputStateCreateInfo.gStructLayout.byteSize()));
            vertexInputStateCreateInfo.vertexBindingDescriptionCount(1);
            vertexInputStateCreateInfo.pVertexBindingDescriptions(binding0.ptr());
            vertexInputStateCreateInfo.vertexAttributeDescriptionCount(1);
            vertexInputStateCreateInfo.pVertexAttributeDescriptions(attribute0.ptr());

            objectDebugPipeline = buildGraphicsPipeline(arena, logicalDevice.handle(), pipelineCreateInfo.ptr());

            if (hasWireframes)
            {
                VkPipelineRasterizationStateCreateInfo rasterizationStateCreateInfo = new VkPipelineRasterizationStateCreateInfo(pipelineCreateInfo.pRasterizationState().reinterpret(VkPipelineRasterizationStateCreateInfo.gStructLayout.byteSize()));
                rasterizationStateCreateInfo.polygonMode(VK_POLYGON_MODE_LINE);
                rasterizationStateCreateInfo.cullMode(VK_CULL_MODE_NONE);

                if (wideLines)
                {
                    appendLineDynamicState(arena, pipelineCreateInfo);
                }

                objectDebugWireframePipeline = buildGraphicsPipeline(arena, logicalDevice.handle(), pipelineCreateInfo.ptr());
            }
            else
            {
                objectDebugWireframePipeline = objectDebugPipeline;
            }
        }

        MemorySegment objectDebugInstancedPipeline;
        try (Arena arena = Arena.ofConfined())
        {
            VkGraphicsPipelineCreateInfo pipelineCreateInfo = makeGraphicsPrototype(arena, layouts.objectDebugInstanced(), renderPass, sampleCount, shaders.objectDebugInstanced());

            VkVertexInputBindingDescription binding0 = new VkVertexInputBindingDescription(arena);
            binding0.binding(0);
            binding0.stride(3 * Float.BYTES);
            binding0.inputRate(VK_VERTEX_INPUT_RATE_VERTEX);

            VkVertexInputAttributeDescription attribute0 = new VkVertexInputAttributeDescription(arena);
            attribute0.location(0);
            attribute0.format(VK_FORMAT_R32G32B32_SFLOAT);
            attribute0.offset(0);

            VkPipelineVertexInputStateCreateInfo vertexInputStateCreateInfo = new VkPipelineVertexInputStateCreateInfo(pipelineCreateInfo.pVertexInputState().reinterpret(VkPipelineVertexInputStateCreateInfo.gStructLayout.byteSize()));
            vertexInputStateCreateInfo.vertexBindingDescriptionCount(1);
            vertexInputStateCreateInfo.pVertexBindingDescriptions(binding0.ptr());
            vertexInputStateCreateInfo.vertexAttributeDescriptionCount(1);
            vertexInputStateCreateInfo.pVertexAttributeDescriptions(attribute0.ptr());

            objectDebugInstancedPipeline = buildGraphicsPipeline(arena, logicalDevice.handle(), pipelineCreateInfo.ptr());
        }

        MemorySegment nuklearOverlayPipeline;
        try (Arena arena = Arena.ofConfined())
        {
            VkGraphicsPipelineCreateInfo pipelineCreateInfo = makeGraphicsPrototype(arena, layouts.nuklearOverlay(), renderPass, sampleCount, shaders.nuklearOverlay());

            VkVertexInputBindingDescription binding0 = new VkVertexInputBindingDescription(arena);
            binding0.binding(0);
            binding0.stride(4 * Float.BYTES + 4);
            binding0.inputRate(VK_VERTEX_INPUT_RATE_VERTEX);

            MemorySegment attributes = arena.allocateArray(VkVertexInputAttributeDescription.gStructLayout, 3);
            VkVertexInputAttributeDescription attribute;

            attribute = VkVertexInputAttributeDescription.getAtIndex(attributes, 0);
            attribute.location(0);
            attribute.format(VK_FORMAT_R32G32_SFLOAT);
            attribute.offset(0);

            attribute = VkVertexInputAttributeDescription.getAtIndex(attributes, 1);
            attribute.location(1);
            attribute.format(VK_FORMAT_R32G32_SFLOAT);
            attribute.offset(2 * Float.BYTES);

            attribute = VkVertexInputAttributeDescription.getAtIndex(attributes, 2);
            attribute.location(2);
            attribute.format(VK_FORMAT_R8G8B8A8_UINT);
            attribute.offset(4 * Float.BYTES);

            VkPipelineVertexInputStateCreateInfo vertexInputStateCreateInfo = new VkPipelineVertexInputStateCreateInfo(pipelineCreateInfo.pVertexInputState().reinterpret(VkPipelineVertexInputStateCreateInfo.gStructLayout.byteSize()));
            vertexInputStateCreateInfo.vertexBindingDescriptionCount(1);
            vertexInputStateCreateInfo.pVertexBindingDescriptions(binding0.ptr());
            vertexInputStateCreateInfo.vertexAttributeDescriptionCount(3);
            vertexInputStateCreateInfo.pVertexAttributeDescriptions(attributes);

            VkPipelineRasterizationStateCreateInfo rasterizationStateCreateInfo = new VkPipelineRasterizationStateCreateInfo(pipelineCreateInfo.pRasterizationState().reinterpret(VkPipelineRasterizationStateCreateInfo.gStructLayout.byteSize()));
            rasterizationStateCreateInfo.depthClampEnable(VK_FALSE);
            rasterizationStateCreateInfo.cullMode(VK_CULL_MODE_FRONT_BIT);

            nuklearOverlayPipeline = buildGraphicsPipeline(arena, logicalDevice.handle(), pipelineCreateInfo.ptr());
        }

        return new Pipelines(logicalDevice, staticGridPipeline, objectDebugPipeline, objectDebugWireframePipeline, objectDebugInstancedPipeline, nuklearOverlayPipeline);
    }

    @Override
    public void dispose()
    {
        vkDestroyPipeline(this.logicalDevice.handle(), this.staticGrid, NULL);

        vkDestroyPipeline(this.logicalDevice.handle(), this.objectDebug, NULL);
        if (this.logicalDevice.physicalDevice.features().fillModeNonSolid() != VK_FALSE)
        {
            vkDestroyPipeline(this.logicalDevice.handle(), this.objectDebugWireframe, NULL);
        }

        vkDestroyPipeline(this.logicalDevice.handle(), this.objectDebugInstanced, NULL);
        vkDestroyPipeline(this.logicalDevice.handle(), this.nuklearOverlay, NULL);
    }
}
