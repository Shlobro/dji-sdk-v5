/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraAdvanceModeType
extends Enum<CameraAdvanceModeType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraAdvanceModeType ADVANCE_MODE_TYPE_NORMAL = new CameraAdvanceModeType(0);
    public static final /* enum */ CameraAdvanceModeType ADVANCE_MODE_TYPE_PROFESSIONAL = new CameraAdvanceModeType(1);
    public static final /* enum */ CameraAdvanceModeType UNKNOWN = new CameraAdvanceModeType(65535);
    private int value;
    private static final CameraAdvanceModeType[] allValues;
    private static final /* synthetic */ CameraAdvanceModeType[] $VALUES;

    public static CameraAdvanceModeType[] values() {
        return null;
    }

    public static CameraAdvanceModeType valueOf(String string) {
        return null;
    }

    private CameraAdvanceModeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraAdvanceModeType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraAdvanceModeType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraAdvanceModeType.$values();
        allValues = CameraAdvanceModeType.values();
    }
}

