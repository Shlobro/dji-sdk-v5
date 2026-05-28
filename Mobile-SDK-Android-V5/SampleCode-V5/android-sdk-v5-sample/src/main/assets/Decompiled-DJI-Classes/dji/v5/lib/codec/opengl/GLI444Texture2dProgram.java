/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.media.ImageReader
 */
package dji.v5.lib.codec.opengl;

import android.annotation.SuppressLint;
import android.media.ImageReader;
import dji.v5.lib.codec.opengl.GLTexture2dProgram;

public class GLI444Texture2dProgram
extends GLTexture2dProgram {
    private static final String FRAGMENT_SHADER_RGB_TO_I444 = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision highp float;\nin vec2 v_texCoord;\nlayout(location = 0) out vec4 outColor;\nuniform samplerExternalOES s_TextureMap;\nuniform float u_Offset;\n//Y =  0.299R + 0.587G + 0.114B\n//U = -0.147R - 0.289G + 0.436B\n//V =  0.615R - 0.515G - 0.100B\nconst vec3 COEF_Y = vec3( 0.299,  0.587,  0.114);\nconst vec3 COEF_U = vec3(-0.147, -0.289,  0.436);\nconst vec3 COEF_V = vec3( 0.615, -0.515, -0.100);\nconst float U_DIVIDE_LINE = 1.0 / 3.0;\nconst float V_DIVIDE_LINE = 2.0 / 3.0;\nvoid main()\n{\n    vec2 texelOffset = vec2(u_Offset, 0.0);\n    if(v_texCoord.y <= U_DIVIDE_LINE) {\n        vec2 texCoord = vec2(v_texCoord.x, v_texCoord.y * 3.0);\n        vec4 color0 = texture(s_TextureMap, texCoord);\n        vec4 color1 = texture(s_TextureMap, texCoord + texelOffset);\n        vec4 color2 = texture(s_TextureMap, texCoord + texelOffset * 2.0);\n        vec4 color3 = texture(s_TextureMap, texCoord + texelOffset * 3.0);\n\n        float y0 = dot(color0.rgb, COEF_Y);\n        float y1 = dot(color1.rgb, COEF_Y);\n        float y2 = dot(color2.rgb, COEF_Y);\n        float y3 = dot(color3.rgb, COEF_Y);\n        outColor = vec4(y0, y1, y2, y3);\n    } else if(v_texCoord.y <= V_DIVIDE_LINE) {\n        vec2 texCoord = vec2(v_texCoord.x, (v_texCoord.y - U_DIVIDE_LINE) * 3.0);\n        vec4 color0 = texture(s_TextureMap, texCoord);\n        vec4 color1 = texture(s_TextureMap, texCoord + texelOffset);\n        vec4 color2 = texture(s_TextureMap, texCoord + texelOffset * 2.0);\n        vec4 color3 = texture(s_TextureMap, texCoord + texelOffset * 3.0);\n\n        float u0 = dot(color0.rgb, COEF_U) + 0.5;\n        float u1 = dot(color1.rgb, COEF_U) + 0.5;\n        float u2 = dot(color2.rgb, COEF_U) + 0.5;\n        float u3 = dot(color3.rgb, COEF_U) + 0.5;\n        outColor = vec4(u0, u1, u2, u3);\n    } else {\n        vec2 texCoord = vec2(v_texCoord.x, (v_texCoord.y - V_DIVIDE_LINE) * 3.0);\n        vec4 color0 = texture(s_TextureMap, texCoord);\n        vec4 color1 = texture(s_TextureMap, texCoord + texelOffset);\n        vec4 color2 = texture(s_TextureMap, texCoord + texelOffset * 2.0);\n        vec4 color3 = texture(s_TextureMap, texCoord + texelOffset * 3.0);\n\n        float v0 = dot(color0.rgb, COEF_V) + 0.5;\n        float v1 = dot(color1.rgb, COEF_V) + 0.5;\n        float v2 = dot(color2.rgb, COEF_V) + 0.5;\n        float v3 = dot(color3.rgb, COEF_V) + 0.5;\n        outColor = vec4(v0, v1, v2, v3);\n    }\n}";

    @Override
    protected void viewport(int n, int n2) {
    }

    @Override
    protected void onDrawBefore(int n, int n2) {
    }

    @Override
    protected void onDrawAfter(int n, int n2) {
    }

    @SuppressLint(value={"WrongConstant"})
    public static ImageReader createImageReader(int n, int n2) {
        return null;
    }
}

