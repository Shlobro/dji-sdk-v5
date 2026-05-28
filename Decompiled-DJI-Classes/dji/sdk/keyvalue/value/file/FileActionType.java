/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileActionType
extends Enum<FileActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileActionType NONE = new FileActionType(0);
    public static final /* enum */ FileActionType TAG_STAR = new FileActionType(1);
    public static final /* enum */ FileActionType CANCEL_STAR = new FileActionType(2);
    public static final /* enum */ FileActionType DELETE_SINGLE = new FileActionType(3);
    public static final /* enum */ FileActionType DELETE_ALL = new FileActionType(4);
    public static final /* enum */ FileActionType STOP_BATCH_STAR = new FileActionType(5);
    public static final /* enum */ FileActionType STOP_BATCH_DELETE = new FileActionType(6);
    public static final /* enum */ FileActionType DELETE_SINGLE_MAGIC = new FileActionType(7);
    public static final /* enum */ FileActionType START_BATCH_TAG = new FileActionType(8);
    public static final /* enum */ FileActionType STOP_BATCH_TAG = new FileActionType(9);
    public static final /* enum */ FileActionType UNKNOWN = new FileActionType(65535);
    private int value;
    private static final FileActionType[] allValues;
    private static final /* synthetic */ FileActionType[] $VALUES;

    public static FileActionType[] values() {
        return null;
    }

    public static FileActionType valueOf(String string) {
        return null;
    }

    private FileActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileActionType find(int n) {
        return null;
    }

    private static /* synthetic */ FileActionType[] $values() {
        return null;
    }

    static {
        $VALUES = FileActionType.$values();
        allValues = FileActionType.values();
    }
}

