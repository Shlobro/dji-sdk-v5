/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class RecordingState
extends Enum<RecordingState>
implements JNIProguardKeepTag {
    public static final /* enum */ RecordingState IDEL = new RecordingState(0);
    public static final /* enum */ RecordingState STARTING = new RecordingState(1);
    public static final /* enum */ RecordingState RECORDING = new RecordingState(2);
    public static final /* enum */ RecordingState STOPPING = new RecordingState(3);
    public static final /* enum */ RecordingState PAUSED = new RecordingState(4);
    public static final /* enum */ RecordingState PAUSING = new RecordingState(5);
    public static final /* enum */ RecordingState RESUMING = new RecordingState(6);
    public static final /* enum */ RecordingState UNKNOWN = new RecordingState(65535);
    private int value;
    private static final RecordingState[] allValues;
    private static final /* synthetic */ RecordingState[] $VALUES;

    public static RecordingState[] values() {
        return null;
    }

    public static RecordingState valueOf(String string) {
        return null;
    }

    private RecordingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RecordingState find(int n) {
        return null;
    }

    private static /* synthetic */ RecordingState[] $values() {
        return null;
    }

    static {
        $VALUES = RecordingState.$values();
        allValues = RecordingState.values();
    }
}

