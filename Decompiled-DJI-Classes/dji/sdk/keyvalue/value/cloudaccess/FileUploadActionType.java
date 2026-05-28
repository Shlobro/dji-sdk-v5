/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class FileUploadActionType
extends Enum<FileUploadActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileUploadActionType UPLOAD_CALLBACK = new FileUploadActionType(0);
    public static final /* enum */ FileUploadActionType DETECT = new FileUploadActionType(1);
    public static final /* enum */ FileUploadActionType PROMPT = new FileUploadActionType(2);
    public static final /* enum */ FileUploadActionType UNKNOWN = new FileUploadActionType(65535);
    private int value;
    private static final FileUploadActionType[] allValues;
    private static final /* synthetic */ FileUploadActionType[] $VALUES;

    public static FileUploadActionType[] values() {
        return null;
    }

    public static FileUploadActionType valueOf(String string) {
        return null;
    }

    private FileUploadActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileUploadActionType find(int n) {
        return null;
    }

    private static /* synthetic */ FileUploadActionType[] $values() {
        return null;
    }

    static {
        $VALUES = FileUploadActionType.$values();
        allValues = FileUploadActionType.values();
    }
}

