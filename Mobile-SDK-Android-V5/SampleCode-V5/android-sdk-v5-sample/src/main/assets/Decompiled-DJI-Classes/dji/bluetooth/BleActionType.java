/*
 * Decompiled with CFR 0.152.
 */
package dji.bluetooth;

public final class BleActionType
extends Enum<BleActionType> {
    public static final /* enum */ BleActionType START_SCAN = new BleActionType(0);
    public static final /* enum */ BleActionType STOP_SCAN = new BleActionType(1);
    public static final /* enum */ BleActionType START_CONNECT = new BleActionType(2);
    public static final /* enum */ BleActionType DISCONNECT = new BleActionType(3);
    public static final /* enum */ BleActionType START_BROADCAST_DATA = new BleActionType(4);
    public static final /* enum */ BleActionType STOP_BROADCAST_DATA = new BleActionType(5);
    private int value;
    private static final /* synthetic */ BleActionType[] $VALUES;

    public static BleActionType[] values() {
        return null;
    }

    public static BleActionType valueOf(String string2) {
        return null;
    }

    private BleActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BleActionType find(int n) {
        return null;
    }

    private static /* synthetic */ BleActionType[] $values() {
        return null;
    }

    static {
        $VALUES = BleActionType.$values();
    }
}

