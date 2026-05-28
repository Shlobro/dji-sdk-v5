/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class MediaTaskType
extends Enum<MediaTaskType>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaTaskType FILE_DATA = new MediaTaskType(0);
    public static final /* enum */ MediaTaskType FILE_LIST = new MediaTaskType(1);
    public static final /* enum */ MediaTaskType UNKNOWN = new MediaTaskType(65535);
    private int value;
    private static final MediaTaskType[] allValues;
    private static final /* synthetic */ MediaTaskType[] $VALUES;

    public static MediaTaskType[] values() {
        return null;
    }

    public static MediaTaskType valueOf(String string) {
        return null;
    }

    private MediaTaskType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaTaskType find(int n) {
        return null;
    }

    private static /* synthetic */ MediaTaskType[] $values() {
        return null;
    }

    static {
        $VALUES = MediaTaskType.$values();
        allValues = MediaTaskType.values();
    }
}

