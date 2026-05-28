/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudMediaUploadState
extends Enum<CloudMediaUploadState>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudMediaUploadState WAITING = new CloudMediaUploadState(0);
    public static final /* enum */ CloudMediaUploadState GET_FILE_INFO = new CloudMediaUploadState(1);
    public static final /* enum */ CloudMediaUploadState WAIT_DOWNLOAD = new CloudMediaUploadState(2);
    public static final /* enum */ CloudMediaUploadState PREPARE_DOWNLOAD = new CloudMediaUploadState(3);
    public static final /* enum */ CloudMediaUploadState DOWNLOADING = new CloudMediaUploadState(4);
    public static final /* enum */ CloudMediaUploadState DOWNLOADED = new CloudMediaUploadState(5);
    public static final /* enum */ CloudMediaUploadState PREPARE_UPLOAD = new CloudMediaUploadState(6);
    public static final /* enum */ CloudMediaUploadState UPLOADING = new CloudMediaUploadState(7);
    public static final /* enum */ CloudMediaUploadState UPLOADED = new CloudMediaUploadState(8);
    public static final /* enum */ CloudMediaUploadState SYNCING = new CloudMediaUploadState(9);
    public static final /* enum */ CloudMediaUploadState WAIT_SYNC_CHECK = new CloudMediaUploadState(10);
    public static final /* enum */ CloudMediaUploadState SYNC_CHECKING = new CloudMediaUploadState(11);
    public static final /* enum */ CloudMediaUploadState SYNCED = new CloudMediaUploadState(12);
    public static final /* enum */ CloudMediaUploadState CANCELED = new CloudMediaUploadState(13);
    public static final /* enum */ CloudMediaUploadState FAILED = new CloudMediaUploadState(14);
    public static final /* enum */ CloudMediaUploadState COMPLATED = new CloudMediaUploadState(15);
    public static final /* enum */ CloudMediaUploadState UNKNOWN = new CloudMediaUploadState(256);
    private int value;
    private static final CloudMediaUploadState[] allValues;
    private static final /* synthetic */ CloudMediaUploadState[] $VALUES;

    public static CloudMediaUploadState[] values() {
        return null;
    }

    public static CloudMediaUploadState valueOf(String string) {
        return null;
    }

    private CloudMediaUploadState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudMediaUploadState find(int n) {
        return null;
    }

    private static /* synthetic */ CloudMediaUploadState[] $values() {
        return null;
    }

    static {
        $VALUES = CloudMediaUploadState.$values();
        allValues = CloudMediaUploadState.values();
    }
}

