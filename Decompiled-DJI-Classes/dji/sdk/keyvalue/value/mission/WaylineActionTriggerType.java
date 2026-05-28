/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineActionTriggerType
extends Enum<WaylineActionTriggerType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineActionTriggerType REACH_POINT = new WaylineActionTriggerType(0);
    public static final /* enum */ WaylineActionTriggerType BETWEEN_ADJACENT_POINTS = new WaylineActionTriggerType(1);
    public static final /* enum */ WaylineActionTriggerType MULTIPLE_TIMING = new WaylineActionTriggerType(2);
    public static final /* enum */ WaylineActionTriggerType MULTIPLE_DISTANCE = new WaylineActionTriggerType(3);
    public static final /* enum */ WaylineActionTriggerType UNKNOWN = new WaylineActionTriggerType(65535);
    private int value;
    private static final WaylineActionTriggerType[] allValues;
    private static final /* synthetic */ WaylineActionTriggerType[] $VALUES;

    public static WaylineActionTriggerType[] values() {
        return null;
    }

    public static WaylineActionTriggerType valueOf(String string) {
        return null;
    }

    private WaylineActionTriggerType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineActionTriggerType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineActionTriggerType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineActionTriggerType.$values();
        allValues = WaylineActionTriggerType.values();
    }
}

