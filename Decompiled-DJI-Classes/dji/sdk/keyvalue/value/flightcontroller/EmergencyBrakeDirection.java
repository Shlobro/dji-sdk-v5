/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class EmergencyBrakeDirection
extends Enum<EmergencyBrakeDirection>
implements JNIProguardKeepTag {
    public static final /* enum */ EmergencyBrakeDirection FRONT = new EmergencyBrakeDirection(1);
    public static final /* enum */ EmergencyBrakeDirection RIGHT = new EmergencyBrakeDirection(2);
    public static final /* enum */ EmergencyBrakeDirection BACK = new EmergencyBrakeDirection(3);
    public static final /* enum */ EmergencyBrakeDirection LEFT = new EmergencyBrakeDirection(4);
    public static final /* enum */ EmergencyBrakeDirection UNKNOWN = new EmergencyBrakeDirection(65535);
    private int value;
    private static final EmergencyBrakeDirection[] allValues;
    private static final /* synthetic */ EmergencyBrakeDirection[] $VALUES;

    public static EmergencyBrakeDirection[] values() {
        return null;
    }

    public static EmergencyBrakeDirection valueOf(String string) {
        return null;
    }

    private EmergencyBrakeDirection(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EmergencyBrakeDirection find(int n) {
        return null;
    }

    private static /* synthetic */ EmergencyBrakeDirection[] $values() {
        return null;
    }

    static {
        $VALUES = EmergencyBrakeDirection.$values();
        allValues = EmergencyBrakeDirection.values();
    }
}

