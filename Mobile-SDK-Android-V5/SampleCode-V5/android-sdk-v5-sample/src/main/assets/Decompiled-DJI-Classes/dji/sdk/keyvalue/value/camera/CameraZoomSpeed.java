/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraZoomSpeed
extends Enum<CameraZoomSpeed>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraZoomSpeed SLOWEST = new CameraZoomSpeed(0);
    public static final /* enum */ CameraZoomSpeed SLOW = new CameraZoomSpeed(1);
    public static final /* enum */ CameraZoomSpeed MODERATELY_SLOW = new CameraZoomSpeed(2);
    public static final /* enum */ CameraZoomSpeed NORMAL = new CameraZoomSpeed(3);
    public static final /* enum */ CameraZoomSpeed MODERATELY_FAST = new CameraZoomSpeed(4);
    public static final /* enum */ CameraZoomSpeed FAST = new CameraZoomSpeed(5);
    public static final /* enum */ CameraZoomSpeed FASTEST = new CameraZoomSpeed(6);
    public static final /* enum */ CameraZoomSpeed UNKNOWN = new CameraZoomSpeed(65535);
    private int value;
    private static final CameraZoomSpeed[] allValues;
    private static final /* synthetic */ CameraZoomSpeed[] $VALUES;

    public static CameraZoomSpeed[] values() {
        return null;
    }

    public static CameraZoomSpeed valueOf(String string) {
        return null;
    }

    private CameraZoomSpeed(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraZoomSpeed find(int n) {
        return null;
    }

    private static /* synthetic */ CameraZoomSpeed[] $values() {
        return null;
    }

    static {
        $VALUES = CameraZoomSpeed.$values();
        allValues = CameraZoomSpeed.values();
    }
}

