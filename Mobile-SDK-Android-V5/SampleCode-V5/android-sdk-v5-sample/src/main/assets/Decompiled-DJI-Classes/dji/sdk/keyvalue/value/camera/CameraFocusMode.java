/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraFocusMode
extends Enum<CameraFocusMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraFocusMode MANUAL = new CameraFocusMode(0);
    public static final /* enum */ CameraFocusMode AF = new CameraFocusMode(1);
    public static final /* enum */ CameraFocusMode AFC = new CameraFocusMode(2);
    public static final /* enum */ CameraFocusMode FINE_TUNE = new CameraFocusMode(3);
    public static final /* enum */ CameraFocusMode UNKNOWN = new CameraFocusMode(65535);
    private int value;
    private static final CameraFocusMode[] allValues;
    private static final /* synthetic */ CameraFocusMode[] $VALUES;

    public static CameraFocusMode[] values() {
        return null;
    }

    public static CameraFocusMode valueOf(String string) {
        return null;
    }

    private CameraFocusMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraFocusMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraFocusMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraFocusMode.$values();
        allValues = CameraFocusMode.values();
    }
}

