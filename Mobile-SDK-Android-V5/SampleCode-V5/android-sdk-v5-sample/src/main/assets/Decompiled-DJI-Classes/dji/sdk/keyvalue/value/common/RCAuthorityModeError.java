/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class RCAuthorityModeError
extends Enum<RCAuthorityModeError>
implements JNIProguardKeepTag {
    public static final /* enum */ RCAuthorityModeError AUTH_SUCCESS = new RCAuthorityModeError(0);
    public static final /* enum */ RCAuthorityModeError OWNER_OFFLINE = new RCAuthorityModeError(1);
    public static final /* enum */ RCAuthorityModeError DEVICE_OFFLINE = new RCAuthorityModeError(2);
    public static final /* enum */ RCAuthorityModeError IS_OWNER = new RCAuthorityModeError(3);
    public static final /* enum */ RCAuthorityModeError DEVICE_LOCKED = new RCAuthorityModeError(4);
    public static final /* enum */ RCAuthorityModeError AUTH_OTHER = new RCAuthorityModeError(5);
    public static final /* enum */ RCAuthorityModeError UNKNOWN = new RCAuthorityModeError(255);
    private int value;
    private static final RCAuthorityModeError[] allValues;
    private static final /* synthetic */ RCAuthorityModeError[] $VALUES;

    public static RCAuthorityModeError[] values() {
        return null;
    }

    public static RCAuthorityModeError valueOf(String string) {
        return null;
    }

    private RCAuthorityModeError(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCAuthorityModeError find(int n) {
        return null;
    }

    private static /* synthetic */ RCAuthorityModeError[] $values() {
        return null;
    }

    static {
        $VALUES = RCAuthorityModeError.$values();
        allValues = RCAuthorityModeError.values();
    }
}

