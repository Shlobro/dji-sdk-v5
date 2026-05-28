/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCPowerSupplySystemType
extends Enum<FCPowerSupplySystemType>
implements JNIProguardKeepTag {
    public static final /* enum */ FCPowerSupplySystemType NORMAL = new FCPowerSupplySystemType(0);
    public static final /* enum */ FCPowerSupplySystemType MOORING = new FCPowerSupplySystemType(1);
    public static final /* enum */ FCPowerSupplySystemType DOCK = new FCPowerSupplySystemType(2);
    public static final /* enum */ FCPowerSupplySystemType UNKNOWN = new FCPowerSupplySystemType(65535);
    private int value;
    private static final FCPowerSupplySystemType[] allValues;
    private static final /* synthetic */ FCPowerSupplySystemType[] $VALUES;

    public static FCPowerSupplySystemType[] values() {
        return null;
    }

    public static FCPowerSupplySystemType valueOf(String string) {
        return null;
    }

    private FCPowerSupplySystemType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCPowerSupplySystemType find(int n) {
        return null;
    }

    private static /* synthetic */ FCPowerSupplySystemType[] $values() {
        return null;
    }

    static {
        $VALUES = FCPowerSupplySystemType.$values();
        allValues = FCPowerSupplySystemType.values();
    }
}

