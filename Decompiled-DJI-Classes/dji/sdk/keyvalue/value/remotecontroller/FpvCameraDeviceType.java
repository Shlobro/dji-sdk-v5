/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class FpvCameraDeviceType
extends Enum<FpvCameraDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ FpvCameraDeviceType DJI_DEVICE_FPV = new FpvCameraDeviceType(0);
    public static final /* enum */ FpvCameraDeviceType DJI_DEVICE_CAMERA1 = new FpvCameraDeviceType(1);
    public static final /* enum */ FpvCameraDeviceType DJI_DEVICE_CAMERA2 = new FpvCameraDeviceType(2);
    public static final /* enum */ FpvCameraDeviceType DJI_DEVICE_CAMERA3 = new FpvCameraDeviceType(3);
    public static final /* enum */ FpvCameraDeviceType UNKNOWN = new FpvCameraDeviceType(255);
    private int value;
    private static final FpvCameraDeviceType[] allValues;
    private static final /* synthetic */ FpvCameraDeviceType[] $VALUES;

    public static FpvCameraDeviceType[] values() {
        return null;
    }

    public static FpvCameraDeviceType valueOf(String string) {
        return null;
    }

    private FpvCameraDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FpvCameraDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ FpvCameraDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = FpvCameraDeviceType.$values();
        allValues = FpvCameraDeviceType.values();
    }
}

