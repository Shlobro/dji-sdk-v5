/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.statuscode;

import dji.jni.JNIProguardKeepTag;

public final class StatusCode
extends Enum<StatusCode>
implements JNIProguardKeepTag {
    public static final /* enum */ StatusCode NORMAL_RTK = new StatusCode(0x1F100000);
    public static final /* enum */ StatusCode NORMAL = new StatusCode(0x1F100001);
    public static final /* enum */ StatusCode REMOTE_DISCONNECT = new StatusCode(521142274);
    public static final /* enum */ StatusCode AIRCRAFT_DISCONNECT = new StatusCode(521142275);
    public static final /* enum */ StatusCode MOTOR_STOP_LANDING_IN_AIR = new StatusCode(521142276);
    public static final /* enum */ StatusCode MOTOR_STOP_LANDING_MODE = new StatusCode(521142277);
    public static final /* enum */ StatusCode MC_DATA_ERROR = new StatusCode(521142278);
    public static final /* enum */ StatusCode IMU_CALI = new StatusCode(521142279);
    public static final /* enum */ StatusCode COMPASS_ERROR = new StatusCode(521142280);
    public static final /* enum */ StatusCode ESC_ERROR_SKY = new StatusCode(521142281);
    public static final /* enum */ StatusCode ESC_ERROR = new StatusCode(0x1F100010);
    public static final /* enum */ StatusCode COMPASS_DISTURB = new StatusCode(0x1F100011);
    public static final /* enum */ StatusCode BAROMETER_DEAD = new StatusCode(521142290);
    public static final /* enum */ StatusCode FRONT_VISION_CALI = new StatusCode(521142291);
    public static final /* enum */ StatusCode DOWN_VISION_CALI = new StatusCode(521142292);
    public static final /* enum */ StatusCode BACK_VISION_CALI = new StatusCode(521142293);
    public static final /* enum */ StatusCode VISION_ERROR = new StatusCode(521142294);
    public static final /* enum */ StatusCode BATTERY_CONN_EXCEPTION = new StatusCode(521142295);
    public static final /* enum */ StatusCode BATTERY_EXCEPTION = new StatusCode(521142296);
    public static final /* enum */ StatusCode BATTERY_BROKEN = new StatusCode(521142297);
    public static final /* enum */ StatusCode BATTERY_OVER_CURRENT = new StatusCode(521142304);
    public static final /* enum */ StatusCode BATTERY_OVER_TEMP = new StatusCode(521142305);
    public static final /* enum */ StatusCode BATTERY_LOW_TEMP = new StatusCode(521142306);
    public static final /* enum */ StatusCode BATTERY_SELF_RELEASE = new StatusCode(521142307);
    public static final /* enum */ StatusCode IMU_INITIALIZING = new StatusCode(521142308);
    public static final /* enum */ StatusCode SENSOR_ERROR = new StatusCode(521142309);
    public static final /* enum */ StatusCode IMU_ERROR = new StatusCode(521142310);
    public static final /* enum */ StatusCode IMU_COMPASS_ERROR = new StatusCode(521142311);
    public static final /* enum */ StatusCode IMU_HEATING = new StatusCode(521142312);
    public static final /* enum */ StatusCode DEVICE_LOCK = new StatusCode(521142313);
    public static final /* enum */ StatusCode CANT_TAKEOFF_NOVICE = new StatusCode(521142320);
    public static final /* enum */ StatusCode CANT_TAKEOFF = new StatusCode(521142321);
    public static final /* enum */ StatusCode CANT_TAKEOFF_HMS = new StatusCode(521142322);
    public static final /* enum */ StatusCode SERIOUS_LOW_VOLTAGE_LANDING = new StatusCode(521142323);
    public static final /* enum */ StatusCode SERIOUS_LOW_VOLTAGE = new StatusCode(521142324);
    public static final /* enum */ StatusCode SERIOUS_LOW_POWER_LANDING = new StatusCode(521142325);
    public static final /* enum */ StatusCode SERIOUS_LOW_POWER = new StatusCode(521142326);
    public static final /* enum */ StatusCode SMART_LOW_POWER_LANDING = new StatusCode(521142327);
    public static final /* enum */ StatusCode SMART_LOW_POWER = new StatusCode(521142328);
    public static final /* enum */ StatusCode LOW_VOLTAGE = new StatusCode(521142329);
    public static final /* enum */ StatusCode NOT_ENOUGH_FORCE = new StatusCode(521142336);
    public static final /* enum */ StatusCode GOHOME_FAILED = new StatusCode(521142337);
    public static final /* enum */ StatusCode FAILSAFE_GOHOME = new StatusCode(521142338);
    public static final /* enum */ StatusCode FAILSAFE = new StatusCode(521142339);
    public static final /* enum */ StatusCode LOW_POWER_GOHOME = new StatusCode(521142340);
    public static final /* enum */ StatusCode LOW_POWER = new StatusCode(521142341);
    public static final /* enum */ StatusCode LOW_RC_POWER = new StatusCode(521142342);
    public static final /* enum */ StatusCode LOW_RC_SIGNAL = new StatusCode(521142343);
    public static final /* enum */ StatusCode LOW_RADIO_SIGNAL = new StatusCode(521142344);
    public static final /* enum */ StatusCode RC_SIGNAL_DISTURB = new StatusCode(521142345);
    public static final /* enum */ StatusCode RADIO_SIGNAL_DISTURB = new StatusCode(521142352);
    public static final /* enum */ StatusCode GALE_WARNING = new StatusCode(521142353);
    public static final /* enum */ StatusCode GIMBAL_STUCK = new StatusCode(521142354);
    public static final /* enum */ StatusCode GIMBAL_END_POINT_STUCK = new StatusCode(521142355);
    public static final /* enum */ StatusCode GIMBAL_END_POINT_OVERLOAD = new StatusCode(521142356);
    public static final /* enum */ StatusCode GIMBAL_VIBRATION = new StatusCode(521142357);
    public static final /* enum */ StatusCode IN_NFZ_MAX_HEIGHT = new StatusCode(521142358);
    public static final /* enum */ StatusCode NON_GPS_IN_THE_AIR_NONVISION = new StatusCode(521142359);
    public static final /* enum */ StatusCode NON_GPS_IN_THE_AIR = new StatusCode(521142360);
    public static final /* enum */ StatusCode NON_GPS_NONVISION = new StatusCode(521142361);
    public static final /* enum */ StatusCode NON_GPS = new StatusCode(521142368);
    public static final /* enum */ StatusCode ATTI_STATE_IN_THE_AIR = new StatusCode(521142369);
    public static final /* enum */ StatusCode ATTI_STATE = new StatusCode(521142370);
    public static final /* enum */ StatusCode CHLSTATUS_POOR = new StatusCode(521142371);
    public static final /* enum */ StatusCode GOHOME = new StatusCode(521142372);
    public static final /* enum */ StatusCode NORMAL_IN_THE_AIR_RTK = new StatusCode(521142373);
    public static final /* enum */ StatusCode NORMAL_IN_THE_AIR = new StatusCode(521142374);
    public static final /* enum */ StatusCode AIR_SENSE_WARNING_LEVEL_4 = new StatusCode(521142375);
    public static final /* enum */ StatusCode UNKNOWN = new StatusCode(0x1F2FFFFF);
    private int value;
    private static final StatusCode[] allValues;
    private static final /* synthetic */ StatusCode[] $VALUES;

    public static StatusCode[] values() {
        return null;
    }

    public static StatusCode valueOf(String string) {
        return null;
    }

    private StatusCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static StatusCode find(int n) {
        return null;
    }

    private static /* synthetic */ StatusCode[] $values() {
        return null;
    }

    static {
        $VALUES = StatusCode.$values();
        allValues = StatusCode.values();
    }
}

