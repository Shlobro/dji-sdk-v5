/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKNetworkRequestType
extends Enum<RTKNetworkRequestType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKNetworkRequestType DEVICE_BINDING = new RTKNetworkRequestType(1);
    public static final /* enum */ RTKNetworkRequestType ACTIVATE_ACCOUNT = new RTKNetworkRequestType(2);
    public static final /* enum */ RTKNetworkRequestType REQUEST_TO_USE = new RTKNetworkRequestType(3);
    public static final /* enum */ RTKNetworkRequestType ACTIVATE_PLAN_B = new RTKNetworkRequestType(4);
    public static final /* enum */ RTKNetworkRequestType RESET_DSS = new RTKNetworkRequestType(5);
    public static final /* enum */ RTKNetworkRequestType RENEWAL_ORDER = new RTKNetworkRequestType(6);
    public static final /* enum */ RTKNetworkRequestType DPS_DEVICE_BINDING = new RTKNetworkRequestType(17);
    public static final /* enum */ RTKNetworkRequestType DPS_ACTIVATE_ACCOUNT = new RTKNetworkRequestType(18);
    public static final /* enum */ RTKNetworkRequestType DPS_REQUEST_TO_USE = new RTKNetworkRequestType(19);
    public static final /* enum */ RTKNetworkRequestType DPS_RENEWAL_ORDER = new RTKNetworkRequestType(20);
    public static final /* enum */ RTKNetworkRequestType UNKNOWN = new RTKNetworkRequestType(65535);
    private int value;
    private static final RTKNetworkRequestType[] allValues;
    private static final /* synthetic */ RTKNetworkRequestType[] $VALUES;

    public static RTKNetworkRequestType[] values() {
        return null;
    }

    public static RTKNetworkRequestType valueOf(String string) {
        return null;
    }

    private RTKNetworkRequestType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKNetworkRequestType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKNetworkRequestType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKNetworkRequestType.$values();
        allValues = RTKNetworkRequestType.values();
    }
}

