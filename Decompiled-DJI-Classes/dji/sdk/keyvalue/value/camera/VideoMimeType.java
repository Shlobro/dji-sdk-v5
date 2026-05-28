/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoMimeType
extends Enum<VideoMimeType>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoMimeType H264 = new VideoMimeType(0);
    public static final /* enum */ VideoMimeType H265 = new VideoMimeType(1);
    public static final /* enum */ VideoMimeType ProRes = new VideoMimeType(2);
    public static final /* enum */ VideoMimeType ProResRaw = new VideoMimeType(3);
    public static final /* enum */ VideoMimeType JPEG = new VideoMimeType(4);
    public static final /* enum */ VideoMimeType JPEG_2000 = new VideoMimeType(5);
    public static final /* enum */ VideoMimeType JPEG_LOSSLESS = new VideoMimeType(6);
    public static final /* enum */ VideoMimeType UNKNOWN = new VideoMimeType(65535);
    private int value;
    private static final VideoMimeType[] allValues;
    private static final /* synthetic */ VideoMimeType[] $VALUES;

    public static VideoMimeType[] values() {
        return null;
    }

    public static VideoMimeType valueOf(String string) {
        return null;
    }

    private VideoMimeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoMimeType find(int n) {
        return null;
    }

    private static /* synthetic */ VideoMimeType[] $values() {
        return null;
    }

    static {
        $VALUES = VideoMimeType.$values();
        allValues = VideoMimeType.values();
    }
}

