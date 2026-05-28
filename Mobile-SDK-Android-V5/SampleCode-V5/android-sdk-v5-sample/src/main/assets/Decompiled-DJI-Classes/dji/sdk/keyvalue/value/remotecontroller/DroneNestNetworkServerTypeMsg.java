/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestNetworkServerTypeMsg
extends Enum<DroneNestNetworkServerTypeMsg>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestNetworkServerTypeMsg GATEWAY = new DroneNestNetworkServerTypeMsg(0);
    public static final /* enum */ DroneNestNetworkServerTypeMsg NTP = new DroneNestNetworkServerTypeMsg(1);
    public static final /* enum */ DroneNestNetworkServerTypeMsg CLOUD_SERVER = new DroneNestNetworkServerTypeMsg(2);
    public static final /* enum */ DroneNestNetworkServerTypeMsg OUTER_NETWORK = new DroneNestNetworkServerTypeMsg(3);
    public static final /* enum */ DroneNestNetworkServerTypeMsg DNS = new DroneNestNetworkServerTypeMsg(4);
    public static final /* enum */ DroneNestNetworkServerTypeMsg CUSTOM_NETWORK = new DroneNestNetworkServerTypeMsg(5);
    public static final /* enum */ DroneNestNetworkServerTypeMsg UNKNOWN = new DroneNestNetworkServerTypeMsg(65535);
    private int value;
    private static final DroneNestNetworkServerTypeMsg[] allValues;
    private static final /* synthetic */ DroneNestNetworkServerTypeMsg[] $VALUES;

    public static DroneNestNetworkServerTypeMsg[] values() {
        return null;
    }

    public static DroneNestNetworkServerTypeMsg valueOf(String string) {
        return null;
    }

    private DroneNestNetworkServerTypeMsg(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestNetworkServerTypeMsg find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestNetworkServerTypeMsg[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestNetworkServerTypeMsg.$values();
        allValues = DroneNestNetworkServerTypeMsg.values();
    }
}

