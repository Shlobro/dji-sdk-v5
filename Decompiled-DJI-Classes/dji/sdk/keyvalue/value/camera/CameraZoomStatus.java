/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraZoomStatus
extends Enum<CameraZoomStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraZoomStatus IDLE = new CameraZoomStatus(0);
    public static final /* enum */ CameraZoomStatus ZOOM_IN = new CameraZoomStatus(1);
    public static final /* enum */ CameraZoomStatus ZOOM_OUT = new CameraZoomStatus(2);
    public static final /* enum */ CameraZoomStatus ZOOM_LIMITED = new CameraZoomStatus(3);
    public static final /* enum */ CameraZoomStatus UNKNOWN = new CameraZoomStatus(255);
    private int value;
    private static final CameraZoomStatus[] allValues;
    private static final /* synthetic */ CameraZoomStatus[] $VALUES;

    public static CameraZoomStatus[] values() {
        return null;
    }

    public static CameraZoomStatus valueOf(String string) {
        return null;
    }

    private CameraZoomStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraZoomStatus find(int n) {
        return null;
    }

    private static /* synthetic */ CameraZoomStatus[] $values() {
        return null;
    }

    static {
        $VALUES = CameraZoomStatus.$values();
        allValues = CameraZoomStatus.values();
    }
}

