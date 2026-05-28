/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class PayloadSubType
extends Enum<PayloadSubType>
implements JNIProguardKeepTag {
    public static final /* enum */ PayloadSubType UNDEFINED = new PayloadSubType(0);
    public static final /* enum */ PayloadSubType VOICE_ZV1 = new PayloadSubType(1);
    public static final /* enum */ PayloadSubType SPOTLIGHT_ZS1 = new PayloadSubType(2);
    public static final /* enum */ PayloadSubType UNKNOWN = new PayloadSubType(65535);
    private int value;
    private static final PayloadSubType[] allValues;
    private static final /* synthetic */ PayloadSubType[] $VALUES;

    public static PayloadSubType[] values() {
        return null;
    }

    public static PayloadSubType valueOf(String string) {
        return null;
    }

    private PayloadSubType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PayloadSubType find(int n) {
        return null;
    }

    private static /* synthetic */ PayloadSubType[] $values() {
        return null;
    }

    static {
        $VALUES = PayloadSubType.$values();
        allValues = PayloadSubType.values();
    }
}

