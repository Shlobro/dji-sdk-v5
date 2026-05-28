/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RCStickMode
extends Enum<RCStickMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RCStickMode LEFT_PITCH_RIGHT_YAW = new RCStickMode(1);
    public static final /* enum */ RCStickMode LEFT_YAW_RIGHT_PITCH = new RCStickMode(2);
    public static final /* enum */ RCStickMode LEFT_PITCH_AND_YAW = new RCStickMode(3);
    public static final /* enum */ RCStickMode RIGHT_PITCH_AND_YAW = new RCStickMode(4);
    public static final /* enum */ RCStickMode UNKNOWN = new RCStickMode(255);
    private int value;
    private static final RCStickMode[] allValues;
    private static final /* synthetic */ RCStickMode[] $VALUES;

    public static RCStickMode[] values() {
        return null;
    }

    public static RCStickMode valueOf(String string) {
        return null;
    }

    private RCStickMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCStickMode find(int n) {
        return null;
    }

    private static /* synthetic */ RCStickMode[] $values() {
        return null;
    }

    static {
        $VALUES = RCStickMode.$values();
        allValues = RCStickMode.values();
    }
}

