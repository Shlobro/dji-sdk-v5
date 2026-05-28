/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class LTEDeviceType
extends Enum<LTEDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_INVALID = new LTEDeviceType(0);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_MF825C = new LTEDeviceType(1);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_NOTION = new LTEDeviceType(2);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_HUAWEI = new LTEDeviceType(3);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_SIMCOM = new LTEDeviceType(4);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_WEWINS = new LTEDeviceType(5);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_DJI = new LTEDeviceType(6);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_DJI_RIL = new LTEDeviceType(7);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_FIBOCOM = new LTEDeviceType(8);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_VIRTUAL = new LTEDeviceType(9);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_DJI_MINI = new LTEDeviceType(10);
    public static final /* enum */ LTEDeviceType LTE_DEV_TYPE_VIRTUAL_ETH = new LTEDeviceType(11);
    public static final /* enum */ LTEDeviceType UNKNOWN = new LTEDeviceType(65535);
    private int value;
    private static final LTEDeviceType[] allValues;
    private static final /* synthetic */ LTEDeviceType[] $VALUES;

    public static LTEDeviceType[] values() {
        return null;
    }

    public static LTEDeviceType valueOf(String string) {
        return null;
    }

    private LTEDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LTEDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ LTEDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = LTEDeviceType.$values();
        allValues = LTEDeviceType.values();
    }
}

