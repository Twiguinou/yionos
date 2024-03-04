#version 460 core

layout(location=0) in vec3 inPosition;

layout(location=0) out vec3 outPosition;

layout(push_constant) uniform PushConstants
{
    mat4 transformationMatrix;
} pushConstants;

void main(void)
{
    gl_Position = pushConstants.transformationMatrix * vec4(inPosition, 1.0);
    outPosition = inPosition;
}
