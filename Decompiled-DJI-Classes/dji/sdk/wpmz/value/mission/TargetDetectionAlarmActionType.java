/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum TargetDetectionAlarmActionType implements JNIProguardKeepTag
{
    ALARM_ACTION_TYPE_SHOT(0),
    ALARM_ACTION_TYPE_RECORD(1),
    ALARM_ACTION_TYPE_SPZ(2),
    ALARM_ACTION_TYPE_WAIT_CONTROL(3),
    UNKNOWN(255);

    private int value;
    private static final TargetDetectionAlarmActionType[] allValues;

    private TargetDetectionAlarmActionType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static TargetDetectionAlarmActionType find(int value) {
        TargetDetectionAlarmActionType result = null;
        for (int i = 0; i < allValues.length; ++i) {
            if (!allValues[i].equals(value)) continue;
            result = allValues[i];
            break;
        }
        if (null == result) {
            result = UNKNOWN;
            result.value = value;
        }
        return result;
    }

    static {
        allValues = TargetDetectionAlarmActionType.values();
    }
}

