/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class CalibrationFileUpdateState
extends Enum<CalibrationFileUpdateState>
implements JNIProguardKeepTag {
    public static final /* enum */ CalibrationFileUpdateState PREPARE = new CalibrationFileUpdateState(0);
    public static final /* enum */ CalibrationFileUpdateState TRANSFER = new CalibrationFileUpdateState(1);
    public static final /* enum */ CalibrationFileUpdateState VERIFY = new CalibrationFileUpdateState(2);
    public static final /* enum */ CalibrationFileUpdateState FAILED = new CalibrationFileUpdateState(3);
    public static final /* enum */ CalibrationFileUpdateState SUCCESSFUL = new CalibrationFileUpdateState(4);
    public static final /* enum */ CalibrationFileUpdateState UNKNOWN = new CalibrationFileUpdateState(255);
    private int value;
    private static final CalibrationFileUpdateState[] allValues;
    private static final /* synthetic */ CalibrationFileUpdateState[] $VALUES;

    public static CalibrationFileUpdateState[] values() {
        return null;
    }

    public static CalibrationFileUpdateState valueOf(String string) {
        return null;
    }

    private CalibrationFileUpdateState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CalibrationFileUpdateState find(int n) {
        return null;
    }

    private static /* synthetic */ CalibrationFileUpdateState[] $values() {
        return null;
    }

    static {
        $VALUES = CalibrationFileUpdateState.$values();
        allValues = CalibrationFileUpdateState.values();
    }
}

