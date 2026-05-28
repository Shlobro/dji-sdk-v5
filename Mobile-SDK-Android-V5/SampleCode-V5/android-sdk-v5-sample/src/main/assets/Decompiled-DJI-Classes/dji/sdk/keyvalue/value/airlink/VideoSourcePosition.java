/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class VideoSourcePosition
extends Enum<VideoSourcePosition>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoSourcePosition SOURCE_POSITION_LEFT = new VideoSourcePosition(0);
    public static final /* enum */ VideoSourcePosition SOURCE_POSITION_RIGHT = new VideoSourcePosition(1);
    public static final /* enum */ VideoSourcePosition SOURCE_POSITION_UP = new VideoSourcePosition(2);
    public static final /* enum */ VideoSourcePosition SOURCE_POSITION_FPV = new VideoSourcePosition(7);
    public static final /* enum */ VideoSourcePosition UNKNOWN = new VideoSourcePosition(65535);
    private int value;
    private static final VideoSourcePosition[] allValues;
    private static final /* synthetic */ VideoSourcePosition[] $VALUES;

    public static VideoSourcePosition[] values() {
        return null;
    }

    public static VideoSourcePosition valueOf(String string) {
        return null;
    }

    private VideoSourcePosition(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoSourcePosition find(int n) {
        return null;
    }

    private static /* synthetic */ VideoSourcePosition[] $values() {
        return null;
    }

    static {
        $VALUES = VideoSourcePosition.$values();
        allValues = VideoSourcePosition.values();
    }
}

