/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class LightGimbalAutoAdjustState
extends Enum<LightGimbalAutoAdjustState>
implements JNIProguardKeepTag {
    public static final /* enum */ LightGimbalAutoAdjustState FINISH = new LightGimbalAutoAdjustState(0);
    public static final /* enum */ LightGimbalAutoAdjustState CALIING = new LightGimbalAutoAdjustState(1);
    public static final /* enum */ LightGimbalAutoAdjustState WAIT_FOR_VERTICAL = new LightGimbalAutoAdjustState(2);
    public static final /* enum */ LightGimbalAutoAdjustState FAILED = new LightGimbalAutoAdjustState(3);
    public static final /* enum */ LightGimbalAutoAdjustState TIMEOUT = new LightGimbalAutoAdjustState(4);
    public static final /* enum */ LightGimbalAutoAdjustState LARGE_OFFSET_INN = new LightGimbalAutoAdjustState(5);
    public static final /* enum */ LightGimbalAutoAdjustState LARGE_OFFSET_MID = new LightGimbalAutoAdjustState(6);
    public static final /* enum */ LightGimbalAutoAdjustState LARGE_OFFSET_OUT = new LightGimbalAutoAdjustState(7);
    public static final /* enum */ LightGimbalAutoAdjustState AXIS_VERIFY_ERROR = new LightGimbalAutoAdjustState(8);
    public static final /* enum */ LightGimbalAutoAdjustState LINEAR_ERROR = new LightGimbalAutoAdjustState(9);
    public static final /* enum */ LightGimbalAutoAdjustState FLIGHT_NOT_STATIC = new LightGimbalAutoAdjustState(10);
    public static final /* enum */ LightGimbalAutoAdjustState FLIGHT_ATTI_ERROR = new LightGimbalAutoAdjustState(11);
    public static final /* enum */ LightGimbalAutoAdjustState LARGE_QFBASE = new LightGimbalAutoAdjustState(12);
    public static final /* enum */ LightGimbalAutoAdjustState QFBASE_CHECKFAILED = new LightGimbalAutoAdjustState(13);
    public static final /* enum */ LightGimbalAutoAdjustState LARGE_RES_ERROR = new LightGimbalAutoAdjustState(14);
    public static final /* enum */ LightGimbalAutoAdjustState LARGE_CONTROL_ERROR = new LightGimbalAutoAdjustState(15);
    public static final /* enum */ LightGimbalAutoAdjustState LARGE_GYRO_NORM = new LightGimbalAutoAdjustState(16);
    public static final /* enum */ LightGimbalAutoAdjustState SAVE_FAILED = new LightGimbalAutoAdjustState(17);
    public static final /* enum */ LightGimbalAutoAdjustState STOP_COMMAND_REQ = new LightGimbalAutoAdjustState(18);
    public static final /* enum */ LightGimbalAutoAdjustState HANDLE_TILT = new LightGimbalAutoAdjustState(19);
    public static final /* enum */ LightGimbalAutoAdjustState CAM_ATII_TIME_OUT = new LightGimbalAutoAdjustState(20);
    public static final /* enum */ LightGimbalAutoAdjustState GIMBAL_NOT_STATIC = new LightGimbalAutoAdjustState(21);
    public static final /* enum */ LightGimbalAutoAdjustState UNKNOWN = new LightGimbalAutoAdjustState(65535);
    private int value;
    private static final LightGimbalAutoAdjustState[] allValues;
    private static final /* synthetic */ LightGimbalAutoAdjustState[] $VALUES;

    public static LightGimbalAutoAdjustState[] values() {
        return null;
    }

    public static LightGimbalAutoAdjustState valueOf(String string) {
        return null;
    }

    private LightGimbalAutoAdjustState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LightGimbalAutoAdjustState find(int n) {
        return null;
    }

    private static /* synthetic */ LightGimbalAutoAdjustState[] $values() {
        return null;
    }

    static {
        $VALUES = LightGimbalAutoAdjustState.$values();
        allValues = LightGimbalAutoAdjustState.values();
    }
}

