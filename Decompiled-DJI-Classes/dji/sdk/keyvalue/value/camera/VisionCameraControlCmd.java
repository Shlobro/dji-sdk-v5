/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VisionCameraControlCmd
extends Enum<VisionCameraControlCmd>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionCameraControlCmd ABORT = new VisionCameraControlCmd(0);
    public static final /* enum */ VisionCameraControlCmd CAPTURE = new VisionCameraControlCmd(1);
    public static final /* enum */ VisionCameraControlCmd RELEASE = new VisionCameraControlCmd(2);
    public static final /* enum */ VisionCameraControlCmd SET_MODE_3x1 = new VisionCameraControlCmd(3);
    public static final /* enum */ VisionCameraControlCmd SET_MODE_BOKEH = new VisionCameraControlCmd(4);
    public static final /* enum */ VisionCameraControlCmd SET_MODE_GESTURE = new VisionCameraControlCmd(5);
    public static final /* enum */ VisionCameraControlCmd SET_MODE_1x3 = new VisionCameraControlCmd(6);
    public static final /* enum */ VisionCameraControlCmd SET_MODE_3x3 = new VisionCameraControlCmd(7);
    public static final /* enum */ VisionCameraControlCmd SET_MODE_SPHERE = new VisionCameraControlCmd(8);
    public static final /* enum */ VisionCameraControlCmd SET_MODE_SCROLL_180 = new VisionCameraControlCmd(9);
    public static final /* enum */ VisionCameraControlCmd SET_MODE_SUPER_RESOLUTION = new VisionCameraControlCmd(10);
    public static final /* enum */ VisionCameraControlCmd UNKNOWN = new VisionCameraControlCmd(65535);
    private int value;
    private static final VisionCameraControlCmd[] allValues;
    private static final /* synthetic */ VisionCameraControlCmd[] $VALUES;

    public static VisionCameraControlCmd[] values() {
        return null;
    }

    public static VisionCameraControlCmd valueOf(String string) {
        return null;
    }

    private VisionCameraControlCmd(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionCameraControlCmd find(int n) {
        return null;
    }

    private static /* synthetic */ VisionCameraControlCmd[] $values() {
        return null;
    }

    static {
        $VALUES = VisionCameraControlCmd.$values();
        allValues = VisionCameraControlCmd.values();
    }
}

