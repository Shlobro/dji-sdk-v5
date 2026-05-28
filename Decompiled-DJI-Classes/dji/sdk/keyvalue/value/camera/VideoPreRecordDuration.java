/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoPreRecordDuration
extends Enum<VideoPreRecordDuration>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoPreRecordDuration DURATION_5_SEC = new VideoPreRecordDuration(5);
    public static final /* enum */ VideoPreRecordDuration DURATION_10_SEC = new VideoPreRecordDuration(10);
    public static final /* enum */ VideoPreRecordDuration DURATION_15_SEC = new VideoPreRecordDuration(15);
    public static final /* enum */ VideoPreRecordDuration DURATION_30_SEC = new VideoPreRecordDuration(30);
    public static final /* enum */ VideoPreRecordDuration DURATION_60_SEC = new VideoPreRecordDuration(60);
    public static final /* enum */ VideoPreRecordDuration UNKNOWN = new VideoPreRecordDuration(65535);
    private int value;
    private static final VideoPreRecordDuration[] allValues;
    private static final /* synthetic */ VideoPreRecordDuration[] $VALUES;

    public static VideoPreRecordDuration[] values() {
        return null;
    }

    public static VideoPreRecordDuration valueOf(String string) {
        return null;
    }

    private VideoPreRecordDuration(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoPreRecordDuration find(int n) {
        return null;
    }

    private static /* synthetic */ VideoPreRecordDuration[] $values() {
        return null;
    }

    static {
        $VALUES = VideoPreRecordDuration.$values();
        allValues = VideoPreRecordDuration.values();
    }
}

