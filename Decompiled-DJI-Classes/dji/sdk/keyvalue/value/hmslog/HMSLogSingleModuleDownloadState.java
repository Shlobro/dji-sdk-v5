/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;

public final class HMSLogSingleModuleDownloadState
extends Enum<HMSLogSingleModuleDownloadState>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSLogSingleModuleDownloadState INIT = new HMSLogSingleModuleDownloadState(0);
    public static final /* enum */ HMSLogSingleModuleDownloadState DOWNLOADING = new HMSLogSingleModuleDownloadState(1);
    public static final /* enum */ HMSLogSingleModuleDownloadState DOWNLOAD_SUCCESS = new HMSLogSingleModuleDownloadState(2);
    public static final /* enum */ HMSLogSingleModuleDownloadState DOWNLOAD_FAILED = new HMSLogSingleModuleDownloadState(3);
    public static final /* enum */ HMSLogSingleModuleDownloadState UNKNOWN = new HMSLogSingleModuleDownloadState(65535);
    private int value;
    private static final HMSLogSingleModuleDownloadState[] allValues;
    private static final /* synthetic */ HMSLogSingleModuleDownloadState[] $VALUES;

    public static HMSLogSingleModuleDownloadState[] values() {
        return null;
    }

    public static HMSLogSingleModuleDownloadState valueOf(String string) {
        return null;
    }

    private HMSLogSingleModuleDownloadState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSLogSingleModuleDownloadState find(int n) {
        return null;
    }

    private static /* synthetic */ HMSLogSingleModuleDownloadState[] $values() {
        return null;
    }

    static {
        $VALUES = HMSLogSingleModuleDownloadState.$values();
        allValues = HMSLogSingleModuleDownloadState.values();
    }
}

