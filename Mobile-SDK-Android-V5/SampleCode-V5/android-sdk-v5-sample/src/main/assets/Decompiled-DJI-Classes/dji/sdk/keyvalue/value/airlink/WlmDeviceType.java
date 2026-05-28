/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmDeviceType
extends Enum<WlmDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmDeviceType UAV = new WlmDeviceType(0);
    public static final /* enum */ WlmDeviceType RC = new WlmDeviceType(1);
    public static final /* enum */ WlmDeviceType GLASS = new WlmDeviceType(2);
    public static final /* enum */ WlmDeviceType LIFT = new WlmDeviceType(3);
    public static final /* enum */ WlmDeviceType PHONE = new WlmDeviceType(4);
    public static final /* enum */ WlmDeviceType BEACON = new WlmDeviceType(5);
    public static final /* enum */ WlmDeviceType SIDELINK_RC = new WlmDeviceType(6);
    public static final /* enum */ WlmDeviceType DOCK = new WlmDeviceType(7);
    public static final /* enum */ WlmDeviceType MONITOR = new WlmDeviceType(8);
    public static final /* enum */ WlmDeviceType RTK = new WlmDeviceType(9);
    public static final /* enum */ WlmDeviceType INVALID = new WlmDeviceType(255);
    public static final /* enum */ WlmDeviceType UNKNOWN = new WlmDeviceType(65535);
    private int value;
    private static final WlmDeviceType[] allValues;
    private static final /* synthetic */ WlmDeviceType[] $VALUES;

    public static WlmDeviceType[] values() {
        return null;
    }

    public static WlmDeviceType valueOf(String string) {
        return null;
    }

    private WlmDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ WlmDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = WlmDeviceType.$values();
        allValues = WlmDeviceType.values();
    }
}

