#version 460 core
#extension GL_ARB_separate_shader_objects : enable

layout(location=0) in vec2 inPosition;
layout(location=1) in vec2 inUv;
layout(location=2) in uvec4 inColor;

layout(location=0) out vec2 outUv;
layout(location=1) out vec4 outColor;

layout(push_constant) uniform PushConstants
{
    mat4 projectionMatrix;
} pushConstants;

void main(void)
{
    gl_Position = pushConstants.projectionMatrix * vec4(inPosition, 0.0, 1.0);

    outColor = vec4(inColor[0] / 255.0, inColor[1] / 255.0, inColor[2] / 255.0, inColor[3] / 255.0);
    outUv = inUv;
}
