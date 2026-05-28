/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalFFCMode
extends Enum<ThermalFFCMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalFFCMode AUTO = new ThermalFFCMode(0);
    public static final /* enum */ ThermalFFCMode MANUAL = new ThermalFFCMode(1);
    public static final /* enum */ ThermalFFCMode UNKNOWN = new ThermalFFCMode(65535);
    private int value;
    private static final ThermalFFCMode[] allValues;
    private static final /* synthetic */ ThermalFFCMode[] $VALUES;

    public static ThermalFFCMode[] values() {
        return null;
    }

    public static ThermalFFCMode valueOf(String string) {
        return null;
    }

    private ThermalFFCMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalFFCMode find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalFFCMode[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalFFCMode.$values();
        allValues = ThermalFFCMode.values();
    }
}

