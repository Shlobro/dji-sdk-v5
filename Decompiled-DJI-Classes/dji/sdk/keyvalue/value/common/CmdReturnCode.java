/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class CmdReturnCode
extends Enum<CmdReturnCode>
implements JNIProguardKeepTag {
    public static final /* enum */ CmdReturnCode RETURN_CODE_SUCCESS = new CmdReturnCode(0);
    public static final /* enum */ CmdReturnCode RETURN_CODE_ACK = new CmdReturnCode(1);
    public static final /* enum */ CmdReturnCode RETURN_CODE_FAILURE = new CmdReturnCode(2);
    public static final /* enum */ CmdReturnCode RETURN_CODE_BUSY = new CmdReturnCode(3);
    public static final /* enum */ CmdReturnCode RETURN_CODE_NO_RESOURCE = new CmdReturnCode(4);
    public static final /* enum */ CmdReturnCode RETURN_CODE_NO_FEATURE = new CmdReturnCode(5);
    public static final /* enum */ CmdReturnCode RETURN_CODE_CANNOT_ENTER_PLAYBACK_IN_CUR_STATE = new CmdReturnCode(176);
    public static final /* enum */ CmdReturnCode RETURN_CODE_FILE_TRANSFER_BUSY = new CmdReturnCode(192);
    public static final /* enum */ CmdReturnCode RETURN_CODE_NAVIGATION_IS_FORBIDDEN = new CmdReturnCode(208);
    public static final /* enum */ CmdReturnCode RETURN_CODE_NAVIGATION_IS_OFF = new CmdReturnCode(209);
    public static final /* enum */ CmdReturnCode RETURN_CODE_INVALID_TASK_INFORMATION = new CmdReturnCode(210);
    public static final /* enum */ CmdReturnCode RETURN_CODE_TASK_UPLOAD_ERROR = new CmdReturnCode(211);
    public static final /* enum */ CmdReturnCode RETURN_CODE_INVALID_REQUEST_PARAMETER = new CmdReturnCode(212);
    public static final /* enum */ CmdReturnCode RETURN_CODE_MAY_CROSS_RESTRICTED_AREA = new CmdReturnCode(213);
    public static final /* enum */ CmdReturnCode RETURN_CODE_EXCEEDED_INPUT_TIME_LIMIT = new CmdReturnCode(214);
    public static final /* enum */ CmdReturnCode RETURN_CODE_EXECUTING_HIGHER_PRIORITY_TASK = new CmdReturnCode(215);
    public static final /* enum */ CmdReturnCode RETURN_CODE_CANNOT_START_TASK_WEAK_GPS = new CmdReturnCode(216);
    public static final /* enum */ CmdReturnCode RETURN_CODE_CANNOT_START_TASK_VLOTAGE_ALARM = new CmdReturnCode(217);
    public static final /* enum */ CmdReturnCode RETURN_CODE_MISSMATCH = new CmdReturnCode(218);
    public static final /* enum */ CmdReturnCode RETURN_CODE_DATA = new CmdReturnCode(219);
    public static final /* enum */ CmdReturnCode RETURN_CODE_TRY_LATER = new CmdReturnCode(220);
    public static final /* enum */ CmdReturnCode RETURN_CODE_NOT_IMPLEMENTED = new CmdReturnCode(221);
    public static final /* enum */ CmdReturnCode RETURN_CODE_CANCELLED = new CmdReturnCode(222);
    public static final /* enum */ CmdReturnCode RETURN_CODE_NOT_FOUND = new CmdReturnCode(223);
    public static final /* enum */ CmdReturnCode RETURN_CODE_UNSUPPORTED_COMMAND = new CmdReturnCode(224);
    public static final /* enum */ CmdReturnCode RETURN_CODE_TIMEOUT = new CmdReturnCode(225);
    public static final /* enum */ CmdReturnCode RETURN_CODE_RAM_ALLOCATION_FAILED = new CmdReturnCode(226);
    public static final /* enum */ CmdReturnCode RETURN_CODE_INVALID_COMMAND_PARAMETER = new CmdReturnCode(227);
    public static final /* enum */ CmdReturnCode RETURN_CODE_UNSUPPORTED_COMMAND_IN_CUR_STATE = new CmdReturnCode(228);
    public static final /* enum */ CmdReturnCode RETURN_CODE_CAMERA_TIME_NOT_SYNCHRONIZED = new CmdReturnCode(229);
    public static final /* enum */ CmdReturnCode RETURN_CODE_PARAMETER_SET_FAILED = new CmdReturnCode(230);
    public static final /* enum */ CmdReturnCode RETURN_CODE_PARAMETER_GET_FAILED = new CmdReturnCode(231);
    public static final /* enum */ CmdReturnCode RETURN_CODE_SD_CARD_MISSING = new CmdReturnCode(232);
    public static final /* enum */ CmdReturnCode RETURN_CODE_SD_CARD_FULL = new CmdReturnCode(233);
    public static final /* enum */ CmdReturnCode RETURN_CODE_SD_CARD_ERROR = new CmdReturnCode(234);
    public static final /* enum */ CmdReturnCode RETURN_CODE_SENSOR_ERROR = new CmdReturnCode(235);
    public static final /* enum */ CmdReturnCode RETURN_CODE_SYSTEM_ERROR = new CmdReturnCode(236);
    public static final /* enum */ CmdReturnCode RETURN_CODE_PARAMETER_TOTAL_TOO_LONG = new CmdReturnCode(237);
    public static final /* enum */ CmdReturnCode RETURN_CODE_MODULE_INACTIVATED = new CmdReturnCode(238);
    public static final /* enum */ CmdReturnCode RETURN_CODE_USER_UNBOND = new CmdReturnCode(239);
    public static final /* enum */ CmdReturnCode RETURN_CODE_FIRMWARE_DATA_NUM_DISCONTINUOUS = new CmdReturnCode(240);
    public static final /* enum */ CmdReturnCode RETURN_CODE_FIRMWARE_DATA_OVERLOAD_FLASH = new CmdReturnCode(241);
    public static final /* enum */ CmdReturnCode RETURN_CODE_FIRMWARE_VERIFICATION_ERROR = new CmdReturnCode(242);
    public static final /* enum */ CmdReturnCode RETURN_CODE_FLASH_ERASE_ERROR = new CmdReturnCode(243);
    public static final /* enum */ CmdReturnCode RETURN_CODE_FLASH_WRITE_ERROR = new CmdReturnCode(244);
    public static final /* enum */ CmdReturnCode RETURN_CODE_UPGRADE_STATUS_ERROR = new CmdReturnCode(245);
    public static final /* enum */ CmdReturnCode RETURN_CODE_FIRMWARE_TYPE_MISMATCH = new CmdReturnCode(246);
    public static final /* enum */ CmdReturnCode RETURN_CODE_WAITING_CLIENT_UPGRADE_STATUS = new CmdReturnCode(247);
    public static final /* enum */ CmdReturnCode RETURN_CODE_REMOTE_CONTROL_UNCONNECTED = new CmdReturnCode(248);
    public static final /* enum */ CmdReturnCode RETURN_CODE_MOTOR_NOT_STOPPED = new CmdReturnCode(249);
    public static final /* enum */ CmdReturnCode RETURN_CODE_HARDWARE_ERROR = new CmdReturnCode(250);
    public static final /* enum */ CmdReturnCode RETURN_CODE_INSUFFICIENT_ELECTRICITY = new CmdReturnCode(251);
    public static final /* enum */ CmdReturnCode RETURN_CODE_AIRCRAFT_UNCONNECTED = new CmdReturnCode(252);
    public static final /* enum */ CmdReturnCode RETURN_CODE_FLASH_IS_ERASING = new CmdReturnCode(253);
    public static final /* enum */ CmdReturnCode RETURN_CODE_CANNOT_UPGRADE_IN_CUR_STATE = new CmdReturnCode(254);
    public static final /* enum */ CmdReturnCode RETURN_CODE_UNDEFINE_ERROR = new CmdReturnCode(255);
    public static final /* enum */ CmdReturnCode UNKNOWN = new CmdReturnCode(65535);
    private int value;
    private static final CmdReturnCode[] allValues;
    private static final /* synthetic */ CmdReturnCode[] $VALUES;

    public static CmdReturnCode[] values() {
        return null;
    }

    public static CmdReturnCode valueOf(String string) {
        return null;
    }

    private CmdReturnCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CmdReturnCode find(int n) {
        return null;
    }

    private static /* synthetic */ CmdReturnCode[] $values() {
        return null;
    }

    static {
        $VALUES = CmdReturnCode.$values();
        allValues = CmdReturnCode.values();
    }
}

