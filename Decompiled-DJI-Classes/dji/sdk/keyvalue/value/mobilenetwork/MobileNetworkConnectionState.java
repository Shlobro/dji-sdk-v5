/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mobilenetwork;

import dji.jni.JNIProguardKeepTag;

public final class MobileNetworkConnectionState
extends Enum<MobileNetworkConnectionState>
implements JNIProguardKeepTag {
    public static final /* enum */ MobileNetworkConnectionState NONE = new MobileNetworkConnectionState(0);
    public static final /* enum */ MobileNetworkConnectionState DISCONNECT = new MobileNetworkConnectionState(1);
    public static final /* enum */ MobileNetworkConnectionState CONNECTED = new MobileNetworkConnectionState(2);
    public static final /* enum */ MobileNetworkConnectionState BEING_USED = new MobileNetworkConnectionState(3);
    public static final /* enum */ MobileNetworkConnectionState UNKNOWN = new MobileNetworkConnectionState(255);
    private int value;
    private static final MobileNetworkConnectionState[] allValues;
    private static final /* synthetic */ MobileNetworkConnectionState[] $VALUES;

    public static MobileNetworkConnectionState[] values() {
        return null;
    }

    public static MobileNetworkConnectionState valueOf(String string) {
        return null;
    }

    private MobileNetworkConnectionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MobileNetworkConnectionState find(int n) {
        return null;
    }

    private static /* synthetic */ MobileNetworkConnectionState[] $values() {
        return null;
    }

    static {
        $VALUES = MobileNetworkConnectionState.$values();
        allValues = MobileNetworkConnectionState.values();
    }
}

