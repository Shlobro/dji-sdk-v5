/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraAntiFlicker
extends Enum<CameraAntiFlicker>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraAntiFlicker ANTI_FLICKER_AUTO = new CameraAntiFlicker(0);
    public static final /* enum */ CameraAntiFlicker ANTI_FLICKER_60HZ = new CameraAntiFlicker(1);
    public static final /* enum */ CameraAntiFlicker ANTI_FLICKER_50HZ = new CameraAntiFlicker(2);
    public static final /* enum */ CameraAntiFlicker ANTI_FLICKER_OFF = new CameraAntiFlicker(3);
    public static final /* enum */ CameraAntiFlicker UNKNOWN = new CameraAntiFlicker(65535);
    private int value;
    private static final CameraAntiFlicker[] allValues;
    private static final /* synthetic */ CameraAntiFlicker[] $VALUES;

    public static CameraAntiFlicker[] values() {
        return null;
    }

    public static CameraAntiFlicker valueOf(String string) {
        return null;
    }

    private CameraAntiFlicker(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraAntiFlicker find(int n) {
        return null;
    }

    private static /* synthetic */ CameraAntiFlicker[] $values() {
        return null;
    }

    static {
        $VALUES = CameraAntiFlicker.$values();
        allValues = CameraAntiFlicker.values();
    }
}

