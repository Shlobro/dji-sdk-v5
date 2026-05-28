/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraWorkMode
extends Enum<CameraWorkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraWorkMode SHOOT_PHOTO = new CameraWorkMode(0);
    public static final /* enum */ CameraWorkMode RECORD_VIDEO = new CameraWorkMode(1);
    public static final /* enum */ CameraWorkMode PLAYBACK = new CameraWorkMode(2);
    public static final /* enum */ CameraWorkMode MEDIA_DOWNLOAD = new CameraWorkMode(3);
    public static final /* enum */ CameraWorkMode TURNING = new CameraWorkMode(4);
    public static final /* enum */ CameraWorkMode POWER_SAVE = new CameraWorkMode(5);
    public static final /* enum */ CameraWorkMode DOWNLOAD = new CameraWorkMode(6);
    public static final /* enum */ CameraWorkMode TRANSCODE = new CameraWorkMode(7);
    public static final /* enum */ CameraWorkMode BROADCAST = new CameraWorkMode(8);
    public static final /* enum */ CameraWorkMode UNKNOWN = new CameraWorkMode(65535);
    private int value;
    private static final CameraWorkMode[] allValues;
    private static final /* synthetic */ CameraWorkMode[] $VALUES;

    public static CameraWorkMode[] values() {
        return null;
    }

    public static CameraWorkMode valueOf(String string) {
        return null;
    }

    private CameraWorkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraWorkMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraWorkMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraWorkMode.$values();
        allValues = CameraWorkMode.values();
    }
}

