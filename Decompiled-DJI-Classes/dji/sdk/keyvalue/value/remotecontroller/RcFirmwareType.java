/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcFirmwareType
extends Enum<RcFirmwareType>
implements JNIProguardKeepTag {
    public static final /* enum */ RcFirmwareType M300_RTK = new RcFirmwareType(4096);
    public static final /* enum */ RcFirmwareType M350_RTK = new RcFirmwareType(4136);
    public static final /* enum */ RcFirmwareType T40 = new RcFirmwareType(6656);
    public static final /* enum */ RcFirmwareType MAVIC_3 = new RcFirmwareType(7680);
    public static final /* enum */ RcFirmwareType DJI_AIR_2S = new RcFirmwareType(8192);
    public static final /* enum */ RcFirmwareType M30_SERIES = new RcFirmwareType(9732);
    public static final /* enum */ RcFirmwareType NOT_SUPPORTED_0 = new RcFirmwareType(11264);
    public static final /* enum */ RcFirmwareType DJI_MINI_3_PRO = new RcFirmwareType(11776);
    public static final /* enum */ RcFirmwareType NOT_SUPPORTED_1 = new RcFirmwareType(12800);
    public static final /* enum */ RcFirmwareType NOT_SUPPORTED_2 = new RcFirmwareType(16896);
    public static final /* enum */ RcFirmwareType NOT_SUPPORTED_3 = new RcFirmwareType(18432);
    public static final /* enum */ RcFirmwareType MAVIC_AIR_2_AND_DJI_MINI_2 = new RcFirmwareType(57697);
    public static final /* enum */ RcFirmwareType DJI_MINI_3 = new RcFirmwareType(57699);
    public static final /* enum */ RcFirmwareType UNKNOWN = new RcFirmwareType(65535);
    private int value;
    private static final RcFirmwareType[] allValues;
    private static final /* synthetic */ RcFirmwareType[] $VALUES;

    public static RcFirmwareType[] values() {
        return null;
    }

    public static RcFirmwareType valueOf(String string) {
        return null;
    }

    private RcFirmwareType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcFirmwareType find(int n) {
        return null;
    }

    private static /* synthetic */ RcFirmwareType[] $values() {
        return null;
    }

    static {
        $VALUES = RcFirmwareType.$values();
        allValues = RcFirmwareType.values();
    }
}

