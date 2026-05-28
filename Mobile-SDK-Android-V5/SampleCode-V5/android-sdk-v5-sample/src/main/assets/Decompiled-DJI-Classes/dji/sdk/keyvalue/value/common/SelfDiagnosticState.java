/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SelfDiagnosticState
extends Enum<SelfDiagnosticState>
implements JNIProguardKeepTag {
    public static final /* enum */ SelfDiagnosticState IDLE = new SelfDiagnosticState(0);
    public static final /* enum */ SelfDiagnosticState WAITING = new SelfDiagnosticState(1);
    public static final /* enum */ SelfDiagnosticState PROCESSING = new SelfDiagnosticState(2);
    public static final /* enum */ SelfDiagnosticState FINISHED = new SelfDiagnosticState(3);
    public static final /* enum */ SelfDiagnosticState FAILED = new SelfDiagnosticState(255);
    public static final /* enum */ SelfDiagnosticState UNKNWON = new SelfDiagnosticState(65535);
    public static final /* enum */ SelfDiagnosticState UNKNOWN = new SelfDiagnosticState(65535);
    private int value;
    private static final SelfDiagnosticState[] allValues;
    private static final /* synthetic */ SelfDiagnosticState[] $VALUES;

    public static SelfDiagnosticState[] values() {
        return null;
    }

    public static SelfDiagnosticState valueOf(String string) {
        return null;
    }

    private SelfDiagnosticState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SelfDiagnosticState find(int n) {
        return null;
    }

    private static /* synthetic */ SelfDiagnosticState[] $values() {
        return null;
    }

    static {
        $VALUES = SelfDiagnosticState.$values();
        allValues = SelfDiagnosticState.values();
    }
}

