/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.recorder;

import dji.v5.common.recorder.AudioConfig;
import dji.v5.common.recorder.EncodedDataCallback;
import java.util.concurrent.ArrayBlockingQueue;

public class OpusEncoder {
    private static final String TAG = "OpusEncoder";
    private ArrayBlockingQueue<byte[]> mQueue;
    private int mAudioChannelCount;
    private int mAudioSampleRate;
    private int mAudioBufferSize;
    private boolean isEncoding;
    private boolean mEnableAgc;
    private Thread mEncodeThread;
    private EncodedDataCallback mEncodedDataCallback;
    private long mEncoderId;

    public void config(AudioConfig audioConfig) {
    }

    public void enableAgc(boolean bl) {
    }

    public boolean isEnableAgc() {
        return false;
    }

    private void initAudioEncoder() {
    }

    public void start() {
    }

    public void release() {
    }

    public void putData(byte[] byArray) {
    }

    public void setEncodedDataCallback(EncodedDataCallback encodedDataCallback) {
    }

    private void encodePCM() {
    }

    private short[] getAGCData() {
        return null;
    }

    private byte[] getPCMData() {
        return null;
    }

    static /* synthetic */ boolean access$100(OpusEncoder opusEncoder) {
        return false;
    }

    static /* synthetic */ ArrayBlockingQueue access$200(OpusEncoder opusEncoder) {
        return null;
    }

    static /* synthetic */ void access$300(OpusEncoder opusEncoder) {
    }

    private class EncodeRunnable
    implements Runnable {
        final /* synthetic */ OpusEncoder this$0;

        private EncodeRunnable(OpusEncoder opusEncoder) {
        }

        @Override
        public void run() {
        }

        /* synthetic */ EncodeRunnable(OpusEncoder opusEncoder, 1 var2_2) {
        }
    }
}

