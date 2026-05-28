/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class CalibrationFileStatus
extends Enum<CalibrationFileStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ CalibrationFileStatus NORMAL = new CalibrationFileStatus(0);
    public static final /* enum */ CalibrationFileStatus ABNORMAL = new CalibrationFileStatus(1);
    public static final /* enum */ CalibrationFileStatus UNKNOWN = new CalibrationFileStatus(255);
    private int value;
    private static final CalibrationFileStatus[] allValues;
    private static final /* synthetic */ CalibrationFileStatus[] $VALUES;

    public static CalibrationFileStatus[] values() {
        return null;
    }

    public static CalibrationFileStatus valueOf(String string) {
        return null;
    }

    private CalibrationFileStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CalibrationFileStatus find(int n) {
        return null;
    }

    private static /* synthetic */ CalibrationFileStatus[] $values() {
        return null;
    }

    static {
        $VALUES = CalibrationFileStatus.$values();
        allValues = CalibrationFileStatus.values();
    }
}

