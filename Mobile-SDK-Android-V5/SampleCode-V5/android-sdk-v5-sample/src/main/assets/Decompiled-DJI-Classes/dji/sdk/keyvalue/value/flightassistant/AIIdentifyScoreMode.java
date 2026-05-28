/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class AIIdentifyScoreMode
extends Enum<AIIdentifyScoreMode>
implements JNIProguardKeepTag {
    public static final /* enum */ AIIdentifyScoreMode MODE_INVALID = new AIIdentifyScoreMode(0);
    public static final /* enum */ AIIdentifyScoreMode MODE_COUNT = new AIIdentifyScoreMode(1);
    public static final /* enum */ AIIdentifyScoreMode MODE_RESCUE = new AIIdentifyScoreMode(2);
    public static final /* enum */ AIIdentifyScoreMode MODE_USER = new AIIdentifyScoreMode(3);
    public static final /* enum */ AIIdentifyScoreMode UNKNOWN = new AIIdentifyScoreMode(65535);
    private int value;
    private static final AIIdentifyScoreMode[] allValues;
    private static final /* synthetic */ AIIdentifyScoreMode[] $VALUES;

    public static AIIdentifyScoreMode[] values() {
        return null;
    }

    public static AIIdentifyScoreMode valueOf(String string) {
        return null;
    }

    private AIIdentifyScoreMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AIIdentifyScoreMode find(int n) {
        return null;
    }

    private static /* synthetic */ AIIdentifyScoreMode[] $values() {
        return null;
    }

    static {
        $VALUES = AIIdentifyScoreMode.$values();
        allValues = AIIdentifyScoreMode.values();
    }
}

