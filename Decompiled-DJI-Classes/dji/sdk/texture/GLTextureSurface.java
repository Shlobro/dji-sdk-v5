/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.view.Surface
 */
package dji.sdk.texture;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import dji.sdk.texture.GLTextureCallback;
import dji.sdk.texture.opengl.GLContextManager;
import dji.sdk.texture.opengl.renderer.GLExternalRender;
import java.nio.ByteBuffer;

public class GLTextureSurface
implements SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = GLTextureSurface.class.getSimpleName();
    private int mInputTexture;
    private SurfaceTexture mInputSurfaceTexture;
    private Surface mInputSurface;
    private float[] mSTMatrix;
    GLContextManager mContextPrevious;
    GLContextManager mContextCurrent;
    private int mReadFrameBuffer;
    private int mReadTextureID;
    private boolean mIsFrameBufferInited;
    private GLExternalRender mExternalRender;
    private boolean mIsInited;
    private boolean mIsRunning;
    private HandlerThread mRenderThread;
    private Object mSyncCreateST;
    private Handler mRenderHandle;
    private boolean mIsDebug;
    private ByteBuffer mReadByteBuffer;
    private GLTextureCallback mTextureCallback;

    public void setTextureCallback(GLTextureCallback gLTextureCallback) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized int init() {
        return 0;
    }

    public Surface getInputSurface() {
        return null;
    }

    public int getReadTextureID() {
        return 0;
    }

    public synchronized void destroy() {
    }

    public synchronized void onFrameAvailable(SurfaceTexture surfaceTexture) {
    }

    public synchronized void refreshTexture() {
    }

    static /* synthetic */ SurfaceTexture access$002(GLTextureSurface gLTextureSurface, SurfaceTexture surfaceTexture) {
        return null;
    }

    static /* synthetic */ int access$100(GLTextureSurface gLTextureSurface) {
        return 0;
    }

    static /* synthetic */ Object access$200(GLTextureSurface gLTextureSurface) {
        return null;
    }

    static /* synthetic */ SurfaceTexture access$000(GLTextureSurface gLTextureSurface) {
        return null;
    }
}

