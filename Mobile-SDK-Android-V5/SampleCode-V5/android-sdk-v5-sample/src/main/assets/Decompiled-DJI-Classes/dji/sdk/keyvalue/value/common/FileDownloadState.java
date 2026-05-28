/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class FileDownloadState
extends Enum<FileDownloadState>
implements JNIProguardKeepTag {
    public static final /* enum */ FileDownloadState PREPARE = new FileDownloadState(0);
    public static final /* enum */ FileDownloadState DOWNLOAD = new FileDownloadState(1);
    public static final /* enum */ FileDownloadState FAILED = new FileDownloadState(2);
    public static final /* enum */ FileDownloadState SUCCESSFUL = new FileDownloadState(3);
    public static final /* enum */ FileDownloadState UNKNOWN = new FileDownloadState(255);
    private int value;
    private static final FileDownloadState[] allValues;
    private static final /* synthetic */ FileDownloadState[] $VALUES;

    public static FileDownloadState[] values() {
        return null;
    }

    public static FileDownloadState valueOf(String string) {
        return null;
    }

    private FileDownloadState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileDownloadState find(int n) {
        return null;
    }

    private static /* synthetic */ FileDownloadState[] $values() {
        return null;
    }

    static {
        $VALUES = FileDownloadState.$values();
        allValues = FileDownloadState.values();
    }
}

