/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestGroupBindState
extends Enum<DroneNestGroupBindState>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestGroupBindState NONE = new DroneNestGroupBindState(0);
    public static final /* enum */ DroneNestGroupBindState NOT_SUPPORTED_0 = new DroneNestGroupBindState(1);
    public static final /* enum */ DroneNestGroupBindState RD_CLOUD = new DroneNestGroupBindState(2);
    public static final /* enum */ DroneNestGroupBindState UNKNOWN = new DroneNestGroupBindState(65535);
    private int value;
    private static final DroneNestGroupBindState[] allValues;
    private static final /* synthetic */ DroneNestGroupBindState[] $VALUES;

    public static DroneNestGroupBindState[] values() {
        return null;
    }

    public static DroneNestGroupBindState valueOf(String string) {
        return null;
    }

    private DroneNestGroupBindState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestGroupBindState find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestGroupBindState[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestGroupBindState.$values();
        allValues = DroneNestGroupBindState.values();
    }
}

