/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RelayConnectedDevice
extends Enum<RelayConnectedDevice>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayConnectedDevice NONE = new RelayConnectedDevice(0);
    public static final /* enum */ RelayConnectedDevice RC = new RelayConnectedDevice(1);
    public static final /* enum */ RelayConnectedDevice DOCK = new RelayConnectedDevice(2);
    public static final /* enum */ RelayConnectedDevice UAV = new RelayConnectedDevice(3);
    public static final /* enum */ RelayConnectedDevice UNKNOWN = new RelayConnectedDevice(65535);
    private int value;
    private static final RelayConnectedDevice[] allValues;
    private static final /* synthetic */ RelayConnectedDevice[] $VALUES;

    public static RelayConnectedDevice[] values() {
        return null;
    }

    public static RelayConnectedDevice valueOf(String string) {
        return null;
    }

    private RelayConnectedDevice(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayConnectedDevice find(int n) {
        return null;
    }

    private static /* synthetic */ RelayConnectedDevice[] $values() {
        return null;
    }

    static {
        $VALUES = RelayConnectedDevice.$values();
        allValues = RelayConnectedDevice.values();
    }
}

