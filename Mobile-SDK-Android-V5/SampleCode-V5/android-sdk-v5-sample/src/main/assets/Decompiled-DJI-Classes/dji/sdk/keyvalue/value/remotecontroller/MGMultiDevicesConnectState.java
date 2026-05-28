/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGMultiDevicesConnectState
extends Enum<MGMultiDevicesConnectState>
implements JNIProguardKeepTag {
    public static final /* enum */ MGMultiDevicesConnectState UN_PAIRING = new MGMultiDevicesConnectState(0);
    public static final /* enum */ MGMultiDevicesConnectState PAIRING = new MGMultiDevicesConnectState(1);
    public static final /* enum */ MGMultiDevicesConnectState CONNECT = new MGMultiDevicesConnectState(2);
    public static final /* enum */ MGMultiDevicesConnectState IN_USE = new MGMultiDevicesConnectState(3);
    public static final /* enum */ MGMultiDevicesConnectState UNKNOWN = new MGMultiDevicesConnectState(65535);
    private int value;
    private static final MGMultiDevicesConnectState[] allValues;
    private static final /* synthetic */ MGMultiDevicesConnectState[] $VALUES;

    public static MGMultiDevicesConnectState[] values() {
        return null;
    }

    public static MGMultiDevicesConnectState valueOf(String string) {
        return null;
    }

    private MGMultiDevicesConnectState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGMultiDevicesConnectState find(int n) {
        return null;
    }

    private static /* synthetic */ MGMultiDevicesConnectState[] $values() {
        return null;
    }

    static {
        $VALUES = MGMultiDevicesConnectState.$values();
        allValues = MGMultiDevicesConnectState.values();
    }
}

