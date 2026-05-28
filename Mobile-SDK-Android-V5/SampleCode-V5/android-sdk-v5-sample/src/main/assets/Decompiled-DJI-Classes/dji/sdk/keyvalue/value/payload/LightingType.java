/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class LightingType
extends Enum<LightingType>
implements JNIProguardKeepTag {
    public static final /* enum */ LightingType FLOOD = new LightingType(0);
    public static final /* enum */ LightingType SPOT = new LightingType(1);
    public static final /* enum */ LightingType FULL = new LightingType(2);
    public static final /* enum */ LightingType UNKNOWN = new LightingType(65535);
    private int value;
    private static final LightingType[] allValues;
    private static final /* synthetic */ LightingType[] $VALUES;

    public static LightingType[] values() {
        return null;
    }

    public static LightingType valueOf(String string) {
        return null;
    }

    private LightingType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LightingType find(int n) {
        return null;
    }

    private static /* synthetic */ LightingType[] $values() {
        return null;
    }

    static {
        $VALUES = LightingType.$values();
        allValues = LightingType.values();
    }
}

