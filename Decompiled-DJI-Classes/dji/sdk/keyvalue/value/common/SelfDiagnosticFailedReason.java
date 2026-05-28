/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SelfDiagnosticFailedReason
extends Enum<SelfDiagnosticFailedReason>
implements JNIProguardKeepTag {
    public static final /* enum */ SelfDiagnosticFailedReason NO_ERROR = new SelfDiagnosticFailedReason(0);
    public static final /* enum */ SelfDiagnosticFailedReason RETURN_FAILED = new SelfDiagnosticFailedReason(1);
    public static final /* enum */ SelfDiagnosticFailedReason EXECUTE_TIMEOUT = new SelfDiagnosticFailedReason(2);
    public static final /* enum */ SelfDiagnosticFailedReason TERMINATE = new SelfDiagnosticFailedReason(3);
    public static final /* enum */ SelfDiagnosticFailedReason HEARTBEAT_TIMEOUT = new SelfDiagnosticFailedReason(4);
    public static final /* enum */ SelfDiagnosticFailedReason NOT_SUPPORT = new SelfDiagnosticFailedReason(5);
    public static final /* enum */ SelfDiagnosticFailedReason PARTIAL_FAILED = new SelfDiagnosticFailedReason(6);
    public static final /* enum */ SelfDiagnosticFailedReason UNKNWON = new SelfDiagnosticFailedReason(65535);
    public static final /* enum */ SelfDiagnosticFailedReason UNKNOWN = new SelfDiagnosticFailedReason(65535);
    private int value;
    private static final SelfDiagnosticFailedReason[] allValues;
    private static final /* synthetic */ SelfDiagnosticFailedReason[] $VALUES;

    public static SelfDiagnosticFailedReason[] values() {
        return null;
    }

    public static SelfDiagnosticFailedReason valueOf(String string) {
        return null;
    }

    private SelfDiagnosticFailedReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SelfDiagnosticFailedReason find(int n) {
        return null;
    }

    private static /* synthetic */ SelfDiagnosticFailedReason[] $values() {
        return null;
    }

    static {
        $VALUES = SelfDiagnosticFailedReason.$values();
        allValues = SelfDiagnosticFailedReason.values();
    }
}

