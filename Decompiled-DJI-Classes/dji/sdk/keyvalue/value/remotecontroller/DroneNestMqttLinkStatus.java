/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestMqttLinkStatus
extends Enum<DroneNestMqttLinkStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestMqttLinkStatus NO_CONNECTION = new DroneNestMqttLinkStatus(0);
    public static final /* enum */ DroneNestMqttLinkStatus HAS_CONNECTION = new DroneNestMqttLinkStatus(1);
    public static final /* enum */ DroneNestMqttLinkStatus UNKNOWN = new DroneNestMqttLinkStatus(65535);
    private int value;
    private static final DroneNestMqttLinkStatus[] allValues;
    private static final /* synthetic */ DroneNestMqttLinkStatus[] $VALUES;

    public static DroneNestMqttLinkStatus[] values() {
        return null;
    }

    public static DroneNestMqttLinkStatus valueOf(String string) {
        return null;
    }

    private DroneNestMqttLinkStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestMqttLinkStatus find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestMqttLinkStatus[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestMqttLinkStatus.$values();
        allValues = DroneNestMqttLinkStatus.values();
    }
}

