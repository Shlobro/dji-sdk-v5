/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalResetType
extends Enum<GimbalResetType>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalResetType RECENTER = new GimbalResetType(1);
    public static final /* enum */ GimbalResetType SELFIE = new GimbalResetType(2);
    public static final /* enum */ GimbalResetType PITCH_YAW = new GimbalResetType(3);
    public static final /* enum */ GimbalResetType ONLY_PITCH = new GimbalResetType(4);
    public static final /* enum */ GimbalResetType ONLY_ROLL = new GimbalResetType(5);
    public static final /* enum */ GimbalResetType ONLY_YAW = new GimbalResetType(6);
    public static final /* enum */ GimbalResetType TOGGLE_PITCH = new GimbalResetType(7);
    public static final /* enum */ GimbalResetType YAW_FAN_RECENTER = new GimbalResetType(8);
    public static final /* enum */ GimbalResetType YAW_FAN_SWITCH = new GimbalResetType(9);
    public static final /* enum */ GimbalResetType PITCH_UP_OR_DOWN_WITH_YAW_CENTER = new GimbalResetType(11);
    public static final /* enum */ GimbalResetType PITCH_UP_OR_DOWN = new GimbalResetType(12);
    public static final /* enum */ GimbalResetType PITCH_ONLY_UP = new GimbalResetType(13);
    public static final /* enum */ GimbalResetType UNKNOWN = new GimbalResetType(65535);
    private int value;
    private static final GimbalResetType[] allValues;
    private static final /* synthetic */ GimbalResetType[] $VALUES;

    public static GimbalResetType[] values() {
        return null;
    }

    public static GimbalResetType valueOf(String string) {
        return null;
    }

    private GimbalResetType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalResetType find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalResetType[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalResetType.$values();
        allValues = GimbalResetType.values();
    }
}

