/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraExposureMode
extends Enum<CameraExposureMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraExposureMode PROGRAM = new CameraExposureMode(1);
    public static final /* enum */ CameraExposureMode SHUTTER_PRIORITY = new CameraExposureMode(2);
    public static final /* enum */ CameraExposureMode APERTURE_PRIORITY = new CameraExposureMode(3);
    public static final /* enum */ CameraExposureMode MANUAL = new CameraExposureMode(4);
    public static final /* enum */ CameraExposureMode UNKNOWN = new CameraExposureMode(65535);
    private int value;
    private static final CameraExposureMode[] allValues;
    private static final /* synthetic */ CameraExposureMode[] $VALUES;

    public static CameraExposureMode[] values() {
        return null;
    }

    public static CameraExposureMode valueOf(String string) {
        return null;
    }

    private CameraExposureMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraExposureMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraExposureMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraExposureMode.$values();
        allValues = CameraExposureMode.values();
    }
}

