/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class RotationalInertiaState
extends Enum<RotationalInertiaState>
implements JNIProguardKeepTag {
    public static final /* enum */ RotationalInertiaState NORMAL = new RotationalInertiaState(0);
    public static final /* enum */ RotationalInertiaState SMALLER = new RotationalInertiaState(1);
    public static final /* enum */ RotationalInertiaState TOO_LARGER = new RotationalInertiaState(2);
    public static final /* enum */ RotationalInertiaState UNKNOWN = new RotationalInertiaState(255);
    private int value;
    private static final RotationalInertiaState[] allValues;
    private static final /* synthetic */ RotationalInertiaState[] $VALUES;

    public static RotationalInertiaState[] values() {
        return null;
    }

    public static RotationalInertiaState valueOf(String string) {
        return null;
    }

    private RotationalInertiaState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RotationalInertiaState find(int n) {
        return null;
    }

    private static /* synthetic */ RotationalInertiaState[] $values() {
        return null;
    }

    static {
        $VALUES = RotationalInertiaState.$values();
        allValues = RotationalInertiaState.values();
    }
}

