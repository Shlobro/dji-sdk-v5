/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PayloadIndexMode
extends Enum<PayloadIndexMode>
implements JNIProguardKeepTag {
    public static final /* enum */ PayloadIndexMode LEFT_OR_MAIN = new PayloadIndexMode(0);
    public static final /* enum */ PayloadIndexMode RIGHT = new PayloadIndexMode(1);
    public static final /* enum */ PayloadIndexMode UP = new PayloadIndexMode(2);
    public static final /* enum */ PayloadIndexMode UNKNOWN = new PayloadIndexMode(65535);
    private int value;
    private static final PayloadIndexMode[] allValues;
    private static final /* synthetic */ PayloadIndexMode[] $VALUES;

    public static PayloadIndexMode[] values() {
        return null;
    }

    public static PayloadIndexMode valueOf(String string) {
        return null;
    }

    private PayloadIndexMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PayloadIndexMode find(int n) {
        return null;
    }

    private static /* synthetic */ PayloadIndexMode[] $values() {
        return null;
    }

    static {
        $VALUES = PayloadIndexMode.$values();
        allValues = PayloadIndexMode.values();
    }
}

