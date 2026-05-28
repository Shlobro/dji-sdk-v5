/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class LightGimbal
extends Enum<LightGimbal>
implements JNIProguardKeepTag {
    public static final /* enum */ LightGimbal LEFT = new LightGimbal(0);
    public static final /* enum */ LightGimbal RIGHT = new LightGimbal(1);
    public static final /* enum */ LightGimbal BOTH = new LightGimbal(3);
    public static final /* enum */ LightGimbal UNKNOWN = new LightGimbal(65535);
    private int value;
    private static final LightGimbal[] allValues;
    private static final /* synthetic */ LightGimbal[] $VALUES;

    public static LightGimbal[] values() {
        return null;
    }

    public static LightGimbal valueOf(String string) {
        return null;
    }

    private LightGimbal(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LightGimbal find(int n) {
        return null;
    }

    private static /* synthetic */ LightGimbal[] $values() {
        return null;
    }

    static {
        $VALUES = LightGimbal.$values();
        allValues = LightGimbal.values();
    }
}

