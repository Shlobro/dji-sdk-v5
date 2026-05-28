/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;

public final class UOMRealNameAppStatus
extends Enum<UOMRealNameAppStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ UOMRealNameAppStatus VAILD_AUTH = new UOMRealNameAppStatus(1);
    public static final /* enum */ UOMRealNameAppStatus NOT_AUTH = new UOMRealNameAppStatus(2);
    public static final /* enum */ UOMRealNameAppStatus CANCELLED = new UOMRealNameAppStatus(3);
    public static final /* enum */ UOMRealNameAppStatus NOT_AUTH_BLOCK_FLY = new UOMRealNameAppStatus(4);
    public static final /* enum */ UOMRealNameAppStatus CANCELLED_BLOCK_FLY = new UOMRealNameAppStatus(5);
    public static final /* enum */ UOMRealNameAppStatus UNKNOWN = new UOMRealNameAppStatus(65535);
    private int value;
    private static final UOMRealNameAppStatus[] allValues;
    private static final /* synthetic */ UOMRealNameAppStatus[] $VALUES;

    public static UOMRealNameAppStatus[] values() {
        return null;
    }

    public static UOMRealNameAppStatus valueOf(String string) {
        return null;
    }

    private UOMRealNameAppStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UOMRealNameAppStatus find(int n) {
        return null;
    }

    private static /* synthetic */ UOMRealNameAppStatus[] $values() {
        return null;
    }

    static {
        $VALUES = UOMRealNameAppStatus.$values();
        allValues = UOMRealNameAppStatus.values();
    }
}

