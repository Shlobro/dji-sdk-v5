/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PayloadNegotiateDeviceState
extends Enum<PayloadNegotiateDeviceState>
implements JNIProguardKeepTag {
    public static final /* enum */ PayloadNegotiateDeviceState ADD = new PayloadNegotiateDeviceState(17);
    public static final /* enum */ PayloadNegotiateDeviceState REMOVE = new PayloadNegotiateDeviceState(34);
    public static final /* enum */ PayloadNegotiateDeviceState DOWN = new PayloadNegotiateDeviceState(51);
    public static final /* enum */ PayloadNegotiateDeviceState ALIVE = new PayloadNegotiateDeviceState(68);
    public static final /* enum */ PayloadNegotiateDeviceState OTHER = new PayloadNegotiateDeviceState(85);
    public static final /* enum */ PayloadNegotiateDeviceState UNKNOWN = new PayloadNegotiateDeviceState(65535);
    private int value;
    private static final PayloadNegotiateDeviceState[] allValues;
    private static final /* synthetic */ PayloadNegotiateDeviceState[] $VALUES;

    public static PayloadNegotiateDeviceState[] values() {
        return null;
    }

    public static PayloadNegotiateDeviceState valueOf(String string) {
        return null;
    }

    private PayloadNegotiateDeviceState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PayloadNegotiateDeviceState find(int n) {
        return null;
    }

    private static /* synthetic */ PayloadNegotiateDeviceState[] $values() {
        return null;
    }

    static {
        $VALUES = PayloadNegotiateDeviceState.$values();
        allValues = PayloadNegotiateDeviceState.values();
    }
}

