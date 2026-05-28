/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class LidarCurWorkState
extends Enum<LidarCurWorkState>
implements JNIProguardKeepTag {
    public static final /* enum */ LidarCurWorkState WORK_STATE = new LidarCurWorkState(1);
    public static final /* enum */ LidarCurWorkState IDLE_STATE = new LidarCurWorkState(2);
    public static final /* enum */ LidarCurWorkState SLEEP_STATE = new LidarCurWorkState(3);
    public static final /* enum */ LidarCurWorkState ERROR_STATE = new LidarCurWorkState(4);
    public static final /* enum */ LidarCurWorkState SELF_CHECK_STATE = new LidarCurWorkState(5);
    public static final /* enum */ LidarCurWorkState START_STATE = new LidarCurWorkState(6);
    public static final /* enum */ LidarCurWorkState STOP_STATE = new LidarCurWorkState(7);
    public static final /* enum */ LidarCurWorkState UPGRADE_STATE = new LidarCurWorkState(8);
    public static final /* enum */ LidarCurWorkState READY_STATE = new LidarCurWorkState(9);
    public static final /* enum */ LidarCurWorkState HIGH_PERFORMANCE_STATE = new LidarCurWorkState(10);
    public static final /* enum */ LidarCurWorkState SELF_CALIBRATION_STATE = new LidarCurWorkState(11);
    public static final /* enum */ LidarCurWorkState UNKNOWN = new LidarCurWorkState(65535);
    private int value;
    private static final LidarCurWorkState[] allValues;
    private static final /* synthetic */ LidarCurWorkState[] $VALUES;

    public static LidarCurWorkState[] values() {
        return null;
    }

    public static LidarCurWorkState valueOf(String string) {
        return null;
    }

    private LidarCurWorkState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LidarCurWorkState find(int n) {
        return null;
    }

    private static /* synthetic */ LidarCurWorkState[] $values() {
        return null;
    }

    static {
        $VALUES = LidarCurWorkState.$values();
        allValues = LidarCurWorkState.values();
    }
}

