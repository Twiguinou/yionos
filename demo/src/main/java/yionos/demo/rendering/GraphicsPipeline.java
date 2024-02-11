package yionos.demo.rendering;

import vulkan.*;
import yionos.demo.Disposable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static vulkan.VulkanCore.*;
import static vulkan.VkStructureType.*;
import static vulkan.VkPolygonMode.*;
import static vulkan.VkCullModeFlagBits.*;
import static vulkan.VkFrontFace.*;
import static vulkan.VkCompareOp.*;
import static vulkan.VkLogicOp.*;
import static vulkan.VkColorComponentFlagBits.*;
import static vulkan.VkBlendFactor.*;
import static vulkan.VkBlendOp.*;
import static vulkan.VkPrimitiveTopology.*;
import static java.lang.foreign.MemorySegment.NULL;

public class GraphicsPipeline implements Disposable
{
    private final MemorySegment m_handle;

    public GraphicsPipeline(VkDevice device) throws VulkanException
    {
        try (Arena arena = Arena.ofConfined())
        {
            VkPipelineVertexInputStateCreateInfo vertexInputStateCreateInfo = new VkPipelineVertexInputStateCreateInfo(arena);
            vertexInputStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);

            VkPipelineInputAssemblyStateCreateInfo inputAssemblyStateCreateInfo = new VkPipelineInputAssemblyStateCreateInfo(arena);
            inputAssemblyStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO);
            inputAssemblyStateCreateInfo.topology(VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST);
            inputAssemblyStateCreateInfo.primitiveRestartEnable(VK_FALSE);

