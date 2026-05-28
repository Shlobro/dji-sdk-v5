/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestLteModeMsg
extends Enum<DroneNestLteModeMsg>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestLteModeMsg SDR_ONLY = new DroneNestLteModeMsg(1);
    public static final /* enum */ DroneNestLteModeMsg HYBRID_LTESDR = new DroneNestLteModeMsg(3);
    public static final /* enum */ DroneNestLteModeMsg UNKNOWN = new DroneNestLteModeMsg(65535);
    private int value;
    private static final DroneNestLteModeMsg[] allValues;
    private static final /* synthetic */ DroneNestLteModeMsg[] $VALUES;

    public static DroneNestLteModeMsg[] values() {
        return null;
    }

    public static DroneNestLteModeMsg valueOf(String string) {
        return null;
    }

    private DroneNestLteModeMsg(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestLteModeMsg find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestLteModeMsg[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestLteModeMsg.$values();
        allValues = DroneNestLteModeMsg.values();
    }
}

