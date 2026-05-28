/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalRecenterProgress
extends Enum<GimbalRecenterProgress>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalRecenterProgress ACTION_NO_FINISH = new GimbalRecenterProgress(0);
    public static final /* enum */ GimbalRecenterProgress RECENTER = new GimbalRecenterProgress(1);
    public static final /* enum */ GimbalRecenterProgress SELFIE = new GimbalRecenterProgress(2);
    public static final /* enum */ GimbalRecenterProgress UNKNOWN = new GimbalRecenterProgress(65535);
    private int value;
    private static final GimbalRecenterProgress[] allValues;
    private static final /* synthetic */ GimbalRecenterProgress[] $VALUES;

    public static GimbalRecenterProgress[] values() {
        return null;
    }

    public static GimbalRecenterProgress valueOf(String string) {
        return null;
    }

    private GimbalRecenterProgress(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalRecenterProgress find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalRecenterProgress[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalRecenterProgress.$values();
        allValues = GimbalRecenterProgress.values();
    }
}

