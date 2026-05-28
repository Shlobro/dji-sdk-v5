/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraActionType
extends Enum<CameraActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraActionType NONE = new CameraActionType(0);
    public static final /* enum */ CameraActionType SINGLE_PHOTO = new CameraActionType(1);
    public static final /* enum */ CameraActionType INTERVAL = new CameraActionType(2);
    public static final /* enum */ CameraActionType PANO = new CameraActionType(3);
    public static final /* enum */ CameraActionType NORMAL_RECORD = new CameraActionType(20);
    public static final /* enum */ CameraActionType UNKNOWN = new CameraActionType(65535);
    private int value;
    private static final CameraActionType[] allValues;
    private static final /* synthetic */ CameraActionType[] $VALUES;

    public static CameraActionType[] values() {
        return null;
    }

    public static CameraActionType valueOf(String string) {
        return null;
    }

    private CameraActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraActionType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraActionType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraActionType.$values();
        allValues = CameraActionType.values();
    }
}

