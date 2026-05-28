/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraDenoiseLevel
extends Enum<CameraDenoiseLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraDenoiseLevel DISABLE = new CameraDenoiseLevel(0);
    public static final /* enum */ CameraDenoiseLevel STANDARD = new CameraDenoiseLevel(1);
    public static final /* enum */ CameraDenoiseLevel ENHANCE = new CameraDenoiseLevel(2);
    public static final /* enum */ CameraDenoiseLevel EXTRA = new CameraDenoiseLevel(3);
    public static final /* enum */ CameraDenoiseLevel UNKNOWN = new CameraDenoiseLevel(65535);
    private int value;
    private static final CameraDenoiseLevel[] allValues;
    private static final /* synthetic */ CameraDenoiseLevel[] $VALUES;

    public static CameraDenoiseLevel[] values() {
        return null;
    }

    public static CameraDenoiseLevel valueOf(String string) {
        return null;
    }

    private CameraDenoiseLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraDenoiseLevel find(int n) {
        return null;
    }

    private static /* synthetic */ CameraDenoiseLevel[] $values() {
        return null;
    }

    static {
        $VALUES = CameraDenoiseLevel.$values();
        allValues = CameraDenoiseLevel.values();
    }
}

