/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKDeviceType
extends Enum<RTKDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKDeviceType RC = new RTKDeviceType(0);
    public static final /* enum */ RTKDeviceType UAV = new RTKDeviceType(1);
    public static final /* enum */ RTKDeviceType DRTK = new RTKDeviceType(2);
    public static final /* enum */ RTKDeviceType UNKNOWN = new RTKDeviceType(255);
    private int value;
    private static final RTKDeviceType[] allValues;
    private static final /* synthetic */ RTKDeviceType[] $VALUES;

    public static RTKDeviceType[] values() {
        return null;
    }

    public static RTKDeviceType valueOf(String string) {
        return null;
    }

    private RTKDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKDeviceType.$values();
        allValues = RTKDeviceType.values();
    }
}

