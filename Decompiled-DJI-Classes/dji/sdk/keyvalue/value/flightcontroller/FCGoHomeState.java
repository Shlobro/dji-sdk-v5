/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCGoHomeState
extends Enum<FCGoHomeState>
implements JNIProguardKeepTag {
    public static final /* enum */ FCGoHomeState IDLE = new FCGoHomeState(0);
    public static final /* enum */ FCGoHomeState PREASCENDING = new FCGoHomeState(1);
    public static final /* enum */ FCGoHomeState ALIGN = new FCGoHomeState(2);
    public static final /* enum */ FCGoHomeState ASCENDING = new FCGoHomeState(3);
    public static final /* enum */ FCGoHomeState CRUISE = new FCGoHomeState(4);
    public static final /* enum */ FCGoHomeState BRAKING = new FCGoHomeState(5);
    public static final /* enum */ FCGoHomeState AVOID_ASCENDING = new FCGoHomeState(6);
    public static final /* enum */ FCGoHomeState COMPLETED = new FCGoHomeState(7);
    public static final /* enum */ FCGoHomeState UNKNOWN = new FCGoHomeState(65535);
    private int value;
    private static final FCGoHomeState[] allValues;
    private static final /* synthetic */ FCGoHomeState[] $VALUES;

    public static FCGoHomeState[] values() {
        return null;
    }

    public static FCGoHomeState valueOf(String string) {
        return null;
    }

    private FCGoHomeState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCGoHomeState find(int n) {
        return null;
    }

    private static /* synthetic */ FCGoHomeState[] $values() {
        return null;
    }

    static {
        $VALUES = FCGoHomeState.$values();
        allValues = FCGoHomeState.values();
    }
}

