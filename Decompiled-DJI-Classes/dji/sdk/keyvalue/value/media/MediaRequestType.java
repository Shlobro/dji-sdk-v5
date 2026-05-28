/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class MediaRequestType
extends Enum<MediaRequestType>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaRequestType ORIGIN = new MediaRequestType(0);
    public static final /* enum */ MediaRequestType THUMBNAIL = new MediaRequestType(1);
    public static final /* enum */ MediaRequestType SCREEN = new MediaRequestType(2);
    public static final /* enum */ MediaRequestType CLIP = new MediaRequestType(3);
    public static final /* enum */ MediaRequestType STREAM = new MediaRequestType(4);
    public static final /* enum */ MediaRequestType PANO = new MediaRequestType(5);
    public static final /* enum */ MediaRequestType PANOSCREENNAIL = new MediaRequestType(6);
    public static final /* enum */ MediaRequestType PANOTHUMBNAIL = new MediaRequestType(7);
    public static final /* enum */ MediaRequestType TIMELAPSESCREENAIL = new MediaRequestType(8);
    public static final /* enum */ MediaRequestType MP4FILE = new MediaRequestType(9);
    public static final /* enum */ MediaRequestType CUSTOM_DATA = new MediaRequestType(10);
    public static final /* enum */ MediaRequestType PHOTO_METADATA = new MediaRequestType(11);
    public static final /* enum */ MediaRequestType USER_CTRL_INFO = new MediaRequestType(12);
    public static final /* enum */ MediaRequestType PROXY_MOOV = new MediaRequestType(15);
    public static final /* enum */ MediaRequestType ORIGIN_MOOV = new MediaRequestType(16);
    public static final /* enum */ MediaRequestType AIS = new MediaRequestType(17);
    public static final /* enum */ MediaRequestType PROXY = new MediaRequestType(18);
    public static final /* enum */ MediaRequestType UNKNOWN = new MediaRequestType(65535);
    private int value;
    private static final MediaRequestType[] allValues;
    private static final /* synthetic */ MediaRequestType[] $VALUES;

    public static MediaRequestType[] values() {
        return null;
    }

    public static MediaRequestType valueOf(String string) {
        return null;
    }

    private MediaRequestType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaRequestType find(int n) {
        return null;
    }

    private static /* synthetic */ MediaRequestType[] $values() {
        return null;
    }

    static {
        $VALUES = MediaRequestType.$values();
        allValues = MediaRequestType.values();
    }
}

