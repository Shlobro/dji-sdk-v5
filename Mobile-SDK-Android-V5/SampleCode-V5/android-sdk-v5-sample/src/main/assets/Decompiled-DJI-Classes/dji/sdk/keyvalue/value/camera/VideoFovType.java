/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoFovType
extends Enum<VideoFovType>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoFovType NONE = new VideoFovType(0);
    public static final /* enum */ VideoFovType MEDIUM = new VideoFovType(1);
    public static final /* enum */ VideoFovType NARROW = new VideoFovType(2);
    public static final /* enum */ VideoFovType WIDE = new VideoFovType(3);
    public static final /* enum */ VideoFovType SNARROW = new VideoFovType(4);
    public static final /* enum */ VideoFovType UNKNOWN = new VideoFovType(65535);
    private int value;
    private static final VideoFovType[] allValues;
    private static final /* synthetic */ VideoFovType[] $VALUES;

    public static VideoFovType[] values() {
        return null;
    }

    public static VideoFovType valueOf(String string) {
        return null;
    }

    private VideoFovType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoFovType find(int n) {
        return null;
    }

    private static /* synthetic */ VideoFovType[] $values() {
        return null;
    }

    static {
        $VALUES = VideoFovType.$values();
        allValues = VideoFovType.values();
    }
}