            VkPipelineTessellationStateCreateInfo tessellationStateCreateInfo = new VkPipelineTessellationStateCreateInfo(arena);
            tessellationStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO);

            VkPipelineViewportStateCreateInfo viewportStateCreateInfo = new VkPipelineViewportStateCreateInfo(arena);
            viewportStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO);

            VkPipelineRasterizationStateCreateInfo rasterizationStateCreateInfo = new VkPipelineRasterizationStateCreateInfo(arena);
            rasterizationStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO);
            rasterizationStateCreateInfo.depthClampEnable(VK_FALSE);
            rasterizationStateCreateInfo.rasterizerDiscardEnable(VK_FALSE);
            rasterizationStateCreateInfo.polygonMode(VK_POLYGON_MODE_FILL);
            rasterizationStateCreateInfo.cullMode(VK_CULL_MODE_BACK_BIT);
            rasterizationStateCreateInfo.frontFace(VK_FRONT_FACE_COUNTER_CLOCKWISE);
            rasterizationStateCreateInfo.depthBiasEnable(VK_FALSE);
            rasterizationStateCreateInfo.lineWidth(1.f);

            VkPipelineMultisampleStateCreateInfo multisampleStateCreateInfo = new VkPipelineMultisampleStateCreateInfo(arena);
            multisampleStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO);
            multisampleStateCreateInfo.rasterizationSamples(1);
            multisampleStateCreateInfo.sampleShadingEnable(VK_TRUE);
            multisampleStateCreateInfo.minSampleShading(1.f);
            multisampleStateCreateInfo.alphaToCoverageEnable(VK_FALSE);
            multisampleStateCreateInfo.alphaToOneEnable(VK_FALSE);

            VkPipelineDepthStencilStateCreateInfo depthStencilStateCreateInfo = new VkPipelineDepthStencilStateCreateInfo(arena);
            depthStencilStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO);
            depthStencilStateCreateInfo.depthTestEnable(VK_TRUE);
            depthStencilStateCreateInfo.depthWriteEnable(VK_TRUE);
            depthStencilStateCreateInfo.depthCompareOp(VK_COMPARE_OP_LESS_OR_EQUAL);
            depthStencilStateCreateInfo.depthBoundsTestEnable(VK_FALSE);
            depthStencilStateCreateInfo.minDepthBounds(0.f);
            depthStencilStateCreateInfo.maxDepthBounds(1.f);

            VkPipelineColorBlendAttachmentState colorBlendAttachmentState = new VkPipelineColorBlendAttachmentState(arena);
            colorBlendAttachmentState.colorWriteMask(VK_COLOR_COMPONENT_R_BIT | VK_COLOR_COMPONENT_G_BIT | VK_COLOR_COMPONENT_B_BIT | VK_COLOR_COMPONENT_A_BIT);
            colorBlendAttachmentState.blendEnable(VK_TRUE);
            colorBlendAttachmentState.srcColorBlendFactor(VK_BLEND_FACTOR_SRC_ALPHA);
            colorBlendAttachmentState.dstColorBlendFactor(VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA);
            colorBlendAttachmentState.colorBlendOp(VK_BLEND_OP_ADD);
            colorBlendAttachmentState.srcAlphaBlendFactor(VK_BLEND_FACTOR_ONE);
            colorBlendAttachmentState.dstAlphaBlendFactor(VK_BLEND_FACTOR_ZERO);
            colorBlendAttachmentState.alphaBlendOp(VK_BLEND_OP_ADD);

            VkPipelineColorBlendStateCreateInfo colorBlendStateCreateInfo = new VkPipelineColorBlendStateCreateInfo(arena);
            colorBlendStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO);
            colorBlendStateCreateInfo.logicOpEnable(VK_FALSE);
            colorBlendStateCreateInfo.logicOp(VK_LOGIC_OP_COPY);
            colorBlendStateCreateInfo.attachmentCount(1);
            colorBlendStateCreateInfo.blendConstants(0, 1.f);
            colorBlendStateCreateInfo.blendConstants(1, 1.f);
            colorBlendStateCreateInfo.blendConstants(2, 1.f);
            colorBlendStateCreateInfo.blendConstants(3, 1.f);
            colorBlendStateCreateInfo.attachmentCount(1);
            colorBlendStateCreateInfo.pAttachments(colorBlendAttachmentState.ptr());

            VkPipelineDynamicStateCreateInfo dynamicStateCreateInfo = new VkPipelineDynamicStateCreateInfo(arena);
            dynamicStateCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO);

            VkPipelineLayoutCreateInfo layoutCreateInfo = new VkPipelineLayoutCreateInfo(arena);
            layoutCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);

            VkGraphicsPipelineCreateInfo pipelineCreateInfo = new VkGraphicsPipelineCreateInfo(arena);
            pipelineCreateInfo.sType(VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO);
            pipelineCreateInfo.stageCount(0);
            pipelineCreateInfo.pStages(NULL);
            pipelineCreateInfo.pVertexInputState(vertexInputStateCreateInfo.ptr());
            pipelineCreateInfo.pInputAssemblyState(inputAssemblyStateCreateInfo.ptr());
            pipelineCreateInfo.pTessellationState(tessellationStateCreateInfo.ptr());
            pipelineCreateInfo.pViewportState(viewportStateCreateInfo.ptr());
            pipelineCreateInfo.pRasterizationState(rasterizationStateCreateInfo.ptr());
            pipelineCreateInfo.pMultisampleState(multisampleStateCreateInfo.ptr());
            pipelineCreateInfo.pDepthStencilState(depthStencilStateCreateInfo.ptr());
            pipelineCreateInfo.pColorBlendState(colorBlendStateCreateInfo.ptr());
            pipelineCreateInfo.pDynamicState(dynamicStateCreateInfo.ptr());
            pipelineCreateInfo.layout(NULL);
            pipelineCreateInfo.renderPass(NULL);
            pipelineCreateInfo.subpass(0);
            pipelineCreateInfo.basePipelineIndex(-1);

            MemorySegment pPipeline = arena.allocate(ValueLayout.ADDRESS);
            VulkanException.check(vkCreateGraphicsPipelines(device, NULL, 1, pipelineCreateInfo.ptr(), NULL, pPipeline), "Unable to create graphics pipeline");
            this.m_handle = pPipeline.get(ValueLayout.ADDRESS, 0);
        }
    }

    public MemorySegment handle()
    {
        return this.m_handle;
    }

    @Override
    public void dispose()
    {
    }
}
