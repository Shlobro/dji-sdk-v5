/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineGimbalActuatorActionType
extends Enum<WaylineGimbalActuatorActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineGimbalActuatorActionType UNKNOWN = new WaylineGimbalActuatorActionType(0);
    public static final /* enum */ WaylineGimbalActuatorActionType GIMBAL_ROTATE = new WaylineGimbalActuatorActionType(1);
    public static final /* enum */ WaylineGimbalActuatorActionType START_SMART_OBLIQUE = new WaylineGimbalActuatorActionType(3);
    public static final /* enum */ WaylineGimbalActuatorActionType STOP_SMART_OBLIQUE = new WaylineGimbalActuatorActionType(4);
    public static final /* enum */ WaylineGimbalActuatorActionType GIMBAL_EVENLY_ROTATE = new WaylineGimbalActuatorActionType(5);
    private int value;
    private static final WaylineGimbalActuatorActionType[] allValues;
    private static final /* synthetic */ WaylineGimbalActuatorActionType[] $VALUES;

    public static WaylineGimbalActuatorActionType[] values() {
        return null;
    }

    public static WaylineGimbalActuatorActionType valueOf(String string) {
        return null;
    }

    private WaylineGimbalActuatorActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineGimbalActuatorActionType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineGimbalActuatorActionType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineGimbalActuatorActionType.$values();
        allValues = WaylineGimbalActuatorActionType.values();
    }
}

