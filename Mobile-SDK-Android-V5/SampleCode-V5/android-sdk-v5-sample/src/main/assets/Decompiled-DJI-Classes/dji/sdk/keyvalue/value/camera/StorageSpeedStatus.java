/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class StorageSpeedStatus
extends Enum<StorageSpeedStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ StorageSpeedStatus NORMAL = new StorageSpeedStatus(0);
    public static final /* enum */ StorageSpeedStatus SLOW_CARD = new StorageSpeedStatus(1);
    public static final /* enum */ StorageSpeedStatus RAPID_SLOW = new StorageSpeedStatus(2);
    public static final /* enum */ StorageSpeedStatus STEADY_SLOW = new StorageSpeedStatus(3);
    public static final /* enum */ StorageSpeedStatus UNKNOWN = new StorageSpeedStatus(255);
    private int value;
    private static final StorageSpeedStatus[] allValues;
    private static final /* synthetic */ StorageSpeedStatus[] $VALUES;

    public static StorageSpeedStatus[] values() {
        return null;
    }

    public static StorageSpeedStatus valueOf(String string) {
        return null;
    }

    private StorageSpeedStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static StorageSpeedStatus find(int n) {
        return null;
    }

    private static /* synthetic */ StorageSpeedStatus[] $values() {
        return null;
    }

    static {
        $VALUES = StorageSpeedStatus.$values();
        allValues = StorageSpeedStatus.values();
    }
}

