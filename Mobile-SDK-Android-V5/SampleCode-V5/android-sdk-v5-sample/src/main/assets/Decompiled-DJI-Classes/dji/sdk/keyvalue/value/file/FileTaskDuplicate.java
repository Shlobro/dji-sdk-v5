/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileTaskDuplicate
extends Enum<FileTaskDuplicate>
implements JNIProguardKeepTag {
    public static final /* enum */ FileTaskDuplicate NONE = new FileTaskDuplicate(0);
    public static final /* enum */ FileTaskDuplicate ENQUEUE_WITH_CANCEL = new FileTaskDuplicate(1);
    public static final /* enum */ FileTaskDuplicate DEQUEUE_WITH_COMPLETE = new FileTaskDuplicate(2);
    public static final /* enum */ FileTaskDuplicate UNKNOWN = new FileTaskDuplicate(65535);
    private int value;
    private static final FileTaskDuplicate[] allValues;
    private static final /* synthetic */ FileTaskDuplicate[] $VALUES;

    public static FileTaskDuplicate[] values() {
        return null;
    }

    public static FileTaskDuplicate valueOf(String string) {
        return null;
    }

    private FileTaskDuplicate(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileTaskDuplicate find(int n) {
        return null;
    }

    private static /* synthetic */ FileTaskDuplicate[] $values() {
        return null;
    }

    static {
        $VALUES = FileTaskDuplicate.$values();
        allValues = FileTaskDuplicate.values();
    }
}

