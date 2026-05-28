/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.khronos.egl.EGL10
 *  javax.microedition.khronos.egl.EGLConfig
 *  javax.microedition.khronos.egl.EGLContext
 *  javax.microedition.khronos.egl.EGLDisplay
 *  javax.microedition.khronos.egl.EGLSurface
 */
package dji.sdk.texture.opengl;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class GLContextManager {
    static final String TAG = "GLContextManager";
    public static final int EGL_WIDTH = 1280;
    public static final int EGL_HEIGHT = 720;
    protected final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private EGL10 mEGL;
    private EGLConfig[] mEGLConfigs;
    private EGLDisplay mEGLDisplay;
    private EGLContext mEGLContext;
    private EGLSurface mEGLSurfaceRead;
    private EGLSurface mEGLSurfaceDraw;

    protected void initDisplay() {
    }

    protected void initConfig() {
    }

    protected void checkGLError(String string) {
    }

    public EGLContext getEGLContext() {
        return null;
    }

    public void loadFromThread() {
    }

    public void attachToThread() {
    }

    public void detachFromThread() {
    }

    public void createShareContext(EGLContext eGLContext) {
    }

    public void createPBufferSurface() {
    }

    protected void destroySurfaces() {
    }

    public synchronized void destroy() {
    }
}

