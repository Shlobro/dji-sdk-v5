/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraFpvControlMode
extends Enum<CameraFpvControlMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraFpvControlMode FPV_CONTROL_OFF = new CameraFpvControlMode(0);
    public static final /* enum */ CameraFpvControlMode FPV_CONTROL_ON = new CameraFpvControlMode(1);
    public static final /* enum */ CameraFpvControlMode UNKNOWN = new CameraFpvControlMode(65535);
    private int value;
    private static final CameraFpvControlMode[] allValues;
    private static final /* synthetic */ CameraFpvControlMode[] $VALUES;

    public static CameraFpvControlMode[] values() {
        return null;
    }

    public static CameraFpvControlMode valueOf(String string) {
        return null;
    }

    private CameraFpvControlMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraFpvControlMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraFpvControlMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraFpvControlMode.$values();
        allValues = CameraFpvControlMode.values();
    }
}

