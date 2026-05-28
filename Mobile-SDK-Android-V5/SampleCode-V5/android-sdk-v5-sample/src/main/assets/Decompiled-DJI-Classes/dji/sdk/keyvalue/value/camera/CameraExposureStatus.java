/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraExposureStatus
extends Enum<CameraExposureStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraExposureStatus NOMAL = new CameraExposureStatus(0);
    public static final /* enum */ CameraExposureStatus UNDER_EXPOSURE = new CameraExposureStatus(1);
    public static final /* enum */ CameraExposureStatus OVER_EXPOSURE = new CameraExposureStatus(2);
    public static final /* enum */ CameraExposureStatus UNKNOWN = new CameraExposureStatus(65535);
    private int value;
    private static final CameraExposureStatus[] allValues;
    private static final /* synthetic */ CameraExposureStatus[] $VALUES;

    public static CameraExposureStatus[] values() {
        return null;
    }

    public static CameraExposureStatus valueOf(String string) {
        return null;
    }

    private CameraExposureStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraExposureStatus find(int n) {
        return null;
    }

    private static /* synthetic */ CameraExposureStatus[] $values() {
        return null;
    }

    static {
        $VALUES = CameraExposureStatus.$values();
        allValues = CameraExposureStatus.values();
    }
}

