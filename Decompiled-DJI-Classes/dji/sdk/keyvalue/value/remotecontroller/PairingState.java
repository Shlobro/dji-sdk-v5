/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class PairingState
extends Enum<PairingState>
implements JNIProguardKeepTag {
    public static final /* enum */ PairingState UNPAIRED = new PairingState(0);
    public static final /* enum */ PairingState PAIRING = new PairingState(1);
    public static final /* enum */ PairingState PAIRED = new PairingState(2);
    public static final /* enum */ PairingState STOP_THEN_SWITCH = new PairingState(245);
    public static final /* enum */ PairingState STOP_FW_TYPE_NOT_MATCHED = new PairingState(246);
    public static final /* enum */ PairingState STOP_DEV_MISMATCH = new PairingState(247);
    public static final /* enum */ PairingState STOP_SUB_RC_REJECT = new PairingState(248);
    public static final /* enum */ PairingState STOP_TARGET_TYPE_MISMATCH = new PairingState(249);
    public static final /* enum */ PairingState STOP_RELAY_NOT_SUPPORT_SUB_RC = new PairingState(250);
    public static final /* enum */ PairingState UNKNOWN = new PairingState(65535);
    private int value;
    private static final PairingState[] allValues;
    private static final /* synthetic */ PairingState[] $VALUES;

    public static PairingState[] values() {
        return null;
    }

    public static PairingState valueOf(String string) {
        return null;
    }

    private PairingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PairingState find(int n) {
        return null;
    }

    private static /* synthetic */ PairingState[] $values() {
        return null;
    }

    static {
        $VALUES = PairingState.$values();
        allValues = PairingState.values();
    }
}

