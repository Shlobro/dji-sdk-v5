/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraPhotoQuality
extends Enum<CameraPhotoQuality>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraPhotoQuality NORMAL = new CameraPhotoQuality(0);
    public static final /* enum */ CameraPhotoQuality FINE = new CameraPhotoQuality(1);
    public static final /* enum */ CameraPhotoQuality SFINE = new CameraPhotoQuality(2);
    public static final /* enum */ CameraPhotoQuality UNKNOWN = new CameraPhotoQuality(65535);
    private int value;
    private static final CameraPhotoQuality[] allValues;
    private static final /* synthetic */ CameraPhotoQuality[] $VALUES;

    public static CameraPhotoQuality[] values() {
        return null;
    }

    public static CameraPhotoQuality valueOf(String string) {
        return null;
    }

    private CameraPhotoQuality(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraPhotoQuality find(int n) {
        return null;
    }

    private static /* synthetic */ CameraPhotoQuality[] $values() {
        return null;
    }

    static {
        $VALUES = CameraPhotoQuality.$values();
        allValues = CameraPhotoQuality.values();
    }
}

