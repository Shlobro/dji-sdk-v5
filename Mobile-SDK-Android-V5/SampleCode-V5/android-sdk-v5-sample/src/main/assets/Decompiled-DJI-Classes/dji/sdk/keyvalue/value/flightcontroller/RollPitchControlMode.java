/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class RollPitchControlMode
extends Enum<RollPitchControlMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RollPitchControlMode ANGLE = new RollPitchControlMode(0);
    public static final /* enum */ RollPitchControlMode VELOCITY = new RollPitchControlMode(1);
    public static final /* enum */ RollPitchControlMode POSITION = new RollPitchControlMode(2);
    public static final /* enum */ RollPitchControlMode UNKNOWN = new RollPitchControlMode(65535);
    private int value;
    private static final RollPitchControlMode[] allValues;
    private static final /* synthetic */ RollPitchControlMode[] $VALUES;

    public static RollPitchControlMode[] values() {
        return null;
    }

    public static RollPitchControlMode valueOf(String string) {
        return null;
    }

    private RollPitchControlMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RollPitchControlMode find(int n) {
        return null;
    }

    private static /* synthetic */ RollPitchControlMode[] $values() {
        return null;
    }

    static {
        $VALUES = RollPitchControlMode.$values();
        allValues = RollPitchControlMode.values();
    }
}

