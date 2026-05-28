/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.lib.codec.decode;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.lib.codec.VideoCodec;
import dji.v5.lib.codec.model.FrameInfo;
import dji.v5.lib.codec.model.NalUnit;
import dji.v5.lib.codec.util.CodecByteBuffer;
import java.io.IOException;
import java.util.List;

public abstract class VideoDecoder
extends VideoCodec {
    private static final String KEY_OUTPUT_SURFACE = "output-surface";
    private static final int DEFAULT_WIDTH = 1920;
    private static final int DEFAULT_HEIGHT = 1080;
    private static final int MAX_CODEC_BUFFER_SIZE = 2073600;
    private final List<Integer> mNalUnitOffsetList;
    private final CodecByteBuffer mFrameDataBuffer;
    private OnNalUnitInterceptListener mOnNalUnitInterceptListener;
    private OnFrameInterceptListener mOnFrameInterceptListener;
    private OnFrameDequeueListener mOnFrameDequeueListener;
    private Surface mOutputSurface;
    protected boolean isIPChannel;
    protected FrameInfo latestFrameInfo;

    protected abstract int getNalType(@NonNull byte[] var1, int var2);

    protected abstract boolean isNextFrameStart(List<NalUnit> var1, int var2);

    protected abstract void parseNalUnit(@NonNull FrameInfo var1, @NonNull List<NalUnit> var2, @NonNull byte[] var3);

    protected VideoDecoder(@VideoCodec.MimeType String string2, @Nullable String string3) throws IOException {
    }

    protected void setupDefaultMediaFormat() {
    }

    public synchronized void sendFrame(@NonNull byte[] byArray, int n, int n2, long l2, long l3) throws IllegalStateException {
    }

    @Override
    public synchronized boolean sendFrame(@NonNull byte[] byArray, int n, int n2, long l2, int n3, long l3) throws IllegalStateException {
        return false;
    }

    @Override
    public synchronized void release() {
    }

    @Override
    protected void onClearCache() {
    }

    public synchronized void setOnNalUnitInterceptListener(@NonNull OnNalUnitInterceptListener onNalUnitInterceptListener) {
    }

    public synchronized void setOnFrameInterceptListener(@NonNull OnFrameInterceptListener onFrameInterceptListener) {
    }

    public void setOnFrameDequeueListener(OnFrameDequeueListener onFrameDequeueListener) {
    }

    public synchronized void setOutputSurface(Surface surface) {
    }

    @Override
    public synchronized Surface getOutputSurface() {
        return null;
    }

    @Override
    public synchronized void setColorFormats(int n) {
    }

    public void setIPChannel(boolean bl) {
    }

    public FrameInfo getLatestFrameInfo() {
        return null;
    }

    private FrameInfo createFrameInfo() {
        return null;
    }

    private boolean callOnNalUnitInterceptListener(@NonNull List<Integer> list, @NonNull byte[] byArray) {
        return false;
    }

    private boolean callOnFrameInterceptListener(@NonNull FrameInfo frameInfo, @NonNull byte[] byArray) {
        return false;
    }

    private void callOnFrameDequeueListener(@NonNull FrameInfo frameInfo, @NonNull byte[] byArray, @NonNull DequeueState dequeueState) {
    }

    public static final class DequeueState
    extends Enum<DequeueState> {
        public static final /* enum */ DequeueState DEQUEUED = new DequeueState();
        public static final /* enum */ DequeueState CODEC_BUSY = new DequeueState();
        private static final /* synthetic */ DequeueState[] $VALUES;

        public static DequeueState[] values() {
            return null;
        }

        public static DequeueState valueOf(String string2) {
            return null;
        }

        private static /* synthetic */ DequeueState[] $values() {
            return null;
        }

        static {
            $VALUES = DequeueState.$values();
        }
    }

    public static interface OnFrameDequeueListener {
        public void onFrameDequeue(@NonNull FrameInfo var1, @NonNull byte[] var2, @NonNull DequeueState var3);
    }

    public static interface OnFrameInterceptListener {
        public boolean onFrameIntercept(@NonNull FrameInfo var1, @NonNull byte[] var2);
    }

    public static interface OnNalUnitInterceptListener {
        public boolean onNalUnitIntercept(@NonNull List<Integer> var1, @NonNull byte[] var2);
    }
}

