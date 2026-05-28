/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.opengl.EGLConfig
 *  android.opengl.EGLContext
 *  android.opengl.EGLDisplay
 *  android.opengl.EGLSurface
 *  android.view.Surface
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.lib.codec.opengl;

import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.lib.codec.opengl.GLFrameFormat;
import dji.v5.lib.codec.opengl.GLScaleType;
import dji.v5.lib.codec.opengl.GLTexture2dProgram;
import java.util.Map;

public class EglHelper {
    private final EGLDisplay mEGLDisplay;
    private final EGLContext mEGLContext;
    private final EGLConfig mEGLConfig;
    private final Map<Surface, EGLSurfaceInfo> mEGLSurfaceMap;
    private final Map<Integer, GLTexture2dProgram> mTexture2dProgramMap;
    private final float[] mProjectionMatrix;
    private boolean isRelease;

    public static EglHelper create(@Nullable EGLContext eGLContext) {
        return null;
    }

    private EglHelper(@Nullable EGLContext eGLContext) {
    }

    public void releaseEGL() {
    }

    private static EGLDisplay createEGLDisplay() {
        return null;
    }

    private static EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext) {
        return null;
    }

    private static EGLConfig createEGLConfig(EGLDisplay eGLDisplay) {
        return null;
    }

    private EGLSurface createEGLSurface(Surface surface) {
        return null;
    }

    private boolean makeCurrent(EGLSurface eGLSurface) {
        return false;
    }

    @NonNull
    public EGLContext getEGLContext() {
        return null;
    }

    public void drawOESTexture(int n, int n2, int n3, float[] fArray) {
    }

    public int createOESTextureObject() {
        return 0;
    }

    public void deleteOESTextureObject(int n) {
    }

    public boolean putSurface(@NonNull Surface surface, int n, int n2, @GLFrameFormat int n3, @GLScaleType int n4) {
        return false;
    }

    public boolean removeSurface(@NonNull Surface surface) {
        return false;
    }

    public boolean destroyEGLSurface(@NonNull EGLSurface eGLSurface) {
        return false;
    }

    public boolean hasSurface(@NonNull Surface surface) {
        return false;
    }

    public int getSurfaceCount() {
        return 0;
    }

    @NonNull
    public Map<Surface, EGLSurfaceInfo> getAllOutputSurface() {
        return null;
    }

    private static void checkGlError(String string2) {
    }

    static class EGLSurfaceInfo {
        final Surface surface;
        final EGLSurface eglSurface;
        final int width;
        final int height;
        @GLFrameFormat
        final int format;
        @GLScaleType
        final int scaleType;

        EGLSurfaceInfo(Surface surface, EGLSurface eGLSurface, int n, int n2, @GLFrameFormat int n3, @GLScaleType int n4) {
        }
    }
}

