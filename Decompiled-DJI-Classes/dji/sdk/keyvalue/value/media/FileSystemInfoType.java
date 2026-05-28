/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class FileSystemInfoType
extends Enum<FileSystemInfoType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileSystemInfoType DCF = new FileSystemInfoType(0);
    public static final /* enum */ FileSystemInfoType CLIP = new FileSystemInfoType(1);
    public static final /* enum */ FileSystemInfoType UNKNOWN = new FileSystemInfoType(65535);
    private int value;
    private static final FileSystemInfoType[] allValues;
    private static final /* synthetic */ FileSystemInfoType[] $VALUES;

    public static FileSystemInfoType[] values() {
        return null;
    }

    public static FileSystemInfoType valueOf(String string) {
        return null;
    }

    private FileSystemInfoType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileSystemInfoType find(int n) {
        return null;
    }

    private static /* synthetic */ FileSystemInfoType[] $values() {
        return null;
    }

    static {
        $VALUES = FileSystemInfoType.$values();
        allValues = FileSystemInfoType.values();
    }
}

