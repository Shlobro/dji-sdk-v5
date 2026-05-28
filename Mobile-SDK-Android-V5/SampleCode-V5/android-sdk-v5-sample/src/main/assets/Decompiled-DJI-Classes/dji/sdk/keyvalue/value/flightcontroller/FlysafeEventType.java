/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlysafeEventType
extends Enum<FlysafeEventType>
implements JNIProguardKeepTag {
    public static final /* enum */ FlysafeEventType SHOW_WARNING = new FlysafeEventType(0);
    public static final /* enum */ FlysafeEventType SHOW_TIPS = new FlysafeEventType(1);
    public static final /* enum */ FlysafeEventType SHOW_CDL_WARNING = new FlysafeEventType(2);
    public static final /* enum */ FlysafeEventType SHOW_RTH_TIPS = new FlysafeEventType(3);
    public static final /* enum */ FlysafeEventType SHOW_AREAS = new FlysafeEventType(4);
    public static final /* enum */ FlysafeEventType SHOW_SPECIAL_UNLOCK_AREA = new FlysafeEventType(5);
    public static final /* enum */ FlysafeEventType UPDATE_LICENSE_UNLOCK_VERSION = new FlysafeEventType(6);
    public static final /* enum */ FlysafeEventType CHINA_AIRPORT_WARNING_AREA = new FlysafeEventType(7);
    public static final /* enum */ FlysafeEventType SUPERVISOR_RECORD = new FlysafeEventType(8);
    public static final /* enum */ FlysafeEventType UNKNOWN = new FlysafeEventType(65535);
    private int value;
    private static final FlysafeEventType[] allValues;
    private static final /* synthetic */ FlysafeEventType[] $VALUES;

    public static FlysafeEventType[] values() {
        return null;
    }

    public static FlysafeEventType valueOf(String string) {
        return null;
    }

    private FlysafeEventType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlysafeEventType find(int n) {
        return null;
    }

    private static /* synthetic */ FlysafeEventType[] $values() {
        return null;
    }

    static {
        $VALUES = FlysafeEventType.$values();
        allValues = FlysafeEventType.values();
    }
}

