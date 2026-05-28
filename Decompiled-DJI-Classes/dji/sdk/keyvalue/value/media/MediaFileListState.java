/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class MediaFileListState
extends Enum<MediaFileListState>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaFileListState UP_TO_DATE = new MediaFileListState(0);
    public static final /* enum */ MediaFileListState INCOMPLETE = new MediaFileListState(1);
    public static final /* enum */ MediaFileListState RESET = new MediaFileListState(2);
    public static final /* enum */ MediaFileListState DELETING = new MediaFileListState(3);
    public static final /* enum */ MediaFileListState SYNCING = new MediaFileListState(4);
    public static final /* enum */ MediaFileListState UNKNOWN = new MediaFileListState(65535);
    private int value;
    private static final MediaFileListState[] allValues;
    private static final /* synthetic */ MediaFileListState[] $VALUES;

    public static MediaFileListState[] values() {
        return null;
    }

    public static MediaFileListState valueOf(String string) {
        return null;
    }

    private MediaFileListState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaFileListState find(int n) {
        return null;
    }

    private static /* synthetic */ MediaFileListState[] $values() {
        return null;
    }

    static {
        $VALUES = MediaFileListState.$values();
        allValues = MediaFileListState.values();
    }
}

