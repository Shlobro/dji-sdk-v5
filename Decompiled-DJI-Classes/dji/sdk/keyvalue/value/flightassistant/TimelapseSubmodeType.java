/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class TimelapseSubmodeType
extends Enum<TimelapseSubmodeType>
implements JNIProguardKeepTag {
    public static final /* enum */ TimelapseSubmodeType NONE = new TimelapseSubmodeType(0);
    public static final /* enum */ TimelapseSubmodeType FREE = new TimelapseSubmodeType(1);
    public static final /* enum */ TimelapseSubmodeType TRACE = new TimelapseSubmodeType(2);
    public static final /* enum */ TimelapseSubmodeType CIRCLE = new TimelapseSubmodeType(3);
    public static final /* enum */ TimelapseSubmodeType ORIENTATION = new TimelapseSubmodeType(4);
    public static final /* enum */ TimelapseSubmodeType UNKNOWN = new TimelapseSubmodeType(255);
    private int value;
    private static final TimelapseSubmodeType[] allValues;
    private static final /* synthetic */ TimelapseSubmodeType[] $VALUES;

    public static TimelapseSubmodeType[] values() {
        return null;
    }

    public static TimelapseSubmodeType valueOf(String string) {
        return null;
    }

    private TimelapseSubmodeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimelapseSubmodeType find(int n) {
        return null;
    }

    private static /* synthetic */ TimelapseSubmodeType[] $values() {
        return null;
    }

    static {
        $VALUES = TimelapseSubmodeType.$values();
        allValues = TimelapseSubmodeType.values();
    }
}

