/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCMassCenterCaliState
extends Enum<FCMassCenterCaliState>
implements JNIProguardKeepTag {
    public static final /* enum */ FCMassCenterCaliState STANDBY = new FCMassCenterCaliState(0);
    public static final /* enum */ FCMassCenterCaliState CALCULATING = new FCMassCenterCaliState(1);
    public static final /* enum */ FCMassCenterCaliState STATE_FINISHED = new FCMassCenterCaliState(2);
    public static final /* enum */ FCMassCenterCaliState STATE_FAILED = new FCMassCenterCaliState(3);
    public static final /* enum */ FCMassCenterCaliState UNKNOWN = new FCMassCenterCaliState(65535);
    private int value;
    private static final FCMassCenterCaliState[] allValues;
    private static final /* synthetic */ FCMassCenterCaliState[] $VALUES;

    public static FCMassCenterCaliState[] values() {
        return null;
    }

    public static FCMassCenterCaliState valueOf(String string) {
        return null;
    }

    private FCMassCenterCaliState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCMassCenterCaliState find(int n) {
        return null;
    }

    private static /* synthetic */ FCMassCenterCaliState[] $values() {
        return null;
    }

    static {
        $VALUES = FCMassCenterCaliState.$values();
        allValues = FCMassCenterCaliState.values();
    }
}

