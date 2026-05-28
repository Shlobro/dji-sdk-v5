/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.logexport;

import dji.jni.JNIProguardKeepTag;

public final class LogExportFileSelectRetCode
extends Enum<LogExportFileSelectRetCode>
implements JNIProguardKeepTag {
    public static final /* enum */ LogExportFileSelectRetCode SELECT_SUCCESS = new LogExportFileSelectRetCode(0);
    public static final /* enum */ LogExportFileSelectRetCode SELECT_INVALID = new LogExportFileSelectRetCode(250);
    public static final /* enum */ LogExportFileSelectRetCode SELECT_OVER_SIZE = new LogExportFileSelectRetCode(251);
    public static final /* enum */ LogExportFileSelectRetCode SELECT_NO_MEMORY = new LogExportFileSelectRetCode(252);
    public static final /* enum */ LogExportFileSelectRetCode SELECT_PROCESSING = new LogExportFileSelectRetCode(253);
    public static final /* enum */ LogExportFileSelectRetCode SELECT_NEED_START = new LogExportFileSelectRetCode(254);
    public static final /* enum */ LogExportFileSelectRetCode SELECT_FAILURE = new LogExportFileSelectRetCode(255);
    public static final /* enum */ LogExportFileSelectRetCode UNKNOWN = new LogExportFileSelectRetCode(65535);
    private int value;
    private static final LogExportFileSelectRetCode[] allValues;
    private static final /* synthetic */ LogExportFileSelectRetCode[] $VALUES;

    public static LogExportFileSelectRetCode[] values() {
        return null;
    }

    public static LogExportFileSelectRetCode valueOf(String string) {
        return null;
    }

    private LogExportFileSelectRetCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogExportFileSelectRetCode find(int n) {
        return null;
    }

    private static /* synthetic */ LogExportFileSelectRetCode[] $values() {
        return null;
    }

    static {
        $VALUES = LogExportFileSelectRetCode.$values();
        allValues = LogExportFileSelectRetCode.values();
    }
}

