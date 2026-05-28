/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalPathMissionType
extends Enum<GimbalPathMissionType>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalPathMissionType FIXED_PATH_NEED_TRIGGER = new GimbalPathMissionType(0);
    public static final /* enum */ GimbalPathMissionType CUSTOM_PATH_NEED_TRIGGER = new GimbalPathMissionType(1);
    public static final /* enum */ GimbalPathMissionType FIXED_PATH_NO_TRIGGER = new GimbalPathMissionType(2);
    public static final /* enum */ GimbalPathMissionType CUSTOM_PATH_NO_TRIGGER = new GimbalPathMissionType(3);
    public static final /* enum */ GimbalPathMissionType UNKNOWN = new GimbalPathMissionType(65535);
    private int value;
    private static final GimbalPathMissionType[] allValues;
    private static final /* synthetic */ GimbalPathMissionType[] $VALUES;

    public static GimbalPathMissionType[] values() {
        return null;
    }

    public static GimbalPathMissionType valueOf(String string) {
        return null;
    }

    private GimbalPathMissionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalPathMissionType find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalPathMissionType[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalPathMissionType.$values();
        allValues = GimbalPathMissionType.values();
    }
}

