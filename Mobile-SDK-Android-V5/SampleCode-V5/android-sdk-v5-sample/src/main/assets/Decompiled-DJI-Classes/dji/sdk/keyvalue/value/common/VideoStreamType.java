/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class VideoStreamType
extends Enum<VideoStreamType>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoStreamType H264 = new VideoStreamType(0);
    public static final /* enum */ VideoStreamType H265 = new VideoStreamType(1);
    public static final /* enum */ VideoStreamType UNKNOWN = new VideoStreamType(65535);
    private int value;
    private static final VideoStreamType[] allValues;
    private static final /* synthetic */ VideoStreamType[] $VALUES;

    public static VideoStreamType[] values() {
        return null;
    }

    public static VideoStreamType valueOf(String string) {
        return null;
    }

    private VideoStreamType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoStreamType find(int n) {
        return null;
    }

    private static /* synthetic */ VideoStreamType[] $values() {
        return null;
    }

    static {
        $VALUES = VideoStreamType.$values();
        allValues = VideoStreamType.values();
    }
}

