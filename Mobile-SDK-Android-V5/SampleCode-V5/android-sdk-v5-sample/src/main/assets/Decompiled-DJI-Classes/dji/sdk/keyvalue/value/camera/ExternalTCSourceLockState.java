/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ExternalTCSourceLockState
extends Enum<ExternalTCSourceLockState>
implements JNIProguardKeepTag {
    public static final /* enum */ ExternalTCSourceLockState UNLOCKED = new ExternalTCSourceLockState(0);
    public static final /* enum */ ExternalTCSourceLockState LOCKING = new ExternalTCSourceLockState(1);
    public static final /* enum */ ExternalTCSourceLockState LOCKED = new ExternalTCSourceLockState(2);
    public static final /* enum */ ExternalTCSourceLockState FAILED = new ExternalTCSourceLockState(3);
    public static final /* enum */ ExternalTCSourceLockState UNKNOWN = new ExternalTCSourceLockState(65535);
    private int value;
    private static final ExternalTCSourceLockState[] allValues;
    private static final /* synthetic */ ExternalTCSourceLockState[] $VALUES;

    public static ExternalTCSourceLockState[] values() {
        return null;
    }

    public static ExternalTCSourceLockState valueOf(String string) {
        return null;
    }

    private ExternalTCSourceLockState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ExternalTCSourceLockState find(int n) {
        return null;
    }

    private static /* synthetic */ ExternalTCSourceLockState[] $values() {
        return null;
    }

    static {
        $VALUES = ExternalTCSourceLockState.$values();
        allValues = ExternalTCSourceLockState.values();
    }
}

