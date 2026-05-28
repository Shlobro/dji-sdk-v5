/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.lib.codec.encode;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.lib.codec.VideoCodec;
import java.io.IOException;

public abstract class VideoEncoder
extends VideoCodec {
    private static final String KEY_INPUT_SURFACE = "input-surface";
    private Surface mInputSurface;
    private long mFirstFramePts;
    private long mFirstFrameRealTimePts;

    protected VideoEncoder(@VideoCodec.MimeType String string2, @Nullable String string3) throws IOException {
    }

    protected void setupDefaultMediaFormat() {
    }

    public synchronized boolean sendFrame(@NonNull byte[] byArray, int n, int n2, long l2, long l3) throws IllegalStateException {
        return false;
    }

    public synchronized void sendFromInputSurface(@NonNull EncoderSurface encoderSurface) throws IllegalStateException {
    }

    public synchronized void clearInputSurface() {
    }

    @Override
    public synchronized boolean receiveFrame(@Nullable VideoCodec.ReceiveInfo receiveInfo, long l2, long l3) throws IllegalStateException {
        return false;
    }

    @Override
    public synchronized void release() throws IllegalStateException {
    }

    @Override
    protected void onClearCache() {
    }

    @Override
    @Nullable
    public Surface getInputSurface() {
        return null;
    }

    @NonNull
    public static EncoderSurface createInputSurface() {
        return null;
    }

    public static class EncoderSurface
    implements AutoCloseable {
        @NonNull
        public final Surface surface;

        private EncoderSurface(@NonNull Surface surface) {
        }

        public void release() {
        }

        @Override
        public void close() throws Exception {
        }

        protected void finalize() throws Throwable {
        }

        /* synthetic */ EncoderSurface(Surface surface, 1 var2_2) {
        }
    }
}

