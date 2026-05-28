/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SelfDiagnosticCmd
extends Enum<SelfDiagnosticCmd>
implements JNIProguardKeepTag {
    public static final /* enum */ SelfDiagnosticCmd DEFAULT_ENTER = new SelfDiagnosticCmd(0);
    public static final /* enum */ SelfDiagnosticCmd DIAGNOSTIC_ENTER = new SelfDiagnosticCmd(1);
    public static final /* enum */ SelfDiagnosticCmd QUERY = new SelfDiagnosticCmd(2);
    public static final /* enum */ SelfDiagnosticCmd UNKNOWN = new SelfDiagnosticCmd(65535);
    private int value;
    private static final SelfDiagnosticCmd[] allValues;
    private static final /* synthetic */ SelfDiagnosticCmd[] $VALUES;

    public static SelfDiagnosticCmd[] values() {
        return null;
    }

    public static SelfDiagnosticCmd valueOf(String string) {
        return null;
    }

    private SelfDiagnosticCmd(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SelfDiagnosticCmd find(int n) {
        return null;
    }

    private static /* synthetic */ SelfDiagnosticCmd[] $values() {
        return null;
    }

    static {
        $VALUES = SelfDiagnosticCmd.$values();
        allValues = SelfDiagnosticCmd.values();
    }
}

