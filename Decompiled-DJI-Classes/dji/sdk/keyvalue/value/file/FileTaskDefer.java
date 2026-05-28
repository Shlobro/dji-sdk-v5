/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileTaskDefer
extends Enum<FileTaskDefer>
implements JNIProguardKeepTag {
    public static final /* enum */ FileTaskDefer BACK_TO_QUEUE = new FileTaskDefer(0);
    public static final /* enum */ FileTaskDefer ABORT = new FileTaskDefer(1);
    public static final /* enum */ FileTaskDefer UNKNOWN = new FileTaskDefer(65535);
    private int value;
    private static final FileTaskDefer[] allValues;
    private static final /* synthetic */ FileTaskDefer[] $VALUES;

    public static FileTaskDefer[] values() {
        return null;
    }

    public static FileTaskDefer valueOf(String string) {
        return null;
    }

    private FileTaskDefer(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileTaskDefer find(int n) {
        return null;
    }

    private static /* synthetic */ FileTaskDefer[] $values() {
        return null;
    }

    static {
        $VALUES = FileTaskDefer.$values();
        allValues = FileTaskDefer.values();
    }
}

