/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKNetworkServiceAccountState
extends Enum<RTKNetworkServiceAccountState>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKNetworkServiceAccountState NOT_PURCHASED = new RTKNetworkServiceAccountState(0);
    public static final /* enum */ RTKNetworkServiceAccountState UNBOUND = new RTKNetworkServiceAccountState(1);
    public static final /* enum */ RTKNetworkServiceAccountState BOUND = new RTKNetworkServiceAccountState(2);
    public static final /* enum */ RTKNetworkServiceAccountState UNKNOWN = new RTKNetworkServiceAccountState(65535);
    private int value;
    private static final RTKNetworkServiceAccountState[] allValues;
    private static final /* synthetic */ RTKNetworkServiceAccountState[] $VALUES;

    public static RTKNetworkServiceAccountState[] values() {
        return null;
    }

    public static RTKNetworkServiceAccountState valueOf(String string) {
        return null;
    }

    private RTKNetworkServiceAccountState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKNetworkServiceAccountState find(int n) {
        return null;
    }

    private static /* synthetic */ RTKNetworkServiceAccountState[] $values() {
        return null;
    }

    static {
        $VALUES = RTKNetworkServiceAccountState.$values();
        allValues = RTKNetworkServiceAccountState.values();
    }
}

