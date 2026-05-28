/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraAccessoryType
extends Enum<CameraAccessoryType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraAccessoryType NONE = new CameraAccessoryType(0);
    public static final /* enum */ CameraAccessoryType SCREEN = new CameraAccessoryType(1);
    public static final /* enum */ CameraAccessoryType BATTERY = new CameraAccessoryType(2);
    public static final /* enum */ CameraAccessoryType THIRD = new CameraAccessoryType(3);
    public static final /* enum */ CameraAccessoryType UNKNOWN = new CameraAccessoryType(65535);
    private int value;
    private static final CameraAccessoryType[] allValues;
    private static final /* synthetic */ CameraAccessoryType[] $VALUES;

    public static CameraAccessoryType[] values() {
        return null;
    }

    public static CameraAccessoryType valueOf(String string) {
        return null;
    }

    private CameraAccessoryType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraAccessoryType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraAccessoryType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraAccessoryType.$values();
        allValues = CameraAccessoryType.values();
    }
}

