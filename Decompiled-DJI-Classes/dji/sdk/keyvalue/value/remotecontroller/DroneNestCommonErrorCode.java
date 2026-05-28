/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestCommonErrorCode
extends Enum<DroneNestCommonErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestCommonErrorCode NO_ERROR = new DroneNestCommonErrorCode(0);
    public static final /* enum */ DroneNestCommonErrorCode NOT_IMPLEMENTED = new DroneNestCommonErrorCode(514100);
    public static final /* enum */ DroneNestCommonErrorCode CLOSE_PUTTER_FAIL = new DroneNestCommonErrorCode(514101);
    public static final /* enum */ DroneNestCommonErrorCode FREE_PUTTER_FAIL = new DroneNestCommonErrorCode(514102);
    public static final /* enum */ DroneNestCommonErrorCode BAT_SOC_LOW = new DroneNestCommonErrorCode(514103);
    public static final /* enum */ DroneNestCommonErrorCode START_CHARGE_FAIL = new DroneNestCommonErrorCode(514104);
    public static final /* enum */ DroneNestCommonErrorCode STOP_CHARGE_FAIL = new DroneNestCommonErrorCode(514105);
    public static final /* enum */ DroneNestCommonErrorCode REBOOT_DRONE_FAIL = new DroneNestCommonErrorCode(514106);
    public static final /* enum */ DroneNestCommonErrorCode OPEN_COVER_FAIL = new DroneNestCommonErrorCode(514107);
    public static final /* enum */ DroneNestCommonErrorCode CLOSE_COVER_FAIL = new DroneNestCommonErrorCode(514108);
    public static final /* enum */ DroneNestCommonErrorCode OPEN_DRONE_FAIL = new DroneNestCommonErrorCode(514109);
    public static final /* enum */ DroneNestCommonErrorCode CLOSE_DRONE_FAIL = new DroneNestCommonErrorCode(514110);
    public static final /* enum */ DroneNestCommonErrorCode START_PADDLE_FAIL = new DroneNestCommonErrorCode(514111);
    public static final /* enum */ DroneNestCommonErrorCode STOP_PADDLE_FAIL = new DroneNestCommonErrorCode(514112);
    public static final /* enum */ DroneNestCommonErrorCode CREATE_CONNECT_FAIL = new DroneNestCommonErrorCode(514113);
    public static final /* enum */ DroneNestCommonErrorCode GET_DRONE_POWER_FAIL = new DroneNestCommonErrorCode(514114);
    public static final /* enum */ DroneNestCommonErrorCode TASK_BUSY = new DroneNestCommonErrorCode(514116);
    public static final /* enum */ DroneNestCommonErrorCode CHECK_COVER_STATE_FAIL = new DroneNestCommonErrorCode(514117);
    public static final /* enum */ DroneNestCommonErrorCode CHECK_PUTTER_STATE_FAIL = new DroneNestCommonErrorCode(514118);
    public static final /* enum */ DroneNestCommonErrorCode GET_NEAR_SWITCH_STATE_FAIL = new DroneNestCommonErrorCode(514119);
    public static final /* enum */ DroneNestCommonErrorCode SDR_CONNECT_FAIL = new DroneNestCommonErrorCode(514120);
    public static final /* enum */ DroneNestCommonErrorCode SCRAM_STATE = new DroneNestCommonErrorCode(514121);
    public static final /* enum */ DroneNestCommonErrorCode GET_CHARGE_STATUS_FAIL = new DroneNestCommonErrorCode(514122);
    public static final /* enum */ DroneNestCommonErrorCode AIRCRAFT_POWER_ON_FAIL = new DroneNestCommonErrorCode(514123);
    public static final /* enum */ DroneNestCommonErrorCode GET_BATTERY_INFO_FAIL = new DroneNestCommonErrorCode(514124);
    public static final /* enum */ DroneNestCommonErrorCode BATTERY_FULL_NOT_CHARGE = new DroneNestCommonErrorCode(514125);
    public static final /* enum */ DroneNestCommonErrorCode COVER_CLOSE_NOT_FULLY = new DroneNestCommonErrorCode(514144);
    public static final /* enum */ DroneNestCommonErrorCode COVER_OPEN_NOT_CHARGE = new DroneNestCommonErrorCode(514154);
    public static final /* enum */ DroneNestCommonErrorCode SYSTEM_INITIALIZING = new DroneNestCommonErrorCode(514170);
    public static final /* enum */ DroneNestCommonErrorCode AIR_CONDITIONNER_STOP_FAIL = new DroneNestCommonErrorCode(514180);
    public static final /* enum */ DroneNestCommonErrorCode AIR_CONDITIONNER_COOL_FAIL = new DroneNestCommonErrorCode(514181);
    public static final /* enum */ DroneNestCommonErrorCode AIR_CONDITIONNER_HEAT_FAIL = new DroneNestCommonErrorCode(514182);
    public static final /* enum */ DroneNestCommonErrorCode AIR_CONDITIONNER_DEHUMIDIFY_FAIL = new DroneNestCommonErrorCode(514183);
    public static final /* enum */ DroneNestCommonErrorCode AIR_CONDITIONNER_TOO_COOL = new DroneNestCommonErrorCode(514184);
    public static final /* enum */ DroneNestCommonErrorCode AIR_CONDITIONNER_TOO_HOT = new DroneNestCommonErrorCode(514185);
    public static final /* enum */ DroneNestCommonErrorCode FOD_CALIBRATION_ERROR_STEP1 = new DroneNestCommonErrorCode(514160);
    public static final /* enum */ DroneNestCommonErrorCode FOD_CALIBRATION_ERROR_STEP2 = new DroneNestCommonErrorCode(514161);
    public static final /* enum */ DroneNestCommonErrorCode UNKNOWN = new DroneNestCommonErrorCode(0xFFFFFFF);
    private int value;
    private static final DroneNestCommonErrorCode[] allValues;
    private static final /* synthetic */ DroneNestCommonErrorCode[] $VALUES;

    public static DroneNestCommonErrorCode[] values() {
        return null;
    }

    public static DroneNestCommonErrorCode valueOf(String string) {
        return null;
    }

    private DroneNestCommonErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestCommonErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestCommonErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestCommonErrorCode.$values();
        allValues = DroneNestCommonErrorCode.values();
    }
}

