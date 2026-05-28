/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ABPointState
extends Enum<ABPointState>
implements JNIProguardKeepTag {
    public static final /* enum */ ABPointState NONE = new ABPointState(0);
    public static final /* enum */ ABPointState SET_POINT = new ABPointState(1);
    public static final /* enum */ ABPointState SET_ANGLE = new ABPointState(2);
    public static final /* enum */ ABPointState CANCEL_ABPOINT_SET = new ABPointState(3);
    public static final /* enum */ ABPointState UNKNOWN = new ABPointState(65535);
    private int value;
    private static final ABPointState[] allValues;
    private static final /* synthetic */ ABPointState[] $VALUES;

    public static ABPointState[] values() {
        return null;
    }

    public static ABPointState valueOf(String string) {
        return null;
    }

    private ABPointState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ABPointState find(int n) {
        return null;
    }

    private static /* synthetic */ ABPointState[] $values() {
        return null;
    }

    static {
        $VALUES = ABPointState.$values();
        allValues = ABPointState.values();
    }
}

