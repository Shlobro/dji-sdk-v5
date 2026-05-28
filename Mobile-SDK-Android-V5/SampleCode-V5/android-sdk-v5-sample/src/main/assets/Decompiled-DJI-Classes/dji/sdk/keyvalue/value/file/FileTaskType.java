/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileTaskType
extends Enum<FileTaskType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileTaskType FILE_DATA = new FileTaskType(0);
    public static final /* enum */ FileTaskType FILE_LIST = new FileTaskType(1);
    public static final /* enum */ FileTaskType UNKNOWN = new FileTaskType(65535);
    private int value;
    private static final FileTaskType[] allValues;
    private static final /* synthetic */ FileTaskType[] $VALUES;

    public static FileTaskType[] values() {
        return null;
    }

    public static FileTaskType valueOf(String string) {
        return null;
    }

    private FileTaskType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileTaskType find(int n) {
        return null;
    }

    private static /* synthetic */ FileTaskType[] $values() {
        return null;
    }

    static {
        $VALUES = FileTaskType.$values();
        allValues = FileTaskType.values();
    }
}

