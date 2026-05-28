/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaFormat
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.datacenter.camera;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.lib.codec.VideoCodec;
import dji.v5.lib.codec.decode.VideoDecoder;
import dji.v5.lib.codec.model.FrameInfo;
import dji.v5.lib.codec.opengl.GLFrameDispatcher;
import dji.v5.manager.interfaces.ICameraStreamManager;
import java.util.List;

public class StreamDecoder {
    private final String mTag;
    private final GLFrameDispatcher mFrameDispatcher;
    private VideoDecoder mDecoder;
    private ICameraStreamManager.MimeType mMimeType;
    private VideoDecoder.OnFrameInterceptListener mOnFrameInterceptListener;
    private VideoDecoder.OnFrameDequeueListener mOnFrameDequeueListener;
    private boolean isRelease;
    private boolean isIPChannel;

    public StreamDecoder(@Nullable String string2, @NonNull ICameraStreamManager.MimeType mimeType) {
    }

    public synchronized void setCodecMimeType(@NonNull ICameraStreamManager.MimeType mimeType) {
    }

    public synchronized ICameraStreamManager.MimeType getCodecMimeType() {
        return null;
    }

    public void setOnFrameInterceptListener(VideoDecoder.OnFrameInterceptListener onFrameInterceptListener) {
    }

    public void setOnFrameDequeueListener(VideoDecoder.OnFrameDequeueListener onFrameDequeueListener) {
    }

    public GLFrameDispatcher getFrameDispatcher() {
        return null;
    }

    @Deprecated
    @NonNull
    public synchronized MediaFormat getMediaFormat() {
        return null;
    }

    public synchronized void flush() {
    }

    public synchronized void release() {
    }

    public synchronized void resetDecoder() {
    }

    public synchronized void sendFrame(@NonNull byte[] byArray, int n, int n2) {
    }

    public boolean receiveFrame(@Nullable VideoCodec.ReceiveInfo receiveInfo) {
        return false;
    }

    public void setIPChannel(boolean bl) {
    }

    public FrameInfo getLatestFrameInfo() {
        return null;
    }

    private boolean onFrameIntercept(@NonNull FrameInfo frameInfo, @NonNull byte[] byArray) {
        return false;
    }

    private boolean onNalUnitIntercept(@NonNull List<Integer> list, @NonNull byte[] byArray) {
        return false;
    }

    private void onFrameDequeue(@NonNull FrameInfo frameInfo, @NonNull byte[] byArray, @NonNull VideoDecoder.DequeueState dequeueState) {
    }

    private String getLog(String string2) {
        return null;
    }
}

