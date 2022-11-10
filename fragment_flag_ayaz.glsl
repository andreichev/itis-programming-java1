#define PI 3.1415926535
#define RED vec3(133., 0., 0.) / 255.
#define GREEN vec3(0., 133, 0.) / 255.

void mainImage( out vec4 fragColor, in vec2 fragCoord )
{
    vec2 uv = (2. * fragCoord - iResolution.xy) / min(iResolution.x, iResolution.y);
    float w = sin((uv.x + uv.y - iTime * .75 + sin(1.5 * uv.x + 4.5 * uv.y) * PI * .3)
                  * PI * .7); // fake waviness factor
    vec3 col = vec3(0.);
    col += 1.;
    col = mix(col, GREEN, smoothstep(0.09, 0.1, uv.y));
    col = mix(col, RED, smoothstep(-0.09,-0.1, uv.y));
    col += w * .225;

    fragColor = vec4(col, 1.);
}