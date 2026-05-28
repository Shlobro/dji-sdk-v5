/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ChipOverHeatLevel
extends Enum<ChipOverHeatLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ ChipOverHeatLevel PROTECT_ON_GROUND = new ChipOverHeatLevel(0);
    public static final /* enum */ ChipOverHeatLevel SERIOUS_ON_GROUND = new ChipOverHeatLevel(1);
    public static final /* enum */ ChipOverHeatLevel PROTECT_IN_AIR = new ChipOverHeatLevel(2);
    public static final /* enum */ ChipOverHeatLevel SERIOUS_IN_AIR = new ChipOverHeatLevel(3);
    public static final /* enum */ ChipOverHeatLevel UNKNOWN = new ChipOverHeatLevel(65535);
    private int value;
    private static final ChipOverHeatLevel[] allValues;
    private static final /* synthetic */ ChipOverHeatLevel[] $VALUES;

    public static ChipOverHeatLevel[] values() {
        return null;
    }

    public static ChipOverHeatLevel valueOf(String string) {
        return null;
    }

    private ChipOverHeatLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ChipOverHeatLevel find(int n) {
        return null;
    }

    private static /* synthetic */ ChipOverHeatLevel[] $values() {
        return null;
    }

    static {
        $VALUES = ChipOverHeatLevel.$values();
        allValues = ChipOverHeatLevel.values();
    }
}

