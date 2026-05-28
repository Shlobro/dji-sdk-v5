/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VisionStabilizationPauseReason
extends Enum<VisionStabilizationPauseReason>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionStabilizationPauseReason FEATURE_NOT_ENOUGH = new VisionStabilizationPauseReason(0);
    public static final /* enum */ VisionStabilizationPauseReason CAMERA_PARAM_CHANGED = new VisionStabilizationPauseReason(1);
    public static final /* enum */ VisionStabilizationPauseReason GIMBAL_MOVE = new VisionStabilizationPauseReason(2);
    public static final /* enum */ VisionStabilizationPauseReason AIRCRAFT_MOVE = new VisionStabilizationPauseReason(3);
    public static final /* enum */ VisionStabilizationPauseReason IN_TRACKING_MODE = new VisionStabilizationPauseReason(4);
    public static final /* enum */ VisionStabilizationPauseReason UNKNOWN = new VisionStabilizationPauseReason(65535);
    private int value;
    private static final VisionStabilizationPauseReason[] allValues;
    private static final /* synthetic */ VisionStabilizationPauseReason[] $VALUES;

    public static VisionStabilizationPauseReason[] values() {
        return null;
    }

    public static VisionStabilizationPauseReason valueOf(String string) {
        return null;
    }

    private VisionStabilizationPauseReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionStabilizationPauseReason find(int n) {
        return null;
    }

    private static /* synthetic */ VisionStabilizationPauseReason[] $values() {
        return null;
    }

    static {
        $VALUES = VisionStabilizationPauseReason.$values();
        allValues = VisionStabilizationPauseReason.values();
    }
}

