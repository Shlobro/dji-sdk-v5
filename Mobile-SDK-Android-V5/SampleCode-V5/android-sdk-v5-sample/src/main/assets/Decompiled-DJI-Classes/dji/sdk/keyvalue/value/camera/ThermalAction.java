/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalAction
extends Enum<ThermalAction>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalAction RESERVED = new ThermalAction(0);
    public static final /* enum */ ThermalAction CLOSING_WIFI = new ThermalAction(1);
    public static final /* enum */ ThermalAction UNKNOWN = new ThermalAction(65535);
    private int value;
    private static final ThermalAction[] allValues;
    private static final /* synthetic */ ThermalAction[] $VALUES;

    public static ThermalAction[] values() {
        return null;
    }

    public static ThermalAction valueOf(String string) {
        return null;
    }

    private ThermalAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalAction find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalAction[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalAction.$values();
        allValues = ThermalAction.values();
    }
}

