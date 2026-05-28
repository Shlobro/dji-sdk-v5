/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileListRequestTimeOrderType
extends Enum<FileListRequestTimeOrderType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileListRequestTimeOrderType OLD_FIRST = new FileListRequestTimeOrderType(0);
    public static final /* enum */ FileListRequestTimeOrderType NEW_FIRST = new FileListRequestTimeOrderType(1);
    public static final /* enum */ FileListRequestTimeOrderType UNKNOWN = new FileListRequestTimeOrderType(65535);
    private int value;
    private static final FileListRequestTimeOrderType[] allValues;
    private static final /* synthetic */ FileListRequestTimeOrderType[] $VALUES;

    public static FileListRequestTimeOrderType[] values() {
        return null;
    }

    public static FileListRequestTimeOrderType valueOf(String string) {
        return null;
    }

    private FileListRequestTimeOrderType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileListRequestTimeOrderType find(int n) {
        return null;
    }

    private static /* synthetic */ FileListRequestTimeOrderType[] $values() {
        return null;
    }

    static {
        $VALUES = FileListRequestTimeOrderType.$values();
        allValues = FileListRequestTimeOrderType.values();
    }
}

