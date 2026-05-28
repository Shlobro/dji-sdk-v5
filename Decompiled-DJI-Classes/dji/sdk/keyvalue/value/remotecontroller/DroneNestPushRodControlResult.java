/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestPushRodControlResult
extends Enum<DroneNestPushRodControlResult>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestPushRodControlResult DEVICE_NORMAL = new DroneNestPushRodControlResult(0);
    public static final /* enum */ DroneNestPushRodControlResult EMERGENCY = new DroneNestPushRodControlResult(1);
    public static final /* enum */ DroneNestPushRodControlResult ABNORMAL = new DroneNestPushRodControlResult(2);
    public static final /* enum */ DroneNestPushRodControlResult UNKNOWN = new DroneNestPushRodControlResult(65535);
    private int value;
    private static final DroneNestPushRodControlResult[] allValues;
    private static final /* synthetic */ DroneNestPushRodControlResult[] $VALUES;

    public static DroneNestPushRodControlResult[] values() {
        return null;
    }

    public static DroneNestPushRodControlResult valueOf(String string) {
        return null;
    }

    private DroneNestPushRodControlResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestPushRodControlResult find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestPushRodControlResult[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestPushRodControlResult.$values();
        allValues = DroneNestPushRodControlResult.values();
    }
}

