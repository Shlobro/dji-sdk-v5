/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class RCAuthorityLockError
extends Enum<RCAuthorityLockError>
implements JNIProguardKeepTag {
    public static final /* enum */ RCAuthorityLockError LOCK_SUCCESS = new RCAuthorityLockError(0);
    public static final /* enum */ RCAuthorityLockError OWNER_NOT_ONLINE = new RCAuthorityLockError(1);
    public static final /* enum */ RCAuthorityLockError DEVICE_ALREADY_LOCK = new RCAuthorityLockError(2);
    public static final /* enum */ RCAuthorityLockError OWNER_NO_RIGHT = new RCAuthorityLockError(3);
    public static final /* enum */ RCAuthorityLockError UNKNOWN = new RCAuthorityLockError(255);
    private int value;
    private static final RCAuthorityLockError[] allValues;
    private static final /* synthetic */ RCAuthorityLockError[] $VALUES;

    public static RCAuthorityLockError[] values() {
        return null;
    }

    public static RCAuthorityLockError valueOf(String string) {
        return null;
    }

    private RCAuthorityLockError(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCAuthorityLockError find(int n) {
        return null;
    }

    private static /* synthetic */ RCAuthorityLockError[] $values() {
        return null;
    }

    static {
        $VALUES = RCAuthorityLockError.$values();
        allValues = RCAuthorityLockError.values();
    }
}

