#version 460 core

layout(location=0) in vec2 inGridPosition;
layout(location=1) in vec3 inGridColor;

layout(location=0) out vec4 outColor;

void main(void)
{
    const vec2 grid = abs(fract(inGridPosition - 0.5) - 0.5) / fwidth(inGridPosition);
    const float line = 1.0 - min(grid.x, grid.y);
    outColor = vec4(inGridColor, line);
}
