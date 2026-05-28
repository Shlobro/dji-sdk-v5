/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraShootPhotoMode
extends Enum<CameraShootPhotoMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraShootPhotoMode NORMAL = new CameraShootPhotoMode(0);
    public static final /* enum */ CameraShootPhotoMode HDR = new CameraShootPhotoMode(1);
    public static final /* enum */ CameraShootPhotoMode BURST = new CameraShootPhotoMode(2);
    public static final /* enum */ CameraShootPhotoMode AEB = new CameraShootPhotoMode(3);
    public static final /* enum */ CameraShootPhotoMode INTERVAL = new CameraShootPhotoMode(4);
    public static final /* enum */ CameraShootPhotoMode STATIONARY_TIME_LAPSE = new CameraShootPhotoMode(5);
    public static final /* enum */ CameraShootPhotoMode MOTION_TIME_LAPSE = new CameraShootPhotoMode(6);
    public static final /* enum */ CameraShootPhotoMode HYPER_TIME_LAPSE = new CameraShootPhotoMode(7);
    public static final /* enum */ CameraShootPhotoMode PANO_APP = new CameraShootPhotoMode(8);
    public static final /* enum */ CameraShootPhotoMode RAW_BURST = new CameraShootPhotoMode(9);
    public static final /* enum */ CameraShootPhotoMode EHDR = new CameraShootPhotoMode(10);
    public static final /* enum */ CameraShootPhotoMode HYPER_LIGHT = new CameraShootPhotoMode(11);
    public static final /* enum */ CameraShootPhotoMode HYPER_LAPSE = new CameraShootPhotoMode(12);
    public static final /* enum */ CameraShootPhotoMode VISION_PANO = new CameraShootPhotoMode(13);
    public static final /* enum */ CameraShootPhotoMode VISION_BOKEH = new CameraShootPhotoMode(14);
    public static final /* enum */ CameraShootPhotoMode UNKNOWN = new CameraShootPhotoMode(65535);
    private int value;
    private static final CameraShootPhotoMode[] allValues;
    private static final /* synthetic */ CameraShootPhotoMode[] $VALUES;

    public static CameraShootPhotoMode[] values() {
        return null;
    }

    public static CameraShootPhotoMode valueOf(String string) {
        return null;
    }

    private CameraShootPhotoMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraShootPhotoMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraShootPhotoMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraShootPhotoMode.$values();
        allValues = CameraShootPhotoMode.values();
    }
}

