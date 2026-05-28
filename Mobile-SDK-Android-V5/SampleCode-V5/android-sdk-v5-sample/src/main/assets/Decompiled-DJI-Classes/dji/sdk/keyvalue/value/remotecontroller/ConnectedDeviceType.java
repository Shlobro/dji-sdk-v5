/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class ConnectedDeviceType
extends Enum<ConnectedDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ ConnectedDeviceType AIRCRAFT_P4P = new ConnectedDeviceType(0);
    public static final /* enum */ ConnectedDeviceType AIRCRAFT_T16 = new ConnectedDeviceType(1);
    public static final /* enum */ ConnectedDeviceType AIRCRAFT_T20 = new ConnectedDeviceType(2);
    public static final /* enum */ ConnectedDeviceType AIRCRAFT_P4R = new ConnectedDeviceType(3);
    public static final /* enum */ ConnectedDeviceType AIRCRAFT_MG1P = new ConnectedDeviceType(4);
    public static final /* enum */ ConnectedDeviceType AIRCRAFT_T10 = new ConnectedDeviceType(5);
    public static final /* enum */ ConnectedDeviceType AIRCRAFT_T30 = new ConnectedDeviceType(6);
    public static final /* enum */ ConnectedDeviceType AIRCRAFT_T20P = new ConnectedDeviceType(7);
    public static final /* enum */ ConnectedDeviceType AIRCRAFT_T40 = new ConnectedDeviceType(8);
    public static final /* enum */ ConnectedDeviceType RTK_DRTK2 = new ConnectedDeviceType(100);
    public static final /* enum */ ConnectedDeviceType RTK = new ConnectedDeviceType(65533);
    public static final /* enum */ ConnectedDeviceType AIRCRAFT = new ConnectedDeviceType(65534);
    public static final /* enum */ ConnectedDeviceType UNKNOWN = new ConnectedDeviceType(65535);
    private int value;
    private static final ConnectedDeviceType[] allValues;
    private static final /* synthetic */ ConnectedDeviceType[] $VALUES;

    public static ConnectedDeviceType[] values() {
        return null;
    }

    public static ConnectedDeviceType valueOf(String string) {
        return null;
    }

    private ConnectedDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ConnectedDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ ConnectedDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = ConnectedDeviceType.$values();
        allValues = ConnectedDeviceType.values();
    }
}

