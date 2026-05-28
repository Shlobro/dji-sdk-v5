/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SmartEyeState
extends Enum<SmartEyeState>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartEyeState NONE = new SmartEyeState(0);
    public static final /* enum */ SmartEyeState RECOGNIZING_TARGET = new SmartEyeState(1);
    public static final /* enum */ SmartEyeState WAITING_FOR_CONFIRMATION = new SmartEyeState(2);
    public static final /* enum */ SmartEyeState TRACKING_OBJECT = new SmartEyeState(3);
    public static final /* enum */ SmartEyeState WAIT_FOR_ESTIMATION = new SmartEyeState(4);
    public static final /* enum */ SmartEyeState UNKNOWN = new SmartEyeState(255);
    private int value;
    private static final SmartEyeState[] allValues;
    private static final /* synthetic */ SmartEyeState[] $VALUES;

    public static SmartEyeState[] values() {
        return null;
    }

    public static SmartEyeState valueOf(String string) {
        return null;
    }

    private SmartEyeState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartEyeState find(int n) {
        return null;
    }

    private static /* synthetic */ SmartEyeState[] $values() {
        return null;
    }

    static {
        $VALUES = SmartEyeState.$values();
        allValues = SmartEyeState.values();
    }
}

