/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoStreamIndex
extends Enum<VideoStreamIndex>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoStreamIndex FIRST_STREAM = new VideoStreamIndex(0);
    public static final /* enum */ VideoStreamIndex SECOND_STREAM = new VideoStreamIndex(1);
    public static final /* enum */ VideoStreamIndex PLAYBACK = new VideoStreamIndex(2);
    public static final /* enum */ VideoStreamIndex UNKNOWN = new VideoStreamIndex(4095);
    private int value;
    private static final VideoStreamIndex[] allValues;
    private static final /* synthetic */ VideoStreamIndex[] $VALUES;

    public static VideoStreamIndex[] values() {
        return null;
    }

    public static VideoStreamIndex valueOf(String string) {
        return null;
    }

    private VideoStreamIndex(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoStreamIndex find(int n) {
        return null;
    }

    private static /* synthetic */ VideoStreamIndex[] $values() {
        return null;
    }

    static {
        $VALUES = VideoStreamIndex.$values();
        allValues = VideoStreamIndex.values();
    }
}

