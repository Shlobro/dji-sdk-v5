/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.datacenter.camera;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.lib.codec.decode.VideoDecoder;
import dji.v5.lib.codec.model.FrameInfo;
import dji.v5.manager.datacenter.camera.StreamDecoder;
import dji.v5.manager.datacenter.camera.StreamSource;

public class StreamObserver {
    private static final int MAX_REQUEST_INTERVAL = 1000;
    private static final int MAX_DECODE_INTERVAL = 2000;
    private final String mTag;
    private final StreamDecoder mDecoder;
    private final Handler mDecodeHandler;
    private final long mMaxRequestKeyFrameInterval;
    private StreamSource mStreamSource;
    private OnFrameListener mOnFrameListener;
    private OnFrameConsumerDataListener mOnConsumerDataListener;
    private long mLastDecodeSuccessTime;
    private long mLastRequestKeyFrameTime;
    private int mLastFrameIndex;
    private int mCurrentFrameIndex;

    public StreamObserver(@Nullable String string2, @NonNull StreamDecoder streamDecoder) {
    }

    public StreamObserver(@Nullable String string2, @NonNull StreamDecoder streamDecoder, long l2) {
    }

    public void release() {
    }

    public void updateStreamSource(@Nullable StreamSource streamSource) {
    }

    private void onReceiveStream(byte[] byArray, int n, int n2) {
    }

    private boolean onInterceptDecodeFrame(@NonNull FrameInfo frameInfo, @NonNull byte[] byArray) {
        return false;
    }

    private void onFrameDequeue(@NonNull FrameInfo frameInfo, @NonNull byte[] byArray, @NonNull VideoDecoder.DequeueState dequeueState) {
    }

    private void resetFrameIndex() {
    }

    private void requestKeyFrameIfNeed() {
    }

    private void runOnDecoderHandler(Runnable runnable) {
    }

    public void setOnFrameListener(@Nullable OnFrameListener onFrameListener) {
    }

    public void setOnConsumerDataListener(OnFrameConsumerDataListener onFrameConsumerDataListener) {
    }

    public StreamDecoder getDecoder() {
        return null;
    }

    private String getLog(String string2) {
        return null;
    }

    private void onSeiTypeIsF5(byte[] byArray) {
    }

    private /* synthetic */ void lambda$updateStreamSource$1(StreamSource streamSource) {
    }

    private /* synthetic */ void lambda$release$0() {
    }

    static /* synthetic */ void access$000(StreamObserver streamObserver) {
    }

    public static interface OnFrameListener {
        public void onFrame(@NonNull FrameInfo var1, @NonNull byte[] var2);
    }

    public static interface OnFrameConsumerDataListener {
        public void onUpdate(int var1, int var2, byte[] var3, int var4);
    }
}

