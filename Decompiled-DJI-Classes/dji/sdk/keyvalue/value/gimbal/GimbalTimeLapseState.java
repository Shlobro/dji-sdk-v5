/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalTimeLapseState
extends Enum<GimbalTimeLapseState>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalTimeLapseState NONE = new GimbalTimeLapseState(0);
    public static final /* enum */ GimbalTimeLapseState PREPARE = new GimbalTimeLapseState(1);
    public static final /* enum */ GimbalTimeLapseState PROGRESS = new GimbalTimeLapseState(2);
    public static final /* enum */ GimbalTimeLapseState END = new GimbalTimeLapseState(3);
    public static final /* enum */ GimbalTimeLapseState HAS_ERROR = new GimbalTimeLapseState(4);
    public static final /* enum */ GimbalTimeLapseState UNKNOWN = new GimbalTimeLapseState(65535);
    private int value;
    private static final GimbalTimeLapseState[] allValues;
    private static final /* synthetic */ GimbalTimeLapseState[] $VALUES;

    public static GimbalTimeLapseState[] values() {
        return null;
    }

    public static GimbalTimeLapseState valueOf(String string) {
        return null;
    }

    private GimbalTimeLapseState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalTimeLapseState find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalTimeLapseState[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalTimeLapseState.$values();
        allValues = GimbalTimeLapseState.values();
    }
}

