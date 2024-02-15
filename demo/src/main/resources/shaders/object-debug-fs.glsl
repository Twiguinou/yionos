#version 460 core

layout(location=0) in vec3 inPosition;

layout(location=0) out vec4 outColor;

const float gridSize = 4.0;
const float border = gridSize * 0.001;
const float halfGridSize = gridSize * 0.5;

const vec4 lightColor = vec4(1.0, 0.0, 0.0, 1.0);
const vec4 darkColor = vec4(0.2, 0.4, 0.3, 1.0);
const vec4 borderColor = vec4(0.43725, 0.9411, 0.741176, 1.0);

bool atBorder(float pos)
{
    return mod(pos, 1.0) < border || 1.0 - mod(pos, 1.0) < border || mod(pos, 0.5) < border || 0.5 - mod(pos, 0.5) < border;
}

void main(void)
{
    vec3 pos = inPosition;
    if (pos.x <= 0.0) pos.x = abs(pos.x - halfGridSize);
    if (pos.y <= 0.0) pos.y = abs(pos.y - halfGridSize);
    if (pos.z <= 0.0) pos.z = abs(pos.z - halfGridSize);

    pos /= gridSize;
    pos.y += float(fract(float(int(pos.x * halfGridSize)) / halfGridSize));
    pos.z += float(fract(float(int(pos.x * halfGridSize)) / halfGridSize));

    vec3 col = (vec3(fract(float(int(pos.z * halfGridSize)) / halfGridSize)) == vec3(0.0) ? lightColor : darkColor).rgb;
    if (atBorder(pos.x) || atBorder(pos.y) || atBorder(pos.z)) col = borderColor.rgb;

    outColor = vec4(col * 0.92, 1.0);
}