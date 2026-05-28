/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class TimelapseStopType
extends Enum<TimelapseStopType>
implements JNIProguardKeepTag {
    public static final /* enum */ TimelapseStopType NONE = new TimelapseStopType(0);
    public static final /* enum */ TimelapseStopType STOP = new TimelapseStopType(1);
    public static final /* enum */ TimelapseStopType PAUSE = new TimelapseStopType(2);
    public static final /* enum */ TimelapseStopType RESUME = new TimelapseStopType(3);
    public static final /* enum */ TimelapseStopType CLEAR_MISSION = new TimelapseStopType(4);
    public static final /* enum */ TimelapseStopType UNKNOWN = new TimelapseStopType(255);
    private int value;
    private static final TimelapseStopType[] allValues;
    private static final /* synthetic */ TimelapseStopType[] $VALUES;

    public static TimelapseStopType[] values() {
        return null;
    }

    public static TimelapseStopType valueOf(String string) {
        return null;
    }

    private TimelapseStopType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimelapseStopType find(int n) {
        return null;
    }

    private static /* synthetic */ TimelapseStopType[] $values() {
        return null;
    }

    static {
        $VALUES = TimelapseStopType.$values();
        allValues = TimelapseStopType.values();
    }
}

