/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class MediaPhotoType
extends Enum<MediaPhotoType>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaPhotoType NORMAL = new MediaPhotoType(0);
    public static final /* enum */ MediaPhotoType HDR = new MediaPhotoType(1);
    public static final /* enum */ MediaPhotoType AEB = new MediaPhotoType(2);
    public static final /* enum */ MediaPhotoType INTERVAL = new MediaPhotoType(3);
    public static final /* enum */ MediaPhotoType BURST = new MediaPhotoType(4);
    public static final /* enum */ MediaPhotoType EHDR = new MediaPhotoType(5);
    public static final /* enum */ MediaPhotoType RAW_BURST = new MediaPhotoType(6);
    public static final /* enum */ MediaPhotoType HYPER_LIGHT = new MediaPhotoType(7);
    public static final /* enum */ MediaPhotoType SMART = new MediaPhotoType(9);
    public static final /* enum */ MediaPhotoType SUPER_RESOLUTION = new MediaPhotoType(14);
    public static final /* enum */ MediaPhotoType HIGH_RESOLUTION = new MediaPhotoType(16);
    public static final /* enum */ MediaPhotoType PANORAMA = new MediaPhotoType(17);
    public static final /* enum */ MediaPhotoType UNKNOWN = new MediaPhotoType(65535);
    private int value;
    private static final MediaPhotoType[] allValues;
    private static final /* synthetic */ MediaPhotoType[] $VALUES;

    public static MediaPhotoType[] values() {
        return null;
    }

    public static MediaPhotoType valueOf(String string) {
        return null;
    }

    private MediaPhotoType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaPhotoType find(int n) {
        return null;
    }

    private static /* synthetic */ MediaPhotoType[] $values() {
        return null;
    }

    static {
        $VALUES = MediaPhotoType.$values();
        allValues = MediaPhotoType.values();
    }
}

