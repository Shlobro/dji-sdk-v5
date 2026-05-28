/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class EdgeComputingDeviceBindResult
extends Enum<EdgeComputingDeviceBindResult>
implements JNIProguardKeepTag {
    public static final /* enum */ EdgeComputingDeviceBindResult SUCCESSED = new EdgeComputingDeviceBindResult(0);
    public static final /* enum */ EdgeComputingDeviceBindResult UUID_INIT_ERROR = new EdgeComputingDeviceBindResult(1);
    public static final /* enum */ EdgeComputingDeviceBindResult STORAGE_ERROR = new EdgeComputingDeviceBindResult(2);
    public static final /* enum */ EdgeComputingDeviceBindResult UNKNOWN = new EdgeComputingDeviceBindResult(65535);
    private int value;
    private static final EdgeComputingDeviceBindResult[] allValues;
    private static final /* synthetic */ EdgeComputingDeviceBindResult[] $VALUES;

    public static EdgeComputingDeviceBindResult[] values() {
        return null;
    }

    public static EdgeComputingDeviceBindResult valueOf(String string) {
        return null;
    }

    private EdgeComputingDeviceBindResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EdgeComputingDeviceBindResult find(int n) {
        return null;
    }

    private static /* synthetic */ EdgeComputingDeviceBindResult[] $values() {
        return null;
    }

    static {
        $VALUES = EdgeComputingDeviceBindResult.$values();
        allValues = EdgeComputingDeviceBindResult.values();
    }
}

