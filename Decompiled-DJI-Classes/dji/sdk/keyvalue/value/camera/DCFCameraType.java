/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class DCFCameraType
extends Enum<DCFCameraType>
implements JNIProguardKeepTag {
    public static final /* enum */ DCFCameraType INFRARED = new DCFCameraType(0);
    public static final /* enum */ DCFCameraType ZOOM = new DCFCameraType(1);
    public static final /* enum */ DCFCameraType WIDE = new DCFCameraType(2);
    public static final /* enum */ DCFCameraType SUPER_RESOLUTION = new DCFCameraType(3);
    public static final /* enum */ DCFCameraType SCREEN = new DCFCameraType(4);
    public static final /* enum */ DCFCameraType VISIBLE = new DCFCameraType(5);
    public static final /* enum */ DCFCameraType NDVI = new DCFCameraType(6);
    public static final /* enum */ DCFCameraType RGB = new DCFCameraType(7);
    public static final /* enum */ DCFCameraType G = new DCFCameraType(8);
    public static final /* enum */ DCFCameraType R = new DCFCameraType(9);
    public static final /* enum */ DCFCameraType RE = new DCFCameraType(10);
    public static final /* enum */ DCFCameraType NIR = new DCFCameraType(11);
    public static final /* enum */ DCFCameraType LEFT_CAM = new DCFCameraType(15);
    public static final /* enum */ DCFCameraType RIGHT_CAM = new DCFCameraType(16);
    public static final /* enum */ DCFCameraType UNKNOWN = new DCFCameraType(65535);
    private int value;
    private static final DCFCameraType[] allValues;
    private static final /* synthetic */ DCFCameraType[] $VALUES;

    public static DCFCameraType[] values() {
        return null;
    }

    public static DCFCameraType valueOf(String string) {
        return null;
    }

    private DCFCameraType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DCFCameraType find(int n) {
        return null;
    }

    private static /* synthetic */ DCFCameraType[] $values() {
        return null;
    }

    static {
        $VALUES = DCFCameraType.$values();
        allValues = DCFCameraType.values();
    }
}

