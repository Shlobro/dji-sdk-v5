/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcMutilDeviceState
extends Enum<RcMutilDeviceState>
implements JNIProguardKeepTag {
    public static final /* enum */ RcMutilDeviceState UNPAIRED = new RcMutilDeviceState(0);
    public static final /* enum */ RcMutilDeviceState PAIRED = new RcMutilDeviceState(1);
    public static final /* enum */ RcMutilDeviceState CONNECTED = new RcMutilDeviceState(2);
    public static final /* enum */ RcMutilDeviceState USING = new RcMutilDeviceState(3);
    public static final /* enum */ RcMutilDeviceState UNKNOWN = new RcMutilDeviceState(65535);
    private int value;
    private static final RcMutilDeviceState[] allValues;
    private static final /* synthetic */ RcMutilDeviceState[] $VALUES;

    public static RcMutilDeviceState[] values() {
        return null;
    }

    public static RcMutilDeviceState valueOf(String string) {
        return null;
    }

    private RcMutilDeviceState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcMutilDeviceState find(int n) {
        return null;
    }

    private static /* synthetic */ RcMutilDeviceState[] $values() {
        return null;
    }

    static {
        $VALUES = RcMutilDeviceState.$values();
        allValues = RcMutilDeviceState.values();
    }
}

