/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class MotionLapseMode
extends Enum<MotionLapseMode>
implements JNIProguardKeepTag {
    public static final /* enum */ MotionLapseMode USER_DEFINED = new MotionLapseMode(0);
    public static final /* enum */ MotionLapseMode LEFT_TO_RIGHT_120 = new MotionLapseMode(1);
    public static final /* enum */ MotionLapseMode RIGHT_TO_LEFT_120 = new MotionLapseMode(2);
    public static final /* enum */ MotionLapseMode UNKNOWN = new MotionLapseMode(65535);
    private int value;
    private static final MotionLapseMode[] allValues;
    private static final /* synthetic */ MotionLapseMode[] $VALUES;

    public static MotionLapseMode[] values() {
        return null;
    }

    public static MotionLapseMode valueOf(String string) {
        return null;
    }

    private MotionLapseMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MotionLapseMode find(int n) {
        return null;
    }

    private static /* synthetic */ MotionLapseMode[] $values() {
        return null;
    }

    static {
        $VALUES = MotionLapseMode.$values();
        allValues = MotionLapseMode.values();
    }
}

