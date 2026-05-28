/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class VideoClipInfoControl
extends Enum<VideoClipInfoControl>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoClipInfoControl STOPALL = new VideoClipInfoControl(0);
    public static final /* enum */ VideoClipInfoControl START = new VideoClipInfoControl(1);
    public static final /* enum */ VideoClipInfoControl STOPCURRENT = new VideoClipInfoControl(2);
    public static final /* enum */ VideoClipInfoControl PAUSE = new VideoClipInfoControl(3);
    public static final /* enum */ VideoClipInfoControl APPEND = new VideoClipInfoControl(4);
    public static final /* enum */ VideoClipInfoControl UNKNOWN = new VideoClipInfoControl(65535);
    private int value;
    private static final VideoClipInfoControl[] allValues;
    private static final /* synthetic */ VideoClipInfoControl[] $VALUES;

    public static VideoClipInfoControl[] values() {
        return null;
    }

    public static VideoClipInfoControl valueOf(String string) {
        return null;
    }

    private VideoClipInfoControl(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoClipInfoControl find(int n) {
        return null;
    }

    private static /* synthetic */ VideoClipInfoControl[] $values() {
        return null;
    }

    static {
        $VALUES = VideoClipInfoControl.$values();
        allValues = VideoClipInfoControl.values();
    }
}

