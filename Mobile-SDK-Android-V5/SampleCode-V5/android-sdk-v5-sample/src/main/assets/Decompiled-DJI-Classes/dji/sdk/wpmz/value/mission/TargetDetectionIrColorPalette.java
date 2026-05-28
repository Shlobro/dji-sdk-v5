/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum TargetDetectionIrColorPalette implements JNIProguardKeepTag
{
    DJI_CAMERA_DIGITAL_FILTER_FLIR_WHITEHOT(24),
    DJI_CAMERA_DIGITAL_FILTER_FLIR_BLACKHOT(25),
    DJI_CAMERA_DIGITAL_FILTER_FLIR_RAINBOW(27),
    DJI_CAMERA_DIGITAL_FILTER_FLIR_IRONBOW1(28),
    DJI_CAMERA_DIGITAL_FILTER_FLIR_ICEFIRE(29),
    DJI_CAMERA_DIGITAL_FILTER_FLIR_LAVA(33),
    DJI_CAMERA_DIGITAL_FILTER_FLIR_IRONBOW2(34),
    DJI_CAMERA_DIGITAL_FILTER_FLIR_RAINBOWHC(35),
    DJI_CAMERA_DIGITAL_FILTER_FLIR_REDHOT(36),
    DJI_CAMERA_DIGITAL_FILTER_FLIR_GREENHOT(37),
    UNKNOWN(255);

    private int value;
    private static final TargetDetectionIrColorPalette[] allValues;

    private TargetDetectionIrColorPalette(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static TargetDetectionIrColorPalette find(int value) {
        TargetDetectionIrColorPalette result = null;
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
        allValues = TargetDetectionIrColorPalette.values();
    }
}

