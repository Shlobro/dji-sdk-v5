/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.texture.opengl.renderer;

import dji.sdk.texture.opengl.renderer.GLIdentityRender;

public class GLExternalRender
extends GLIdentityRender {
    protected static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float scale;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * scale;\n}\n";

    @Override
    protected String getFragmentShader() {
        return null;
    }
}

