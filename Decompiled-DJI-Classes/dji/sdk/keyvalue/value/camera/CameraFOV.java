/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraFOV
extends Enum<CameraFOV>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraFOV SUPER_WIDE = new CameraFOV(0);
    public static final /* enum */ CameraFOV NORMAL = new CameraFOV(1);
    public static final /* enum */ CameraFOV LINEAR = new CameraFOV(2);
    public static final /* enum */ CameraFOV UNKNOWN = new CameraFOV(65535);
    private int value;
    private static final CameraFOV[] allValues;
    private static final /* synthetic */ CameraFOV[] $VALUES;

    public static CameraFOV[] values() {
        return null;
    }

    public static CameraFOV valueOf(String string) {
        return null;
    }

    private CameraFOV(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraFOV find(int n) {
        return null;
    }

    private static /* synthetic */ CameraFOV[] $values() {
        return null;
    }

    static {
        $VALUES = CameraFOV.$values();
        allValues = CameraFOV.values();
    }
}

