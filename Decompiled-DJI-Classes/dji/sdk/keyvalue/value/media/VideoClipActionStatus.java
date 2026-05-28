/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class VideoClipActionStatus
extends Enum<VideoClipActionStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoClipActionStatus SUCCEEDED = new VideoClipActionStatus(0);
    public static final /* enum */ VideoClipActionStatus UNDO = new VideoClipActionStatus(1);
    public static final /* enum */ VideoClipActionStatus INVALID_PARAM = new VideoClipActionStatus(2);
    public static final /* enum */ VideoClipActionStatus INCOMPLETE = new VideoClipActionStatus(3);
    public static final /* enum */ VideoClipActionStatus SRC_NOT_EXIST = new VideoClipActionStatus(4);
    public static final /* enum */ VideoClipActionStatus TIMEOUT = new VideoClipActionStatus(5);
    public static final /* enum */ VideoClipActionStatus UNKNOWN = new VideoClipActionStatus(65535);
    private int value;
    private static final VideoClipActionStatus[] allValues;
    private static final /* synthetic */ VideoClipActionStatus[] $VALUES;

    public static VideoClipActionStatus[] values() {
        return null;
    }

    public static VideoClipActionStatus valueOf(String string) {
        return null;
    }

    private VideoClipActionStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoClipActionStatus find(int n) {
        return null;
    }

    private static /* synthetic */ VideoClipActionStatus[] $values() {
        return null;
    }

    static {
        $VALUES = VideoClipActionStatus.$values();
        allValues = VideoClipActionStatus.values();
    }
}

