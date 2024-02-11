#version 460 core

layout(location=0) in vec2 inPosition;

layout(location=1) out vec2 outGridPosition;
layout(location=2) out vec3 outGridColor;

layout(push_constant) uniform PushConstants
{
    mat4 transformationMatrix;
    vec4 gridProperties;
} pushConstants;

void main(void)
{
    vec3 gridPosition = vec3(inPosition.x, 0.0, inPosition.y) * pushConstants.gridProperties.w;
    outGridPosition = gridPosition.xz;
    gl_Position = pushConstants.transformationMatrix * vec4(gridPosition, 1.0);
    outGridColor = pushConstants.gridProperties.xyz;
}
