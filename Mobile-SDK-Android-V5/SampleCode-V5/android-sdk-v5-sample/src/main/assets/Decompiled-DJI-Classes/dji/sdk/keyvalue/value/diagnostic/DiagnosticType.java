/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.diagnostic;

import dji.jni.JNIProguardKeepTag;

public final class DiagnosticType
extends Enum<DiagnosticType>
implements JNIProguardKeepTag {
    public static final /* enum */ DiagnosticType STATE = new DiagnosticType(0);
    public static final /* enum */ DiagnosticType EVENT = new DiagnosticType(1);
    public static final /* enum */ DiagnosticType UNKNOWN = new DiagnosticType(65535);
    private int value;
    private static final DiagnosticType[] allValues;
    private static final /* synthetic */ DiagnosticType[] $VALUES;

    public static DiagnosticType[] values() {
        return null;
    }

    public static DiagnosticType valueOf(String string) {
        return null;
    }

    private DiagnosticType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DiagnosticType find(int n) {
        return null;
    }

    private static /* synthetic */ DiagnosticType[] $values() {
        return null;
    }

    static {
        $VALUES = DiagnosticType.$values();
        allValues = DiagnosticType.values();
    }
}

