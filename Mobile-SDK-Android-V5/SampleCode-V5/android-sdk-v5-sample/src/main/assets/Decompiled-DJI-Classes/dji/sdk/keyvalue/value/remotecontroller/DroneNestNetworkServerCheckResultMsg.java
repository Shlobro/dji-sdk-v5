/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestNetworkServerCheckResultMsg
extends Enum<DroneNestNetworkServerCheckResultMsg>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestNetworkServerCheckResultMsg SUCCESSED = new DroneNestNetworkServerCheckResultMsg(0);
    public static final /* enum */ DroneNestNetworkServerCheckResultMsg FAILED = new DroneNestNetworkServerCheckResultMsg(1);
    public static final /* enum */ DroneNestNetworkServerCheckResultMsg CHECKING = new DroneNestNetworkServerCheckResultMsg(2);
    public static final /* enum */ DroneNestNetworkServerCheckResultMsg CONNECT_GATEWAY_FAILED = new DroneNestNetworkServerCheckResultMsg(3);
    public static final /* enum */ DroneNestNetworkServerCheckResultMsg CONNECT_NTP_FAILED = new DroneNestNetworkServerCheckResultMsg(4);
    public static final /* enum */ DroneNestNetworkServerCheckResultMsg DNS_PARSE_FAILED = new DroneNestNetworkServerCheckResultMsg(5);
    public static final /* enum */ DroneNestNetworkServerCheckResultMsg UNKNOWN = new DroneNestNetworkServerCheckResultMsg(65535);
    private int value;
    private static final DroneNestNetworkServerCheckResultMsg[] allValues;
    private static final /* synthetic */ DroneNestNetworkServerCheckResultMsg[] $VALUES;

    public static DroneNestNetworkServerCheckResultMsg[] values() {
        return null;
    }

    public static DroneNestNetworkServerCheckResultMsg valueOf(String string) {
        return null;
    }

    private DroneNestNetworkServerCheckResultMsg(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestNetworkServerCheckResultMsg find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestNetworkServerCheckResultMsg[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestNetworkServerCheckResultMsg.$values();
        allValues = DroneNestNetworkServerCheckResultMsg.values();
    }
}

