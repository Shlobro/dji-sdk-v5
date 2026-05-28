/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.logexport;

import dji.jni.JNIProguardKeepTag;

public final class LogExportFtpControlRetCode
extends Enum<LogExportFtpControlRetCode>
implements JNIProguardKeepTag {
    public static final /* enum */ LogExportFtpControlRetCode CONTROL_SUCCESS = new LogExportFtpControlRetCode(0);
    public static final /* enum */ LogExportFtpControlRetCode CONTROL_IN_PROCESS = new LogExportFtpControlRetCode(253);
    public static final /* enum */ LogExportFtpControlRetCode CONTROL_ILLEGAL = new LogExportFtpControlRetCode(254);
    public static final /* enum */ LogExportFtpControlRetCode CONTROL_FAILURE = new LogExportFtpControlRetCode(255);
    public static final /* enum */ LogExportFtpControlRetCode UNKNOWN = new LogExportFtpControlRetCode(65535);
    private int value;
    private static final LogExportFtpControlRetCode[] allValues;
    private static final /* synthetic */ LogExportFtpControlRetCode[] $VALUES;

    public static LogExportFtpControlRetCode[] values() {
        return null;
    }

    public static LogExportFtpControlRetCode valueOf(String string) {
        return null;
    }

    private LogExportFtpControlRetCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogExportFtpControlRetCode find(int n) {
        return null;
    }

    private static /* synthetic */ LogExportFtpControlRetCode[] $values() {
        return null;
    }

    static {
        $VALUES = LogExportFtpControlRetCode.$values();
        allValues = LogExportFtpControlRetCode.values();
    }
}

