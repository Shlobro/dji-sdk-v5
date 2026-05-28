/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;

public final class WaypointV3MissionState
extends Enum<WaypointV3MissionState>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointV3MissionState DISCONNECTED = new WaypointV3MissionState(0);
    public static final /* enum */ WaypointV3MissionState NOT_SUPPORED = new WaypointV3MissionState(1);
    public static final /* enum */ WaypointV3MissionState READY = new WaypointV3MissionState(2);
    public static final /* enum */ WaypointV3MissionState UPLOADING = new WaypointV3MissionState(3);
    public static final /* enum */ WaypointV3MissionState EXECUTING_PRE_PRARING = new WaypointV3MissionState(4);
    public static final /* enum */ WaypointV3MissionState ENTER_WAYLINE = new WaypointV3MissionState(5);
    public static final /* enum */ WaypointV3MissionState EXECUTING = new WaypointV3MissionState(6);
    public static final /* enum */ WaypointV3MissionState INTERRUPTED = new WaypointV3MissionState(7);
    public static final /* enum */ WaypointV3MissionState RECOVERING = new WaypointV3MissionState(8);
    public static final /* enum */ WaypointV3MissionState FINISHED = new WaypointV3MissionState(9);
    public static final /* enum */ WaypointV3MissionState RETURN_TO_START_POINT = new WaypointV3MissionState(10);
    public static final /* enum */ WaypointV3MissionState PRECISE_FILE_UPLOADING = new WaypointV3MissionState(11);
    public static final /* enum */ WaypointV3MissionState CANCEL_PRECISE_FILE_UPLOADING = new WaypointV3MissionState(12);
    public static final /* enum */ WaypointV3MissionState UNKNOWN = new WaypointV3MissionState(256);
    private int value;
    private static final WaypointV3MissionState[] allValues;
    private static final /* synthetic */ WaypointV3MissionState[] $VALUES;

    public static WaypointV3MissionState[] values() {
        return null;
    }

    public static WaypointV3MissionState valueOf(String string) {
        return null;
    }

    private WaypointV3MissionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointV3MissionState find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointV3MissionState[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointV3MissionState.$values();
        allValues = WaypointV3MissionState.values();
    }
}

