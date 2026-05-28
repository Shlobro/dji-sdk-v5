/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraZoomInvalidReason
extends Enum<CameraZoomInvalidReason>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraZoomInvalidReason NONE = new CameraZoomInvalidReason(1);
    public static final /* enum */ CameraZoomInvalidReason CAMERA_MODE_NOT_SUPPORT = new CameraZoomInvalidReason(2);
    public static final /* enum */ CameraZoomInvalidReason CAMERA_SHOOTING = new CameraZoomInvalidReason(3);
    public static final /* enum */ CameraZoomInvalidReason LENS_NOT_SUPPORT_ON_TRACKING = new CameraZoomInvalidReason(4);
    public static final /* enum */ CameraZoomInvalidReason LENS_NOT_SUPPORT_ON_MOT = new CameraZoomInvalidReason(5);
    public static final /* enum */ CameraZoomInvalidReason UNKNOWN = new CameraZoomInvalidReason(65535);
    private int value;
    private static final CameraZoomInvalidReason[] allValues;
    private static final /* synthetic */ CameraZoomInvalidReason[] $VALUES;

    public static CameraZoomInvalidReason[] values() {
        return null;
    }

    public static CameraZoomInvalidReason valueOf(String string) {
        return null;
    }

    private CameraZoomInvalidReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraZoomInvalidReason find(int n) {
        return null;
    }

    private static /* synthetic */ CameraZoomInvalidReason[] $values() {
        return null;
    }

    static {
        $VALUES = CameraZoomInvalidReason.$values();
        allValues = CameraZoomInvalidReason.values();
    }
}

