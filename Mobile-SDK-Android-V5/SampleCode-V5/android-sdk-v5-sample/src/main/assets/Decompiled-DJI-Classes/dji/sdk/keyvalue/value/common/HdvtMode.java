/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class HdvtMode
extends Enum<HdvtMode>
implements JNIProguardKeepTag {
    public static final /* enum */ HdvtMode NORMAL_LATENCY = new HdvtMode(0);
    public static final /* enum */ HdvtMode LOW_LATENCY = new HdvtMode(1);
    public static final /* enum */ HdvtMode UNKNOWN = new HdvtMode(65535);
    private int value;
    private static final HdvtMode[] allValues;
    private static final /* synthetic */ HdvtMode[] $VALUES;

    public static HdvtMode[] values() {
        return null;
    }

    public static HdvtMode valueOf(String string) {
        return null;
    }

    private HdvtMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HdvtMode find(int n) {
        return null;
    }

    private static /* synthetic */ HdvtMode[] $values() {
        return null;
    }

    static {
        $VALUES = HdvtMode.$values();
        allValues = HdvtMode.values();
    }
}

