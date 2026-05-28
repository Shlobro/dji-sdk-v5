/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.logexport;

import dji.jni.JNIProguardKeepTag;

public final class LogExportSender
extends Enum<LogExportSender>
implements JNIProguardKeepTag {
    public static final /* enum */ LogExportSender MASTER_E1E = new LogExportSender(0);
    public static final /* enum */ LogExportSender SLAVE_E1E = new LogExportSender(1);
    public static final /* enum */ LogExportSender PIGEON_GND = new LogExportSender(2);
    public static final /* enum */ LogExportSender PIGEON_3399 = new LogExportSender(3);
    public static final /* enum */ LogExportSender UNKNOWN = new LogExportSender(65535);
    private int value;
    private static final LogExportSender[] allValues;
    private static final /* synthetic */ LogExportSender[] $VALUES;

    public static LogExportSender[] values() {
        return null;
    }

    public static LogExportSender valueOf(String string) {
        return null;
    }

    private LogExportSender(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogExportSender find(int n) {
        return null;
    }

    private static /* synthetic */ LogExportSender[] $values() {
        return null;
    }

    static {
        $VALUES = LogExportSender.$values();
        allValues = LogExportSender.values();
    }
}

