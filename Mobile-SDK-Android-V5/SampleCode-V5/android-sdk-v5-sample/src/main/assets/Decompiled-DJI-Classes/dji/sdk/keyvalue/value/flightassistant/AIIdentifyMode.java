/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class AIIdentifyMode
extends Enum<AIIdentifyMode>
implements JNIProguardKeepTag {
    public static final /* enum */ AIIdentifyMode DISABLE = new AIIdentifyMode(0);
    public static final /* enum */ AIIdentifyMode VISIBLE_LIGHT = new AIIdentifyMode(1);
    public static final /* enum */ AIIdentifyMode INFRARED_LIGHT = new AIIdentifyMode(2);
    public static final /* enum */ AIIdentifyMode UNKNOWN = new AIIdentifyMode(65535);
    private int value;
    private static final AIIdentifyMode[] allValues;
    private static final /* synthetic */ AIIdentifyMode[] $VALUES;

    public static AIIdentifyMode[] values() {
        return null;
    }

    public static AIIdentifyMode valueOf(String string) {
        return null;
    }

    private AIIdentifyMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AIIdentifyMode find(int n) {
        return null;
    }

    private static /* synthetic */ AIIdentifyMode[] $values() {
        return null;
    }

    static {
        $VALUES = AIIdentifyMode.$values();
        allValues = AIIdentifyMode.values();
    }
}

