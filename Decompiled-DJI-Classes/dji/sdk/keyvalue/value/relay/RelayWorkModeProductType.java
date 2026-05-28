/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayWorkModeProductType
extends Enum<RelayWorkModeProductType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayWorkModeProductType NONE = new RelayWorkModeProductType(0);
    public static final /* enum */ RelayWorkModeProductType RELAY_EA230_EA230 = new RelayWorkModeProductType(1);
    public static final /* enum */ RelayWorkModeProductType RELAY_RTK_BASE = new RelayWorkModeProductType(2);
    public static final /* enum */ RelayWorkModeProductType RELAY_RTK_ROVER = new RelayWorkModeProductType(3);
    public static final /* enum */ RelayWorkModeProductType RELAY_COMPAT_RTK = new RelayWorkModeProductType(4);
    public static final /* enum */ RelayWorkModeProductType RELAY_ON_CLOUD = new RelayWorkModeProductType(5);
    public static final /* enum */ RelayWorkModeProductType RELAY_RC701_WA345 = new RelayWorkModeProductType(6);
    public static final /* enum */ RelayWorkModeProductType RELAY_RC701_TA201 = new RelayWorkModeProductType(7);
    public static final /* enum */ RelayWorkModeProductType RELAY_RC701_EA230 = new RelayWorkModeProductType(9);
    public static final /* enum */ RelayWorkModeProductType RELAY_RC701_PM440 = new RelayWorkModeProductType(10);
    public static final /* enum */ RelayWorkModeProductType VER3_UAV_NONE = new RelayWorkModeProductType(256);
    public static final /* enum */ RelayWorkModeProductType VER3_SINGLE_S2 = new RelayWorkModeProductType(257);
    public static final /* enum */ RelayWorkModeProductType VER3_DOUBLE_S2 = new RelayWorkModeProductType(258);
    public static final /* enum */ RelayWorkModeProductType VER3_DOUBLE_S2_WA345 = new RelayWorkModeProductType(259);
    public static final /* enum */ RelayWorkModeProductType VER3_DOUBLE_S2_PM440 = new RelayWorkModeProductType(260);
    public static final /* enum */ RelayWorkModeProductType UNKNOWN = new RelayWorkModeProductType(65535);
    private int value;
    private static final RelayWorkModeProductType[] allValues;
    private static final /* synthetic */ RelayWorkModeProductType[] $VALUES;

    public static RelayWorkModeProductType[] values() {
        return null;
    }

    public static RelayWorkModeProductType valueOf(String string) {
        return null;
    }

    private RelayWorkModeProductType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayWorkModeProductType find(int n) {
        return null;
    }

    private static /* synthetic */ RelayWorkModeProductType[] $values() {
        return null;
    }

    static {
        $VALUES = RelayWorkModeProductType.$values();
        allValues = RelayWorkModeProductType.values();
    }
}

