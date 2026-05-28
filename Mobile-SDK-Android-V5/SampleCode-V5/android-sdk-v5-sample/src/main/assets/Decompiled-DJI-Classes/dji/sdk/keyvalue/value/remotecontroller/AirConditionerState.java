/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class AirConditionerState
extends Enum<AirConditionerState>
implements JNIProguardKeepTag {
    public static final /* enum */ AirConditionerState IDLE = new AirConditionerState(0);
    public static final /* enum */ AirConditionerState COOLING = new AirConditionerState(1);
    public static final /* enum */ AirConditionerState HEATING = new AirConditionerState(2);
    public static final /* enum */ AirConditionerState DEHUMIDIFYING = new AirConditionerState(3);
    public static final /* enum */ AirConditionerState COOL_EXITING = new AirConditionerState(4);
    public static final /* enum */ AirConditionerState HEAT_EXITING = new AirConditionerState(5);
    public static final /* enum */ AirConditionerState DEHUMIDIFY_EXITING = new AirConditionerState(6);
    public static final /* enum */ AirConditionerState COOL_PREPARE = new AirConditionerState(7);
    public static final /* enum */ AirConditionerState HEAT_PREPARE = new AirConditionerState(8);
    public static final /* enum */ AirConditionerState DEHUMIDIFY_PREPARE = new AirConditionerState(9);
    public static final /* enum */ AirConditionerState AIR_COOL_PREPARE = new AirConditionerState(10);
    public static final /* enum */ AirConditionerState AIR_COOLING = new AirConditionerState(11);
    public static final /* enum */ AirConditionerState AIR_COOL_EXITING = new AirConditionerState(12);
    public static final /* enum */ AirConditionerState ERROR = new AirConditionerState(255);
    public static final /* enum */ AirConditionerState UNKNOWN = new AirConditionerState(65535);
    private int value;
    private static final AirConditionerState[] allValues;
    private static final /* synthetic */ AirConditionerState[] $VALUES;

    public static AirConditionerState[] values() {
        return null;
    }

    public static AirConditionerState valueOf(String string) {
        return null;
    }

    private AirConditionerState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AirConditionerState find(int n) {
        return null;
    }

    private static /* synthetic */ AirConditionerState[] $values() {
        return null;
    }

    static {
        $VALUES = AirConditionerState.$values();
        allValues = AirConditionerState.values();
    }
}

