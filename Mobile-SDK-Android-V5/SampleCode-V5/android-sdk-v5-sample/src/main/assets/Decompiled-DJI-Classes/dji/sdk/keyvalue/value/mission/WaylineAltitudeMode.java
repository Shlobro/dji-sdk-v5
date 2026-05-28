/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineAltitudeMode
extends Enum<WaylineAltitudeMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineAltitudeMode WGS84 = new WaylineAltitudeMode(0);
    public static final /* enum */ WaylineAltitudeMode RELATIVE_TO_START_POINT = new WaylineAltitudeMode(1);
    public static final /* enum */ WaylineAltitudeMode UNKNOWN = new WaylineAltitudeMode(65535);
    private int value;
    private static final WaylineAltitudeMode[] allValues;
    private static final /* synthetic */ WaylineAltitudeMode[] $VALUES;

    public static WaylineAltitudeMode[] values() {
        return null;
    }

    public static WaylineAltitudeMode valueOf(String string) {
        return null;
    }

    private WaylineAltitudeMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineAltitudeMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineAltitudeMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineAltitudeMode.$values();
        allValues = WaylineAltitudeMode.values();
    }
}

