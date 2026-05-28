/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class FileUploadException
extends Enum<FileUploadException>
implements JNIProguardKeepTag {
    public static final /* enum */ FileUploadException OK = new FileUploadException(0);
    public static final /* enum */ FileUploadException MOTOR_LOCK_FAILED = new FileUploadException(1);
    public static final /* enum */ FileUploadException SWITCH_TO_HIGH_SPEED_MODE_FAILED = new FileUploadException(2);
    public static final /* enum */ FileUploadException SWITCH_TO_NORMAL_SPEED_MODE_FAILED = new FileUploadException(3);
    public static final /* enum */ FileUploadException MOTOR_RECORERY_FAILED = new FileUploadException(4);
    public static final /* enum */ FileUploadException FILE_UPLOAD_FIALED = new FileUploadException(5);
    public static final /* enum */ FileUploadException UNKNOWN = new FileUploadException(255);
    private int value;
    private static final FileUploadException[] allValues;
    private static final /* synthetic */ FileUploadException[] $VALUES;

    public static FileUploadException[] values() {
        return null;
    }

    public static FileUploadException valueOf(String string) {
        return null;
    }

    private FileUploadException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileUploadException find(int n) {
        return null;
    }

    private static /* synthetic */ FileUploadException[] $values() {
        return null;
    }

    static {
        $VALUES = FileUploadException.$values();
        allValues = FileUploadException.values();
    }
}

