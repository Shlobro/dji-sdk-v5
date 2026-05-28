/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileListRequestSizeOrderType
extends Enum<FileListRequestSizeOrderType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileListRequestSizeOrderType LARGE_FIRST = new FileListRequestSizeOrderType(0);
    public static final /* enum */ FileListRequestSizeOrderType SMALL_FIRST = new FileListRequestSizeOrderType(1);
    public static final /* enum */ FileListRequestSizeOrderType UNKNOWN = new FileListRequestSizeOrderType(65535);
    private int value;
    private static final FileListRequestSizeOrderType[] allValues;
    private static final /* synthetic */ FileListRequestSizeOrderType[] $VALUES;

    public static FileListRequestSizeOrderType[] values() {
        return null;
    }

    public static FileListRequestSizeOrderType valueOf(String string) {
        return null;
    }

    private FileListRequestSizeOrderType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileListRequestSizeOrderType find(int n) {
        return null;
    }

    private static /* synthetic */ FileListRequestSizeOrderType[] $values() {
        return null;
    }

    static {
        $VALUES = FileListRequestSizeOrderType.$values();
        allValues = FileListRequestSizeOrderType.values();
    }
}

