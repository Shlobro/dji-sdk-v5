/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class MegaphoneUploadState
extends Enum<MegaphoneUploadState>
implements JNIProguardKeepTag {
    public static final /* enum */ MegaphoneUploadState UPLOADING = new MegaphoneUploadState(0);
    public static final /* enum */ MegaphoneUploadState SUCCESS_UPLOAD = new MegaphoneUploadState(1);
    public static final /* enum */ MegaphoneUploadState FAIL_UPLOAD = new MegaphoneUploadState(2);
    public static final /* enum */ MegaphoneUploadState FAIL_MD5 = new MegaphoneUploadState(3);
    public static final /* enum */ MegaphoneUploadState ABORTED = new MegaphoneUploadState(4);
    public static final /* enum */ MegaphoneUploadState UNKNOWN = new MegaphoneUploadState(65535);
    private int value;
    private static final MegaphoneUploadState[] allValues;
    private static final /* synthetic */ MegaphoneUploadState[] $VALUES;

    public static MegaphoneUploadState[] values() {
        return null;
    }

    public static MegaphoneUploadState valueOf(String string) {
        return null;
    }

    private MegaphoneUploadState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MegaphoneUploadState find(int n) {
        return null;
    }

    private static /* synthetic */ MegaphoneUploadState[] $values() {
        return null;
    }

    static {
        $VALUES = MegaphoneUploadState.$values();
        allValues = MegaphoneUploadState.values();
    }
}

