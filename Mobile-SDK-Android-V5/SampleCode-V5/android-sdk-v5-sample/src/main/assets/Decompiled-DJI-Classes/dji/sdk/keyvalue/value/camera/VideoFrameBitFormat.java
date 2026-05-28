/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoFrameBitFormat
extends Enum<VideoFrameBitFormat>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoFrameBitFormat RAW = new VideoFrameBitFormat(0);
    public static final /* enum */ VideoFrameBitFormat RGB = new VideoFrameBitFormat(1);
    public static final /* enum */ VideoFrameBitFormat RGBA = new VideoFrameBitFormat(2);
    public static final /* enum */ VideoFrameBitFormat YUV420 = new VideoFrameBitFormat(3);
    public static final /* enum */ VideoFrameBitFormat YUV422 = new VideoFrameBitFormat(4);
    public static final /* enum */ VideoFrameBitFormat YUV444 = new VideoFrameBitFormat(5);
    public static final /* enum */ VideoFrameBitFormat UNKNOWN = new VideoFrameBitFormat(65535);
    private int value;
    private static final VideoFrameBitFormat[] allValues;
    private static final /* synthetic */ VideoFrameBitFormat[] $VALUES;

    public static VideoFrameBitFormat[] values() {
        return null;
    }

    public static VideoFrameBitFormat valueOf(String string) {
        return null;
    }

    private VideoFrameBitFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoFrameBitFormat find(int n) {
        return null;
    }

    private static /* synthetic */ VideoFrameBitFormat[] $values() {
        return null;
    }

    static {
        $VALUES = VideoFrameBitFormat.$values();
        allValues = VideoFrameBitFormat.values();
    }
}

