/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RCStickChannelMode
extends Enum<RCStickChannelMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RCStickChannelMode NONE = new RCStickChannelMode(0);
    public static final /* enum */ RCStickChannelMode GIMBAL_YAW = new RCStickChannelMode(1);
    public static final /* enum */ RCStickChannelMode GIMBAL_PITCH = new RCStickChannelMode(2);
    public static final /* enum */ RCStickChannelMode GIMBAL_ROLL = new RCStickChannelMode(3);
    public static final /* enum */ RCStickChannelMode GIMBAL_YAW_REVERSE = new RCStickChannelMode(4);
    public static final /* enum */ RCStickChannelMode GIMBAL_PITCH_REVERSE = new RCStickChannelMode(5);
    public static final /* enum */ RCStickChannelMode GIMBAL_ROLL_REVERSE = new RCStickChannelMode(6);
    public static final /* enum */ RCStickChannelMode UNKNOWN = new RCStickChannelMode(255);
    private int value;
    private static final RCStickChannelMode[] allValues;
    private static final /* synthetic */ RCStickChannelMode[] $VALUES;

    public static RCStickChannelMode[] values() {
        return null;
    }

    public static RCStickChannelMode valueOf(String string) {
        return null;
    }

    private RCStickChannelMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCStickChannelMode find(int n) {
        return null;
    }

    private static /* synthetic */ RCStickChannelMode[] $values() {
        return null;
    }

    static {
        $VALUES = RCStickChannelMode.$values();
        allValues = RCStickChannelMode.values();
    }
}

