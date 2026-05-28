/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoCodecFormat
extends Enum<VideoCodecFormat>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoCodecFormat DEFAULT = new VideoCodecFormat(0);
    public static final /* enum */ VideoCodecFormat H264 = new VideoCodecFormat(1);
    public static final /* enum */ VideoCodecFormat H265 = new VideoCodecFormat(2);
    public static final /* enum */ VideoCodecFormat UNKNOWN = new VideoCodecFormat(65535);
    private int value;
    private static final VideoCodecFormat[] allValues;
    private static final /* synthetic */ VideoCodecFormat[] $VALUES;

    public static VideoCodecFormat[] values() {
        return null;
    }

    public static VideoCodecFormat valueOf(String string) {
        return null;
    }

    private VideoCodecFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoCodecFormat find(int n) {
        return null;
    }

    private static /* synthetic */ VideoCodecFormat[] $values() {
        return null;
    }

    static {
        $VALUES = VideoCodecFormat.$values();
        allValues = VideoCodecFormat.values();
    }
}

