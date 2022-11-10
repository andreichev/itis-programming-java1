void mainImage( out vec4 fragColor, in vec2 fragCoord )
{
    if(fragCoord.y > 380.0) {
        fragColor = vec4(0.0, 1.0, 0.0, 1.0);
    } else if (fragCoord.y < 340.0)  {
        fragColor = vec4(1.0, 0.0, 0.0, 1.0);
    } else {
        fragColor = vec4(1.0, 1.0, 1.0, 1.0);
    }
}