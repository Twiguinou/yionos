#version 460 core

layout(location=0) in vec3 inPosition;
layout(location=1) in vec3 inColor;

layout(location=0) out vec3 outColor;

layout(push_constant) uniform PushConstants
{
    mat4 clippingMatrix;
} pushConstants;

void main(void)
{
    gl_Position = pushConstants.clippingMatrix * vec4(inPosition, 1.0);
    outColor = inColor;
}
