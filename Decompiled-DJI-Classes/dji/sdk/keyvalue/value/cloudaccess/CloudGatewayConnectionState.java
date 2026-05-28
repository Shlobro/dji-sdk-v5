/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudGatewayConnectionState
extends Enum<CloudGatewayConnectionState>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudGatewayConnectionState IDLE = new CloudGatewayConnectionState(0);
    public static final /* enum */ CloudGatewayConnectionState PREPARED = new CloudGatewayConnectionState(1);
    public static final /* enum */ CloudGatewayConnectionState CONNECTED = new CloudGatewayConnectionState(2);
    public static final /* enum */ CloudGatewayConnectionState DISCONNECTED = new CloudGatewayConnectionState(3);
    public static final /* enum */ CloudGatewayConnectionState UNKNOWN = new CloudGatewayConnectionState(256);
    private int value;
    private static final CloudGatewayConnectionState[] allValues;
    private static final /* synthetic */ CloudGatewayConnectionState[] $VALUES;

    public static CloudGatewayConnectionState[] values() {
        return null;
    }

    public static CloudGatewayConnectionState valueOf(String string) {
        return null;
    }

    private CloudGatewayConnectionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudGatewayConnectionState find(int n) {
        return null;
    }

    private static /* synthetic */ CloudGatewayConnectionState[] $values() {
        return null;
    }

    static {
        $VALUES = CloudGatewayConnectionState.$values();
        allValues = CloudGatewayConnectionState.values();
    }
}

