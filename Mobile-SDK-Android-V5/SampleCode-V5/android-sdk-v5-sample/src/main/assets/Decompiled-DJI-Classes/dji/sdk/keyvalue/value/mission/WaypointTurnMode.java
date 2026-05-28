/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaypointTurnMode
extends Enum<WaypointTurnMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointTurnMode CLOCKWISE = new WaypointTurnMode(0);
    public static final /* enum */ WaypointTurnMode COUNTER_CLOCKWISE = new WaypointTurnMode(1);
    public static final /* enum */ WaypointTurnMode UNKNOWN = new WaypointTurnMode(65535);
    private int value;
    private static final WaypointTurnMode[] allValues;
    private static final /* synthetic */ WaypointTurnMode[] $VALUES;

    public static WaypointTurnMode[] values() {
        return null;
    }

    public static WaypointTurnMode valueOf(String string) {
        return null;
    }

    private WaypointTurnMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointTurnMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointTurnMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointTurnMode.$values();
        allValues = WaypointTurnMode.values();
    }
}

