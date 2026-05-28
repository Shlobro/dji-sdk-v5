/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class VfenceFileState
extends Enum<VfenceFileState>
implements JNIProguardKeepTag {
    public static final /* enum */ VfenceFileState LOAD_SUCCESS = new VfenceFileState(0);
    public static final /* enum */ VfenceFileState LOADING = new VfenceFileState(1);
    public static final /* enum */ VfenceFileState LOAD_FAIL = new VfenceFileState(2);
    public static final /* enum */ VfenceFileState UNKNOWN = new VfenceFileState(65535);
    private int value;
    private static final VfenceFileState[] allValues;
    private static final /* synthetic */ VfenceFileState[] $VALUES;

    public static VfenceFileState[] values() {
        return null;
    }

    public static VfenceFileState valueOf(String string) {
        return null;
    }

    private VfenceFileState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VfenceFileState find(int n) {
        return null;
    }

    private static /* synthetic */ VfenceFileState[] $values() {
        return null;
    }

    static {
        $VALUES = VfenceFileState.$values();
        allValues = VfenceFileState.values();
    }
}

