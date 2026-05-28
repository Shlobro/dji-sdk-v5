/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SelfDiagnosticMotorAction
extends Enum<SelfDiagnosticMotorAction>
implements JNIProguardKeepTag {
    public static final /* enum */ SelfDiagnosticMotorAction BEEP = new SelfDiagnosticMotorAction(1);
    public static final /* enum */ SelfDiagnosticMotorAction VERY_SLOW_ROTATE = new SelfDiagnosticMotorAction(2);
    public static final /* enum */ SelfDiagnosticMotorAction SLOW_ROTATE = new SelfDiagnosticMotorAction(3);
    public static final /* enum */ SelfDiagnosticMotorAction STOP_ROTATE = new SelfDiagnosticMotorAction(4);
    public static final /* enum */ SelfDiagnosticMotorAction UNKNOWN = new SelfDiagnosticMotorAction(65535);
    private int value;
    private static final SelfDiagnosticMotorAction[] allValues;
    private static final /* synthetic */ SelfDiagnosticMotorAction[] $VALUES;

    public static SelfDiagnosticMotorAction[] values() {
        return null;
    }

    public static SelfDiagnosticMotorAction valueOf(String string) {
        return null;
    }

    private SelfDiagnosticMotorAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SelfDiagnosticMotorAction find(int n) {
        return null;
    }

    private static /* synthetic */ SelfDiagnosticMotorAction[] $values() {
        return null;
    }

    static {
        $VALUES = SelfDiagnosticMotorAction.$values();
        allValues = SelfDiagnosticMotorAction.values();
    }
}

