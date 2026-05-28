/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MotorEscmState
extends Enum<MotorEscmState>
implements JNIProguardKeepTag {
    public static final /* enum */ MotorEscmState NON_SMART = new MotorEscmState(0);
    public static final /* enum */ MotorEscmState DISCONNECT = new MotorEscmState(1);
    public static final /* enum */ MotorEscmState SIGNAL_ERROR = new MotorEscmState(2);
    public static final /* enum */ MotorEscmState RESISTANCE_ERROR = new MotorEscmState(3);
    public static final /* enum */ MotorEscmState BLOCK = new MotorEscmState(4);
    public static final /* enum */ MotorEscmState NON_BALANCE = new MotorEscmState(5);
    public static final /* enum */ MotorEscmState ESCM_ERROR = new MotorEscmState(6);
    public static final /* enum */ MotorEscmState PROPELLER_OFF = new MotorEscmState(7);
    public static final /* enum */ MotorEscmState MOTOR_IDLE = new MotorEscmState(8);
    public static final /* enum */ MotorEscmState MOTOR_UP = new MotorEscmState(9);
    public static final /* enum */ MotorEscmState MOTOR_OFF = new MotorEscmState(10);
    public static final /* enum */ MotorEscmState NON_CONNECT = new MotorEscmState(11);
    public static final /* enum */ MotorEscmState OTHER = new MotorEscmState(100);
    public static final /* enum */ MotorEscmState UNKNOWN = new MotorEscmState(65535);
    private int value;
    private static final MotorEscmState[] allValues;
    private static final /* synthetic */ MotorEscmState[] $VALUES;

    public static MotorEscmState[] values() {
        return null;
    }

    public static MotorEscmState valueOf(String string) {
        return null;
    }

    private MotorEscmState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MotorEscmState find(int n) {
        return null;
    }

    private static /* synthetic */ MotorEscmState[] $values() {
        return null;
    }

    static {
        $VALUES = MotorEscmState.$values();
        allValues = MotorEscmState.values();
    }
}

