/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestAirConditionnerMode
extends Enum<DroneNestAirConditionnerMode>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestAirConditionnerMode AIR_CONDITIONNER_IDLE_MODE = new DroneNestAirConditionnerMode(0);
    public static final /* enum */ DroneNestAirConditionnerMode AIR_CONDITIONNER_REFRIGERATION_MODE = new DroneNestAirConditionnerMode(1);
    public static final /* enum */ DroneNestAirConditionnerMode AIR_CONDITIONNER_HEAT_MODE = new DroneNestAirConditionnerMode(2);
    public static final /* enum */ DroneNestAirConditionnerMode AIR_CONDITIONNER_DEHUMIDIFICATION_MODE = new DroneNestAirConditionnerMode(3);
    public static final /* enum */ DroneNestAirConditionnerMode AIR_CONDITIONNER_STANDBY_MODE = new DroneNestAirConditionnerMode(4);
    public static final /* enum */ DroneNestAirConditionnerMode AIR_CONDITIONNER_WIND_MODE = new DroneNestAirConditionnerMode(5);
    public static final /* enum */ DroneNestAirConditionnerMode UNKNOWN = new DroneNestAirConditionnerMode(65535);
    private int value;
    private static final DroneNestAirConditionnerMode[] allValues;
    private static final /* synthetic */ DroneNestAirConditionnerMode[] $VALUES;

    public static DroneNestAirConditionnerMode[] values() {
        return null;
    }

    public static DroneNestAirConditionnerMode valueOf(String string) {
        return null;
    }

    private DroneNestAirConditionnerMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestAirConditionnerMode find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestAirConditionnerMode[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestAirConditionnerMode.$values();
        allValues = DroneNestAirConditionnerMode.values();
    }
}

