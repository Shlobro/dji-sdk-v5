/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineAircraftActuatorActionType
extends Enum<WaylineAircraftActuatorActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineAircraftActuatorActionType UNKNOWN = new WaylineAircraftActuatorActionType(0);
    public static final /* enum */ WaylineAircraftActuatorActionType ROTATE_YAW = new WaylineAircraftActuatorActionType(1);
    public static final /* enum */ WaylineAircraftActuatorActionType FLY_CONTROL = new WaylineAircraftActuatorActionType(2);
    public static final /* enum */ WaylineAircraftActuatorActionType HOVER = new WaylineAircraftActuatorActionType(3);
    private int value;
    private static final WaylineAircraftActuatorActionType[] allValues;
    private static final /* synthetic */ WaylineAircraftActuatorActionType[] $VALUES;

    public static WaylineAircraftActuatorActionType[] values() {
        return null;
    }

    public static WaylineAircraftActuatorActionType valueOf(String string) {
        return null;
    }

    private WaylineAircraftActuatorActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineAircraftActuatorActionType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineAircraftActuatorActionType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineAircraftActuatorActionType.$values();
        allValues = WaylineAircraftActuatorActionType.values();
    }
}

