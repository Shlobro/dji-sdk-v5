/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class MediaFileState
extends Enum<MediaFileState>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaFileState IDLE = new MediaFileState(0);
    public static final /* enum */ MediaFileState UPLOADING = new MediaFileState(1);
    public static final /* enum */ MediaFileState UPLOAD_SUCCESS = new MediaFileState(2);
    public static final /* enum */ MediaFileState UPLOAD_FAILED = new MediaFileState(3);
    public static final /* enum */ MediaFileState UNKNOWN = new MediaFileState(65535);
    private int value;
    private static final MediaFileState[] allValues;
    private static final /* synthetic */ MediaFileState[] $VALUES;

    public static MediaFileState[] values() {
        return null;
    }

    public static MediaFileState valueOf(String string) {
        return null;
    }

    private MediaFileState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaFileState find(int n) {
        return null;
    }

    private static /* synthetic */ MediaFileState[] $values() {
        return null;
    }

    static {
        $VALUES = MediaFileState.$values();
        allValues = MediaFileState.values();
    }
}

