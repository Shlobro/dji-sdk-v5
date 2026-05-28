/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class EdgeComputingDeviceBindState
extends Enum<EdgeComputingDeviceBindState>
implements JNIProguardKeepTag {
    public static final /* enum */ EdgeComputingDeviceBindState UNBOUND = new EdgeComputingDeviceBindState(0);
    public static final /* enum */ EdgeComputingDeviceBindState BOUND = new EdgeComputingDeviceBindState(1);
    public static final /* enum */ EdgeComputingDeviceBindState UNKNOWN = new EdgeComputingDeviceBindState(65535);
    private int value;
    private static final EdgeComputingDeviceBindState[] allValues;
    private static final /* synthetic */ EdgeComputingDeviceBindState[] $VALUES;

    public static EdgeComputingDeviceBindState[] values() {
        return null;
    }

    public static EdgeComputingDeviceBindState valueOf(String string) {
        return null;
    }

    private EdgeComputingDeviceBindState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EdgeComputingDeviceBindState find(int n) {
        return null;
    }

    private static /* synthetic */ EdgeComputingDeviceBindState[] $values() {
        return null;
    }

    static {
        $VALUES = EdgeComputingDeviceBindState.$values();
        allValues = EdgeComputingDeviceBindState.values();
    }
}

