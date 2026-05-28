/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RelayOwnerState
extends Enum<RelayOwnerState>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayOwnerState INVALID = new RelayOwnerState(0);
    public static final /* enum */ RelayOwnerState NOT_OWNER = new RelayOwnerState(1);
    public static final /* enum */ RelayOwnerState OWNER = new RelayOwnerState(2);
    public static final /* enum */ RelayOwnerState UNKNOWN = new RelayOwnerState(65535);
    private int value;
    private static final RelayOwnerState[] allValues;
    private static final /* synthetic */ RelayOwnerState[] $VALUES;

    public static RelayOwnerState[] values() {
        return null;
    }

    public static RelayOwnerState valueOf(String string) {
        return null;
    }

    private RelayOwnerState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayOwnerState find(int n) {
        return null;
    }

    private static /* synthetic */ RelayOwnerState[] $values() {
        return null;
    }

    static {
        $VALUES = RelayOwnerState.$values();
        allValues = RelayOwnerState.values();
    }
}

