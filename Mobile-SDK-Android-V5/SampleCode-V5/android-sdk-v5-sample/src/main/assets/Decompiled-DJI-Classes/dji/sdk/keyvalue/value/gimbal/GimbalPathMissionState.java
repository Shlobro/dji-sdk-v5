/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalPathMissionState
extends Enum<GimbalPathMissionState>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalPathMissionState NONE = new GimbalPathMissionState(0);
    public static final /* enum */ GimbalPathMissionState PROGRESS = new GimbalPathMissionState(1);
    public static final /* enum */ GimbalPathMissionState PAUSE = new GimbalPathMissionState(2);
    public static final /* enum */ GimbalPathMissionState UNKNOWN = new GimbalPathMissionState(65535);
    private int value;
    private static final GimbalPathMissionState[] allValues;
    private static final /* synthetic */ GimbalPathMissionState[] $VALUES;

    public static GimbalPathMissionState[] values() {
        return null;
    }

    public static GimbalPathMissionState valueOf(String string) {
        return null;
    }

    private GimbalPathMissionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalPathMissionState find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalPathMissionState[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalPathMissionState.$values();
        allValues = GimbalPathMissionState.values();
    }
}

