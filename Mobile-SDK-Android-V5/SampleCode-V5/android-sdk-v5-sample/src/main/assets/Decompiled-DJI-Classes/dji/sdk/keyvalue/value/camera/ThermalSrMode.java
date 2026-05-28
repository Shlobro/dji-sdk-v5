/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalSrMode
extends Enum<ThermalSrMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalSrMode OFF = new ThermalSrMode(0);
    public static final /* enum */ ThermalSrMode ON = new ThermalSrMode(1);
    public static final /* enum */ ThermalSrMode UNKNOWN = new ThermalSrMode(65535);
    private int value;
    private static final ThermalSrMode[] allValues;
    private static final /* synthetic */ ThermalSrMode[] $VALUES;

    public static ThermalSrMode[] values() {
        return null;
    }

    public static ThermalSrMode valueOf(String string) {
        return null;
    }

    private ThermalSrMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalSrMode find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalSrMode[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalSrMode.$values();
        allValues = ThermalSrMode.values();
    }
}

