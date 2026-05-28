/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoStreamIQType
extends Enum<VideoStreamIQType>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoStreamIQType NORMAL = new VideoStreamIQType(1);
    public static final /* enum */ VideoStreamIQType HIGH = new VideoStreamIQType(2);
    public static final /* enum */ VideoStreamIQType UNKNOWN = new VideoStreamIQType(65535);
    private int value;
    private static final VideoStreamIQType[] allValues;
    private static final /* synthetic */ VideoStreamIQType[] $VALUES;

    public static VideoStreamIQType[] values() {
        return null;
    }

    public static VideoStreamIQType valueOf(String string) {
        return null;
    }

    private VideoStreamIQType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoStreamIQType find(int n) {
        return null;
    }

    private static /* synthetic */ VideoStreamIQType[] $values() {
        return null;
    }

    static {
        $VALUES = VideoStreamIQType.$values();
        allValues = VideoStreamIQType.values();
    }
}

