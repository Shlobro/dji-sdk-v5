/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AccessLockerState
extends Enum<AccessLockerState>
implements JNIProguardKeepTag {
    public static final /* enum */ AccessLockerState NOT_INITIALIZED = new AccessLockerState(0);
    public static final /* enum */ AccessLockerState LOCKED = new AccessLockerState(1);
    public static final /* enum */ AccessLockerState UNLOCKED = new AccessLockerState(2);
    public static final /* enum */ AccessLockerState UNKNOWN = new AccessLockerState(65535);
    private int value;
    private static final AccessLockerState[] allValues;
    private static final /* synthetic */ AccessLockerState[] $VALUES;

    public static AccessLockerState[] values() {
        return null;
    }

    public static AccessLockerState valueOf(String string) {
        return null;
    }

    private AccessLockerState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AccessLockerState find(int n) {
        return null;
    }

    private static /* synthetic */ AccessLockerState[] $values() {
        return null;
    }

    static {
        $VALUES = AccessLockerState.$values();
        allValues = AccessLockerState.values();
    }
}

