/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SuperResolutionState
extends Enum<SuperResolutionState>
implements JNIProguardKeepTag {
    public static final /* enum */ SuperResolutionState SELECTING = new SuperResolutionState(0);
    public static final /* enum */ SuperResolutionState IN_PROGRESS = new SuperResolutionState(1);
    public static final /* enum */ SuperResolutionState FINISH = new SuperResolutionState(2);
    public static final /* enum */ SuperResolutionState EXIT_OUT_OF_STORAGE = new SuperResolutionState(3);
    public static final /* enum */ SuperResolutionState EXIT_SHOOT_FAIL = new SuperResolutionState(4);
    public static final /* enum */ SuperResolutionState EXIT_GIMBAL_BLOCK = new SuperResolutionState(5);
    public static final /* enum */ SuperResolutionState EXIT_GIMBAL_ABNORMAL_MOVE = new SuperResolutionState(6);
    public static final /* enum */ SuperResolutionState TIP_GIMBAL_OUT_OF_RANGE = new SuperResolutionState(7);
    public static final /* enum */ SuperResolutionState TIP_OUT_OF_ZOOM = new SuperResolutionState(8);
    public static final /* enum */ SuperResolutionState UNKNOWN = new SuperResolutionState(65535);
    private int value;
    private static final SuperResolutionState[] allValues;
    private static final /* synthetic */ SuperResolutionState[] $VALUES;

    public static SuperResolutionState[] values() {
        return null;
    }

    public static SuperResolutionState valueOf(String string) {
        return null;
    }

    private SuperResolutionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SuperResolutionState find(int n) {
        return null;
    }

    private static /* synthetic */ SuperResolutionState[] $values() {
        return null;
    }

    static {
        $VALUES = SuperResolutionState.$values();
        allValues = SuperResolutionState.values();
    }
}

