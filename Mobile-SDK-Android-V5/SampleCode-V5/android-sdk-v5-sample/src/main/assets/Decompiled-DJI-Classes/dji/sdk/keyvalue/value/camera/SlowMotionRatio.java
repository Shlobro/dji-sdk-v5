/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SlowMotionRatio
extends Enum<SlowMotionRatio>
implements JNIProguardKeepTag {
    public static final /* enum */ SlowMotionRatio RATIO_1X = new SlowMotionRatio(0);
    public static final /* enum */ SlowMotionRatio RATIO_2X = new SlowMotionRatio(1);
    public static final /* enum */ SlowMotionRatio RATIO_4X = new SlowMotionRatio(2);
    public static final /* enum */ SlowMotionRatio RATIO_8X = new SlowMotionRatio(3);
    public static final /* enum */ SlowMotionRatio RATIO_16X = new SlowMotionRatio(4);
    public static final /* enum */ SlowMotionRatio UNKNOWN = new SlowMotionRatio(65535);
    private int value;
    private static final SlowMotionRatio[] allValues;
    private static final /* synthetic */ SlowMotionRatio[] $VALUES;

    public static SlowMotionRatio[] values() {
        return null;
    }

    public static SlowMotionRatio valueOf(String string) {
        return null;
    }

    private SlowMotionRatio(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SlowMotionRatio find(int n) {
        return null;
    }

    private static /* synthetic */ SlowMotionRatio[] $values() {
        return null;
    }

    static {
        $VALUES = SlowMotionRatio.$values();
        allValues = SlowMotionRatio.values();
    }
}

