/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class MegaphoneSystemState
extends Enum<MegaphoneSystemState>
implements JNIProguardKeepTag {
    public static final /* enum */ MegaphoneSystemState IDEL = new MegaphoneSystemState(0);
    public static final /* enum */ MegaphoneSystemState IN_TRANSMISSION = new MegaphoneSystemState(1);
    public static final /* enum */ MegaphoneSystemState PLAYING = new MegaphoneSystemState(2);
    public static final /* enum */ MegaphoneSystemState IN_EXCEPTION = new MegaphoneSystemState(3);
    public static final /* enum */ MegaphoneSystemState TTS_IN_CONVERSION = new MegaphoneSystemState(4);
    public static final /* enum */ MegaphoneSystemState PLAYING_IN_TRANSMISSION = new MegaphoneSystemState(5);
    public static final /* enum */ MegaphoneSystemState UNKNOWN = new MegaphoneSystemState(65535);
    private int value;
    private static final MegaphoneSystemState[] allValues;
    private static final /* synthetic */ MegaphoneSystemState[] $VALUES;

    public static MegaphoneSystemState[] values() {
        return null;
    }

    public static MegaphoneSystemState valueOf(String string) {
        return null;
    }

    private MegaphoneSystemState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MegaphoneSystemState find(int n) {
        return null;
    }

    private static /* synthetic */ MegaphoneSystemState[] $values() {
        return null;
    }

    static {
        $VALUES = MegaphoneSystemState.$values();
        allValues = MegaphoneSystemState.values();
    }
}

