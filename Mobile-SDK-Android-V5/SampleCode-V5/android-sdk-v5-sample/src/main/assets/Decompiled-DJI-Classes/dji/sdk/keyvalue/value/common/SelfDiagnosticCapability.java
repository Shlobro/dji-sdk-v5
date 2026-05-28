/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SelfDiagnosticCapability
extends Enum<SelfDiagnosticCapability>
implements JNIProguardKeepTag {
    public static final /* enum */ SelfDiagnosticCapability SELF_TEST = new SelfDiagnosticCapability(1);
    public static final /* enum */ SelfDiagnosticCapability ACTION = new SelfDiagnosticCapability(2);
    public static final /* enum */ SelfDiagnosticCapability UNKNWON = new SelfDiagnosticCapability(65535);
    public static final /* enum */ SelfDiagnosticCapability UNKNOWN = new SelfDiagnosticCapability(65535);
    private int value;
    private static final SelfDiagnosticCapability[] allValues;
    private static final /* synthetic */ SelfDiagnosticCapability[] $VALUES;

    public static SelfDiagnosticCapability[] values() {
        return null;
    }

    public static SelfDiagnosticCapability valueOf(String string) {
        return null;
    }

    private SelfDiagnosticCapability(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SelfDiagnosticCapability find(int n) {
        return null;
    }

    private static /* synthetic */ SelfDiagnosticCapability[] $values() {
        return null;
    }

    static {
        $VALUES = SelfDiagnosticCapability.$values();
        allValues = SelfDiagnosticCapability.values();
    }
}

