/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class LDMMode
extends Enum<LDMMode>
implements JNIProguardKeepTag {
    public static final /* enum */ LDMMode ENABLE = new LDMMode(0);
    public static final /* enum */ LDMMode DISABLE = new LDMMode(1);
    public static final /* enum */ LDMMode WHITE_LIST = new LDMMode(2);
    public static final /* enum */ LDMMode UNKNOWN = new LDMMode(65535);
    private int value;
    private static final LDMMode[] allValues;
    private static final /* synthetic */ LDMMode[] $VALUES;

    public static LDMMode[] values() {
        return null;
    }

    public static LDMMode valueOf(String string) {
        return null;
    }

    private LDMMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LDMMode find(int n) {
        return null;
    }

    private static /* synthetic */ LDMMode[] $values() {
        return null;
    }

    static {
        $VALUES = LDMMode.$values();
        allValues = LDMMode.values();
    }
}

