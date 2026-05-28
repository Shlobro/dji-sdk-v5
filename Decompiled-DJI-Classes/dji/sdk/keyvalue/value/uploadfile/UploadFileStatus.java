/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.uploadfile;

import dji.jni.JNIProguardKeepTag;

public final class UploadFileStatus
extends Enum<UploadFileStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ UploadFileStatus NONE = new UploadFileStatus(0);
    public static final /* enum */ UploadFileStatus INIT = new UploadFileStatus(1);
    public static final /* enum */ UploadFileStatus GETTOKEN = new UploadFileStatus(2);
    public static final /* enum */ UploadFileStatus UPLOADING = new UploadFileStatus(3);
    public static final /* enum */ UploadFileStatus COMMIT_FILES = new UploadFileStatus(4);
    public static final /* enum */ UploadFileStatus FINISH = new UploadFileStatus(5);
    public static final /* enum */ UploadFileStatus ERR = new UploadFileStatus(6);
    public static final /* enum */ UploadFileStatus SINGLE_FINISH = new UploadFileStatus(7);
    public static final /* enum */ UploadFileStatus SINGLE_ERR = new UploadFileStatus(8);
    public static final /* enum */ UploadFileStatus UNKNOWN = new UploadFileStatus(65535);
    private int value;
    private static final UploadFileStatus[] allValues;
    private static final /* synthetic */ UploadFileStatus[] $VALUES;

    public static UploadFileStatus[] values() {
        return null;
    }

    public static UploadFileStatus valueOf(String string) {
        return null;
    }

    private UploadFileStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UploadFileStatus find(int n) {
        return null;
    }

    private static /* synthetic */ UploadFileStatus[] $values() {
        return null;
    }

    static {
        $VALUES = UploadFileStatus.$values();
        allValues = UploadFileStatus.values();
    }
}

