/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayPowerSupplyType
extends Enum<RelayPowerSupplyType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayPowerSupplyType PWR_IN_BATTERY = new RelayPowerSupplyType(0);
    public static final /* enum */ RelayPowerSupplyType PWR_IN_PD = new RelayPowerSupplyType(1);
    public static final /* enum */ RelayPowerSupplyType PWR_IN_POE = new RelayPowerSupplyType(2);
    public static final /* enum */ RelayPowerSupplyType UNKNOWN = new RelayPowerSupplyType(65535);
    private int value;
    private static final RelayPowerSupplyType[] allValues;
    private static final /* synthetic */ RelayPowerSupplyType[] $VALUES;

    public static RelayPowerSupplyType[] values() {
        return null;
    }

    public static RelayPowerSupplyType valueOf(String string) {
        return null;
    }

    private RelayPowerSupplyType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayPowerSupplyType find(int n) {
        return null;
    }

    private static /* synthetic */ RelayPowerSupplyType[] $values() {
        return null;
    }

    static {
        $VALUES = RelayPowerSupplyType.$values();
        allValues = RelayPowerSupplyType.values();
    }
}

