/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalAngleRotationMode
extends Enum<GimbalAngleRotationMode>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalAngleRotationMode RELATIVE_ANGLE = new GimbalAngleRotationMode(0);
    public static final /* enum */ GimbalAngleRotationMode ABSOLUTE_ANGLE = new GimbalAngleRotationMode(1);
    public static final /* enum */ GimbalAngleRotationMode UNKNOWN = new GimbalAngleRotationMode(65535);
    private int value;
    private static final GimbalAngleRotationMode[] allValues;
    private static final /* synthetic */ GimbalAngleRotationMode[] $VALUES;

    public static GimbalAngleRotationMode[] values() {
        return null;
    }

    public static GimbalAngleRotationMode valueOf(String string) {
        return null;
    }

    private GimbalAngleRotationMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalAngleRotationMode find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalAngleRotationMode[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalAngleRotationMode.$values();
        allValues = GimbalAngleRotationMode.values();
    }
}

