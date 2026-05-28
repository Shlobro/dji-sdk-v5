/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;

public final class WaypointV3ActionState
extends Enum<WaypointV3ActionState>
implements JNIProguardKeepTag {
    public static final /* enum */ WaypointV3ActionState IDLE = new WaypointV3ActionState(0);
    public static final /* enum */ WaypointV3ActionState RUNNING = new WaypointV3ActionState(1);
    public static final /* enum */ WaypointV3ActionState INTERRUPTED = new WaypointV3ActionState(2);
    public static final /* enum */ WaypointV3ActionState RESUMEING = new WaypointV3ActionState(3);
    public static final /* enum */ WaypointV3ActionState RESUMED = new WaypointV3ActionState(4);
    public static final /* enum */ WaypointV3ActionState FINISHED = new WaypointV3ActionState(5);
    public static final /* enum */ WaypointV3ActionState UNKNOWN = new WaypointV3ActionState(256);
    private int value;
    private static final WaypointV3ActionState[] allValues;
    private static final /* synthetic */ WaypointV3ActionState[] $VALUES;

    public static WaypointV3ActionState[] values() {
        return null;
    }

    public static WaypointV3ActionState valueOf(String string) {
        return null;
    }

    private WaypointV3ActionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaypointV3ActionState find(int n) {
        return null;
    }

    private static /* synthetic */ WaypointV3ActionState[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointV3ActionState.$values();
        allValues = WaypointV3ActionState.values();
    }
}

