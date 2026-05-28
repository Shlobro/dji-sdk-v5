/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoRecordingState
extends Enum<VideoRecordingState>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoRecordingState IDLE = new VideoRecordingState(0);
    public static final /* enum */ VideoRecordingState STARTING = new VideoRecordingState(1);
    public static final /* enum */ VideoRecordingState RECORDING = new VideoRecordingState(2);
    public static final /* enum */ VideoRecordingState STOPPING = new VideoRecordingState(3);
    public static final /* enum */ VideoRecordingState COUNTDOWN = new VideoRecordingState(4);
    public static final /* enum */ VideoRecordingState PRE_RECORDING = new VideoRecordingState(5);
    public static final /* enum */ VideoRecordingState UNKNOWN = new VideoRecordingState(65535);
    private int value;
    private static final VideoRecordingState[] allValues;
    private static final /* synthetic */ VideoRecordingState[] $VALUES;

    public static VideoRecordingState[] values() {
        return null;
    }

    public static VideoRecordingState valueOf(String string) {
        return null;
    }

    private VideoRecordingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoRecordingState find(int n) {
        return null;
    }

    private static /* synthetic */ VideoRecordingState[] $values() {
        return null;
    }

    static {
        $VALUES = VideoRecordingState.$values();
        allValues = VideoRecordingState.values();
    }
}

