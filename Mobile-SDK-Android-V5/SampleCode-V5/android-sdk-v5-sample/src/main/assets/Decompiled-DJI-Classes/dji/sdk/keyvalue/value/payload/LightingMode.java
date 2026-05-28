/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class LightingMode
extends Enum<LightingMode>
implements JNIProguardKeepTag {
    public static final /* enum */ LightingMode CLOSE = new LightingMode(0);
    public static final /* enum */ LightingMode OPEN = new LightingMode(1);
    public static final /* enum */ LightingMode STROBE = new LightingMode(2);
    public static final /* enum */ LightingMode FAST_STROBE = new LightingMode(3);
    public static final /* enum */ LightingMode ALTER_STROBE = new LightingMode(4);
    public static final /* enum */ LightingMode UNKNOWN = new LightingMode(65535);
    private int value;
    private static final LightingMode[] allValues;
    private static final /* synthetic */ LightingMode[] $VALUES;

    public static LightingMode[] values() {
        return null;
    }

    public static LightingMode valueOf(String string) {
        return null;
    }

    private LightingMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LightingMode find(int n) {
        return null;
    }

    private static /* synthetic */ LightingMode[] $values() {
        return null;
    }

    static {
        $VALUES = LightingMode.$values();
        allValues = LightingMode.values();
    }
}

