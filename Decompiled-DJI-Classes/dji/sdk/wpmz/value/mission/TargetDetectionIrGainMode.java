/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum TargetDetectionIrGainMode implements JNIProguardKeepTag
{
    IR_GAIN_MODE_LOW(1),
    IR_GAIN_MODE_HIGH(2),
    IR_GAIN_MODE_SUPER_CLEAER(3),
    UNKNOWN(255);

    private int value;
    private static final TargetDetectionIrGainMode[] allValues;

    private TargetDetectionIrGainMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static TargetDetectionIrGainMode find(int value) {
        TargetDetectionIrGainMode result = null;
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
        allValues = TargetDetectionIrGainMode.values();
    }
}

