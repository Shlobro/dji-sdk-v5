/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class MRTCState
extends Enum<MRTCState>
implements JNIProguardKeepTag {
    public static final /* enum */ MRTCState OFFLINE = new MRTCState(0);
    public static final /* enum */ MRTCState ONLINE = new MRTCState(1);
    public static final /* enum */ MRTCState ERROR = new MRTCState(2);
    public static final /* enum */ MRTCState UNKNOWN = new MRTCState(255);
    private int value;
    private static final MRTCState[] allValues;
    private static final /* synthetic */ MRTCState[] $VALUES;

    public static MRTCState[] values() {
        return null;
    }

    public static MRTCState valueOf(String string) {
        return null;
    }

    private MRTCState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MRTCState find(int n) {
        return null;
    }

    private static /* synthetic */ MRTCState[] $values() {
        return null;
    }

    static {
        $VALUES = MRTCState.$values();
        allValues = MRTCState.values();
    }
}

