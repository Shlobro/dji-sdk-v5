/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoFileFormat
extends Enum<VideoFileFormat>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoFileFormat MOV = new VideoFileFormat(0);
    public static final /* enum */ VideoFileFormat MP4 = new VideoFileFormat(1);
    public static final /* enum */ VideoFileFormat TIFF_SEQ = new VideoFileFormat(2);
    public static final /* enum */ VideoFileFormat SEQ = new VideoFileFormat(3);
    public static final /* enum */ VideoFileFormat CDNG = new VideoFileFormat(4);
    public static final /* enum */ VideoFileFormat MXF = new VideoFileFormat(5);
    public static final /* enum */ VideoFileFormat TS = new VideoFileFormat(6);
    public static final /* enum */ VideoFileFormat UNKNOWN = new VideoFileFormat(65535);
    private int value;
    private static final VideoFileFormat[] allValues;
    private static final /* synthetic */ VideoFileFormat[] $VALUES;

    public static VideoFileFormat[] values() {
        return null;
    }

    public static VideoFileFormat valueOf(String string) {
        return null;
    }

    private VideoFileFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoFileFormat find(int n) {
        return null;
    }

    private static /* synthetic */ VideoFileFormat[] $values() {
        return null;
    }

    static {
        $VALUES = VideoFileFormat.$values();
        allValues = VideoFileFormat.values();
    }
}

