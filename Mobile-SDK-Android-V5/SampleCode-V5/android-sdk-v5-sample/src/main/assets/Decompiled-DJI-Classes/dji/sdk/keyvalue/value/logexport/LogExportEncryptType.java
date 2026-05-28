/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.logexport;

import dji.jni.JNIProguardKeepTag;

public final class LogExportEncryptType
extends Enum<LogExportEncryptType>
implements JNIProguardKeepTag {
    public static final /* enum */ LogExportEncryptType NONE = new LogExportEncryptType(0);
    public static final /* enum */ LogExportEncryptType XOR = new LogExportEncryptType(1);
    public static final /* enum */ LogExportEncryptType UNKNOWN = new LogExportEncryptType(65535);
    private int value;
    private static final LogExportEncryptType[] allValues;
    private static final /* synthetic */ LogExportEncryptType[] $VALUES;

    public static LogExportEncryptType[] values() {
        return null;
    }

    public static LogExportEncryptType valueOf(String string) {
        return null;
    }

    private LogExportEncryptType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogExportEncryptType find(int n) {
        return null;
    }

    private static /* synthetic */ LogExportEncryptType[] $values() {
        return null;
    }

    static {
        $VALUES = LogExportEncryptType.$values();
        allValues = LogExportEncryptType.values();
    }
}

