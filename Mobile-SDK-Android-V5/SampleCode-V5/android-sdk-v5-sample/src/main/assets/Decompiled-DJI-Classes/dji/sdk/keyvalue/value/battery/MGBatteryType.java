/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class MGBatteryType
extends Enum<MGBatteryType>
implements JNIProguardKeepTag {
    public static final /* enum */ MGBatteryType T10 = new MGBatteryType(0);
    public static final /* enum */ MGBatteryType T16 = new MGBatteryType(1);
    public static final /* enum */ MGBatteryType T20 = new MGBatteryType(2);
    public static final /* enum */ MGBatteryType T30 = new MGBatteryType(3);
    public static final /* enum */ MGBatteryType UNKNOWN = new MGBatteryType(65535);
    private int value;
    private static final MGBatteryType[] allValues;
    private static final /* synthetic */ MGBatteryType[] $VALUES;

    public static MGBatteryType[] values() {
        return null;
    }

    public static MGBatteryType valueOf(String string) {
        return null;
    }

    private MGBatteryType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGBatteryType find(int n) {
        return null;
    }

    private static /* synthetic */ MGBatteryType[] $values() {
        return null;
    }

    static {
        $VALUES = MGBatteryType.$values();
        allValues = MGBatteryType.values();
    }
}

