/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraZoomDirection
extends Enum<CameraZoomDirection>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraZoomDirection ZOOM_IN = new CameraZoomDirection(1);
    public static final /* enum */ CameraZoomDirection ZOOM_OUT = new CameraZoomDirection(2);
    public static final /* enum */ CameraZoomDirection UNKNOWN = new CameraZoomDirection(65535);
    private int value;
    private static final CameraZoomDirection[] allValues;
    private static final /* synthetic */ CameraZoomDirection[] $VALUES;

    public static CameraZoomDirection[] values() {
        return null;
    }

    public static CameraZoomDirection valueOf(String string) {
        return null;
    }

    private CameraZoomDirection(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraZoomDirection find(int n) {
        return null;
    }

    private static /* synthetic */ CameraZoomDirection[] $values() {
        return null;
    }

    static {
        $VALUES = CameraZoomDirection.$values();
        allValues = CameraZoomDirection.values();
    }
}

