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
import dji.v5.lib.codec.util.CodecByteBuffer;

public abstract class StreamSource {
    private static final int MAX_PENDING_DATA_SIZE = 0x1E0000;
    private final CodecByteBuffer mPendingStreamBuffer;
    private StreamReceiver mStreamReceiver;
    private Handler mListenerHandler;
    protected int mLinkId;
    private final Runnable mCallOnReceiveStreamListener;

    public abstract void start();

    public abstract void stop();

    protected StreamSource() {
    }

    public synchronized void setLinkId(int n) {
    }

    public void requestKeyFrame() {
    }

    public synchronized void setStreamReceiver(@Nullable StreamReceiver streamReceiver, @Nullable Handler handler) {
    }

    protected synchronized void writePendingData(byte[] byArray, int n, int n2) {
    }

    @NonNull
    public String toString() {
        return null;
    }

    static /* synthetic */ CodecByteBuffer access$000(StreamSource streamSource) {
        return null;
    }

    static /* synthetic */ StreamReceiver access$100(StreamSource streamSource) {
        return null;
    }

    public static interface StreamReceiver {
        public void onReceiveStream(byte[] var1, int var2, int var3);
    }
}

