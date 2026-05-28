/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraLensControl
extends Enum<CameraLensControl>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraLensControl DEFAULT = new CameraLensControl(0);
    public static final /* enum */ CameraLensControl AUGMENT = new CameraLensControl(1);
    public static final /* enum */ CameraLensControl DIMMER = new CameraLensControl(2);
    public static final /* enum */ CameraLensControl DIVING = new CameraLensControl(3);
    public static final /* enum */ CameraLensControl UNKNOWN = new CameraLensControl(65535);
    private int value;
    private static final CameraLensControl[] allValues;
    private static final /* synthetic */ CameraLensControl[] $VALUES;

    public static CameraLensControl[] values() {
        return null;
    }

    public static CameraLensControl valueOf(String string) {
        return null;
    }

    private CameraLensControl(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraLensControl find(int n) {
        return null;
    }

    private static /* synthetic */ CameraLensControl[] $values() {
        return null;
    }

    static {
        $VALUES = CameraLensControl.$values();
        allValues = CameraLensControl.values();
    }
}

