/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class MegaphonePlayMode
extends Enum<MegaphonePlayMode>
implements JNIProguardKeepTag {
    public static final /* enum */ MegaphonePlayMode SINGLE_PLAY = new MegaphonePlayMode(0);
    public static final /* enum */ MegaphonePlayMode LOOP_PLAYBACK = new MegaphonePlayMode(1);
    public static final /* enum */ MegaphonePlayMode UNKNOWN = new MegaphonePlayMode(65535);
    private int value;
    private static final MegaphonePlayMode[] allValues;
    private static final /* synthetic */ MegaphonePlayMode[] $VALUES;

    public static MegaphonePlayMode[] values() {
        return null;
    }

    public static MegaphonePlayMode valueOf(String string) {
        return null;
    }

    private MegaphonePlayMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MegaphonePlayMode find(int n) {
        return null;
    }

    private static /* synthetic */ MegaphonePlayMode[] $values() {
        return null;
    }

    static {
        $VALUES = MegaphonePlayMode.$values();
        allValues = MegaphonePlayMode.values();
    }
}

