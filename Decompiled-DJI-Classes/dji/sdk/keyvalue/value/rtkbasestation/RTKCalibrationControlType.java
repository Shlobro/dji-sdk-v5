/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKCalibrationControlType
extends Enum<RTKCalibrationControlType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKCalibrationControlType MIN = new RTKCalibrationControlType(0);
    public static final /* enum */ RTKCalibrationControlType STOP = new RTKCalibrationControlType(0);
    public static final /* enum */ RTKCalibrationControlType SELF = new RTKCalibrationControlType(1);
    public static final /* enum */ RTKCalibrationControlType NET_RTK = new RTKCalibrationControlType(2);
    public static final /* enum */ RTKCalibrationControlType PPP = new RTKCalibrationControlType(3);
    public static final /* enum */ RTKCalibrationControlType PPP_AR = new RTKCalibrationControlType(4);
    public static final /* enum */ RTKCalibrationControlType MAX = new RTKCalibrationControlType(4);
    public static final /* enum */ RTKCalibrationControlType UNKNOWN = new RTKCalibrationControlType(255);
    private int value;
    private static final RTKCalibrationControlType[] allValues;
    private static final /* synthetic */ RTKCalibrationControlType[] $VALUES;

    public static RTKCalibrationControlType[] values() {
        return null;
    }

    public static RTKCalibrationControlType valueOf(String string) {
        return null;
    }

    private RTKCalibrationControlType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKCalibrationControlType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKCalibrationControlType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKCalibrationControlType.$values();
        allValues = RTKCalibrationControlType.values();
    }
}

