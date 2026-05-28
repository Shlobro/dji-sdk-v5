/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum TargetDetectionTargetType implements JNIProguardKeepTag
{
    TARGET_TYPE_PERSON(0),
    TARGET_TYPE_CAR(1),
    TARGET_TYPE_BOAT(2),
    TARGET_TYPE_TEMPERATURE(3),
    UNKNOWN(255);

    private int value;
    private static final TargetDetectionTargetType[] allValues;

    private TargetDetectionTargetType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static TargetDetectionTargetType find(int value) {
        TargetDetectionTargetType result = null;
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
        allValues = TargetDetectionTargetType.values();
    }
}

