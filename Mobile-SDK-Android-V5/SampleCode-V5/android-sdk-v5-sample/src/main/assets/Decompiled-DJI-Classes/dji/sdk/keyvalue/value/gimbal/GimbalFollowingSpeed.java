/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalFollowingSpeed
extends Enum<GimbalFollowingSpeed>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalFollowingSpeed FAST = new GimbalFollowingSpeed(0);
    public static final /* enum */ GimbalFollowingSpeed MEDIUM = new GimbalFollowingSpeed(1);
    public static final /* enum */ GimbalFollowingSpeed SLOW = new GimbalFollowingSpeed(2);
    public static final /* enum */ GimbalFollowingSpeed CUSTOM = new GimbalFollowingSpeed(3);
    public static final /* enum */ GimbalFollowingSpeed UNKNOWN = new GimbalFollowingSpeed(65535);
    private int value;
    private static final GimbalFollowingSpeed[] allValues;
    private static final /* synthetic */ GimbalFollowingSpeed[] $VALUES;

    public static GimbalFollowingSpeed[] values() {
        return null;
    }

    public static GimbalFollowingSpeed valueOf(String string) {
        return null;
    }

    private GimbalFollowingSpeed(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalFollowingSpeed find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalFollowingSpeed[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalFollowingSpeed.$values();
        allValues = GimbalFollowingSpeed.values();
    }
}

