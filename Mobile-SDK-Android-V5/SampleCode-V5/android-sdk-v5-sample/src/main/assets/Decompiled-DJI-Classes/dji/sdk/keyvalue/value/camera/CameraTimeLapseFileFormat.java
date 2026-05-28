/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraTimeLapseFileFormat
extends Enum<CameraTimeLapseFileFormat>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraTimeLapseFileFormat VIDEO = new CameraTimeLapseFileFormat(0);
    public static final /* enum */ CameraTimeLapseFileFormat JPEG = new CameraTimeLapseFileFormat(1);
    public static final /* enum */ CameraTimeLapseFileFormat JPEG_AND_VIDEO = new CameraTimeLapseFileFormat(2);
    public static final /* enum */ CameraTimeLapseFileFormat RAW_AND_VIDEO = new CameraTimeLapseFileFormat(3);
    public static final /* enum */ CameraTimeLapseFileFormat UNKNOWN = new CameraTimeLapseFileFormat(65535);
    private int value;
    private static final CameraTimeLapseFileFormat[] allValues;
    private static final /* synthetic */ CameraTimeLapseFileFormat[] $VALUES;

    public static CameraTimeLapseFileFormat[] values() {
        return null;
    }

    public static CameraTimeLapseFileFormat valueOf(String string) {
        return null;
    }

    private CameraTimeLapseFileFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraTimeLapseFileFormat find(int n) {
        return null;
    }

    private static /* synthetic */ CameraTimeLapseFileFormat[] $values() {
        return null;
    }

    static {
        $VALUES = CameraTimeLapseFileFormat.$values();
        allValues = CameraTimeLapseFileFormat.values();
    }
}

