/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoRecordMode
extends Enum<VideoRecordMode>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoRecordMode NORMAL = new VideoRecordMode(0);
    public static final /* enum */ VideoRecordMode SLOW_MOTION = new VideoRecordMode(1);
    public static final /* enum */ VideoRecordMode FAST_MOTION = new VideoRecordMode(2);
    public static final /* enum */ VideoRecordMode TIME_LAPSE = new VideoRecordMode(3);
    public static final /* enum */ VideoRecordMode HDR = new VideoRecordMode(4);
    public static final /* enum */ VideoRecordMode HYPER_LAPSE = new VideoRecordMode(5);
    public static final /* enum */ VideoRecordMode QUICK_SHOT = new VideoRecordMode(6);
    public static final /* enum */ VideoRecordMode UNKNOWN = new VideoRecordMode(65535);
    private int value;
    private static final VideoRecordMode[] allValues;
    private static final /* synthetic */ VideoRecordMode[] $VALUES;

    public static VideoRecordMode[] values() {
        return null;
    }

    public static VideoRecordMode valueOf(String string) {
        return null;
    }

    private VideoRecordMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoRecordMode find(int n) {
        return null;
    }

    private static /* synthetic */ VideoRecordMode[] $values() {
        return null;
    }

    static {
        $VALUES = VideoRecordMode.$values();
        allValues = VideoRecordMode.values();
    }
}

