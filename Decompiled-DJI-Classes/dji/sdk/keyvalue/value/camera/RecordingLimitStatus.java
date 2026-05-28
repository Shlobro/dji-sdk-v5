/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class RecordingLimitStatus
extends Enum<RecordingLimitStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ RecordingLimitStatus BLACK_SCREEN_RECORDING = new RecordingLimitStatus(1);
    public static final /* enum */ RecordingLimitStatus FORBID_RECORDING = new RecordingLimitStatus(2);
    public static final /* enum */ RecordingLimitStatus UNKNOWN = new RecordingLimitStatus(65535);
    private int value;
    private static final RecordingLimitStatus[] allValues;
    private static final /* synthetic */ RecordingLimitStatus[] $VALUES;

    public static RecordingLimitStatus[] values() {
        return null;
    }

    public static RecordingLimitStatus valueOf(String string) {
        return null;
    }

    private RecordingLimitStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RecordingLimitStatus find(int n) {
        return null;
    }

    private static /* synthetic */ RecordingLimitStatus[] $values() {
        return null;
    }

    static {
        $VALUES = RecordingLimitStatus.$values();
        allValues = RecordingLimitStatus.values();
    }
}

