/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AccessLockerOperationType
extends Enum<AccessLockerOperationType>
implements JNIProguardKeepTag {
    public static final /* enum */ AccessLockerOperationType SETUP = new AccessLockerOperationType(0);
    public static final /* enum */ AccessLockerOperationType VERIFY = new AccessLockerOperationType(1);
    public static final /* enum */ AccessLockerOperationType MODIFY = new AccessLockerOperationType(2);
    public static final /* enum */ AccessLockerOperationType CANCEL = new AccessLockerOperationType(3);
    public static final /* enum */ AccessLockerOperationType RESET = new AccessLockerOperationType(4);
    public static final /* enum */ AccessLockerOperationType UNKNOWN = new AccessLockerOperationType(65535);
    private int value;
    private static final AccessLockerOperationType[] allValues;
    private static final /* synthetic */ AccessLockerOperationType[] $VALUES;

    public static AccessLockerOperationType[] values() {
        return null;
    }

    public static AccessLockerOperationType valueOf(String string) {
        return null;
    }

    private AccessLockerOperationType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AccessLockerOperationType find(int n) {
        return null;
    }

    private static /* synthetic */ AccessLockerOperationType[] $values() {
        return null;
    }

    static {
        $VALUES = AccessLockerOperationType.$values();
        allValues = AccessLockerOperationType.values();
    }
}

