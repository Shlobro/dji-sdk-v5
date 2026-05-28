/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGSprayWorkState
extends Enum<MGSprayWorkState>
implements JNIProguardKeepTag {
    public static final /* enum */ MGSprayWorkState STOP = new MGSprayWorkState(0);
    public static final /* enum */ MGSprayWorkState WORKING = new MGSprayWorkState(1);
    public static final /* enum */ MGSprayWorkState CALIBRATING = new MGSprayWorkState(2);
    public static final /* enum */ MGSprayWorkState UNKNOWN = new MGSprayWorkState(65535);
    private int value;
    private static final MGSprayWorkState[] allValues;
    private static final /* synthetic */ MGSprayWorkState[] $VALUES;

    public static MGSprayWorkState[] values() {
        return null;
    }

    public static MGSprayWorkState valueOf(String string) {
        return null;
    }

    private MGSprayWorkState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGSprayWorkState find(int n) {
        return null;
    }

    private static /* synthetic */ MGSprayWorkState[] $values() {
        return null;
    }

    static {
        $VALUES = MGSprayWorkState.$values();
        allValues = MGSprayWorkState.values();
    }
}

