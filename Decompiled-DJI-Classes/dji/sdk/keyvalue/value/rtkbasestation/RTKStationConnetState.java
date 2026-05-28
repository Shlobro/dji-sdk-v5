/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKStationConnetState
extends Enum<RTKStationConnetState>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKStationConnetState IDLE = new RTKStationConnetState(0);
    public static final /* enum */ RTKStationConnetState SCANNING = new RTKStationConnetState(1);
    public static final /* enum */ RTKStationConnetState CONNECTING = new RTKStationConnetState(2);
    public static final /* enum */ RTKStationConnetState CONNECTED = new RTKStationConnetState(3);
    public static final /* enum */ RTKStationConnetState DISCONNECTED = new RTKStationConnetState(4);
    public static final /* enum */ RTKStationConnetState UNKNOWN = new RTKStationConnetState(65535);
    private int value;
    private static final RTKStationConnetState[] allValues;
    private static final /* synthetic */ RTKStationConnetState[] $VALUES;

    public static RTKStationConnetState[] values() {
        return null;
    }

    public static RTKStationConnetState valueOf(String string) {
        return null;
    }

    private RTKStationConnetState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKStationConnetState find(int n) {
        return null;
    }

    private static /* synthetic */ RTKStationConnetState[] $values() {
        return null;
    }

    static {
        $VALUES = RTKStationConnetState.$values();
        allValues = RTKStationConnetState.values();
    }
}

