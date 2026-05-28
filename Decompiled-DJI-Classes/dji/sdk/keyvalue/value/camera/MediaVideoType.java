/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class MediaVideoType
extends Enum<MediaVideoType>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaVideoType NORMAL = new MediaVideoType(0);
    public static final /* enum */ MediaVideoType SLOW_MOTION = new MediaVideoType(1);
    public static final /* enum */ MediaVideoType HYPER_LAPSE = new MediaVideoType(2);
    public static final /* enum */ MediaVideoType TIME_LAPSE = new MediaVideoType(3);
    public static final /* enum */ MediaVideoType HDR = new MediaVideoType(4);
    public static final /* enum */ MediaVideoType LOOP = new MediaVideoType(5);
    public static final /* enum */ MediaVideoType QUICK_MOVIE_SURROUND = new MediaVideoType(6);
    public static final /* enum */ MediaVideoType QUICK_MOVIE_OBLIQUE = new MediaVideoType(7);
    public static final /* enum */ MediaVideoType QUICK_MOVIE_SCREW = new MediaVideoType(8);
    public static final /* enum */ MediaVideoType QUICK_MOVIE_ROCKET = new MediaVideoType(9);
    public static final /* enum */ MediaVideoType QUICK_MOVIE_THROW = new MediaVideoType(10);
    public static final /* enum */ MediaVideoType QUICK_MOVIE_COMET = new MediaVideoType(11);
    public static final /* enum */ MediaVideoType QUICK_MOVIE_CROSSINGANDBACK = new MediaVideoType(12);
    public static final /* enum */ MediaVideoType QUICK_MOVIE_ASTEROID = new MediaVideoType(13);
    public static final /* enum */ MediaVideoType QUICK_MOVIE_ZOLLY = new MediaVideoType(14);
    public static final /* enum */ MediaVideoType QUICK_MOVIE_DOLLYZOOM = new MediaVideoType(15);
    public static final /* enum */ MediaVideoType MACHINE_NORMAL_STORY = new MediaVideoType(16);
    public static final /* enum */ MediaVideoType SHORT_VIDEO_MODE = new MediaVideoType(17);
    public static final /* enum */ MediaVideoType MASTERSHOT_NORMAL = new MediaVideoType(101);
    public static final /* enum */ MediaVideoType MASTERSHOT_BIGOBJ = new MediaVideoType(102);
    public static final /* enum */ MediaVideoType MASTERSHOT_PANO = new MediaVideoType(103);
    public static final /* enum */ MediaVideoType MASTERSHOT_PERSON = new MediaVideoType(104);
    public static final /* enum */ MediaVideoType UNKNOWN = new MediaVideoType(65535);
    private int value;
    private static final MediaVideoType[] allValues;
    private static final /* synthetic */ MediaVideoType[] $VALUES;

    public static MediaVideoType[] values() {
        return null;
    }

    public static MediaVideoType valueOf(String string) {
        return null;
    }

    private MediaVideoType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaVideoType find(int n) {
        return null;
    }

    private static /* synthetic */ MediaVideoType[] $values() {
        return null;
    }

    static {
        $VALUES = MediaVideoType.$values();
        allValues = MediaVideoType.values();
    }
}

