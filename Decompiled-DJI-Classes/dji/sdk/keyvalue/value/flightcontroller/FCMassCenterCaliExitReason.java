/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCMassCenterCaliExitReason
extends Enum<FCMassCenterCaliExitReason>
implements JNIProguardKeepTag {
    public static final /* enum */ FCMassCenterCaliExitReason REASON_SUCCESS = new FCMassCenterCaliExitReason(0);
    public static final /* enum */ FCMassCenterCaliExitReason MANNUAL_EXIT = new FCMassCenterCaliExitReason(1);
    public static final /* enum */ FCMassCenterCaliExitReason FAIL_NOT_IN_HOVER = new FCMassCenterCaliExitReason(2);
    public static final /* enum */ FCMassCenterCaliExitReason FAIL_BIG_WIND = new FCMassCenterCaliExitReason(3);
    public static final /* enum */ FCMassCenterCaliExitReason UNKNOWN = new FCMassCenterCaliExitReason(65535);
    private int value;
    private static final FCMassCenterCaliExitReason[] allValues;
    private static final /* synthetic */ FCMassCenterCaliExitReason[] $VALUES;

    public static FCMassCenterCaliExitReason[] values() {
        return null;
    }

    public static FCMassCenterCaliExitReason valueOf(String string) {
        return null;
    }

    private FCMassCenterCaliExitReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCMassCenterCaliExitReason find(int n) {
        return null;
    }

    private static /* synthetic */ FCMassCenterCaliExitReason[] $values() {
        return null;
    }

    static {
        $VALUES = FCMassCenterCaliExitReason.$values();
        allValues = FCMassCenterCaliExitReason.values();
    }
}

