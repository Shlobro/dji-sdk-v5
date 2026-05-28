/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalMode
extends Enum<GimbalMode>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalMode FREE = new GimbalMode(0);
    public static final /* enum */ GimbalMode FPV = new GimbalMode(1);
    public static final /* enum */ GimbalMode YAW_FOLLOW = new GimbalMode(2);
    public static final /* enum */ GimbalMode UNKNOWN = new GimbalMode(65535);
    private int value;
    private static final GimbalMode[] allValues;
    private static final /* synthetic */ GimbalMode[] $VALUES;

    public static GimbalMode[] values() {
        return null;
    }

    public static GimbalMode valueOf(String string) {
        return null;
    }

    private GimbalMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalMode find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalMode[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalMode.$values();
        allValues = GimbalMode.values();
    }
}

