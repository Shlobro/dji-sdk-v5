/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraStorageLocation
extends Enum<CameraStorageLocation>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraStorageLocation SDCARD = new CameraStorageLocation(0);
    public static final /* enum */ CameraStorageLocation INTERNAL = new CameraStorageLocation(1);
    public static final /* enum */ CameraStorageLocation INTERNAL_SSD = new CameraStorageLocation(2);
    public static final /* enum */ CameraStorageLocation UNKNOWN = new CameraStorageLocation(65535);
    private int value;
    private static final CameraStorageLocation[] allValues;
    private static final /* synthetic */ CameraStorageLocation[] $VALUES;

    public static CameraStorageLocation[] values() {
        return null;
    }

    public static CameraStorageLocation valueOf(String string) {
        return null;
    }

    private CameraStorageLocation(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraStorageLocation find(int n) {
        return null;
    }

    private static /* synthetic */ CameraStorageLocation[] $values() {
        return null;
    }

    static {
        $VALUES = CameraStorageLocation.$values();
        allValues = CameraStorageLocation.values();
    }
}

