/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalMotionSettingMode
extends Enum<GimbalMotionSettingMode>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalMotionSettingMode FAST = new GimbalMotionSettingMode(0);
    public static final /* enum */ GimbalMotionSettingMode MEDIUM = new GimbalMotionSettingMode(1);
    public static final /* enum */ GimbalMotionSettingMode SLOW = new GimbalMotionSettingMode(2);
    public static final /* enum */ GimbalMotionSettingMode CUSTOM1 = new GimbalMotionSettingMode(3);
    public static final /* enum */ GimbalMotionSettingMode CUSTOM2 = new GimbalMotionSettingMode(4);
    public static final /* enum */ GimbalMotionSettingMode UNKNOWN = new GimbalMotionSettingMode(65535);
    private int value;
    private static final GimbalMotionSettingMode[] allValues;
    private static final /* synthetic */ GimbalMotionSettingMode[] $VALUES;

    public static GimbalMotionSettingMode[] values() {
        return null;
    }

    public static GimbalMotionSettingMode valueOf(String string) {
        return null;
    }

    private GimbalMotionSettingMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalMotionSettingMode find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalMotionSettingMode[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalMotionSettingMode.$values();
        allValues = GimbalMotionSettingMode.values();
    }
}

