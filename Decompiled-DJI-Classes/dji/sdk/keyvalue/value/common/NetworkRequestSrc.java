/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class NetworkRequestSrc
extends Enum<NetworkRequestSrc>
implements JNIProguardKeepTag {
    public static final /* enum */ NetworkRequestSrc FLYSAFE = new NetworkRequestSrc(0);
    public static final /* enum */ NetworkRequestSrc UPGRADE = new NetworkRequestSrc(1);
    public static final /* enum */ NetworkRequestSrc REAL_NAME = new NetworkRequestSrc(2);
    public static final /* enum */ NetworkRequestSrc AREA_CODE = new NetworkRequestSrc(3);
    public static final /* enum */ NetworkRequestSrc UTMISS = new NetworkRequestSrc(4);
    public static final /* enum */ NetworkRequestSrc USER_ACOUNT = new NetworkRequestSrc(5);
    public static final /* enum */ NetworkRequestSrc CLOUD_ACCESS = new NetworkRequestSrc(6);
    public static final /* enum */ NetworkRequestSrc CARE = new NetworkRequestSrc(7);
    public static final /* enum */ NetworkRequestSrc RTK = new NetworkRequestSrc(8);
    public static final /* enum */ NetworkRequestSrc DEVICE_CENTER = new NetworkRequestSrc(9);
    public static final /* enum */ NetworkRequestSrc PROTOTYPE_MANAGER = new NetworkRequestSrc(10);
    public static final /* enum */ NetworkRequestSrc UOM_REALNAME = new NetworkRequestSrc(11);
    public static final /* enum */ NetworkRequestSrc OID = new NetworkRequestSrc(12);
    public static final /* enum */ NetworkRequestSrc UNKNOWN = new NetworkRequestSrc(65535);
    private int value;
    private static final NetworkRequestSrc[] allValues;
    private static final /* synthetic */ NetworkRequestSrc[] $VALUES;

    public static NetworkRequestSrc[] values() {
        return null;
    }

    public static NetworkRequestSrc valueOf(String string) {
        return null;
    }

    private NetworkRequestSrc(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static NetworkRequestSrc find(int n) {
        return null;
    }

    private static /* synthetic */ NetworkRequestSrc[] $values() {
        return null;
    }

    static {
        $VALUES = NetworkRequestSrc.$values();
        allValues = NetworkRequestSrc.values();
    }
}

