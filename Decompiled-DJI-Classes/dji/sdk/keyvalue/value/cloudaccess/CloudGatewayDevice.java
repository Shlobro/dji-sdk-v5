/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudGatewayDevice
extends Enum<CloudGatewayDevice>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudGatewayDevice REMOTE_CONTROL = new CloudGatewayDevice(0);
    public static final /* enum */ CloudGatewayDevice REMOTE_CONTROL_AND_AIRCRAFT = new CloudGatewayDevice(1);
    public static final /* enum */ CloudGatewayDevice MQTT = new CloudGatewayDevice(2);
    public static final /* enum */ CloudGatewayDevice UNKNOWN = new CloudGatewayDevice(65535);
    private int value;
    private static final CloudGatewayDevice[] allValues;
    private static final /* synthetic */ CloudGatewayDevice[] $VALUES;

    public static CloudGatewayDevice[] values() {
        return null;
    }

    public static CloudGatewayDevice valueOf(String string) {
        return null;
    }

    private CloudGatewayDevice(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudGatewayDevice find(int n) {
        return null;
    }

    private static /* synthetic */ CloudGatewayDevice[] $values() {
        return null;
    }

    static {
        $VALUES = CloudGatewayDevice.$values();
        allValues = CloudGatewayDevice.values();
    }
}

