/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class AxialStiffnessState
extends Enum<AxialStiffnessState>
implements JNIProguardKeepTag {
    public static final /* enum */ AxialStiffnessState NORMAL = new AxialStiffnessState(0);
    public static final /* enum */ AxialStiffnessState LOW = new AxialStiffnessState(1);
    public static final /* enum */ AxialStiffnessState UNKNOWN = new AxialStiffnessState(100);
    private int value;
    private static final AxialStiffnessState[] allValues;
    private static final /* synthetic */ AxialStiffnessState[] $VALUES;

    public static AxialStiffnessState[] values() {
        return null;
    }

    public static AxialStiffnessState valueOf(String string) {
        return null;
    }

    private AxialStiffnessState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AxialStiffnessState find(int n) {
        return null;
    }

    private static /* synthetic */ AxialStiffnessState[] $values() {
        return null;
    }

    static {
        $VALUES = AxialStiffnessState.$values();
        allValues = AxialStiffnessState.values();
    }
}

