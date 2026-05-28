/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGFpvLed
extends Enum<MGFpvLed>
implements JNIProguardKeepTag {
    public static final /* enum */ MGFpvLed FRONT = new MGFpvLed(0);
    public static final /* enum */ MGFpvLed BACK = new MGFpvLed(1);
    public static final /* enum */ MGFpvLed UNKNOWN = new MGFpvLed(65535);
    private int value;
    private static final MGFpvLed[] allValues;
    private static final /* synthetic */ MGFpvLed[] $VALUES;

    public static MGFpvLed[] values() {
        return null;
    }

    public static MGFpvLed valueOf(String string) {
        return null;
    }

    private MGFpvLed(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGFpvLed find(int n) {
        return null;
    }

    private static /* synthetic */ MGFpvLed[] $values() {
        return null;
    }

    static {
        $VALUES = MGFpvLed.$values();
        allValues = MGFpvLed.values();
    }
}

