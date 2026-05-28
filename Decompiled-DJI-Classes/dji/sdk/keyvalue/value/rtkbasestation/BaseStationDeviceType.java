/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class BaseStationDeviceType
extends Enum<BaseStationDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ BaseStationDeviceType BS_RTK2 = new BaseStationDeviceType(0);
    public static final /* enum */ BaseStationDeviceType BS_RTK3 = new BaseStationDeviceType(1);
    public static final /* enum */ BaseStationDeviceType UNKNOWN = new BaseStationDeviceType(255);
    private int value;
    private static final BaseStationDeviceType[] allValues;
    private static final /* synthetic */ BaseStationDeviceType[] $VALUES;

    public static BaseStationDeviceType[] values() {
        return null;
    }

    public static BaseStationDeviceType valueOf(String string) {
        return null;
    }

    private BaseStationDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BaseStationDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ BaseStationDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = BaseStationDeviceType.$values();
        allValues = BaseStationDeviceType.values();
    }
}

