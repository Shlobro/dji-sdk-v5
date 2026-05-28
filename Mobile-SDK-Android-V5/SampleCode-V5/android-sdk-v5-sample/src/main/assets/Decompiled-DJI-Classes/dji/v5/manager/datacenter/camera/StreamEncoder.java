/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.datacenter.camera;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.v5.lib.codec.encode.VideoEncoder;
import dji.v5.manager.datacenter.camera.CameraStreamManager;
import dji.v5.manager.interfaces.ICameraStreamManager;
import java.util.Set;

public class StreamEncoder {
    private final Set<ICameraStreamManager.ReceiveStreamListener> mReceiveStreamListenerSet;
    private final String mTag;
    private ComponentIndexType mCameraIndex;
    private ICameraStreamManager.MimeType mMimeType;
    private Thread mEncodedThread;
    private int mExpectedBitRate;
    private int mRealBitRate;
    private int mExpectedVideoWidth;
    private int mExpectedVideoHeight;
    private int mRealVideoWidth;
    private int mRealVideoHeight;
    private ICameraStreamManager.ScaleType mScaleType;

    public StreamEncoder(@Nullable String string2) {
    }

    public synchronized void setCameraIndex(@Nullable ComponentIndexType componentIndexType) {
    }

    public synchronized void setMimeType(@Nullable ICameraStreamManager.MimeType mimeType) {
    }

    public synchronized void setVideoSize(int n, int n2) {
    }

    public synchronized void setVideoScaleType(ICameraStreamManager.ScaleType scaleType) {
    }

    public synchronized void setBitRate(int n) {
    }

    public int getBitRate() {
        return 0;
    }

    public synchronized void addOnReceiveStreamListener(@NonNull ICameraStreamManager.ReceiveStreamListener receiveStreamListener) {
    }

    public synchronized void removeOnReceiveStreamListener(@NonNull ICameraStreamManager.ReceiveStreamListener receiveStreamListener) {
    }

    public synchronized boolean hasOnReceiveStreamListener(@NonNull ICameraStreamManager.ReceiveStreamListener receiveStreamListener) {
        return false;
    }

    public synchronized void reset() {
    }

    private synchronized void updateEncoder() {
    }

    public int getRealVideoWidth() {
        return 0;
    }

    public int getRealVideoHeight() {
        return 0;
    }

    private String getLog(String string2) {
        return null;
    }

    static /* synthetic */ String access$100(StreamEncoder streamEncoder, String string2) {
        return null;
    }

    static /* synthetic */ Set access$200(StreamEncoder streamEncoder) {
        return null;
    }

    static /* synthetic */ String access$300(StreamEncoder streamEncoder) {
        return null;
    }

    static /* synthetic */ int access$402(StreamEncoder streamEncoder, int n) {
        return 0;
    }

    static /* synthetic */ int access$502(StreamEncoder streamEncoder, int n) {
        return 0;
    }

    static /* synthetic */ int access$602(StreamEncoder streamEncoder, int n) {
        return 0;
    }

    private class EncodeAndDispatchRunnable
    implements Runnable {
        private static final int FORMAT_FPS = 30;
        private static final int FORMAT_I_INTERVAL_SECOND = 1;
        private final CameraStreamManager mStreamManager;
        private final ComponentIndexType mCameraIndex;
        private final String mMimeType;
        private int mBitRate;
        private final int mExpectedWidth;
        private final int mExpectedHeight;
        private int mLastVideoWidth;
        private int mLastVideoHeight;
        private VideoEncoder mVideoEncoder;
        private VideoEncoder.EncoderSurface mEncoderSurface;
        private final ICameraStreamManager.ScaleType mScaleType;
        final /* synthetic */ StreamEncoder this$0;

        private EncodeAndDispatchRunnable(StreamEncoder streamEncoder, ComponentIndexType componentIndexType, String string2, int n, int n2, int n3, ICameraStreamManager.ScaleType scaleType) {
        }

        @Override
        public void run() {
        }

        private boolean setupEncoder(int n, int n2, int n3) {
            return false;
        }

        private void resetEncoder() {
        }

        public int alignValue(int n, int n2) {
            return 0;
        }

        /* synthetic */ EncodeAndDispatchRunnable(StreamEncoder streamEncoder, ComponentIndexType componentIndexType, String string2, int n, int n2, int n3, ICameraStreamManager.ScaleType scaleType, 1 var8_8) {
        }
    }
}

