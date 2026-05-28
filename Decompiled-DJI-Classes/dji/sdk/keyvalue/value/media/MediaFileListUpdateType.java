/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class MediaFileListUpdateType
extends Enum<MediaFileListUpdateType>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaFileListUpdateType RELOAD = new MediaFileListUpdateType(0);
    public static final /* enum */ MediaFileListUpdateType INSERT = new MediaFileListUpdateType(1);
    public static final /* enum */ MediaFileListUpdateType REMOVE = new MediaFileListUpdateType(2);
    public static final /* enum */ MediaFileListUpdateType CHANGE = new MediaFileListUpdateType(3);
    public static final /* enum */ MediaFileListUpdateType UNKNOWN = new MediaFileListUpdateType(65535);
    private int value;
    private static final MediaFileListUpdateType[] allValues;
    private static final /* synthetic */ MediaFileListUpdateType[] $VALUES;

    public static MediaFileListUpdateType[] values() {
        return null;
    }

    public static MediaFileListUpdateType valueOf(String string) {
        return null;
    }

    private MediaFileListUpdateType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaFileListUpdateType find(int n) {
        return null;
    }

    private static /* synthetic */ MediaFileListUpdateType[] $values() {
        return null;
    }

    static {
        $VALUES = MediaFileListUpdateType.$values();
        allValues = MediaFileListUpdateType.values();
    }
}

