/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.radar;

import dji.jni.JNIProguardKeepTag;

public final class RadarSensitivityLevel
extends Enum<RadarSensitivityLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ RadarSensitivityLevel UNCHANGED = new RadarSensitivityLevel(0);
    public static final /* enum */ RadarSensitivityLevel LEVEL_1 = new RadarSensitivityLevel(1);
    public static final /* enum */ RadarSensitivityLevel LEVEL_2 = new RadarSensitivityLevel(2);
    public static final /* enum */ RadarSensitivityLevel UNKNOWN = new RadarSensitivityLevel(65535);
    private int value;
    private static final RadarSensitivityLevel[] allValues;
    private static final /* synthetic */ RadarSensitivityLevel[] $VALUES;

    public static RadarSensitivityLevel[] values() {
        return null;
    }

    public static RadarSensitivityLevel valueOf(String string) {
        return null;
    }

    private RadarSensitivityLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RadarSensitivityLevel find(int n) {
        return null;
    }

    private static /* synthetic */ RadarSensitivityLevel[] $values() {
        return null;
    }

    static {
        $VALUES = RadarSensitivityLevel.$values();
        allValues = RadarSensitivityLevel.values();
    }
}

