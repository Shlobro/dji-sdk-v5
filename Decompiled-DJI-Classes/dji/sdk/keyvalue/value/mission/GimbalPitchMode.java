/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class GimbalPitchMode
extends Enum<GimbalPitchMode>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalPitchMode FREE = new GimbalPitchMode(0);
    public static final /* enum */ GimbalPitchMode AUTO = new GimbalPitchMode(1);
    public static final /* enum */ GimbalPitchMode ANGLE = new GimbalPitchMode(2);
    public static final /* enum */ GimbalPitchMode FIXED = new GimbalPitchMode(3);
    public static final /* enum */ GimbalPitchMode UNKNOWN = new GimbalPitchMode(65535);
    private int value;
    private static final GimbalPitchMode[] allValues;
    private static final /* synthetic */ GimbalPitchMode[] $VALUES;

    public static GimbalPitchMode[] values() {
        return null;
    }

    public static GimbalPitchMode valueOf(String string) {
        return null;
    }

    private GimbalPitchMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalPitchMode find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalPitchMode[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalPitchMode.$values();
        allValues = GimbalPitchMode.values();
    }
}

