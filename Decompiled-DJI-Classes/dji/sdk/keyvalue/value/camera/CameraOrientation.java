/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraOrientation
extends Enum<CameraOrientation>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraOrientation DEFAULT = new CameraOrientation(0);
    public static final /* enum */ CameraOrientation CW90 = new CameraOrientation(1);
    public static final /* enum */ CameraOrientation CW180 = new CameraOrientation(2);
    public static final /* enum */ CameraOrientation CW270 = new CameraOrientation(3);
    public static final /* enum */ CameraOrientation UNKNOWN = new CameraOrientation(65535);
    private int value;
    private static final CameraOrientation[] allValues;
    private static final /* synthetic */ CameraOrientation[] $VALUES;

    public static CameraOrientation[] values() {
        return null;
    }

    public static CameraOrientation valueOf(String string) {
        return null;
    }

    private CameraOrientation(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraOrientation find(int n) {
        return null;
    }

    private static /* synthetic */ CameraOrientation[] $values() {
        return null;
    }

    static {
        $VALUES = CameraOrientation.$values();
        allValues = CameraOrientation.values();
    }
}

