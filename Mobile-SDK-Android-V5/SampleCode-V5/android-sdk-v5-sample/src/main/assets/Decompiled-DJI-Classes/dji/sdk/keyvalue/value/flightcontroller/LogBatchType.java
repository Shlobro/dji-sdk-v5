/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LogBatchType
extends Enum<LogBatchType>
implements JNIProguardKeepTag {
    public static final /* enum */ LogBatchType CURRENT_FLIGHT = new LogBatchType(0);
    public static final /* enum */ LogBatchType PREVIOUS_FLIGHT = new LogBatchType(1);
    public static final /* enum */ LogBatchType UNKNOWN = new LogBatchType(65535);
    private int value;
    private static final LogBatchType[] allValues;
    private static final /* synthetic */ LogBatchType[] $VALUES;

    public static LogBatchType[] values() {
        return null;
    }

    public static LogBatchType valueOf(String string) {
        return null;
    }

    private LogBatchType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LogBatchType find(int n) {
        return null;
    }

    private static /* synthetic */ LogBatchType[] $values() {
        return null;
    }

    static {
        $VALUES = LogBatchType.$values();
        allValues = LogBatchType.values();
    }
}

