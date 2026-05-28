/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCMotorStartFailureError
extends Enum<FCMotorStartFailureError>
implements JNIProguardKeepTag {
    public static final /* enum */ FCMotorStartFailureError NONE = new FCMotorStartFailureError(0);
    public static final /* enum */ FCMotorStartFailureError COMPASS_ERROR = new FCMotorStartFailureError(1);
    public static final /* enum */ FCMotorStartFailureError ASSISTANT_PROTECTED = new FCMotorStartFailureError(2);
    public static final /* enum */ FCMotorStartFailureError DEVICE_LOCKED = new FCMotorStartFailureError(3);
    public static final /* enum */ FCMotorStartFailureError DISTANCE_LIMIT = new FCMotorStartFailureError(4);
    public static final /* enum */ FCMotorStartFailureError IMU_NEED_CALIBRATION = new FCMotorStartFailureError(5);
    public static final /* enum */ FCMotorStartFailureError IMU_SN_ERROR = new FCMotorStartFailureError(6);
    public static final /* enum */ FCMotorStartFailureError IMU_WARMING_UP = new FCMotorStartFailureError(7);
    public static final /* enum */ FCMotorStartFailureError COMPASS_CALIBRATING = new FCMotorStartFailureError(8);
    public static final /* enum */ FCMotorStartFailureError ATTI_ERROR = new FCMotorStartFailureError(9);
    public static final /* enum */ FCMotorStartFailureError NOVICE_PROTECTED = new FCMotorStartFailureError(10);
    public static final /* enum */ FCMotorStartFailureError BATTERY_CELL_ERROR = new FCMotorStartFailureError(11);
    public static final /* enum */ FCMotorStartFailureError BATTERY_COMMUNICATION_ERROR = new FCMotorStartFailureError(12);
    public static final /* enum */ FCMotorStartFailureError SERIOU_LOW_VOLTAGE = new FCMotorStartFailureError(13);
    public static final /* enum */ FCMotorStartFailureError SERIOU_LOW_POWER = new FCMotorStartFailureError(14);
    public static final /* enum */ FCMotorStartFailureError LOW_VOLTAGE = new FCMotorStartFailureError(15);
    public static final /* enum */ FCMotorStartFailureError TEMPERATURE_TOO_LOW = new FCMotorStartFailureError(16);
    public static final /* enum */ FCMotorStartFailureError SMART_LOW_TO_LAND = new FCMotorStartFailureError(17);
    public static final /* enum */ FCMotorStartFailureError BATTERY_NOT_READY = new FCMotorStartFailureError(18);
    public static final /* enum */ FCMotorStartFailureError SIMULATOR_MODE = new FCMotorStartFailureError(19);
    public static final /* enum */ FCMotorStartFailureError IN_TRANSPORT_MODE = new FCMotorStartFailureError(20);
    public static final /* enum */ FCMotorStartFailureError ATTITUDE_ABNORMAL = new FCMotorStartFailureError(21);
    public static final /* enum */ FCMotorStartFailureError NOT_ACTIVATED = new FCMotorStartFailureError(22);
    public static final /* enum */ FCMotorStartFailureError IN_NO_FLY_ZONE = new FCMotorStartFailureError(23);
    public static final /* enum */ FCMotorStartFailureError BIAS_ERROR = new FCMotorStartFailureError(24);
    public static final /* enum */ FCMotorStartFailureError ESC_ERROR = new FCMotorStartFailureError(25);
    public static final /* enum */ FCMotorStartFailureError IMU_INIT_ERROR = new FCMotorStartFailureError(26);
    public static final /* enum */ FCMotorStartFailureError SYSTEM_UPGRADE = new FCMotorStartFailureError(27);
    public static final /* enum */ FCMotorStartFailureError SIMULATOR_STARTED = new FCMotorStartFailureError(28);
    public static final /* enum */ FCMotorStartFailureError IMUING_ERROR = new FCMotorStartFailureError(29);
    public static final /* enum */ FCMotorStartFailureError ATTI_ANGLE_OVER = new FCMotorStartFailureError(30);
    public static final /* enum */ FCMotorStartFailureError GYROSCOPE_NOT_WORKING = new FCMotorStartFailureError(31);
    public static final /* enum */ FCMotorStartFailureError ACCELERATOR_NOT_WORKING = new FCMotorStartFailureError(32);
    public static final /* enum */ FCMotorStartFailureError COMPASS_NOT_WORKING = new FCMotorStartFailureError(33);
    public static final /* enum */ FCMotorStartFailureError BAROMETER_NOT_WORKING = new FCMotorStartFailureError(34);
    public static final /* enum */ FCMotorStartFailureError BAROMETER_NEGATIVE = new FCMotorStartFailureError(35);
    public static final /* enum */ FCMotorStartFailureError COMPASS_LARGE_MOD = new FCMotorStartFailureError(36);
    public static final /* enum */ FCMotorStartFailureError GYROSCOPE_LARGE_BIAS = new FCMotorStartFailureError(37);
    public static final /* enum */ FCMotorStartFailureError ACCELERATOR_LARGE_BIAS = new FCMotorStartFailureError(38);
    public static final /* enum */ FCMotorStartFailureError COMPASS_LARGE_NOISE = new FCMotorStartFailureError(39);
    public static final /* enum */ FCMotorStartFailureError BAROMETER_LARGE_NOISE = new FCMotorStartFailureError(40);
    public static final /* enum */ FCMotorStartFailureError INVALID_SN = new FCMotorStartFailureError(41);
    public static final /* enum */ FCMotorStartFailureError FDI_PRESS_IS_WALKING = new FCMotorStartFailureError(42);
    public static final /* enum */ FCMotorStartFailureError AHRS_ERROR_LARGE = new FCMotorStartFailureError(43);
    public static final /* enum */ FCMotorStartFailureError FLASH_OPERATING = new FCMotorStartFailureError(44);
    public static final /* enum */ FCMotorStartFailureError GPS_DISCONNECT = new FCMotorStartFailureError(45);
    public static final /* enum */ FCMotorStartFailureError OUT_OF_WL_AREA = new FCMotorStartFailureError(46);
    public static final /* enum */ FCMotorStartFailureError SDCARD_EXCEPTION = new FCMotorStartFailureError(47);
    public static final /* enum */ FCMotorStartFailureError INVALID_PRODUCT = new FCMotorStartFailureError(48);
    public static final /* enum */ FCMotorStartFailureError DONT_REALNAME = new FCMotorStartFailureError(51);
    public static final /* enum */ FCMotorStartFailureError REALNAME_CANCLED = new FCMotorStartFailureError(52);
    public static final /* enum */ FCMotorStartFailureError IMU_DISCONNECT = new FCMotorStartFailureError(61);
    public static final /* enum */ FCMotorStartFailureError RC_CALIBRATION = new FCMotorStartFailureError(62);
    public static final /* enum */ FCMotorStartFailureError RC_CALIBRATION_EXCEPTION = new FCMotorStartFailureError(63);
    public static final /* enum */ FCMotorStartFailureError RC_CALIBRATION_UNFINISHED = new FCMotorStartFailureError(64);
    public static final /* enum */ FCMotorStartFailureError RC_STICK_CENTER_ERROR = new FCMotorStartFailureError(65);
    public static final /* enum */ FCMotorStartFailureError RC_MAPPING_ERROR = new FCMotorStartFailureError(66);
    public static final /* enum */ FCMotorStartFailureError AIRCRAFT_TYPE_MISMATCH = new FCMotorStartFailureError(67);
    public static final /* enum */ FCMotorStartFailureError NOT_CONFIGURED_MODULES = new FCMotorStartFailureError(68);
    public static final /* enum */ FCMotorStartFailureError GRYO_ACC_ABNORMAL = new FCMotorStartFailureError(70);
    public static final /* enum */ FCMotorStartFailureError BARO_ABNORMAL = new FCMotorStartFailureError(71);
    public static final /* enum */ FCMotorStartFailureError COMPASS_ABNORMAL = new FCMotorStartFailureError(72);
    public static final /* enum */ FCMotorStartFailureError GPS_ABNORMAL = new FCMotorStartFailureError(73);
    public static final /* enum */ FCMotorStartFailureError NAV_SYS_EXCEPTION = new FCMotorStartFailureError(74);
    public static final /* enum */ FCMotorStartFailureError TOPOLOGY_ABNORMAL = new FCMotorStartFailureError(75);
    public static final /* enum */ FCMotorStartFailureError RC_NEED_CALI = new FCMotorStartFailureError(76);
    public static final /* enum */ FCMotorStartFailureError INVALID_FLOAT = new FCMotorStartFailureError(77);
    public static final /* enum */ FCMotorStartFailureError MISSING_BATTERIES = new FCMotorStartFailureError(78);
    public static final /* enum */ FCMotorStartFailureError BATTERY_AUTH_ERROR = new FCMotorStartFailureError(79);
    public static final /* enum */ FCMotorStartFailureError MULT_BATTERIES_COMM_ERR = new FCMotorStartFailureError(80);
    public static final /* enum */ FCMotorStartFailureError BATTERIES_VOLT_DIFF_LARGE = new FCMotorStartFailureError(81);
    public static final /* enum */ FCMotorStartFailureError BATTERIES_VOLT_DIFF_VERY_LARGE = new FCMotorStartFailureError(82);
    public static final /* enum */ FCMotorStartFailureError BATTERIES_VERSION_MISMATCH = new FCMotorStartFailureError(83);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_GYRO_ABNORMAL = new FCMotorStartFailureError(84);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_ESC_PITCH_NON_DATA = new FCMotorStartFailureError(85);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_ESC_ROLL_NON_DATA = new FCMotorStartFailureError(86);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_ESC_YAW_NON_DATA = new FCMotorStartFailureError(87);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_FIRM_IS_UPDATING = new FCMotorStartFailureError(88);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_DISORDER = new FCMotorStartFailureError(89);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_PITCH_VIBRATE = new FCMotorStartFailureError(90);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_ROLL_VIBRATE = new FCMotorStartFailureError(91);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_YAW_VIBRATE = new FCMotorStartFailureError(92);
    public static final /* enum */ FCMotorStartFailureError IMU_CALIBRATION_FINISHED = new FCMotorStartFailureError(93);
    public static final /* enum */ FCMotorStartFailureError TAKEOFF_ROLLOVER = new FCMotorStartFailureError(94);
    public static final /* enum */ FCMotorStartFailureError MOTOR_STUCK = new FCMotorStartFailureError(95);
    public static final /* enum */ FCMotorStartFailureError MOTOR_UNBALANCED = new FCMotorStartFailureError(96);
    public static final /* enum */ FCMotorStartFailureError MISSING_PROPELLER = new FCMotorStartFailureError(97);
    public static final /* enum */ FCMotorStartFailureError MOTOR_START_ERROR = new FCMotorStartFailureError(98);
    public static final /* enum */ FCMotorStartFailureError MOTOR_AUTO_TAKEOFF_FAIL = new FCMotorStartFailureError(99);
    public static final /* enum */ FCMotorStartFailureError ROLL_OVER_ON_GRD = new FCMotorStartFailureError(100);
    public static final /* enum */ FCMotorStartFailureError BAT_VERSION_ERROR = new FCMotorStartFailureError(101);
    public static final /* enum */ FCMotorStartFailureError RTK_BAD_SIGNAL = new FCMotorStartFailureError(102);
    public static final /* enum */ FCMotorStartFailureError RTK_DEVIATION_ERROR = new FCMotorStartFailureError(103);
    public static final /* enum */ FCMotorStartFailureError ESC_SHORT_CIRCUIT = new FCMotorStartFailureError(104);
    public static final /* enum */ FCMotorStartFailureError ESC_HARDWARE_ERR = new FCMotorStartFailureError(105);
    public static final /* enum */ FCMotorStartFailureError BAT_HARDWARE_VERSION_ERR = new FCMotorStartFailureError(106);
    public static final /* enum */ FCMotorStartFailureError BAT_FIRMWARE_ERR = new FCMotorStartFailureError(107);
    public static final /* enum */ FCMotorStartFailureError MOTOR_STARTED = new FCMotorStartFailureError(110);
    public static final /* enum */ FCMotorStartFailureError NOT_IN_MANUAL_FARM_MODE = new FCMotorStartFailureError(111);
    public static final /* enum */ FCMotorStartFailureError ESC_CALIBRATING = new FCMotorStartFailureError(112);
    public static final /* enum */ FCMotorStartFailureError GPS_SIGN_INVALID = new FCMotorStartFailureError(113);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_IS_CALIBRATING = new FCMotorStartFailureError(114);
    public static final /* enum */ FCMotorStartFailureError LOCK_BY_APP = new FCMotorStartFailureError(115);
    public static final /* enum */ FCMotorStartFailureError START_FLY_HEIGHT_ERROR = new FCMotorStartFailureError(116);
    public static final /* enum */ FCMotorStartFailureError ESC_VERSION_NOT_MATCH = new FCMotorStartFailureError(117);
    public static final /* enum */ FCMotorStartFailureError IMU_ORI_NOT_MATCH = new FCMotorStartFailureError(118);
    public static final /* enum */ FCMotorStartFailureError STOP_BY_APP = new FCMotorStartFailureError(119);
    public static final /* enum */ FCMotorStartFailureError COMPASS_IMU_ORI_NOT_MATCH = new FCMotorStartFailureError(120);
    public static final /* enum */ FCMotorStartFailureError FLASH_UNLOCK = new FCMotorStartFailureError(121);
    public static final /* enum */ FCMotorStartFailureError ESC_BEEPING = new FCMotorStartFailureError(122);
    public static final /* enum */ FCMotorStartFailureError ESC_OVER_HEAT = new FCMotorStartFailureError(123);
    public static final /* enum */ FCMotorStartFailureError BATTERY_INSTALL_ERROR = new FCMotorStartFailureError(124);
    public static final /* enum */ FCMotorStartFailureError BE_IMPACT = new FCMotorStartFailureError(125);
    public static final /* enum */ FCMotorStartFailureError CRASH = new FCMotorStartFailureError(127);
    public static final /* enum */ FCMotorStartFailureError ONCE_SOAP_UP = new FCMotorStartFailureError(128);
    public static final /* enum */ FCMotorStartFailureError LOW_VERSION_OF_BATTERY = new FCMotorStartFailureError(129);
    public static final /* enum */ FCMotorStartFailureError VOLTAGE_OF_BATTERY_IS_TOO_HIGH = new FCMotorStartFailureError(130);
    public static final /* enum */ FCMotorStartFailureError BATTERY_NOT_PRESENT = new FCMotorStartFailureError(131);
    public static final /* enum */ FCMotorStartFailureError COOLING_FAN_EXCEPTION = new FCMotorStartFailureError(132);
    public static final /* enum */ FCMotorStartFailureError TEMPERATURE_WARNING = new FCMotorStartFailureError(133);
    public static final /* enum */ FCMotorStartFailureError FOR_MIS_DEGRADE_TO_ATTI = new FCMotorStartFailureError(134);
    public static final /* enum */ FCMotorStartFailureError RC_THROTTLE_IS_NOT_IN_MIDDLE = new FCMotorStartFailureError(136);
    public static final /* enum */ FCMotorStartFailureError FC_AUTH_STATE = new FCMotorStartFailureError(137);
    public static final /* enum */ FCMotorStartFailureError BSP_SYS_ERROR = new FCMotorStartFailureError(138);
    public static final /* enum */ FCMotorStartFailureError SPARY_OPEN_ON_GND = new FCMotorStartFailureError(139);
    public static final /* enum */ FCMotorStartFailureError CONTRACT_CRAFT_AREA_ERR = new FCMotorStartFailureError(140);
    public static final /* enum */ FCMotorStartFailureError CONTRACT_CRAFT_DIS_ERR = new FCMotorStartFailureError(141);
    public static final /* enum */ FCMotorStartFailureError CONTRACT_CRAFT_TIME_ERR = new FCMotorStartFailureError(142);
    public static final /* enum */ FCMotorStartFailureError RTK_YAW_NOT_FIX = new FCMotorStartFailureError(143);
    public static final /* enum */ FCMotorStartFailureError MAJOR_ACC_GYRO_CHANGE = new FCMotorStartFailureError(144);
    public static final /* enum */ FCMotorStartFailureError COUNTRY_LIMIT = new FCMotorStartFailureError(145);
    public static final /* enum */ FCMotorStartFailureError BAT_CAP_ERR = new FCMotorStartFailureError(146);
    public static final /* enum */ FCMotorStartFailureError BACKUP_COMMUNICATE_FAIL = new FCMotorStartFailureError(147);
    public static final /* enum */ FCMotorStartFailureError BACKUP_HAVE_BEEN_USED = new FCMotorStartFailureError(148);
    public static final /* enum */ FCMotorStartFailureError BACKUP_VOLTAGE_IS_ZERO = new FCMotorStartFailureError(149);
    public static final /* enum */ FCMotorStartFailureError BACKUP_VOLTAGE_TOO_LOW = new FCMotorStartFailureError(150);
    public static final /* enum */ FCMotorStartFailureError BACKUP_TEMPERATURE_TOO_LOW = new FCMotorStartFailureError(151);
    public static final /* enum */ FCMotorStartFailureError BACKUP_AUTH_NOT_SUCCESS = new FCMotorStartFailureError(152);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_STARTUP_EXECPTION = new FCMotorStartFailureError(153);
    public static final /* enum */ FCMotorStartFailureError GIMBAL_IS_VIBRATION = new FCMotorStartFailureError(154);
    public static final /* enum */ FCMotorStartFailureError SHOULD_CHECK_BLADE_INSTALL = new FCMotorStartFailureError(162);
    public static final /* enum */ FCMotorStartFailureError USB_CONNECTED = new FCMotorStartFailureError(163);
    public static final /* enum */ FCMotorStartFailureError SHOULD_CONFIRM_IN_MOVING_PLAT = new FCMotorStartFailureError(164);
    public static final /* enum */ FCMotorStartFailureError ESC_TOTOR_TIGHT = new FCMotorStartFailureError(165);
    public static final /* enum */ FCMotorStartFailureError MOTOR_FAIL_RC_BATTERY_LOW = new FCMotorStartFailureError(166);
    public static final /* enum */ FCMotorStartFailureError DJI_CARE_LOCK_MOTOR = new FCMotorStartFailureError(167);
    public static final /* enum */ FCMotorStartFailureError ARM_NOT_PRESENT = new FCMotorStartFailureError(168);
    public static final /* enum */ FCMotorStartFailureError ESC_ROTATE_SLOW = new FCMotorStartFailureError(169);
    public static final /* enum */ FCMotorStartFailureError FLYSAFE_TRUSTZONE_FAIL = new FCMotorStartFailureError(170);
    public static final /* enum */ FCMotorStartFailureError FLYSAFE_DATABASE_FAIL = new FCMotorStartFailureError(171);
    public static final /* enum */ FCMotorStartFailureError GET_SCHED_RIGHT_FAIL = new FCMotorStartFailureError(172);
    public static final /* enum */ FCMotorStartFailureError CONNECT_MOTION_RC = new FCMotorStartFailureError(173);
    public static final /* enum */ FCMotorStartFailureError CONNECT_GLS = new FCMotorStartFailureError(174);
    public static final /* enum */ FCMotorStartFailureError REMOTE_USB_CONNECTED = new FCMotorStartFailureError(200);
    public static final /* enum */ FCMotorStartFailureError VFENCE_CHECK_FAIL = new FCMotorStartFailureError(253);
    public static final /* enum */ FCMotorStartFailureError UNKNOWN = new FCMotorStartFailureError(65535);
    private int value;
    private static final FCMotorStartFailureError[] allValues;
    private static final /* synthetic */ FCMotorStartFailureError[] $VALUES;

    public static FCMotorStartFailureError[] values() {
        return null;
    }

    public static FCMotorStartFailureError valueOf(String string) {
        return null;
    }

    private FCMotorStartFailureError(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCMotorStartFailureError find(int n) {
        return null;
    }

    private static /* synthetic */ FCMotorStartFailureError[] $values() {
        return null;
    }

    static {
        $VALUES = FCMotorStartFailureError.$values();
        allValues = FCMotorStartFailureError.values();
    }
}

