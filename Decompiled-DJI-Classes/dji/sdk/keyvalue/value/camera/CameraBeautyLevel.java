/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraBeautyLevel
extends Enum<CameraBeautyLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraBeautyLevel OFF = new CameraBeautyLevel(0);
    public static final /* enum */ CameraBeautyLevel LOW = new CameraBeautyLevel(1);
    public static final /* enum */ CameraBeautyLevel MID = new CameraBeautyLevel(2);
    public static final /* enum */ CameraBeautyLevel HIGH = new CameraBeautyLevel(3);
    public static final /* enum */ CameraBeautyLevel UNKNOWN = new CameraBeautyLevel(65535);
    private int value;
    private static final CameraBeautyLevel[] allValues;
    private static final /* synthetic */ CameraBeautyLevel[] $VALUES;

    public static CameraBeautyLevel[] values() {
        return null;
    }

    public static CameraBeautyLevel valueOf(String string) {
        return null;
    }

    private CameraBeautyLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraBeautyLevel find(int n) {
        return null;
    }

    private static /* synthetic */ CameraBeautyLevel[] $values() {
        return null;
    }

    static {
        $VALUES = CameraBeautyLevel.$values();
        allValues = CameraBeautyLevel.values();
    }
}

