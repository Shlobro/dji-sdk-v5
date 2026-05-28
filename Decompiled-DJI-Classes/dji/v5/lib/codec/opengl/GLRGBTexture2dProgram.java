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

public class GLRGBTexture2dProgram
extends GLTexture2dProgram {
    private static final String FRAGMENT_SHADER_RGB = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision highp float;\nin vec2 v_texCoord;\nuniform samplerExternalOES sTexture;\nlayout(location = 0) out vec4 outColor;\nvoid main() {\n    outColor = texture(sTexture, v_texCoord);\n}\n";

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

