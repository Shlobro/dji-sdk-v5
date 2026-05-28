/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraLiveViewOutputFormat
extends Enum<CameraLiveViewOutputFormat>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraLiveViewOutputFormat AUTO = new CameraLiveViewOutputFormat(0);
    public static final /* enum */ CameraLiveViewOutputFormat SD_SF = new CameraLiveViewOutputFormat(1);
    public static final /* enum */ CameraLiveViewOutputFormat HD_SF = new CameraLiveViewOutputFormat(2);
    public static final /* enum */ CameraLiveViewOutputFormat SD_HF = new CameraLiveViewOutputFormat(3);
    public static final /* enum */ CameraLiveViewOutputFormat HD_HF = new CameraLiveViewOutputFormat(4);
    public static final /* enum */ CameraLiveViewOutputFormat UNKNOWN = new CameraLiveViewOutputFormat(65535);
    private int value;
    private static final CameraLiveViewOutputFormat[] allValues;
    private static final /* synthetic */ CameraLiveViewOutputFormat[] $VALUES;

    public static CameraLiveViewOutputFormat[] values() {
        return null;
    }

    public static CameraLiveViewOutputFormat valueOf(String string) {
        return null;
    }

    private CameraLiveViewOutputFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraLiveViewOutputFormat find(int n) {
        return null;
    }

    private static /* synthetic */ CameraLiveViewOutputFormat[] $values() {
        return null;
    }

    static {
        $VALUES = CameraLiveViewOutputFormat.$values();
        allValues = CameraLiveViewOutputFormat.values();
    }
}

