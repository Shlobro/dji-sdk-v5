/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class LTENetState
extends Enum<LTENetState>
implements JNIProguardKeepTag {
    public static final /* enum */ LTENetState DJI_LTE_NET_STATE_UNKNOWN = new LTENetState(0);
    public static final /* enum */ LTENetState DJI_LTE_NET_STATE_DISCONNECT = new LTENetState(1);
    public static final /* enum */ LTENetState DJI_LTE_NET_STATE_CONNECTED = new LTENetState(2);
    public static final /* enum */ LTENetState DJI_LTE_NET_STATE_EXCEPTION = new LTENetState(3);
    public static final /* enum */ LTENetState DJI_LTE_NET_STATE_MAX = new LTENetState(4);
    public static final /* enum */ LTENetState UNKNOWN = new LTENetState(255);
    private int value;
    private static final LTENetState[] allValues;
    private static final /* synthetic */ LTENetState[] $VALUES;

    public static LTENetState[] values() {
        return null;
    }

    public static LTENetState valueOf(String string) {
        return null;
    }

    private LTENetState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LTENetState find(int n) {
        return null;
    }

    private static /* synthetic */ LTENetState[] $values() {
        return null;
    }

    static {
        $VALUES = LTENetState.$values();
        allValues = LTENetState.values();
    }
}

