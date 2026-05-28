/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ChinaOidNetworkStatus
extends Enum<ChinaOidNetworkStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ ChinaOidNetworkStatus NONE = new ChinaOidNetworkStatus(0);
    public static final /* enum */ ChinaOidNetworkStatus NETWORK_CONNECT = new ChinaOidNetworkStatus(1);
    public static final /* enum */ ChinaOidNetworkStatus NETWORK_DISCONNECT = new ChinaOidNetworkStatus(2);
    public static final /* enum */ ChinaOidNetworkStatus UNKNOWN = new ChinaOidNetworkStatus(65535);
    private int value;
    private static final ChinaOidNetworkStatus[] allValues;
    private static final /* synthetic */ ChinaOidNetworkStatus[] $VALUES;

    public static ChinaOidNetworkStatus[] values() {
        return null;
    }

    public static ChinaOidNetworkStatus valueOf(String string) {
        return null;
    }

    private ChinaOidNetworkStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ChinaOidNetworkStatus find(int n) {
        return null;
    }

    private static /* synthetic */ ChinaOidNetworkStatus[] $values() {
        return null;
    }

    static {
        $VALUES = ChinaOidNetworkStatus.$values();
        allValues = ChinaOidNetworkStatus.values();
    }
}

