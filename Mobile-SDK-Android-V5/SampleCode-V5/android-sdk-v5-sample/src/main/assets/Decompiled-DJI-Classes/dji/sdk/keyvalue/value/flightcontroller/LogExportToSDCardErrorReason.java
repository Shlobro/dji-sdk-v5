/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LogExportToSDCardErrorReason
extends Enum<LogExportToSDCardErrorReason>
implements JNIProguardKeepTag {
    public static final /* enum */ LogExportToSDCardErrorReason NO_ERROR = new LogExportToSDCardErrorReason(0);
    public static final /* enum */ LogExportToSDCardErrorReason SDCARD_PULL_OUT = new LogExportToSDCardErrorReason(1);
    public static final /* enum */ LogExportToSDCardErrorReason SDCARD_NO_SPACE = new LogExportToSDCardErrorReason(2);
    public static final /* enum */ LogExportToSDCardErrorReason UNKNOWN = new LogExportToSDCardErrorReason(255);
    private int value;
    private static final LogExportToSDCardErrorReason[] allValues;
    private static final /* synthetic */ LogExportToSDCardErrorReason[] $VALUES;

    public static LogExportToSDCardErrorReason[] values() {
        return null;
    }

    public static LogExportToSDCardErrorReason valueOf(String string) {
        return null;
    }

    private LogExportToSDCardErrorReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogExportToSDCardErrorReason find(int n) {
        return null;
    }

    private static /* synthetic */ LogExportToSDCardErrorReason[] $values() {
        return null;
    }

    static {
        $VALUES = LogExportToSDCardErrorReason.$values();
        allValues = LogExportToSDCardErrorReason.values();
    }
}

