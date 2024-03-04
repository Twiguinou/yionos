#version 460 core

layout(location=0) in vec3 inPosition;

layout(location=0) out vec3 outPosition;

layout(std140,set=0,binding=0) readonly buffer ObjectBuffer
{
    mat4 transforms[];
} objectBuffer;

layout(push_constant) uniform PushConstants
{
    mat4 clippingMatrix;
} pushConstants;

void main(void)
{
    gl_Position = pushConstants.clippingMatrix * objectBuffer.transforms[gl_InstanceIndex] * vec4(inPosition, 1.0);
    outPosition = inPosition;
}
