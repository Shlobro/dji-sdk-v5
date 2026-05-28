/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.diagnostic;

import dji.sdk.keyvalue.value.statuscode.StatusCode;
import dji.v5.manager.diagnostic.IDJIDeviceStatus;
import dji.v5.manager.diagnostic.WarningLevel;

public final class DJIDeviceStatus
extends Enum<DJIDeviceStatus>
implements IDJIDeviceStatus {
    public static final /* enum */ DJIDeviceStatus NORMAL_RTK = new DJIDeviceStatus(StatusCode.NORMAL_RTK.value(), WarningLevel.NORMAL);
    public static final /* enum */ DJIDeviceStatus NORMAL = new DJIDeviceStatus(StatusCode.NORMAL.value(), WarningLevel.NORMAL);
    public static final /* enum */ DJIDeviceStatus REMOTE_DISCONNECT = new DJIDeviceStatus(StatusCode.REMOTE_DISCONNECT.value(), WarningLevel.NOTICE);
    public static final /* enum */ DJIDeviceStatus AIRCRAFT_DISCONNECT = new DJIDeviceStatus(StatusCode.AIRCRAFT_DISCONNECT.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus MOTOR_STOP_LANDING_IN_AIR = new DJIDeviceStatus(StatusCode.MOTOR_STOP_LANDING_IN_AIR.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus MOTOR_STOP_LANDING_MODE = new DJIDeviceStatus(StatusCode.MOTOR_STOP_LANDING_MODE.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus MC_DATA_ERROR = new DJIDeviceStatus(StatusCode.MC_DATA_ERROR.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus IMU_CALI = new DJIDeviceStatus(StatusCode.IMU_CALI.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus COMPASS_ERROR = new DJIDeviceStatus(StatusCode.COMPASS_ERROR.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus ESC_ERROR_SKY = new DJIDeviceStatus(StatusCode.ESC_ERROR_SKY.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus ESC_ERROR = new DJIDeviceStatus(StatusCode.ESC_ERROR.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus COMPASS_DISTURB = new DJIDeviceStatus(StatusCode.COMPASS_DISTURB.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus FRONT_VISION_CALI = new DJIDeviceStatus(StatusCode.FRONT_VISION_CALI.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus DOWN_VISION_CALI = new DJIDeviceStatus(StatusCode.DOWN_VISION_CALI.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus BACK_VISION_CALI = new DJIDeviceStatus(StatusCode.BACK_VISION_CALI.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus VISION_ERROR = new DJIDeviceStatus(StatusCode.VISION_ERROR.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus BATTERY_CONN_EXCEPTION = new DJIDeviceStatus(StatusCode.BATTERY_CONN_EXCEPTION.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus BATTERY_EXCEPTION = new DJIDeviceStatus(StatusCode.BATTERY_EXCEPTION.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus BATTERY_BROKEN = new DJIDeviceStatus(StatusCode.BATTERY_BROKEN.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus BATTERY_OVER_CURRENT = new DJIDeviceStatus(StatusCode.BATTERY_OVER_CURRENT.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus BATTERY_OVER_TEMP = new DJIDeviceStatus(StatusCode.BATTERY_OVER_TEMP.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus BATTERY_LOW_TEMP = new DJIDeviceStatus(StatusCode.BATTERY_LOW_TEMP.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus BATTERY_SELF_RELEASE = new DJIDeviceStatus(StatusCode.BATTERY_SELF_RELEASE.value(), WarningLevel.NORMAL);
    public static final /* enum */ DJIDeviceStatus IMU_INITIALIZING = new DJIDeviceStatus(StatusCode.IMU_INITIALIZING.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus SENSOR_ERROR = new DJIDeviceStatus(StatusCode.SENSOR_ERROR.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus IMU_ERROR = new DJIDeviceStatus(StatusCode.IMU_ERROR.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus IMU_COMPASS_ERROR = new DJIDeviceStatus(StatusCode.IMU_COMPASS_ERROR.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus IMU_HEATING = new DJIDeviceStatus(StatusCode.IMU_HEATING.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus DEVICE_LOCK = new DJIDeviceStatus(StatusCode.DEVICE_LOCK.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus CANT_TAKEOFF_NOVICE = new DJIDeviceStatus(StatusCode.CANT_TAKEOFF_NOVICE.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus CANT_TAKEOFF = new DJIDeviceStatus(StatusCode.CANT_TAKEOFF.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus CANT_TAKEOFF_HMS = new DJIDeviceStatus(StatusCode.CANT_TAKEOFF_HMS.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus SERIOUS_LOW_VOLTAGE_LANDING = new DJIDeviceStatus(StatusCode.SERIOUS_LOW_VOLTAGE_LANDING.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus SERIOUS_LOW_VOLTAGE = new DJIDeviceStatus(StatusCode.SERIOUS_LOW_VOLTAGE.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus SERIOUS_LOW_POWER_LANDING = new DJIDeviceStatus(StatusCode.SERIOUS_LOW_POWER_LANDING.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus SERIOUS_LOW_POWER = new DJIDeviceStatus(StatusCode.SERIOUS_LOW_POWER.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus SMART_LOW_POWER_LANDING = new DJIDeviceStatus(StatusCode.SMART_LOW_POWER_LANDING.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus SMART_LOW_POWER = new DJIDeviceStatus(StatusCode.SMART_LOW_POWER.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus LOW_VOLTAGE = new DJIDeviceStatus(StatusCode.LOW_VOLTAGE.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus NOT_ENOUGH_FORCE = new DJIDeviceStatus(StatusCode.NOT_ENOUGH_FORCE.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus GOHOME_FAILED = new DJIDeviceStatus(StatusCode.GOHOME_FAILED.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus FAILSAFE_GOHOME = new DJIDeviceStatus(StatusCode.FAILSAFE_GOHOME.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus FAILSAFE = new DJIDeviceStatus(StatusCode.FAILSAFE.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus LOW_POWER_GOHOME = new DJIDeviceStatus(StatusCode.LOW_POWER_GOHOME.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus LOW_POWER = new DJIDeviceStatus(StatusCode.LOW_POWER.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus LOW_RC_POWER = new DJIDeviceStatus(StatusCode.LOW_RC_POWER.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus LOW_RC_SIGNAL = new DJIDeviceStatus(StatusCode.LOW_RC_SIGNAL.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus LOW_RADIO_SIGNAL = new DJIDeviceStatus(StatusCode.LOW_RADIO_SIGNAL.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus RC_SIGNAL_DISTURB = new DJIDeviceStatus(StatusCode.RC_SIGNAL_DISTURB.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus RADIO_SIGNAL_DISTURB = new DJIDeviceStatus(StatusCode.RADIO_SIGNAL_DISTURB.value(), WarningLevel.SERIOUS_WARNING);
    public static final /* enum */ DJIDeviceStatus GALE_WARNING = new DJIDeviceStatus(StatusCode.GALE_WARNING.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus GIMBAL_STUCK = new DJIDeviceStatus(StatusCode.GIMBAL_STUCK.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus GIMBAL_END_POINT_STUCK = new DJIDeviceStatus(StatusCode.GIMBAL_END_POINT_STUCK.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus GIMBAL_END_POINT_OVERLOAD = new DJIDeviceStatus(StatusCode.GIMBAL_END_POINT_OVERLOAD.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus GIMBAL_VIBRATION = new DJIDeviceStatus(StatusCode.GIMBAL_VIBRATION.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus IN_NFZ_MAX_HEIGHT = new DJIDeviceStatus(StatusCode.IN_NFZ_MAX_HEIGHT.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus NON_GPS_IN_THE_AIR_NONVISION = new DJIDeviceStatus(StatusCode.NON_GPS_IN_THE_AIR_NONVISION.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus NON_GPS_IN_THE_AIR = new DJIDeviceStatus(StatusCode.NON_GPS_IN_THE_AIR.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus NON_GPS_NONVISION = new DJIDeviceStatus(StatusCode.NON_GPS_NONVISION.value(), WarningLevel.NORMAL);
    public static final /* enum */ DJIDeviceStatus NON_GPS = new DJIDeviceStatus(StatusCode.NON_GPS.value(), WarningLevel.NORMAL);
    public static final /* enum */ DJIDeviceStatus ATTI_STATE_IN_THE_AIR = new DJIDeviceStatus(StatusCode.ATTI_STATE_IN_THE_AIR.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus ATTI_STATE = new DJIDeviceStatus(StatusCode.ATTI_STATE.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus CHLSTATUS_POOR = new DJIDeviceStatus(StatusCode.CHLSTATUS_POOR.value(), WarningLevel.WARNING);
    public static final /* enum */ DJIDeviceStatus GOHOME = new DJIDeviceStatus(StatusCode.GOHOME.value(), WarningLevel.NORMAL);
    public static final /* enum */ DJIDeviceStatus NORMAL_IN_THE_AIR_RTK = new DJIDeviceStatus(StatusCode.NORMAL_IN_THE_AIR_RTK.value(), WarningLevel.NORMAL);
    public static final /* enum */ DJIDeviceStatus NORMAL_IN_THE_AIR = new DJIDeviceStatus(StatusCode.NORMAL_IN_THE_AIR.value(), WarningLevel.NORMAL);
    public static final /* enum */ DJIDeviceStatus AIR_SENSE_WARNING_LEVEL_4 = new DJIDeviceStatus(StatusCode.AIR_SENSE_WARNING_LEVEL_4.value(), WarningLevel.NORMAL);
    public static final /* enum */ DJIDeviceStatus UNKNOWN = new DJIDeviceStatus(StatusCode.UNKNOWN.value(), WarningLevel.WARNING);
    private final String code;
    private final WarningLevel warningLevel;
    private String description;
    private static final DJIDeviceStatus[] values;
    private static final String STATUS_CONTENT = "status_content_";
    private static final String STATUS_CONTENT_OTHER = "status_content_other_";
    private static final /* synthetic */ DJIDeviceStatus[] $VALUES;

    public static DJIDeviceStatus[] values() {
        return null;
    }

    public static DJIDeviceStatus valueOf(String string2) {
        return null;
    }

    private DJIDeviceStatus(long l2, WarningLevel warningLevel) {
    }

    public static DJIDeviceStatus find(String string2) {
        return null;
    }

    public static DJIDeviceStatus find(long l2) {
        return null;
    }

    @Override
    public String statusCode() {
        return null;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public WarningLevel warningLevel() {
        return null;
    }

    private String getStatusContentKey() {
        return null;
    }

    private static /* synthetic */ DJIDeviceStatus[] $values() {
        return null;
    }

    static {
        $VALUES = DJIDeviceStatus.$values();
        values = DJIDeviceStatus.values();
    }
}

