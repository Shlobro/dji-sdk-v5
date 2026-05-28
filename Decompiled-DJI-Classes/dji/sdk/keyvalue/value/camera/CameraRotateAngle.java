/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraRotateAngle
extends Enum<CameraRotateAngle>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraRotateAngle DEGREE_0 = new CameraRotateAngle(0);
    public static final /* enum */ CameraRotateAngle DEGREE_90 = new CameraRotateAngle(1);
    public static final /* enum */ CameraRotateAngle DEGREE_180 = new CameraRotateAngle(2);
    public static final /* enum */ CameraRotateAngle DEGREE_270 = new CameraRotateAngle(3);
    public static final /* enum */ CameraRotateAngle UNKNOWN = new CameraRotateAngle(65535);
    private int value;
    private static final CameraRotateAngle[] allValues;
    private static final /* synthetic */ CameraRotateAngle[] $VALUES;

    public static CameraRotateAngle[] values() {
        return null;
    }

    public static CameraRotateAngle valueOf(String string) {
        return null;
    }

    private CameraRotateAngle(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraRotateAngle find(int n) {
        return null;
    }

    private static /* synthetic */ CameraRotateAngle[] $values() {
        return null;
    }

    static {
        $VALUES = CameraRotateAngle.$values();
        allValues = CameraRotateAngle.values();
    }
}

