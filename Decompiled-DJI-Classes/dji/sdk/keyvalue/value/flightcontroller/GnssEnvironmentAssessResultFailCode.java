/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GnssEnvironmentAssessResultFailCode
extends Enum<GnssEnvironmentAssessResultFailCode>
implements JNIProguardKeepTag {
    public static final /* enum */ GnssEnvironmentAssessResultFailCode STATUS_SUCCESS = new GnssEnvironmentAssessResultFailCode(0);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode ASSESS_RESULT_UNAVAILABLE = new GnssEnvironmentAssessResultFailCode(16);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode GNSS_DATA_UNAVAILABLE = new GnssEnvironmentAssessResultFailCode(17);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode TWO_STAGE_TIME_DIFF_LARGE = new GnssEnvironmentAssessResultFailCode(18);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode SPP_LOW_POS_RATE = new GnssEnvironmentAssessResultFailCode(32);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode SPP_LOW_POS_ACCURACY = new GnssEnvironmentAssessResultFailCode(33);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode SPP_POS_SAT_INSUFFICIENT = new GnssEnvironmentAssessResultFailCode(34);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode SPP_POS_HIGH_PDOP = new GnssEnvironmentAssessResultFailCode(35);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode HEADING_LOW_FIXRATE = new GnssEnvironmentAssessResultFailCode(36);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode HEADING_SWITCH_TO_FLOAT = new GnssEnvironmentAssessResultFailCode(37);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode HEADING_LOW_ACCURACY = new GnssEnvironmentAssessResultFailCode(38);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode HEADING_SAT_INSUFFICIENT = new GnssEnvironmentAssessResultFailCode(39);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode RTK_POS_NO_VALID_DATA = new GnssEnvironmentAssessResultFailCode(40);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode RTK_POS_TOO_MANY_ERROR_PERIODS = new GnssEnvironmentAssessResultFailCode(41);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode NO_EPHEMERIS = new GnssEnvironmentAssessResultFailCode(48);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode SAT_COCER_LESS = new GnssEnvironmentAssessResultFailCode(49);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode EPHEMERIS_NOT_VALID = new GnssEnvironmentAssessResultFailCode(50);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode EPHEMERIS_DATA_NOT_MATCHING = new GnssEnvironmentAssessResultFailCode(51);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode OBS_SAT_SNR_LOW = new GnssEnvironmentAssessResultFailCode(64);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode OBS_SAT_FREQUENT_CYCLE_SLIP = new GnssEnvironmentAssessResultFailCode(65);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode OBS_SAT_NUM_INSUFFICIENT = new GnssEnvironmentAssessResultFailCode(66);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode OBS_MIN_SAT_NUM_LESS = new GnssEnvironmentAssessResultFailCode(67);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode POSITION_CHANGED = new GnssEnvironmentAssessResultFailCode(80);
    public static final /* enum */ GnssEnvironmentAssessResultFailCode UNKNOWN = new GnssEnvironmentAssessResultFailCode(255);
    private int value;
    private static final GnssEnvironmentAssessResultFailCode[] allValues;
    private static final /* synthetic */ GnssEnvironmentAssessResultFailCode[] $VALUES;

    public static GnssEnvironmentAssessResultFailCode[] values() {
        return null;
    }

    public static GnssEnvironmentAssessResultFailCode valueOf(String string) {
        return null;
    }

    private GnssEnvironmentAssessResultFailCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GnssEnvironmentAssessResultFailCode find(int n) {
        return null;
    }

    private static /* synthetic */ GnssEnvironmentAssessResultFailCode[] $values() {
        return null;
    }

    static {
        $VALUES = GnssEnvironmentAssessResultFailCode.$values();
        allValues = GnssEnvironmentAssessResultFailCode.values();
    }
}

