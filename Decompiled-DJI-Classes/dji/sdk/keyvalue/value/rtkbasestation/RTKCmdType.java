/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKCmdType
extends Enum<RTKCmdType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKCmdType NETWORK_RTK_DEVICE_BINDING = new RTKCmdType(1);
    public static final /* enum */ RTKCmdType NETWORK_RTK_ACTIVATE = new RTKCmdType(2);
    public static final /* enum */ RTKCmdType NETWORK_RTK_REQUEST_DSK_DSS = new RTKCmdType(3);
    public static final /* enum */ RTKCmdType NETWORK_RTK_BPLAN = new RTKCmdType(4);
    public static final /* enum */ RTKCmdType NETWORK_RTK_RESET_DDS = new RTKCmdType(5);
    public static final /* enum */ RTKCmdType NETWORK_RTK_RENEW = new RTKCmdType(6);
    public static final /* enum */ RTKCmdType DPS_DEVICE_BINDING = new RTKCmdType(7);
    public static final /* enum */ RTKCmdType DPS_ACTIVATE = new RTKCmdType(8);
    public static final /* enum */ RTKCmdType DPS_REQUEST_DSK_DSS = new RTKCmdType(9);
    public static final /* enum */ RTKCmdType DPS_RENEW = new RTKCmdType(10);
    public static final /* enum */ RTKCmdType UNKNOWN = new RTKCmdType(65535);
    private int value;
    private static final RTKCmdType[] allValues;
    private static final /* synthetic */ RTKCmdType[] $VALUES;

    public static RTKCmdType[] values() {
        return null;
    }

    public static RTKCmdType valueOf(String string) {
        return null;
    }

    private RTKCmdType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKCmdType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKCmdType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKCmdType.$values();
        allValues = RTKCmdType.values();
    }
}

