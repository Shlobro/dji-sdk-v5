/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class CameraPortraitStateType
extends Enum<CameraPortraitStateType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraPortraitStateType RIGHT = new CameraPortraitStateType(0);
    public static final /* enum */ CameraPortraitStateType LEFT = new CameraPortraitStateType(1);
    public static final /* enum */ CameraPortraitStateType UNKNOWN = new CameraPortraitStateType(65535);
    private int value;
    private static final CameraPortraitStateType[] allValues;
    private static final /* synthetic */ CameraPortraitStateType[] $VALUES;

    public static CameraPortraitStateType[] values() {
        return null;
    }

    public static CameraPortraitStateType valueOf(String string) {
        return null;
    }

    private CameraPortraitStateType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraPortraitStateType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraPortraitStateType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraPortraitStateType.$values();
        allValues = CameraPortraitStateType.values();
    }
}

