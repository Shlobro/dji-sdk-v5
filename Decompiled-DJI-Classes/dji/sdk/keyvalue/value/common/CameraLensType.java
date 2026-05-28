/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class CameraLensType
extends Enum<CameraLensType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraLensType CAMERA_LENS_ZOOM = new CameraLensType(0);
    public static final /* enum */ CameraLensType CAMERA_LENS_WIDE = new CameraLensType(1);
    public static final /* enum */ CameraLensType CAMERA_LENS_THERMAL = new CameraLensType(2);
    public static final /* enum */ CameraLensType CAMERA_LENS_MS_G = new CameraLensType(3);
    public static final /* enum */ CameraLensType CAMERA_LENS_MS_R = new CameraLensType(4);
    public static final /* enum */ CameraLensType CAMERA_LENS_MS_RE = new CameraLensType(5);
    public static final /* enum */ CameraLensType CAMERA_LENS_MS_NIR = new CameraLensType(6);
    public static final /* enum */ CameraLensType CAMERA_LENS_MS_NDVI = new CameraLensType(7);
    public static final /* enum */ CameraLensType CAMERA_LENS_RGB = new CameraLensType(8);
    public static final /* enum */ CameraLensType CAMERA_LENS_PCD = new CameraLensType(9);
    public static final /* enum */ CameraLensType CAMERA_LENS_DEFAULT = new CameraLensType(65534);
    public static final /* enum */ CameraLensType UNKNOWN = new CameraLensType(65535);
    private int value;
    private static final CameraLensType[] allValues;
    private static final /* synthetic */ CameraLensType[] $VALUES;

    public static CameraLensType[] values() {
        return null;
    }

    public static CameraLensType valueOf(String string) {
        return null;
    }

    private CameraLensType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraLensType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraLensType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraLensType.$values();
        allValues = CameraLensType.values();
    }
}

