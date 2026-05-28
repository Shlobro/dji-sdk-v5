/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioRecord
 */
package dji.v5.common.recorder;

import android.media.AudioRecord;
import dji.v5.common.recorder.AudioConfig;
import dji.v5.common.recorder.SourceDataCallback;

public class AudioRecordHandler {
    private static final String TAG = "AudioRecordHandler";
    private static final int[] SAMPLE_RATES = new int[]{16000};
    private int audioFormat;
    private int channelConfig;
    private int audioSource;
    private AudioRecord mAudioRecorder;
    private static final int MAX_BUFFER_SIZE = 8192;
    private static final int MIN_BUFFER_SIZE = 2560;
    private int mBufferSize;
    private byte[] mAudioBuffer;
    private SourceDataCallback mCallback;
    private boolean isRecording;
    private Thread mReadDataThread;

    private AudioRecordHandler() {
    }

    public static AudioRecordHandler getInstance() {
        return null;
    }

    public void init() {
    }

    public void setDataCallBack(SourceDataCallback sourceDataCallback) {
    }

    public AudioConfig getAudioConfig() {
        return null;
    }

    public void start() {
    }

    public void stop() {
    }

    public void release() {
    }

    /* synthetic */ AudioRecordHandler(1 var1_1) {
    }

    static /* synthetic */ boolean access$300(AudioRecordHandler audioRecordHandler) {
        return false;
    }

    static /* synthetic */ AudioRecord access$400(AudioRecordHandler audioRecordHandler) {
        return null;
    }

    static /* synthetic */ byte[] access$500(AudioRecordHandler audioRecordHandler) {
        return null;
    }

    static /* synthetic */ SourceDataCallback access$600(AudioRecordHandler audioRecordHandler) {
        return null;
    }

    private static class LazyHolder {
        private static final AudioRecordHandler INSTANCE = new AudioRecordHandler(null);

        private LazyHolder() {
        }

        static /* synthetic */ AudioRecordHandler access$100() {
            return null;
        }
    }

    private class ReadDataThread
    extends Thread {
        int index;
        final /* synthetic */ AudioRecordHandler this$0;

        private ReadDataThread(AudioRecordHandler audioRecordHandler) {
        }

        @Override
        public void run() {
        }

        private void recordDataCallback(int n) {
        }

        /* synthetic */ ReadDataThread(AudioRecordHandler audioRecordHandler, 1 var2_2) {
        }
    }
}

