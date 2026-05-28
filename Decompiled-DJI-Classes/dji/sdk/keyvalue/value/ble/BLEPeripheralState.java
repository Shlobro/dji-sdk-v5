/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.ble;

import dji.jni.JNIProguardKeepTag;

public final class BLEPeripheralState
extends Enum<BLEPeripheralState>
implements JNIProguardKeepTag {
    public static final /* enum */ BLEPeripheralState NO_PERMISSION = new BLEPeripheralState(0);
    public static final /* enum */ BLEPeripheralState NOT_ENABLED = new BLEPeripheralState(1);
    public static final /* enum */ BLEPeripheralState DISCONNECTED = new BLEPeripheralState(2);
    public static final /* enum */ BLEPeripheralState CONNECTING = new BLEPeripheralState(3);
    public static final /* enum */ BLEPeripheralState CONNECTED = new BLEPeripheralState(4);
    public static final /* enum */ BLEPeripheralState DISCONNECTING = new BLEPeripheralState(5);
    public static final /* enum */ BLEPeripheralState NOT_SUPPORTED = new BLEPeripheralState(6);
    public static final /* enum */ BLEPeripheralState UNKNOWN = new BLEPeripheralState(65535);
    private int value;
    private static final BLEPeripheralState[] allValues;
    private static final /* synthetic */ BLEPeripheralState[] $VALUES;

    public static BLEPeripheralState[] values() {
        return null;
    }

    public static BLEPeripheralState valueOf(String string) {
        return null;
    }

    private BLEPeripheralState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BLEPeripheralState find(int n) {
        return null;
    }

    private static /* synthetic */ BLEPeripheralState[] $values() {
        return null;
    }

    static {
        $VALUES = BLEPeripheralState.$values();
        allValues = BLEPeripheralState.values();
    }
}

