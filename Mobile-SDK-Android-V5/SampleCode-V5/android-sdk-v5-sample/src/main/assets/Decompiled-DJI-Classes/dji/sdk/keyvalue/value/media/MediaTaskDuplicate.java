/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class MediaTaskDuplicate
extends Enum<MediaTaskDuplicate>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaTaskDuplicate NONE = new MediaTaskDuplicate(0);
    public static final /* enum */ MediaTaskDuplicate ENQUEUE_WITH_CANCEL = new MediaTaskDuplicate(1);
    public static final /* enum */ MediaTaskDuplicate DEQUEUE_WITH_COMPLETE = new MediaTaskDuplicate(2);
    public static final /* enum */ MediaTaskDuplicate UNKNOWN = new MediaTaskDuplicate(65535);
    private int value;
    private static final MediaTaskDuplicate[] allValues;
    private static final /* synthetic */ MediaTaskDuplicate[] $VALUES;

    public static MediaTaskDuplicate[] values() {
        return null;
    }

    public static MediaTaskDuplicate valueOf(String string) {
        return null;
    }

    private MediaTaskDuplicate(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaTaskDuplicate find(int n) {
        return null;
    }

    private static /* synthetic */ MediaTaskDuplicate[] $values() {
        return null;
    }

    static {
        $VALUES = MediaTaskDuplicate.$values();
        allValues = MediaTaskDuplicate.values();
    }
}

