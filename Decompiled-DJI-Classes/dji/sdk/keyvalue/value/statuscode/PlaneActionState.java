/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.statuscode;

import dji.jni.JNIProguardKeepTag;

public final class PlaneActionState
extends Enum<PlaneActionState>
implements JNIProguardKeepTag {
    public static final /* enum */ PlaneActionState STANDBY = new PlaneActionState(0);
    public static final /* enum */ PlaneActionState ENGINE_START = new PlaneActionState(1);
    public static final /* enum */ PlaneActionState IDLING = new PlaneActionState(2);
    public static final /* enum */ PlaneActionState FLY_BY_MANUAL = new PlaneActionState(3);
    public static final /* enum */ PlaneActionState AUTO_TAKE_OFF = new PlaneActionState(4);
    public static final /* enum */ PlaneActionState AIRYWAY = new PlaneActionState(5);
    public static final /* enum */ PlaneActionState PANORAMA = new PlaneActionState(6);
    public static final /* enum */ PlaneActionState SMART_TRACK = new PlaneActionState(7);
    public static final /* enum */ PlaneActionState ADS_B = new PlaneActionState(8);
    public static final /* enum */ PlaneActionState AUTO_GO_HOME = new PlaneActionState(9);
    public static final /* enum */ PlaneActionState AUTO_LANDING = new PlaneActionState(10);
    public static final /* enum */ PlaneActionState FORCE_LANDING = new PlaneActionState(11);
    public static final /* enum */ PlaneActionState CRASH_LANDING = new PlaneActionState(12);
    public static final /* enum */ PlaneActionState UPGRANDING = new PlaneActionState(13);
    public static final /* enum */ PlaneActionState DISCONNECTED = new PlaneActionState(14);
    public static final /* enum */ PlaneActionState APAS = new PlaneActionState(15);
    public static final /* enum */ PlaneActionState JOYSTICK = new PlaneActionState(16);
    public static final /* enum */ PlaneActionState COMMANDER = new PlaneActionState(17);
    public static final /* enum */ PlaneActionState QUICKTAKEOFF = new PlaneActionState(18);
    public static final /* enum */ PlaneActionState VISUAL_EXPLORATION = new PlaneActionState(19);
    public static final /* enum */ PlaneActionState POI_CIRCLE = new PlaneActionState(20);
    public static final /* enum */ PlaneActionState DEPARTURE_WAYLINE_TEST = new PlaneActionState(21);
    public static final /* enum */ PlaneActionState SDR_QUALITY_DETECT = new PlaneActionState(22);
    public static final /* enum */ PlaneActionState UNKNOWN = new PlaneActionState(65535);
    private int value;
    private static final PlaneActionState[] allValues;
    private static final /* synthetic */ PlaneActionState[] $VALUES;

    public static PlaneActionState[] values() {
        return null;
    }

    public static PlaneActionState valueOf(String string) {
        return null;
    }

    private PlaneActionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PlaneActionState find(int n) {
        return null;
    }

    private static /* synthetic */ PlaneActionState[] $values() {
        return null;
    }

    static {
        $VALUES = PlaneActionState.$values();
        allValues = PlaneActionState.values();
    }
}

