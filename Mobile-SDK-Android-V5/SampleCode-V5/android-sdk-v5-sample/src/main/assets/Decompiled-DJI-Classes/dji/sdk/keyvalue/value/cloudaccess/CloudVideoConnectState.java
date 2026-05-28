/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudVideoConnectState
extends Enum<CloudVideoConnectState>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudVideoConnectState DISCONNECT = new CloudVideoConnectState(0);
    public static final /* enum */ CloudVideoConnectState CONNECT = new CloudVideoConnectState(1);
    public static final /* enum */ CloudVideoConnectState UNKNOWN = new CloudVideoConnectState(65535);
    private int value;
    private static final CloudVideoConnectState[] allValues;
    private static final /* synthetic */ CloudVideoConnectState[] $VALUES;

    public static CloudVideoConnectState[] values() {
        return null;
    }

    public static CloudVideoConnectState valueOf(String string) {
        return null;
    }

    private CloudVideoConnectState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudVideoConnectState find(int n) {
        return null;
    }

    private static /* synthetic */ CloudVideoConnectState[] $values() {
        return null;
    }

    static {
        $VALUES = CloudVideoConnectState.$values();
        allValues = CloudVideoConnectState.values();
    }
}

