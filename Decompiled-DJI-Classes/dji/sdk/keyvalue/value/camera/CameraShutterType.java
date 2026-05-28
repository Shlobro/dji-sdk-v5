/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraShutterType
extends Enum<CameraShutterType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraShutterType SPEED_VALUE = new CameraShutterType(0);
    public static final /* enum */ CameraShutterType ANGLE_VALUE = new CameraShutterType(1);
    public static final /* enum */ CameraShutterType UNKNOWN = new CameraShutterType(65535);
    private int value;
    private static final CameraShutterType[] allValues;
    private static final /* synthetic */ CameraShutterType[] $VALUES;

    public static CameraShutterType[] values() {
        return null;
    }

    public static CameraShutterType valueOf(String string) {
        return null;
    }

    private CameraShutterType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraShutterType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraShutterType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraShutterType.$values();
        allValues = CameraShutterType.values();
    }
}

