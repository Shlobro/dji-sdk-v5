/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.diagnostic;

import dji.jni.JNIProguardKeepTag;

public final class DiagnosticComponentType
extends Enum<DiagnosticComponentType>
implements JNIProguardKeepTag {
    public static final /* enum */ DiagnosticComponentType CAMERA = new DiagnosticComponentType(1);
    public static final /* enum */ DiagnosticComponentType FC = new DiagnosticComponentType(3);
    public static final /* enum */ DiagnosticComponentType GIMBAL = new DiagnosticComponentType(4);
    public static final /* enum */ DiagnosticComponentType RC = new DiagnosticComponentType(6);
    public static final /* enum */ DiagnosticComponentType AIRLINK = new DiagnosticComponentType(8);
    public static final /* enum */ DiagnosticComponentType BATTERY = new DiagnosticComponentType(11);
    public static final /* enum */ DiagnosticComponentType VISION = new DiagnosticComponentType(18);
    public static final /* enum */ DiagnosticComponentType NAVIGATION = new DiagnosticComponentType(80);
    public static final /* enum */ DiagnosticComponentType PRODUCT = new DiagnosticComponentType(90);
    public static final /* enum */ DiagnosticComponentType UNKNOWN = new DiagnosticComponentType(65535);
    private int value;
    private static final DiagnosticComponentType[] allValues;
    private static final /* synthetic */ DiagnosticComponentType[] $VALUES;

    public static DiagnosticComponentType[] values() {
        return null;
    }

    public static DiagnosticComponentType valueOf(String string) {
        return null;
    }

    private DiagnosticComponentType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DiagnosticComponentType find(int n) {
        return null;
    }

    private static /* synthetic */ DiagnosticComponentType[] $values() {
        return null;
    }

    static {
        $VALUES = DiagnosticComponentType.$values();
        allValues = DiagnosticComponentType.values();
    }
}

