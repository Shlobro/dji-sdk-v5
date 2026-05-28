/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestPushRodState
extends Enum<DroneNestPushRodState>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestPushRodState CLOSED = new DroneNestPushRodState(0);
    public static final /* enum */ DroneNestPushRodState OPENED = new DroneNestPushRodState(1);
    public static final /* enum */ DroneNestPushRodState PUTTER_INTERVAL = new DroneNestPushRodState(2);
    public static final /* enum */ DroneNestPushRodState PUTTER_LOCATION_ERROR = new DroneNestPushRodState(3);
    public static final /* enum */ DroneNestPushRodState PUTTER_LOCATION_LIMIT_ERROR = new DroneNestPushRodState(4);
    public static final /* enum */ DroneNestPushRodState UNKNOWN = new DroneNestPushRodState(65535);
    private int value;
    private static final DroneNestPushRodState[] allValues;
    private static final /* synthetic */ DroneNestPushRodState[] $VALUES;

    public static DroneNestPushRodState[] values() {
        return null;
    }

    public static DroneNestPushRodState valueOf(String string) {
        return null;
    }

    private DroneNestPushRodState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestPushRodState find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestPushRodState[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestPushRodState.$values();
        allValues = DroneNestPushRodState.values();
    }
}

