/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointV2Type
extends Enum<WaypointV2Type>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointV2Type CURVATURE_CONTINUES_PASS = new WaypointV2Type(0);
    public static final /* enum */ WaypointV2Type CURVATURE_CONTINUES_STOP = new WaypointV2Type(1);
    public static final /* enum */ WaypointV2Type CURVATURE_BREAK_STOP = new WaypointV2Type(2);
    public static final /* enum */ WaypointV2Type CURVATURE_COORDINATE_TURNING = new WaypointV2Type(3);
    public static final /* enum */ WaypointV2Type STRAIGHT_IN = new WaypointV2Type(4);
    public static final /* enum */ WaypointV2Type STRAIGHT_OUT = new WaypointV2Type(5);
    public static final /* enum */ WaypointV2Type UNKNOWN = new WaypointV2Type(65535);
    private int value;
    private static final WaypointV2Type[] allValues;
    private static final /* synthetic */ WaypointV2Type[] $VALUES;

    public static WaypointV2Type[] values() {
        return null;
    }

    public static WaypointV2Type valueOf(String string) {
        return null;
    }

    private WaypointV2Type(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointV2Type find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointV2Type[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointV2Type.$values();
        allValues = WaypointV2Type.values();
    }
}

