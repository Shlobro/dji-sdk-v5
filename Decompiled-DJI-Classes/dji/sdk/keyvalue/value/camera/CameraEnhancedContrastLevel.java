/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraEnhancedContrastLevel
extends Enum<CameraEnhancedContrastLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraEnhancedContrastLevel OFF = new CameraEnhancedContrastLevel(0);
    public static final /* enum */ CameraEnhancedContrastLevel ONE = new CameraEnhancedContrastLevel(1);
    public static final /* enum */ CameraEnhancedContrastLevel TWO = new CameraEnhancedContrastLevel(2);
    public static final /* enum */ CameraEnhancedContrastLevel THREE = new CameraEnhancedContrastLevel(3);
    public static final /* enum */ CameraEnhancedContrastLevel FOUR = new CameraEnhancedContrastLevel(4);
    public static final /* enum */ CameraEnhancedContrastLevel UNKNOWN = new CameraEnhancedContrastLevel(65535);
    private int value;
    private static final CameraEnhancedContrastLevel[] allValues;
    private static final /* synthetic */ CameraEnhancedContrastLevel[] $VALUES;

    public static CameraEnhancedContrastLevel[] values() {
        return null;
    }

    public static CameraEnhancedContrastLevel valueOf(String string) {
        return null;
    }

    private CameraEnhancedContrastLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraEnhancedContrastLevel find(int n) {
        return null;
    }

    private static /* synthetic */ CameraEnhancedContrastLevel[] $values() {
        return null;
    }

    static {
        $VALUES = CameraEnhancedContrastLevel.$values();
        allValues = CameraEnhancedContrastLevel.values();
    }
}

