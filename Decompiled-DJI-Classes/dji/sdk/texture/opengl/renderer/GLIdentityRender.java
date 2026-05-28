/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.texture.opengl.renderer;

import dji.sdk.texture.opengl.renderer.GLRenderBase;

public class GLIdentityRender
extends GLRenderBase {
    public static String TAG = "GLIdentityRender";
    protected static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    protected static final String FRAGMENT_SHADER = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float scale;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * scale;\n}\n";
    private float mScale;
    private int mUniformScale;

    @Override
    protected String getVertexShader() {
        return null;
    }

    @Override
    protected String getFragmentShader() {
        return null;
    }

    @Override
    protected void onInit() {
    }

    @Override
    protected void preDrawArrays() {
    }

    public void setScale(float f2) {
    }
}

