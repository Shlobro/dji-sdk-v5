/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LimitAreaShape
extends Enum<LimitAreaShape>
implements JNIProguardKeepTag {
    public static final /* enum */ LimitAreaShape CIRCLE = new LimitAreaShape(0);
    public static final /* enum */ LimitAreaShape POLYGON = new LimitAreaShape(1);
    public static final /* enum */ LimitAreaShape VIRTUAL = new LimitAreaShape(2);
    public static final /* enum */ LimitAreaShape UNKNOWN = new LimitAreaShape(65535);
    private int value;
    private static final LimitAreaShape[] allValues;
    private static final /* synthetic */ LimitAreaShape[] $VALUES;

    public static LimitAreaShape[] values() {
        return null;
    }

    public static LimitAreaShape valueOf(String string) {
        return null;
    }

    private LimitAreaShape(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LimitAreaShape find(int n) {
        return null;
    }

    private static /* synthetic */ LimitAreaShape[] $values() {
        return null;
    }

    static {
        $VALUES = LimitAreaShape.$values();
        allValues = LimitAreaShape.values();
    }
}

