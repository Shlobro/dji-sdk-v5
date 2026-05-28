/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileListRequestOrderType
extends Enum<FileListRequestOrderType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileListRequestOrderType TIME = new FileListRequestOrderType(0);
    public static final /* enum */ FileListRequestOrderType SIZE = new FileListRequestOrderType(1);
    public static final /* enum */ FileListRequestOrderType UNKNOWN = new FileListRequestOrderType(65535);
    private int value;
    private static final FileListRequestOrderType[] allValues;
    private static final /* synthetic */ FileListRequestOrderType[] $VALUES;

    public static FileListRequestOrderType[] values() {
        return null;
    }

    public static FileListRequestOrderType valueOf(String string) {
        return null;
    }

    private FileListRequestOrderType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileListRequestOrderType find(int n) {
        return null;
    }

    private static /* synthetic */ FileListRequestOrderType[] $values() {
        return null;
    }

    static {
        $VALUES = FileListRequestOrderType.$values();
        allValues = FileListRequestOrderType.values();
    }
}

