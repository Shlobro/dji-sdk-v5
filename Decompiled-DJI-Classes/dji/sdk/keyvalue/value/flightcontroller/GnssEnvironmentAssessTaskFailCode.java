/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GnssEnvironmentAssessTaskFailCode
extends Enum<GnssEnvironmentAssessTaskFailCode>
implements JNIProguardKeepTag {
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode COMMAND_SUCCESS = new GnssEnvironmentAssessTaskFailCode(0);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode UNKNOWN_TASK_ID = new GnssEnvironmentAssessTaskFailCode(16);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode UNKNOWN_TASK_COMMAND = new GnssEnvironmentAssessTaskFailCode(17);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode UNKNOWN_TASK_PARAMETER = new GnssEnvironmentAssessTaskFailCode(18);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode START_FAIL_TASK_NUM_FULL = new GnssEnvironmentAssessTaskFailCode(32);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode START_FAIL_TASK_STAGE_ERROR = new GnssEnvironmentAssessTaskFailCode(33);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode START_FAIL_TASK_IS_RUNNING = new GnssEnvironmentAssessTaskFailCode(34);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode START_FAIL_GPS_LEVEL_LOW = new GnssEnvironmentAssessTaskFailCode(35);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode START_FAIL_NOT_ON_GROUND = new GnssEnvironmentAssessTaskFailCode(36);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode START_FAIL_POSITION_ERROR = new GnssEnvironmentAssessTaskFailCode(37);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode START_FAIL_TASK_INIT_ERROR = new GnssEnvironmentAssessTaskFailCode(38);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode START_FAIL_TIMEDIFF_ERROR = new GnssEnvironmentAssessTaskFailCode(39);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode START_FAIL_FLIGHTSTATE_ERROR = new GnssEnvironmentAssessTaskFailCode(40);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode STOP_FAIL_TASK_NOT_RUNNING = new GnssEnvironmentAssessTaskFailCode(48);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode DELETE_FAIL_TASK_IS_RUNNING = new GnssEnvironmentAssessTaskFailCode(64);
    public static final /* enum */ GnssEnvironmentAssessTaskFailCode UNKNOWN = new GnssEnvironmentAssessTaskFailCode(255);
    private int value;
    private static final GnssEnvironmentAssessTaskFailCode[] allValues;
    private static final /* synthetic */ GnssEnvironmentAssessTaskFailCode[] $VALUES;

    public static GnssEnvironmentAssessTaskFailCode[] values() {
        return null;
    }

    public static GnssEnvironmentAssessTaskFailCode valueOf(String string) {
        return null;
    }

    private GnssEnvironmentAssessTaskFailCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GnssEnvironmentAssessTaskFailCode find(int n) {
        return null;
    }

    private static /* synthetic */ GnssEnvironmentAssessTaskFailCode[] $values() {
        return null;
    }

    static {
        $VALUES = GnssEnvironmentAssessTaskFailCode.$values();
        allValues = GnssEnvironmentAssessTaskFailCode.values();
    }
}

