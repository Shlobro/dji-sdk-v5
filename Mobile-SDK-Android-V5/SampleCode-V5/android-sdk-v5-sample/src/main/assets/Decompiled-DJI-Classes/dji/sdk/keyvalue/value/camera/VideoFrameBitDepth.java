/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoFrameBitDepth
extends Enum<VideoFrameBitDepth>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoFrameBitDepth BIT_8 = new VideoFrameBitDepth(0);
    public static final /* enum */ VideoFrameBitDepth BIT_10 = new VideoFrameBitDepth(1);
    public static final /* enum */ VideoFrameBitDepth BIT_12 = new VideoFrameBitDepth(2);
    public static final /* enum */ VideoFrameBitDepth BIT_14 = new VideoFrameBitDepth(3);
    public static final /* enum */ VideoFrameBitDepth UNKNOWN = new VideoFrameBitDepth(65535);
    private int value;
    private static final VideoFrameBitDepth[] allValues;
    private static final /* synthetic */ VideoFrameBitDepth[] $VALUES;

    public static VideoFrameBitDepth[] values() {
        return null;
    }

    public static VideoFrameBitDepth valueOf(String string) {
        return null;
    }

    private VideoFrameBitDepth(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoFrameBitDepth find(int n) {
        return null;
    }

    private static /* synthetic */ VideoFrameBitDepth[] $values() {
        return null;
    }

    static {
        $VALUES = VideoFrameBitDepth.$values();
        allValues = VideoFrameBitDepth.values();
    }
}

