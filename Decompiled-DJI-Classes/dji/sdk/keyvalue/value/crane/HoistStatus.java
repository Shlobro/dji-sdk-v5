/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.crane;

import dji.jni.JNIProguardKeepTag;

public final class HoistStatus
extends Enum<HoistStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ HoistStatus CABLE_UP_DONE = new HoistStatus(0);
    public static final /* enum */ HoistStatus CABLE_TAKING_UP = new HoistStatus(1);
    public static final /* enum */ HoistStatus CABLE_PAUSE = new HoistStatus(2);
    public static final /* enum */ HoistStatus CABLE_TAKING_DOWN = new HoistStatus(3);
    public static final /* enum */ HoistStatus CABLE_DOWN_DONE = new HoistStatus(4);
    public static final /* enum */ HoistStatus CABLE_CUT = new HoistStatus(5);
    public static final /* enum */ HoistStatus UNKNOWN = new HoistStatus(65535);
    private int value;
    private static final HoistStatus[] allValues;
    private static final /* synthetic */ HoistStatus[] $VALUES;

    public static HoistStatus[] values() {
        return null;
    }

    public static HoistStatus valueOf(String string) {
        return null;
    }

    private HoistStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HoistStatus find(int n) {
        return null;
    }

    private static /* synthetic */ HoistStatus[] $values() {
        return null;
    }

    static {
        $VALUES = HoistStatus.$values();
        allValues = HoistStatus.values();
    }
}

