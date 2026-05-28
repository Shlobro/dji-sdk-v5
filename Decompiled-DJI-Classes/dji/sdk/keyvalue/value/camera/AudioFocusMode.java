/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class AudioFocusMode
extends Enum<AudioFocusMode>
implements JNIProguardKeepTag {
    public static final /* enum */ AudioFocusMode FORWARD = new AudioFocusMode(0);
    public static final /* enum */ AudioFocusMode BACKWARD = new AudioFocusMode(1);
    public static final /* enum */ AudioFocusMode SHAPE_8 = new AudioFocusMode(2);
    public static final /* enum */ AudioFocusMode UNKNOWN = new AudioFocusMode(65535);
    private int value;
    private static final AudioFocusMode[] allValues;
    private static final /* synthetic */ AudioFocusMode[] $VALUES;

    public static AudioFocusMode[] values() {
        return null;
    }

    public static AudioFocusMode valueOf(String string) {
        return null;
    }

    private AudioFocusMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AudioFocusMode find(int n) {
        return null;
    }

    private static /* synthetic */ AudioFocusMode[] $values() {
        return null;
    }

    static {
        $VALUES = AudioFocusMode.$values();
        allValues = AudioFocusMode.values();
    }
}

