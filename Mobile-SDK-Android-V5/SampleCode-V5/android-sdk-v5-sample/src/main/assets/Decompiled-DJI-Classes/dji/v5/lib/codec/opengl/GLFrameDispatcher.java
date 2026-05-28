/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.media.ImageReader
 *  android.os.Handler
 *  android.view.Surface
 *  androidx.annotation.NonNull
 */
package dji.v5.lib.codec.opengl;

import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import dji.v5.lib.codec.opengl.EglHelper;
import dji.v5.lib.codec.opengl.GLFrameFormat;
import dji.v5.lib.codec.opengl.GLScaleType;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class GLFrameDispatcher {
    private final List<GLImageReader> mGLImageReaderList;
    private final Handler mGLHandler;
    private final float[] mTextureMatrix;
    private SurfaceTexture mGLSurfaceTexture;
    private Surface mGLSurface;
    private EglHelper mEGLHelper;
    private int mOESTextureId;
    private int mInputWidth;
    private int mInputHeight;

    public synchronized void release() {
    }

    public Surface getSurface() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setInputSize(int n, int n2) {
    }

    public void putOutputSurface(@NonNull Surface surface, int n, int n2, @GLScaleType int n3) {
    }

    public void putOutputSurface(@NonNull Surface surface, int n, int n2, @GLFrameFormat int n3, @GLScaleType int n4) {
    }

    public void removeOutputSurface(@NonNull Surface surface) {
    }

    public void addOnFrameListener(@GLFrameFormat int n, @NonNull OnFrameListener onFrameListener) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addOnFrameListener(@GLFrameFormat int n, int n2, int n3, @NonNull OnFrameListener onFrameListener) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void removeOnFrameListener(@NonNull OnFrameListener onFrameListener) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean hasOnFrameListener(@NonNull OnFrameListener onFrameListener) {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean hasOutputTarget() {
        return false;
    }

    private void drawSurface(SurfaceTexture surfaceTexture) {
    }

    private static Handler createWorkHandler(String string2) {
        return null;
    }

    private static void runOnHandler(Handler handler, Runnable runnable, boolean bl) {
    }

    private static /* synthetic */ void lambda$runOnHandler$5(Runnable runnable, CountDownLatch countDownLatch) {
    }

    private /* synthetic */ void lambda$hasOutputTarget$4(boolean[] blArray) {
    }

    private /* synthetic */ void lambda$removeOutputSurface$3(Surface surface) {
    }

    private /* synthetic */ void lambda$putOutputSurface$2(Surface surface, int n, int n2, int n3, int n4) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$release$1() {
    }

    private /* synthetic */ void lambda$new$0() {
    }

    static /* synthetic */ Handler access$100(String string2) {
        return null;
    }

    static /* synthetic */ void access$200(Handler handler, Runnable runnable, boolean bl) {
    }

    private class GLImageReader {
        @GLFrameFormat
        private final int mFormat;
        private final Handler mDispatcherHandler;
        private final OnFrameListener mOnFrameListener;
        private final int mOutputWidth;
        private final int mOutputHeight;
        private ImageReader mImageReader;
        private int mInputWidth;
        private int mInputHeight;
        private byte[] mFrameDataBuffer;
        final /* synthetic */ GLFrameDispatcher this$0;

        public GLImageReader(@GLFrameFormat GLFrameDispatcher gLFrameDispatcher, int n, int n2, @NonNull int n3, OnFrameListener onFrameListener) {
        }

        public void release() {
        }

        public synchronized void setInputSize(int n, int n2) {
        }

        private synchronized void updateImageReader() {
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public void dispatchImage(ImageReader imageReader, int n, int n2) {
        }

        private /* synthetic */ void lambda$updateImageReader$1(int n, int n2, ImageReader imageReader) {
        }

        private /* synthetic */ void lambda$release$0() {
        }

        static /* synthetic */ OnFrameListener access$000(GLImageReader gLImageReader) {
            return null;
        }
    }

    public static interface OnFrameListener {
        public void onFrame(@NonNull byte[] var1, int var2, int var3, int var4, int var5, @GLFrameFormat int var6);
    }
}

