/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKConnectType
extends Enum<RTKConnectType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKConnectType NONE = new RTKConnectType(0);
    public static final /* enum */ RTKConnectType SDR = new RTKConnectType(1);
    public static final /* enum */ RTKConnectType LTE = new RTKConnectType(2);
    public static final /* enum */ RTKConnectType UNKNOWN = new RTKConnectType(65535);
    private int value;
    private static final RTKConnectType[] allValues;
    private static final /* synthetic */ RTKConnectType[] $VALUES;

    public static RTKConnectType[] values() {
        return null;
    }

    public static RTKConnectType valueOf(String string) {
        return null;
    }

    private RTKConnectType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKConnectType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKConnectType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKConnectType.$values();
        allValues = RTKConnectType.values();
    }
}

