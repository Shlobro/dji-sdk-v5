/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineFinishedAction
extends Enum<WaylineFinishedAction>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineFinishedAction NO_ACTION = new WaylineFinishedAction(0);
    public static final /* enum */ WaylineFinishedAction GO_HOME = new WaylineFinishedAction(1);
    public static final /* enum */ WaylineFinishedAction AUTO_LAND = new WaylineFinishedAction(2);
    public static final /* enum */ WaylineFinishedAction GOTO_FIRST_WAYPOINT = new WaylineFinishedAction(3);
    public static final /* enum */ WaylineFinishedAction UNKNOWN = new WaylineFinishedAction(65535);
    private int value;
    private static final WaylineFinishedAction[] allValues;
    private static final /* synthetic */ WaylineFinishedAction[] $VALUES;

    public static WaylineFinishedAction[] values() {
        return null;
    }

    public static WaylineFinishedAction valueOf(String string) {
        return null;
    }

    private WaylineFinishedAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineFinishedAction find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineFinishedAction[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineFinishedAction.$values();
        allValues = WaylineFinishedAction.values();
    }
}

