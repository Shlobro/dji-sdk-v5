/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.wlm;

import dji.jni.JNIProguardKeepTag;

public final class LogLevel
extends Enum<LogLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ LogLevel FATAL = new LogLevel(0);
    public static final /* enum */ LogLevel ERROR = new LogLevel(1);
    public static final /* enum */ LogLevel WARNING = new LogLevel(2);
    public static final /* enum */ LogLevel INFO = new LogLevel(3);
    public static final /* enum */ LogLevel TRACE = new LogLevel(4);
    public static final /* enum */ LogLevel VERBOSE = new LogLevel(5);
    public static final /* enum */ LogLevel UNKNOWN = new LogLevel(65535);
    private int value;
    private static final LogLevel[] allValues;
    private static final /* synthetic */ LogLevel[] $VALUES;

    public static LogLevel[] values() {
        return null;
    }

    public static LogLevel valueOf(String string) {
        return null;
    }

    private LogLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogLevel find(int n) {
        return null;
    }

    private static /* synthetic */ LogLevel[] $values() {
        return null;
    }

    static {
        $VALUES = LogLevel.$values();
        allValues = LogLevel.values();
    }
}

