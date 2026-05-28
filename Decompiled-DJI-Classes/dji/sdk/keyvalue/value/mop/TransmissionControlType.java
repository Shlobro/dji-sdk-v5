/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mop;

import dji.jni.JNIProguardKeepTag;

public final class TransmissionControlType
extends Enum<TransmissionControlType>
implements JNIProguardKeepTag {
    public static final /* enum */ TransmissionControlType STABLE = new TransmissionControlType(0);
    public static final /* enum */ TransmissionControlType UNRELIABLE = new TransmissionControlType(1);
    public static final /* enum */ TransmissionControlType UNKNOWN = new TransmissionControlType(65535);
    private int value;
    private static final TransmissionControlType[] allValues;
    private static final /* synthetic */ TransmissionControlType[] $VALUES;

    public static TransmissionControlType[] values() {
        return null;
    }

    public static TransmissionControlType valueOf(String string) {
        return null;
    }

    private TransmissionControlType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TransmissionControlType find(int n) {
        return null;
    }

    private static /* synthetic */ TransmissionControlType[] $values() {
        return null;
    }

    static {
        $VALUES = TransmissionControlType.$values();
        allValues = TransmissionControlType.values();
    }
}

