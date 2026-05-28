/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LogExportToSDCardState
extends Enum<LogExportToSDCardState>
implements JNIProguardKeepTag {
    public static final /* enum */ LogExportToSDCardState Exporting = new LogExportToSDCardState(0);
    public static final /* enum */ LogExportToSDCardState ExportFinished = new LogExportToSDCardState(1);
    public static final /* enum */ LogExportToSDCardState ExportFailed = new LogExportToSDCardState(2);
    public static final /* enum */ LogExportToSDCardState UNKNOWN = new LogExportToSDCardState(255);
    private int value;
    private static final LogExportToSDCardState[] allValues;
    private static final /* synthetic */ LogExportToSDCardState[] $VALUES;

    public static LogExportToSDCardState[] values() {
        return null;
    }

    public static LogExportToSDCardState valueOf(String string) {
        return null;
    }

    private LogExportToSDCardState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogExportToSDCardState find(int n) {
        return null;
    }

    private static /* synthetic */ LogExportToSDCardState[] $values() {
        return null;
    }

    static {
        $VALUES = LogExportToSDCardState.$values();
        allValues = LogExportToSDCardState.values();
    }
}

