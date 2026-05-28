/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class PayloadCameraType
extends Enum<PayloadCameraType>
implements JNIProguardKeepTag {
    public static final /* enum */ PayloadCameraType EP800 = new PayloadCameraType(1);
    public static final /* enum */ PayloadCameraType EP600 = new PayloadCameraType(2);
    public static final /* enum */ PayloadCameraType EP820 = new PayloadCameraType(3);
    public static final /* enum */ PayloadCameraType UNKNOWN = new PayloadCameraType(65535);
    private int value;
    private static final PayloadCameraType[] allValues;
    private static final /* synthetic */ PayloadCameraType[] $VALUES;

    public static PayloadCameraType[] values() {
        return null;
    }

    public static PayloadCameraType valueOf(String string) {
        return null;
    }

    private PayloadCameraType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PayloadCameraType find(int n) {
        return null;
    }

    private static /* synthetic */ PayloadCameraType[] $values() {
        return null;
    }

    static {
        $VALUES = PayloadCameraType.$values();
        allValues = PayloadCameraType.values();
    }
}

