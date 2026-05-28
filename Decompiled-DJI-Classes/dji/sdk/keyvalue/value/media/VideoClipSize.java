/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class VideoClipSize
extends Enum<VideoClipSize>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoClipSize SIZE_DEFAULT = new VideoClipSize(0);
    public static final /* enum */ VideoClipSize SIZE_1080P = new VideoClipSize(1);
    public static final /* enum */ VideoClipSize SIZE_720P = new VideoClipSize(2);
    public static final /* enum */ VideoClipSize SIZE_480P = new VideoClipSize(3);
    public static final /* enum */ VideoClipSize SIZE_240P = new VideoClipSize(4);
    public static final /* enum */ VideoClipSize UNKNOWN = new VideoClipSize(65535);
    private int value;
    private static final VideoClipSize[] allValues;
    private static final /* synthetic */ VideoClipSize[] $VALUES;

    public static VideoClipSize[] values() {
        return null;
    }

    public static VideoClipSize valueOf(String string) {
        return null;
    }

    private VideoClipSize(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoClipSize find(int n) {
        return null;
    }

    private static /* synthetic */ VideoClipSize[] $values() {
        return null;
    }

    static {
        $VALUES = VideoClipSize.$values();
        allValues = VideoClipSize.values();
    }
}

