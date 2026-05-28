/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayPairingState
extends Enum<RelayPairingState>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayPairingState IDEL = new RelayPairingState(3);
    public static final /* enum */ RelayPairingState CONN_STATE = new RelayPairingState(4);
    public static final /* enum */ RelayPairingState PAIRING_STATE = new RelayPairingState(5);
    public static final /* enum */ RelayPairingState LOST_STATE = new RelayPairingState(6);
    public static final /* enum */ RelayPairingState AMT_STATE = new RelayPairingState(7);
    public static final /* enum */ RelayPairingState ERROR_STATE = new RelayPairingState(7);
    public static final /* enum */ RelayPairingState UNKNOWN = new RelayPairingState(65535);
    private int value;
    private static final RelayPairingState[] allValues;
    private static final /* synthetic */ RelayPairingState[] $VALUES;

    public static RelayPairingState[] values() {
        return null;
    }

    public static RelayPairingState valueOf(String string) {
        return null;
    }

    private RelayPairingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayPairingState find(int n) {
        return null;
    }

    private static /* synthetic */ RelayPairingState[] $values() {
        return null;
    }

    static {
        $VALUES = RelayPairingState.$values();
        allValues = RelayPairingState.values();
    }
}

