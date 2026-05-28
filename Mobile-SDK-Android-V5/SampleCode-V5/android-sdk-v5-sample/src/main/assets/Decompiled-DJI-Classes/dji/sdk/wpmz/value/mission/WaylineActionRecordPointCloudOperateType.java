/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineActionRecordPointCloudOperateType implements JNIProguardKeepTag
{
    STOP_RECORD(0),
    START_RECORD(1),
    PAUSE_RECORD(2),
    RESUME_RECORD(3),
    UNKNOWN(65535);

    private int value;
    private static final WaylineActionRecordPointCloudOperateType[] allValues;

    private WaylineActionRecordPointCloudOperateType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineActionRecordPointCloudOperateType find(int value) {
        WaylineActionRecordPointCloudOperateType result = null;
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
        allValues = WaylineActionRecordPointCloudOperateType.values();
    }
}

