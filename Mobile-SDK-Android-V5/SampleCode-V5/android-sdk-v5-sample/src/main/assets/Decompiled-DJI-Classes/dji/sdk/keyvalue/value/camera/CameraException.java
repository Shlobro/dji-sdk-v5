/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraException
extends Enum<CameraException>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraException EXCEPTION_NONE = new CameraException(0);
    public static final /* enum */ CameraException EXCEPTION_TLP_GIMBAL_REACH_LIMIT = new CameraException(1);
    public static final /* enum */ CameraException EXCEPTION_PANO_GIMBAL_REACH_LIMIT = new CameraException(2);
    public static final /* enum */ CameraException EXCEPTION_START_RECORD_VIDEO_FAILURE = new CameraException(3);
    public static final /* enum */ CameraException EXCEPTION_STOP_RECORD_VIDEO_FAILURE = new CameraException(4);
    public static final /* enum */ CameraException EXCEPTION_STOP_SEEPD_LOW_STOP_SD_CARD = new CameraException(5);
    public static final /* enum */ CameraException UNKNOWN = new CameraException(65535);
    private int value;
    private static final CameraException[] allValues;
    private static final /* synthetic */ CameraException[] $VALUES;

    public static CameraException[] values() {
        return null;
    }

    public static CameraException valueOf(String string) {
        return null;
    }

    private CameraException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraException find(int n) {
        return null;
    }

    private static /* synthetic */ CameraException[] $values() {
        return null;
    }

    static {
        $VALUES = CameraException.$values();
        allValues = CameraException.values();
    }
}

