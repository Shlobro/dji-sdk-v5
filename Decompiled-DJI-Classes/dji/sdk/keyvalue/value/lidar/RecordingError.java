/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class RecordingError
extends Enum<RecordingError>
implements JNIProguardKeepTag {
    public static final /* enum */ RecordingError RECORDING_NOT_SUPPORT = new RecordingError(0);
    public static final /* enum */ RecordingError RECORDING_OK = new RecordingError(1);
    public static final /* enum */ RecordingError RECORDING_VIDEO_RECORDING = new RecordingError(2);
    public static final /* enum */ RecordingError RECORDING_SD_CARD_NOT_PRESENT = new RecordingError(3);
    public static final /* enum */ RecordingError RECORDING_SD_CARD_FULL = new RecordingError(4);
    public static final /* enum */ RecordingError UNKNOWN = new RecordingError(65535);
    private int value;
    private static final RecordingError[] allValues;
    private static final /* synthetic */ RecordingError[] $VALUES;

    public static RecordingError[] values() {
        return null;
    }

    public static RecordingError valueOf(String string) {
        return null;
    }

    private RecordingError(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RecordingError find(int n) {
        return null;
    }

    private static /* synthetic */ RecordingError[] $values() {
        return null;
    }

    static {
        $VALUES = RecordingError.$values();
        allValues = RecordingError.values();
    }
}

