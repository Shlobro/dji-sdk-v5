/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointV2YawMode
extends Enum<WaypointV2YawMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointV2YawMode AUTO = new WaypointV2YawMode(0);
    public static final /* enum */ WaypointV2YawMode NOT_ROTATE = new WaypointV2YawMode(1);
    public static final /* enum */ WaypointV2YawMode CONTROL_BY_RC = new WaypointV2YawMode(2);
    public static final /* enum */ WaypointV2YawMode ROTATE = new WaypointV2YawMode(3);
    public static final /* enum */ WaypointV2YawMode POI = new WaypointV2YawMode(4);
    public static final /* enum */ WaypointV2YawMode CAMERA_FOLLOW = new WaypointV2YawMode(5);
    public static final /* enum */ WaypointV2YawMode UNKNOWN = new WaypointV2YawMode(65535);
    private int value;
    private static final WaypointV2YawMode[] allValues;
    private static final /* synthetic */ WaypointV2YawMode[] $VALUES;

    public static WaypointV2YawMode[] values() {
        return null;
    }

    public static WaypointV2YawMode valueOf(String string) {
        return null;
    }

    private WaypointV2YawMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointV2YawMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointV2YawMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointV2YawMode.$values();
        allValues = WaypointV2YawMode.values();
    }
}

