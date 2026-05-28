/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointActionType
extends Enum<WaypointActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointActionType STAY = new WaypointActionType(0);
    public static final /* enum */ WaypointActionType START_TAKE_PHOTO = new WaypointActionType(1);
    public static final /* enum */ WaypointActionType START_RECORD = new WaypointActionType(2);
    public static final /* enum */ WaypointActionType STOP_RECORD = new WaypointActionType(3);
    public static final /* enum */ WaypointActionType ROTATE_AIRCRAFT = new WaypointActionType(4);
    public static final /* enum */ WaypointActionType GIMBAL_PITCH = new WaypointActionType(5);
    public static final /* enum */ WaypointActionType START_SPRAY = new WaypointActionType(13);
    public static final /* enum */ WaypointActionType STOP_SPRAY = new WaypointActionType(14);
    public static final /* enum */ WaypointActionType GIMBAL_MIDDLE = new WaypointActionType(17);
    public static final /* enum */ WaypointActionType SPRAY_WITH_TIME = new WaypointActionType(18);
    public static final /* enum */ WaypointActionType UNKNOWN = new WaypointActionType(65535);
    private int value;
    private static final WaypointActionType[] allValues;
    private static final /* synthetic */ WaypointActionType[] $VALUES;

    public static WaypointActionType[] values() {
        return null;
    }

    public static WaypointActionType valueOf(String string) {
        return null;
    }

    private WaypointActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointActionType find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointActionType[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointActionType.$values();
        allValues = WaypointActionType.values();
    }
}

