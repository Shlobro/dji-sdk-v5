/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;

public final class AIboxAppState
extends Enum<AIboxAppState>
implements JNIProguardKeepTag {
    public static final /* enum */ AIboxAppState NOT_RUNNING = new AIboxAppState(0);
    public static final /* enum */ AIboxAppState RUNNING = new AIboxAppState(1);
    public static final /* enum */ AIboxAppState UNKNOWN = new AIboxAppState(255);
    private int value;
    private static final AIboxAppState[] allValues;
    private static final /* synthetic */ AIboxAppState[] $VALUES;

    public static AIboxAppState[] values() {
        return null;
    }

    public static AIboxAppState valueOf(String string) {
        return null;
    }

    private AIboxAppState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AIboxAppState find(int n) {
        return null;
    }

    private static /* synthetic */ AIboxAppState[] $values() {
        return null;
    }

    static {
        $VALUES = AIboxAppState.$values();
        allValues = AIboxAppState.values();
    }
}

