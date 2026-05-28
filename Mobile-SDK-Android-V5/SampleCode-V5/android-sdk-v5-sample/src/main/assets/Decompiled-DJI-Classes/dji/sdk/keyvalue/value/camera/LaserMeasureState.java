/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class LaserMeasureState
extends Enum<LaserMeasureState>
implements JNIProguardKeepTag {
    public static final /* enum */ LaserMeasureState NORMAL = new LaserMeasureState(0);
    public static final /* enum */ LaserMeasureState TOO_CLOSE = new LaserMeasureState(1);
    public static final /* enum */ LaserMeasureState TOO_FAR = new LaserMeasureState(2);
    public static final /* enum */ LaserMeasureState NO_SIGNAL = new LaserMeasureState(3);
    public static final /* enum */ LaserMeasureState OUT_OF_RANGE = new LaserMeasureState(4);
    public static final /* enum */ LaserMeasureState UNKNOWN = new LaserMeasureState(65535);
    private int value;
    private static final LaserMeasureState[] allValues;
    private static final /* synthetic */ LaserMeasureState[] $VALUES;

    public static LaserMeasureState[] values() {
        return null;
    }

    public static LaserMeasureState valueOf(String string) {
        return null;
    }

    private LaserMeasureState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LaserMeasureState find(int n) {
        return null;
    }

    private static /* synthetic */ LaserMeasureState[] $values() {
        return null;
    }

    static {
        $VALUES = LaserMeasureState.$values();
        allValues = LaserMeasureState.values();
    }
}

