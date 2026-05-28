/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class LensCaliType
extends Enum<LensCaliType>
implements JNIProguardKeepTag {
    public static final /* enum */ LensCaliType FOCUS = new LensCaliType(0);
    public static final /* enum */ LensCaliType IRIS = new LensCaliType(1);
    public static final /* enum */ LensCaliType ZOOM = new LensCaliType(2);
    public static final /* enum */ LensCaliType UNKNOWN = new LensCaliType(65535);
    private int value;
    private static final LensCaliType[] allValues;
    private static final /* synthetic */ LensCaliType[] $VALUES;

    public static LensCaliType[] values() {
        return null;
    }

    public static LensCaliType valueOf(String string) {
        return null;
    }

    private LensCaliType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LensCaliType find(int n) {
        return null;
    }

    private static /* synthetic */ LensCaliType[] $values() {
        return null;
    }

    static {
        $VALUES = LensCaliType.$values();
        allValues = LensCaliType.values();
    }
}

