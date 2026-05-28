/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.logexport;

import dji.jni.JNIProguardKeepTag;

public final class LogExportFileSelectAction
extends Enum<LogExportFileSelectAction>
implements JNIProguardKeepTag {
    public static final /* enum */ LogExportFileSelectAction FETCH_SIZE = new LogExportFileSelectAction(0);
    public static final /* enum */ LogExportFileSelectAction COMPRESS = new LogExportFileSelectAction(1);
    public static final /* enum */ LogExportFileSelectAction LIST_LOG = new LogExportFileSelectAction(2);
    public static final /* enum */ LogExportFileSelectAction UNKNOWN = new LogExportFileSelectAction(65535);
    private int value;
    private static final LogExportFileSelectAction[] allValues;
    private static final /* synthetic */ LogExportFileSelectAction[] $VALUES;

    public static LogExportFileSelectAction[] values() {
        return null;
    }

    public static LogExportFileSelectAction valueOf(String string) {
        return null;
    }

    private LogExportFileSelectAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogExportFileSelectAction find(int n) {
        return null;
    }

    private static /* synthetic */ LogExportFileSelectAction[] $values() {
        return null;
    }

    static {
        $VALUES = LogExportFileSelectAction.$values();
        allValues = LogExportFileSelectAction.values();
    }
}

