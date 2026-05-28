/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineCameraActuatorActionType
extends Enum<WaylineCameraActuatorActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineCameraActuatorActionType UNKNOWN = new WaylineCameraActuatorActionType(0);
    public static final /* enum */ WaylineCameraActuatorActionType TAKE_PHOTO = new WaylineCameraActuatorActionType(1);
    public static final /* enum */ WaylineCameraActuatorActionType START_RECORD = new WaylineCameraActuatorActionType(2);
    public static final /* enum */ WaylineCameraActuatorActionType STOP_RECORD = new WaylineCameraActuatorActionType(3);
    public static final /* enum */ WaylineCameraActuatorActionType FOCUS = new WaylineCameraActuatorActionType(4);
    public static final /* enum */ WaylineCameraActuatorActionType ZOOM = new WaylineCameraActuatorActionType(5);
    public static final /* enum */ WaylineCameraActuatorActionType CUSTOM_DIR_NAME = new WaylineCameraActuatorActionType(6);
    public static final /* enum */ WaylineCameraActuatorActionType SET_FOCUS_TYPE = new WaylineCameraActuatorActionType(7);
    private int value;
    private static final WaylineCameraActuatorActionType[] allValues;
    private static final /* synthetic */ WaylineCameraActuatorActionType[] $VALUES;

    public static WaylineCameraActuatorActionType[] values() {
        return null;
    }

    public static WaylineCameraActuatorActionType valueOf(String string) {
        return null;
    }

    private WaylineCameraActuatorActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineCameraActuatorActionType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineCameraActuatorActionType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineCameraActuatorActionType.$values();
        allValues = WaylineCameraActuatorActionType.values();
    }
}

