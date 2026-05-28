/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class AudioRecordingGainRange
extends Enum<AudioRecordingGainRange>
implements JNIProguardKeepTag {
    public static final /* enum */ AudioRecordingGainRange RANGE_0_TO_10 = new AudioRecordingGainRange(0);
    public static final /* enum */ AudioRecordingGainRange RANGE_0_TO_100 = new AudioRecordingGainRange(1);
    public static final /* enum */ AudioRecordingGainRange UNKNOWN = new AudioRecordingGainRange(65535);
    private int value;
    private static final AudioRecordingGainRange[] allValues;
    private static final /* synthetic */ AudioRecordingGainRange[] $VALUES;

    public static AudioRecordingGainRange[] values() {
        return null;
    }

    public static AudioRecordingGainRange valueOf(String string) {
        return null;
    }

    private AudioRecordingGainRange(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AudioRecordingGainRange find(int n) {
        return null;
    }

    private static /* synthetic */ AudioRecordingGainRange[] $values() {
        return null;
    }

    static {
        $VALUES = AudioRecordingGainRange.$values();
        allValues = AudioRecordingGainRange.values();
    }
}

