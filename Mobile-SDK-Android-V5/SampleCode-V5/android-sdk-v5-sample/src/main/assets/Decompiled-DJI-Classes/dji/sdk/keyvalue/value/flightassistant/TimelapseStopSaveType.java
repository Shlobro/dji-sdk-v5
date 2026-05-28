/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class TimelapseStopSaveType
extends Enum<TimelapseStopSaveType>
implements JNIProguardKeepTag {
    public static final /* enum */ TimelapseStopSaveType NONE = new TimelapseStopSaveType(0);
    public static final /* enum */ TimelapseStopSaveType VIDEO = new TimelapseStopSaveType(1);
    public static final /* enum */ TimelapseStopSaveType UNKNOWN = new TimelapseStopSaveType(255);
    private int value;
    private static final TimelapseStopSaveType[] allValues;
    private static final /* synthetic */ TimelapseStopSaveType[] $VALUES;

    public static TimelapseStopSaveType[] values() {
        return null;
    }

    public static TimelapseStopSaveType valueOf(String string) {
        return null;
    }

    private TimelapseStopSaveType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimelapseStopSaveType find(int n) {
        return null;
    }

    private static /* synthetic */ TimelapseStopSaveType[] $values() {
        return null;
    }

    static {
        $VALUES = TimelapseStopSaveType.$values();
        allValues = TimelapseStopSaveType.values();
    }
}

