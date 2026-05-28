/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class MegaphoneWorkMode
extends Enum<MegaphoneWorkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ MegaphoneWorkMode TTS = new MegaphoneWorkMode(0);
    public static final /* enum */ MegaphoneWorkMode VOICE = new MegaphoneWorkMode(1);
    public static final /* enum */ MegaphoneWorkMode REAL_TIME = new MegaphoneWorkMode(4);
    public static final /* enum */ MegaphoneWorkMode PLAYING_IN_TRANSMISSION = new MegaphoneWorkMode(5);
    public static final /* enum */ MegaphoneWorkMode UNKNOWN = new MegaphoneWorkMode(65535);
    private int value;
    private static final MegaphoneWorkMode[] allValues;
    private static final /* synthetic */ MegaphoneWorkMode[] $VALUES;

    public static MegaphoneWorkMode[] values() {
        return null;
    }

    public static MegaphoneWorkMode valueOf(String string) {
        return null;
    }

    private MegaphoneWorkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MegaphoneWorkMode find(int n) {
        return null;
    }

    private static /* synthetic */ MegaphoneWorkMode[] $values() {
        return null;
    }

    static {
        $VALUES = MegaphoneWorkMode.$values();
        allValues = MegaphoneWorkMode.values();
    }
}

