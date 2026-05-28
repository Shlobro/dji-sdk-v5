/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class NetworkConnectType
extends Enum<NetworkConnectType>
implements JNIProguardKeepTag {
    public static final /* enum */ NetworkConnectType LTE = new NetworkConnectType(1);
    public static final /* enum */ NetworkConnectType WIRED = new NetworkConnectType(2);
    public static final /* enum */ NetworkConnectType WIFI = new NetworkConnectType(3);
    public static final /* enum */ NetworkConnectType UNKNOWN = new NetworkConnectType(65535);
    private int value;
    private static final NetworkConnectType[] allValues;
    private static final /* synthetic */ NetworkConnectType[] $VALUES;

    public static NetworkConnectType[] values() {
        return null;
    }

    public static NetworkConnectType valueOf(String string) {
        return null;
    }

    private NetworkConnectType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static NetworkConnectType find(int n) {
        return null;
    }

    private static /* synthetic */ NetworkConnectType[] $values() {
        return null;
    }

    static {
        $VALUES = NetworkConnectType.$values();
        allValues = NetworkConnectType.values();
    }
}

