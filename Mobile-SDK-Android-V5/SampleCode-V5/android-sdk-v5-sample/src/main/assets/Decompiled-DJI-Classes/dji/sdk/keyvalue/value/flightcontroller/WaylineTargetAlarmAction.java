/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class WaylineTargetAlarmAction
extends Enum<WaylineTargetAlarmAction>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineTargetAlarmAction SEQ_SHOT = new WaylineTargetAlarmAction(0);
    public static final /* enum */ WaylineTargetAlarmAction RECORD = new WaylineTargetAlarmAction(1);
    public static final /* enum */ WaylineTargetAlarmAction WAIT_CTRL = new WaylineTargetAlarmAction(2);
    public static final /* enum */ WaylineTargetAlarmAction SEARCHLIGHT = new WaylineTargetAlarmAction(3);
    public static final /* enum */ WaylineTargetAlarmAction MEGAPHONE = new WaylineTargetAlarmAction(4);
    public static final /* enum */ WaylineTargetAlarmAction NORMAL_SHOT = new WaylineTargetAlarmAction(101);
    public static final /* enum */ WaylineTargetAlarmAction UNKNOWN = new WaylineTargetAlarmAction(65535);
    private int value;
    private static final WaylineTargetAlarmAction[] allValues;
    private static final /* synthetic */ WaylineTargetAlarmAction[] $VALUES;

    public static WaylineTargetAlarmAction[] values() {
        return null;
    }

    public static WaylineTargetAlarmAction valueOf(String string) {
        return null;
    }

    private WaylineTargetAlarmAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineTargetAlarmAction find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineTargetAlarmAction[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineTargetAlarmAction.$values();
        allValues = WaylineTargetAlarmAction.values();
    }
}

