/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class VideoClipActionState
extends Enum<VideoClipActionState>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoClipActionState SUCCEEDED = new VideoClipActionState(0);
    public static final /* enum */ VideoClipActionState UNDO = new VideoClipActionState(1);
    public static final /* enum */ VideoClipActionState INVALID_PARAM = new VideoClipActionState(2);
    public static final /* enum */ VideoClipActionState INCOMPLETE = new VideoClipActionState(3);
    public static final /* enum */ VideoClipActionState SRC_NOT_EXIST = new VideoClipActionState(4);
    public static final /* enum */ VideoClipActionState TIMEOUT = new VideoClipActionState(5);
    public static final /* enum */ VideoClipActionState UNKNOWN = new VideoClipActionState(65535);
    private int value;
    private static final VideoClipActionState[] allValues;
    private static final /* synthetic */ VideoClipActionState[] $VALUES;

    public static VideoClipActionState[] values() {
        return null;
    }

    public static VideoClipActionState valueOf(String string) {
        return null;
    }

    private VideoClipActionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoClipActionState find(int n) {
        return null;
    }

    private static /* synthetic */ VideoClipActionState[] $values() {
        return null;
    }

    static {
        $VALUES = VideoClipActionState.$values();
        allValues = VideoClipActionState.values();
    }
}

