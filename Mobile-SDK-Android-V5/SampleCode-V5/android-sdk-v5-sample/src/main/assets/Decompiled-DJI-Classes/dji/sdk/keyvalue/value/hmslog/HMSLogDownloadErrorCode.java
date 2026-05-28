/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;

public final class HMSLogDownloadErrorCode
extends Enum<HMSLogDownloadErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSLogDownloadErrorCode DOWNLOAD_FAILED = new HMSLogDownloadErrorCode(0);
    public static final /* enum */ HMSLogDownloadErrorCode UNKNOWN = new HMSLogDownloadErrorCode(65535);
    private int value;
    private static final HMSLogDownloadErrorCode[] allValues;
    private static final /* synthetic */ HMSLogDownloadErrorCode[] $VALUES;

    public static HMSLogDownloadErrorCode[] values() {
        return null;
    }

    public static HMSLogDownloadErrorCode valueOf(String string) {
        return null;
    }

    private HMSLogDownloadErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSLogDownloadErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ HMSLogDownloadErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = HMSLogDownloadErrorCode.$values();
        allValues = HMSLogDownloadErrorCode.values();
    }
}

