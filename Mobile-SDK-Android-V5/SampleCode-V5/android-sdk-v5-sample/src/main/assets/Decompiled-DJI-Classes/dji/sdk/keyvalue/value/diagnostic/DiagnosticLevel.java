/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.diagnostic;

import dji.jni.JNIProguardKeepTag;

public final class DiagnosticLevel
extends Enum<DiagnosticLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ DiagnosticLevel LEVEL_0 = new DiagnosticLevel(0);
    public static final /* enum */ DiagnosticLevel LEVEL_1 = new DiagnosticLevel(1);
    public static final /* enum */ DiagnosticLevel LEVEL_2 = new DiagnosticLevel(2);
    public static final /* enum */ DiagnosticLevel LEVEL_3 = new DiagnosticLevel(3);
    public static final /* enum */ DiagnosticLevel LEVEL_4 = new DiagnosticLevel(4);
    public static final /* enum */ DiagnosticLevel LEVEL_DEBUG_0 = new DiagnosticLevel(240);
    public static final /* enum */ DiagnosticLevel LEVEL_DEBUG_1 = new DiagnosticLevel(241);
    public static final /* enum */ DiagnosticLevel LEVEL_DEBUG_2 = new DiagnosticLevel(242);
    public static final /* enum */ DiagnosticLevel LEVEL_DEBUG_3 = new DiagnosticLevel(243);
    public static final /* enum */ DiagnosticLevel LEVEL_DEBUG_4 = new DiagnosticLevel(244);
    public static final /* enum */ DiagnosticLevel UNKNOWN = new DiagnosticLevel(65535);
    private int value;
    private static final DiagnosticLevel[] allValues;
    private static final /* synthetic */ DiagnosticLevel[] $VALUES;

    public static DiagnosticLevel[] values() {
        return null;
    }

    public static DiagnosticLevel valueOf(String string) {
        return null;
    }

    private DiagnosticLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DiagnosticLevel find(int n) {
        return null;
    }

    private static /* synthetic */ DiagnosticLevel[] $values() {
        return null;
    }

    static {
        $VALUES = DiagnosticLevel.$values();
        allValues = DiagnosticLevel.values();
    }
}

