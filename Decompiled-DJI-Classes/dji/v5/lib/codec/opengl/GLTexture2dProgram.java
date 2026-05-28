/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.media.ImageReader
 *  androidx.annotation.NonNull
 */
package dji.v5.lib.codec.opengl;

import android.annotation.SuppressLint;
import android.media.ImageReader;
import androidx.annotation.NonNull;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public abstract class GLTexture2dProgram {
    private static final String TAG = "Texture2dProgram";
    protected static final FloatBuffer FULL_RECTANGLE_COORDS = GLTexture2dProgram.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    protected static final FloatBuffer FULL_RECTANGLE_TEX_COORDS = GLTexture2dProgram.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    protected static final String VERTEX_SHADER = "#version 300 es\nuniform mat4 u_mvp_matrix;\nuniform mat4 u_tex_matrix;\nlayout(location = 0) in vec4 a_position;\nlayout(location = 1) in vec4 a_texCoord;\nout vec2 v_texCoord;\nvoid main() {\n    gl_Position = u_mvp_matrix * a_position;\n    v_texCoord = (u_tex_matrix * a_texCoord).xy;\n}\n";
    protected static final int SIZEOF_FLOAT = 4;
    protected static final int COORDS_PER_VERTEX = 2;
    protected static final int VERTEX_STRIDE = 8;
    protected static final int VERTEX_COUNT = FULL_RECTANGLE_COORDS.capacity() / 2;
    protected int[] mVaoBuffer;
    protected int[] mVboBuffer;
    protected int mProgramHandle;
    protected int muMVPMatrixLoc;
    protected int muTexMatrixLoc;
    protected int msTextureMap;

    protected abstract void viewport(int var1, int var2);

    protected abstract void onDrawBefore(int var1, int var2);

    protected abstract void onDrawAfter(int var1, int var2);

    protected GLTexture2dProgram(@NonNull String string2) {
    }

    public synchronized void release() {
    }

    public void draw(int n, int n2, int n3, float[] fArray, float[] fArray2) {
    }

    protected static int loadShader(int n, String string2) {
        return 0;
    }

    protected static void checkGlError(String string2) {
    }

    protected static FloatBuffer createFloatBuffer(float[] fArray) {
        return null;
    }

    protected static IntBuffer createIntBuffer(int[] nArray) {
        return null;
    }

    protected static int sizeof(@NonNull FloatBuffer floatBuffer) {
        return 0;
    }

    @SuppressLint(value={"WrongConstant"})
    protected static ImageReader createImageReader(int n, int n2) {
        return null;
    }
}

