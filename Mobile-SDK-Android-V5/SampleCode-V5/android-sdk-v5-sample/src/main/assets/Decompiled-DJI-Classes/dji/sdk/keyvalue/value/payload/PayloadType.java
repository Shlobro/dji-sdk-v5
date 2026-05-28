/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class PayloadType
extends Enum<PayloadType>
implements JNIProguardKeepTag {
    public static final /* enum */ PayloadType SKYPORT_1 = new PayloadType(0);
    public static final /* enum */ PayloadType SKYPORT_2 = new PayloadType(1);
    public static final /* enum */ PayloadType X_PORT = new PayloadType(2);
    public static final /* enum */ PayloadType AIRBORNE_SDK = new PayloadType(3);
    public static final /* enum */ PayloadType NO_HANDRWARE_PSDK = new PayloadType(4);
    public static final /* enum */ PayloadType DJI_SELF_RESEARCH_PSDK = new PayloadType(5);
    public static final /* enum */ PayloadType EPORT_2 = new PayloadType(6);
    public static final /* enum */ PayloadType SKYPORT_3 = new PayloadType(7);
    public static final /* enum */ PayloadType DJI_PSDK_DEVICE_TYPE_OPEN_AI_BOX = new PayloadType(8);
    public static final /* enum */ PayloadType UNKNOWN = new PayloadType(65535);
    private int value;
    private static final PayloadType[] allValues;
    private static final /* synthetic */ PayloadType[] $VALUES;

    public static PayloadType[] values() {
        return null;
    }

    public static PayloadType valueOf(String string) {
        return null;
    }

    private PayloadType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PayloadType find(int n) {
        return null;
    }

    private static /* synthetic */ PayloadType[] $values() {
        return null;
    }

    static {
        $VALUES = PayloadType.$values();
        allValues = PayloadType.values();
    }
}

