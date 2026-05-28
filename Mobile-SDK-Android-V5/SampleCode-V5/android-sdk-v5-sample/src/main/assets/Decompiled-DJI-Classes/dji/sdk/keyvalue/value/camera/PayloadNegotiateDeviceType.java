/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PayloadNegotiateDeviceType
extends Enum<PayloadNegotiateDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ PayloadNegotiateDeviceType CAMERA = new PayloadNegotiateDeviceType(0);
    public static final /* enum */ PayloadNegotiateDeviceType RADAR = new PayloadNegotiateDeviceType(1);
    public static final /* enum */ PayloadNegotiateDeviceType PSDK = new PayloadNegotiateDeviceType(2);
    public static final /* enum */ PayloadNegotiateDeviceType UNKNOWN = new PayloadNegotiateDeviceType(65535);
    private int value;
    private static final PayloadNegotiateDeviceType[] allValues;
    private static final /* synthetic */ PayloadNegotiateDeviceType[] $VALUES;

    public static PayloadNegotiateDeviceType[] values() {
        return null;
    }

    public static PayloadNegotiateDeviceType valueOf(String string) {
        return null;
    }

    private PayloadNegotiateDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PayloadNegotiateDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ PayloadNegotiateDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = PayloadNegotiateDeviceType.$values();
        allValues = PayloadNegotiateDeviceType.values();
    }
}

