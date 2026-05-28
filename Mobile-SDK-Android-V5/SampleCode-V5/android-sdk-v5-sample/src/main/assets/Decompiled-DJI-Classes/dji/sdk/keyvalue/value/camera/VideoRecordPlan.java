/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoRecordPlan
extends Enum<VideoRecordPlan>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoRecordPlan DEFAULT = new VideoRecordPlan(0);
    public static final /* enum */ VideoRecordPlan PRE_RECORD = new VideoRecordPlan(1);
    public static final /* enum */ VideoRecordPlan LOOP_RECORD = new VideoRecordPlan(2);
    public static final /* enum */ VideoRecordPlan UNKNOWN = new VideoRecordPlan(65535);
    private int value;
    private static final VideoRecordPlan[] allValues;
    private static final /* synthetic */ VideoRecordPlan[] $VALUES;

    public static VideoRecordPlan[] values() {
        return null;
    }

    public static VideoRecordPlan valueOf(String string) {
        return null;
    }

    private VideoRecordPlan(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoRecordPlan find(int n) {
        return null;
    }

    private static /* synthetic */ VideoRecordPlan[] $values() {
        return null;
    }

    static {
        $VALUES = VideoRecordPlan.$values();
        allValues = VideoRecordPlan.values();
    }
}

