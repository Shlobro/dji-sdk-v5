/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AccessLockerStorageType
extends Enum<AccessLockerStorageType>
implements JNIProguardKeepTag {
    public static final /* enum */ AccessLockerStorageType RED_3_3 = new AccessLockerStorageType(0);
    public static final /* enum */ AccessLockerStorageType SD_CARD = new AccessLockerStorageType(8);
    public static final /* enum */ AccessLockerStorageType EMMC = new AccessLockerStorageType(9);
    public static final /* enum */ AccessLockerStorageType SSD = new AccessLockerStorageType(10);
    public static final /* enum */ AccessLockerStorageType UNKNOWN = new AccessLockerStorageType(65535);
    private int value;
    private static final AccessLockerStorageType[] allValues;
    private static final /* synthetic */ AccessLockerStorageType[] $VALUES;

    public static AccessLockerStorageType[] values() {
        return null;
    }

    public static AccessLockerStorageType valueOf(String string) {
        return null;
    }

    private AccessLockerStorageType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AccessLockerStorageType find(int n) {
        return null;
    }

    private static /* synthetic */ AccessLockerStorageType[] $values() {
        return null;
    }

    static {
        $VALUES = AccessLockerStorageType.$values();
        allValues = AccessLockerStorageType.values();
    }
}

