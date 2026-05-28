/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalRollMode
extends Enum<GimbalRollMode>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalRollMode NORMAL_THREE_AXIS = new GimbalRollMode(0);
    public static final /* enum */ GimbalRollMode ROLL_360 = new GimbalRollMode(3);
    public static final /* enum */ GimbalRollMode UNKNOWN = new GimbalRollMode(255);
    private int value;
    private static final GimbalRollMode[] allValues;
    private static final /* synthetic */ GimbalRollMode[] $VALUES;

    public static GimbalRollMode[] values() {
        return null;
    }

    public static GimbalRollMode valueOf(String string) {
        return null;
    }

    private GimbalRollMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalRollMode find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalRollMode[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalRollMode.$values();
        allValues = GimbalRollMode.values();
    }
}

