/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGPumpControlMode
extends Enum<MGPumpControlMode>
implements JNIProguardKeepTag {
    public static final /* enum */ MGPumpControlMode SPEED = new MGPumpControlMode(1);
    public static final /* enum */ MGPumpControlMode FLOW = new MGPumpControlMode(2);
    public static final /* enum */ MGPumpControlMode UNKNOWN = new MGPumpControlMode(65535);
    private int value;
    private static final MGPumpControlMode[] allValues;
    private static final /* synthetic */ MGPumpControlMode[] $VALUES;

    public static MGPumpControlMode[] values() {
        return null;
    }

    public static MGPumpControlMode valueOf(String string) {
        return null;
    }

    private MGPumpControlMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGPumpControlMode find(int n) {
        return null;
    }

    private static /* synthetic */ MGPumpControlMode[] $values() {
        return null;
    }

    static {
        $VALUES = MGPumpControlMode.$values();
        allValues = MGPumpControlMode.values();
    }
}

