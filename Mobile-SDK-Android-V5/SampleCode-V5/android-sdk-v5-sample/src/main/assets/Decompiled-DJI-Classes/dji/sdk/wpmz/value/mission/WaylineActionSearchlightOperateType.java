/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineActionSearchlightOperateType implements JNIProguardKeepTag
{
    SEARCHLIGHT_OFF(0),
    SEARCHLIGHT_LIGHTING(1),
    SEARCHLIGHT_FLASH(2),
    UNKNOWN(65535);

    private int value;
    private static final WaylineActionSearchlightOperateType[] allValues;

    private WaylineActionSearchlightOperateType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineActionSearchlightOperateType find(int value) {
        WaylineActionSearchlightOperateType result = null;
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
        allValues = WaylineActionSearchlightOperateType.values();
    }
}

