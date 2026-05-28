/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.texture.opengl.renderer;

import java.nio.FloatBuffer;

public abstract class GLRenderBase {
    private static String TAG = "GLRenderBase";
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 20;
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 3;
    protected float[] mTriangleVerticesData;
    private FloatBuffer mTriangleVertices;
    private float[] mMVPMatrix;
    protected int mProgram;
    private int maPositionHandle;
    private int maTextureHandle;
    private int muMVPMatrixHandle;
    private int muSTMatrixHandle;
    private int musTexture;
    protected int mViewPortWidth;
    protected int mViewPortHeight;

    protected abstract String getVertexShader();

    protected abstract String getFragmentShader();

    protected abstract void onInit();

    protected abstract void preDrawArrays();

    public void init() {
    }

    protected void checkGLError(String string) {
    }

    private int loadShader(int n, String string) {
        return 0;
    }

    protected void checkLocation(int n, String string) {
    }

    private void createProgram() {
    }

    public void draw(int n, int n2, float[] fArray, boolean bl, float f2, int n3, int n4, int n5, int n6) {
    }

    public void destroy() {
    }
}

