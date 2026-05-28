/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalPanoMode
extends Enum<GimbalPanoMode>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalPanoMode MODE3X3 = new GimbalPanoMode(0);
    public static final /* enum */ GimbalPanoMode MODE180 = new GimbalPanoMode(1);
    public static final /* enum */ GimbalPanoMode UNKNOWN = new GimbalPanoMode(65535);
    private int value;
    private static final GimbalPanoMode[] allValues;
    private static final /* synthetic */ GimbalPanoMode[] $VALUES;

    public static GimbalPanoMode[] values() {
        return null;
    }

    public static GimbalPanoMode valueOf(String string) {
        return null;
    }

    private GimbalPanoMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalPanoMode find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalPanoMode[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalPanoMode.$values();
        allValues = GimbalPanoMode.values();
    }
}

