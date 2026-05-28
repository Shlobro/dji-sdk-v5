/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraRecordingStatus
extends Enum<CameraRecordingStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraRecordingStatus IDEL = new CameraRecordingStatus(0);
    public static final /* enum */ CameraRecordingStatus STARTING = new CameraRecordingStatus(1);
    public static final /* enum */ CameraRecordingStatus RECORDING = new CameraRecordingStatus(2);
    public static final /* enum */ CameraRecordingStatus STOPPING = new CameraRecordingStatus(3);
    public static final /* enum */ CameraRecordingStatus UNKNOWN = new CameraRecordingStatus(65535);
    private int value;
    private static final CameraRecordingStatus[] allValues;
    private static final /* synthetic */ CameraRecordingStatus[] $VALUES;

    public static CameraRecordingStatus[] values() {
        return null;
    }

    public static CameraRecordingStatus valueOf(String string) {
        return null;
    }

    private CameraRecordingStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraRecordingStatus find(int n) {
        return null;
    }

    private static /* synthetic */ CameraRecordingStatus[] $values() {
        return null;
    }

    static {
        $VALUES = CameraRecordingStatus.$values();
        allValues = CameraRecordingStatus.values();
    }
}

