/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class MediaTaskDefer
extends Enum<MediaTaskDefer>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaTaskDefer BACK_TO_QUEUE = new MediaTaskDefer(0);
    public static final /* enum */ MediaTaskDefer ABORT = new MediaTaskDefer(1);
    public static final /* enum */ MediaTaskDefer UNKNOWN = new MediaTaskDefer(65535);
    private int value;
    private static final MediaTaskDefer[] allValues;
    private static final /* synthetic */ MediaTaskDefer[] $VALUES;

    public static MediaTaskDefer[] values() {
        return null;
    }

    public static MediaTaskDefer valueOf(String string) {
        return null;
    }

    private MediaTaskDefer(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaTaskDefer find(int n) {
        return null;
    }

    private static /* synthetic */ MediaTaskDefer[] $values() {
        return null;
    }

    static {
        $VALUES = MediaTaskDefer.$values();
        allValues = MediaTaskDefer.values();
    }
}

