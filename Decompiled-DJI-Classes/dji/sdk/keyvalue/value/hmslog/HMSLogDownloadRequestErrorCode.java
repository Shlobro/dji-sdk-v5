/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;

public final class HMSLogDownloadRequestErrorCode
extends Enum<HMSLogDownloadRequestErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSLogDownloadRequestErrorCode NONE = new HMSLogDownloadRequestErrorCode(0);
    public static final /* enum */ HMSLogDownloadRequestErrorCode TIMEOUT = new HMSLogDownloadRequestErrorCode(1);
    public static final /* enum */ HMSLogDownloadRequestErrorCode FAILED = new HMSLogDownloadRequestErrorCode(2);
    public static final /* enum */ HMSLogDownloadRequestErrorCode CANCEL = new HMSLogDownloadRequestErrorCode(3);
    public static final /* enum */ HMSLogDownloadRequestErrorCode BUSY = new HMSLogDownloadRequestErrorCode(4);
    public static final /* enum */ HMSLogDownloadRequestErrorCode NOTSUPPORT = new HMSLogDownloadRequestErrorCode(5);
    public static final /* enum */ HMSLogDownloadRequestErrorCode NOMODULES = new HMSLogDownloadRequestErrorCode(6);
    public static final /* enum */ HMSLogDownloadRequestErrorCode UNKNOWN = new HMSLogDownloadRequestErrorCode(65535);
    private int value;
    private static final HMSLogDownloadRequestErrorCode[] allValues;
    private static final /* synthetic */ HMSLogDownloadRequestErrorCode[] $VALUES;

    public static HMSLogDownloadRequestErrorCode[] values() {
        return null;
    }

    public static HMSLogDownloadRequestErrorCode valueOf(String string) {
        return null;
    }

    private HMSLogDownloadRequestErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSLogDownloadRequestErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ HMSLogDownloadRequestErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = HMSLogDownloadRequestErrorCode.$values();
        allValues = HMSLogDownloadRequestErrorCode.values();
    }
}

