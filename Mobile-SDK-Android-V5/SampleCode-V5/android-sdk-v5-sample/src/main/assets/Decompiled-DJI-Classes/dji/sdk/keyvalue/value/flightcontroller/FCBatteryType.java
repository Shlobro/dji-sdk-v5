/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCBatteryType
extends Enum<FCBatteryType>
implements JNIProguardKeepTag {
    public static final /* enum */ FCBatteryType UNCERTAIN = new FCBatteryType(0);
    public static final /* enum */ FCBatteryType NON_SMART = new FCBatteryType(1);
    public static final /* enum */ FCBatteryType SMART = new FCBatteryType(2);
    public static final /* enum */ FCBatteryType UNKNOWN = new FCBatteryType(65535);
    private int value;
    private static final FCBatteryType[] allValues;
    private static final /* synthetic */ FCBatteryType[] $VALUES;

    public static FCBatteryType[] values() {
        return null;
    }

    public static FCBatteryType valueOf(String string) {
        return null;
    }

    private FCBatteryType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCBatteryType find(int n) {
        return null;
    }

    private static /* synthetic */ FCBatteryType[] $values() {
        return null;
    }

    static {
        $VALUES = FCBatteryType.$values();
        allValues = FCBatteryType.values();
    }
}

