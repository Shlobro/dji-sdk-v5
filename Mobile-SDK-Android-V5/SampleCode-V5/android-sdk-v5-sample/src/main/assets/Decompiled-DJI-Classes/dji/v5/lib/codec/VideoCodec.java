/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecInfo$CodecProfileLevel
 *  android.media.MediaCodecInfo$EncoderCapabilities
 *  android.media.MediaCodecInfo$VideoCapabilities
 *  android.media.MediaFormat
 *  android.view.Surface
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.lib.codec;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.lib.codec.util.CodecByteBuffer;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class VideoCodec {
    protected final MediaCodec mCodec;
    protected final MediaCodec.BufferInfo mBufferInfo;
    protected final MediaFormat mMediaFormat;
    protected final MediaCodecInfo mCodecInfo;
    protected final MediaCodecInfo.CodecCapabilities mCodecCaps;
    protected final MediaCodecInfo.VideoCapabilities mVideoCaps;
    protected final MediaCodecInfo.EncoderCapabilities mEncoderCaps;
    protected final CodecByteBuffer mConfigData;
    protected final boolean isEncoder;
    protected AtomicBoolean isStarted;
    protected AtomicBoolean isRelease;
    private final String logTag;

    protected VideoCodec(@MimeType String string2, boolean bl, @Nullable String string3) throws IOException {
    }

    public synchronized boolean sendFrame(@NonNull byte[] byArray, int n, int n2, long l2, int n3, long l3) throws IllegalStateException {
        return false;
    }

    public synchronized boolean receiveFrame(@Nullable ReceiveInfo receiveInfo, long l2) throws IllegalStateException {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized boolean receiveFrame(@Nullable ReceiveInfo receiveInfo, long l2, long l3) throws IllegalStateException {
        return false;
    }

    public synchronized void start() throws IllegalStateException {
    }

    public synchronized void reset() throws IllegalStateException {
    }

    public synchronized void flush() throws IllegalStateException {
    }

    public synchronized void release() {
    }

    protected void onClearCache() {
    }

    protected void onConfigureChanged(String string2) {
    }

    public boolean isRelease() {
        return false;
    }

    public boolean isStarted() {
        return false;
    }

    @Nullable
    public Surface getInputSurface() {
        return null;
    }

    @Nullable
    public Surface getOutputSurface() {
        return null;
    }

    @NonNull
    public synchronized MediaFormat getOutputFormat() {
        return null;
    }

    @NonNull
    public synchronized MediaFormat getInputFormat() {
        return null;
    }

    @MimeType
    @NonNull
    public String getMimeType() {
        return null;
    }

    public synchronized void setVideoSize(int n, int n2) {
    }

    public MediaCodecInfo.VideoCapabilities getVideoCaps() {
        return null;
    }

    public synchronized void setMaxVideoSize(int n, int n2) {
    }

    public synchronized void setMaxInputSize(int n) {
    }

    public synchronized void setColorFormats(int n) {
    }

    public synchronized void setFrameRate(int n, int n2, int n3) {
    }

    public synchronized void setBitrateMode(int n) {
    }

    public synchronized void setProfileLevel(@Nullable MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
    }

    public synchronized void setBitRate(int n) {
    }

    public synchronized void setIFrameInterval(int n) {
    }

    public synchronized void setIntraRefreshPeriod(int n) {
    }

    public synchronized void setEnableSpsAndPps(boolean bl) {
    }

    protected synchronized boolean isRepeatIntKey(String string2, int n) {
        return false;
    }

    protected synchronized boolean isRepeatLongKey(String string2, long l2) {
        return false;
    }

    public void logCodecCapabilities(@MimeType String string2) {
    }

    protected String logTag() {
        return null;
    }

    @NonNull
    public String toString() {
        return null;
    }

    public static class ReceiveInfo {
        private final CodecByteBuffer buffer;
        private int width;
        private int height;
        private int frameRate;
        private boolean isKeyFrame;
        private long presentationTimeMs;

        public byte[] getReceiveData() {
            return null;
        }

        public int getOffset() {
            return 0;
        }

        public int getLength() {
            return 0;
        }

        public int getWidth() {
            return 0;
        }

        public void setWidth(int n) {
        }

        public int getHeight() {
            return 0;
        }

        public void setHeight(int n) {
        }

        public int getFrameRate() {
            return 0;
        }

        public void setFrameRate(int n) {
        }

        public boolean isKeyFrame() {
            return false;
        }

        public void setKeyFrame(boolean bl) {
        }

        public long getPresentationTimeMs() {
            return 0L;
        }

        public void setPresentationTimeMs(long l2) {
        }

        public void insertData(byte[] byArray, int n, int n2, int n3) {
        }

        public void reset() {
        }

        @NonNull
        public String toString() {
            return null;
        }

        static /* synthetic */ CodecByteBuffer access$000(ReceiveInfo receiveInfo) {
            return null;
        }

        static /* synthetic */ long access$102(ReceiveInfo receiveInfo, long l2) {
            return 0L;
        }

        static /* synthetic */ boolean access$202(ReceiveInfo receiveInfo, boolean bl) {
            return false;
        }

        static /* synthetic */ int access$302(ReceiveInfo receiveInfo, int n) {
            return 0;
        }

        static /* synthetic */ int access$402(ReceiveInfo receiveInfo, int n) {
            return 0;
        }

        static /* synthetic */ int access$502(ReceiveInfo receiveInfo, int n) {
            return 0;
        }
    }

    public static @interface MimeType {
        public static final String H264 = "video/avc";
        public static final String H265 = "video/hevc";
    }
}

