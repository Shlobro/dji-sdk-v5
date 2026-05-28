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

public class GLYUY2Texture2dProgram
extends GLTexture2dProgram {
    private final int mOffsetLoc;
    private static final String FRAGMENT_SHADER_RGB_TO_YUY2 = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision highp float;\nin vec2 v_texCoord;\nlayout(location = 0) out vec4 outColor;\nuniform samplerExternalOES s_TextureMap;\nuniform float u_Offset;\n//Y =  0.299R + 0.587G + 0.114B\n//U = -0.147R - 0.289G + 0.436B\n//V =  0.615R - 0.515G - 0.100B\nconst vec3 COEF_Y = vec3( 0.299,  0.587,  0.114);\nconst vec3 COEF_U = vec3(-0.147, -0.289,  0.436);\nconst vec3 COEF_V = vec3( 0.615, -0.515, -0.100);\n\nvoid main()\n{\n    vec2 texelOffset = vec2(u_Offset, 0.0);\n    vec4 color0 = texture(s_TextureMap, v_texCoord);\n    vec4 color1 = texture(s_TextureMap, v_texCoord + texelOffset);\n    float y0 = dot(color0.rgb, COEF_Y);\n    float u0 = dot(color0.rgb, COEF_U) + 0.5;\n    float v0 = dot(color0.rgb, COEF_V) + 0.5;\n    float y1 = dot(color1.rgb, COEF_Y);\n    outColor = vec4(y0, u0, y1, v0);\n}";

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

