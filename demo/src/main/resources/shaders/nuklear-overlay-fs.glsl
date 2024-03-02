#version 460 core
#extension GL_ARB_separate_shader_objects : enable

layout(location=0) in vec2 inUv;
layout(location=1) in vec4 inColor;

layout(location=0) out vec4 outColor;

layout(binding=0,set=0) uniform sampler2D overlay;

void main()
{
    vec4 texColor = texture(overlay, inUv);
    outColor = inColor * texColor;
}