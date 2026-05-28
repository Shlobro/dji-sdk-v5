/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalScene
extends Enum<ThermalScene>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalScene LINEAR = new ThermalScene(0);
    public static final /* enum */ ThermalScene DEFAULT = new ThermalScene(1);
    public static final /* enum */ ThermalScene SEA_SKY = new ThermalScene(2);
    public static final /* enum */ ThermalScene OUTDOOR = new ThermalScene(3);
    public static final /* enum */ ThermalScene INDOOR = new ThermalScene(4);
    public static final /* enum */ ThermalScene MANUAL = new ThermalScene(5);
    public static final /* enum */ ThermalScene PROFILE1 = new ThermalScene(6);
    public static final /* enum */ ThermalScene PROFILE2 = new ThermalScene(7);
    public static final /* enum */ ThermalScene PROFILE3 = new ThermalScene(8);
    public static final /* enum */ ThermalScene INSPECTION = new ThermalScene(9);
    public static final /* enum */ ThermalScene UNKNOWN = new ThermalScene(65535);
    private int value;
    private static final ThermalScene[] allValues;
    private static final /* synthetic */ ThermalScene[] $VALUES;

    public static ThermalScene[] values() {
        return null;
    }

    public static ThermalScene valueOf(String string) {
        return null;
    }

    private ThermalScene(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalScene find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalScene[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalScene.$values();
        allValues = ThermalScene.values();
    }
}

