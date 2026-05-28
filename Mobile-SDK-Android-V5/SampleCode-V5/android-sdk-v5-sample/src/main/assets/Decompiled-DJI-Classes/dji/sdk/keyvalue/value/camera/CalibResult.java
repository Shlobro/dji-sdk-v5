/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CalibResult
extends Enum<CalibResult>
implements JNIProguardKeepTag {
    public static final /* enum */ CalibResult NOT_GENERATED = new CalibResult(0);
    public static final /* enum */ CalibResult SUCCESSFUL = new CalibResult(1);
    public static final /* enum */ CalibResult FAILED = new CalibResult(2);
    public static final /* enum */ CalibResult UNKNOWN = new CalibResult(65535);
    private int value;
    private static final CalibResult[] allValues;
    private static final /* synthetic */ CalibResult[] $VALUES;

    public static CalibResult[] values() {
        return null;
    }

    public static CalibResult valueOf(String string) {
        return null;
    }

    private CalibResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CalibResult find(int n) {
        return null;
    }

    private static /* synthetic */ CalibResult[] $values() {
        return null;
    }

    static {
        $VALUES = CalibResult.$values();
        allValues = CalibResult.values();
    }
}

