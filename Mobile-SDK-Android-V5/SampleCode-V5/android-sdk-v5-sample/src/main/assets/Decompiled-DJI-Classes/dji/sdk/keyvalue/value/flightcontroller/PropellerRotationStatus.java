/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PropellerRotationStatus
extends Enum<PropellerRotationStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ PropellerRotationStatus NONE_MOTOR_IN_LOW_SPEED_ROTATION = new PropellerRotationStatus(0);
    public static final /* enum */ PropellerRotationStatus PART_MOTOR_IN_LOW_SPEED_ROTATION = new PropellerRotationStatus(1);
    public static final /* enum */ PropellerRotationStatus ALL_MOTOR_IN_LOW_SPEED_ROTATION = new PropellerRotationStatus(2);
    public static final /* enum */ PropellerRotationStatus UNKNOWN = new PropellerRotationStatus(65535);
    private int value;
    private static final PropellerRotationStatus[] allValues;
    private static final /* synthetic */ PropellerRotationStatus[] $VALUES;

    public static PropellerRotationStatus[] values() {
        return null;
    }

    public static PropellerRotationStatus valueOf(String string) {
        return null;
    }

    private PropellerRotationStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PropellerRotationStatus find(int n) {
        return null;
    }

    private static /* synthetic */ PropellerRotationStatus[] $values() {
        return null;
    }

    static {
        $VALUES = PropellerRotationStatus.$values();
        allValues = PropellerRotationStatus.values();
    }
}

