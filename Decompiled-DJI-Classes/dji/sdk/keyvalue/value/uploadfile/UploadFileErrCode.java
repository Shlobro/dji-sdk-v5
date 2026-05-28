/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.uploadfile;

import dji.jni.JNIProguardKeepTag;

public final class UploadFileErrCode
extends Enum<UploadFileErrCode>
implements JNIProguardKeepTag {
    public static final /* enum */ UploadFileErrCode NONE = new UploadFileErrCode(0);
    public static final /* enum */ UploadFileErrCode BIZ_SYSTEM_INTERNAL_ERR = new UploadFileErrCode(1);
    public static final /* enum */ UploadFileErrCode BIZ_STORAGE_ERR = new UploadFileErrCode(2);
    public static final /* enum */ UploadFileErrCode BIZ_PARAM_INVALID = new UploadFileErrCode(3);
    public static final /* enum */ UploadFileErrCode BIZ_CACHE_ERR = new UploadFileErrCode(4);
    public static final /* enum */ UploadFileErrCode BIZ_DB_ERR = new UploadFileErrCode(5);
    public static final /* enum */ UploadFileErrCode BIZ_NOT_PERMITTED = new UploadFileErrCode(6);
    public static final /* enum */ UploadFileErrCode OSS_BASE = new UploadFileErrCode(1000);
    public static final /* enum */ UploadFileErrCode OSS_REQUEST_FAILED = new UploadFileErrCode(1100);
    public static final /* enum */ UploadFileErrCode OSS_UPLOAD_FILE_NOT_EXIST = new UploadFileErrCode(1101);
    public static final /* enum */ UploadFileErrCode OSS_USER_CANCELED = new UploadFileErrCode(1102);
    public static final /* enum */ UploadFileErrCode OSS_CREATE_STORAGE_INSTANCE_FAILED = new UploadFileErrCode(1200);
    public static final /* enum */ UploadFileErrCode OSS_STORAGE_INSTANCE_NOT_FOUND = new UploadFileErrCode(1201);
    public static final /* enum */ UploadFileErrCode OSS_TASK_NOT_FOUND = new UploadFileErrCode(1202);
    public static final /* enum */ UploadFileErrCode OSS_TASK_HANDLE_NOT_FOUND = new UploadFileErrCode(1203);
    public static final /* enum */ UploadFileErrCode OSS_TASK_INVALID_STATE = new UploadFileErrCode(1204);
    public static final /* enum */ UploadFileErrCode UNKNOWN = new UploadFileErrCode(65535);
    private int value;
    private static final UploadFileErrCode[] allValues;
    private static final /* synthetic */ UploadFileErrCode[] $VALUES;

    public static UploadFileErrCode[] values() {
        return null;
    }

    public static UploadFileErrCode valueOf(String string) {
        return null;
    }

    private UploadFileErrCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UploadFileErrCode find(int n) {
        return null;
    }

    private static /* synthetic */ UploadFileErrCode[] $values() {
        return null;
    }

    static {
        $VALUES = UploadFileErrCode.$values();
        allValues = UploadFileErrCode.values();
    }
}

