/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PrototypeStatus
extends Enum<PrototypeStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ PrototypeStatus CAN_USE = new PrototypeStatus(0);
    public static final /* enum */ PrototypeStatus CAN_NOT_USE = new PrototypeStatus(1);
    public static final /* enum */ PrototypeStatus UNKNOWN = new PrototypeStatus(65535);
    private int value;
    private static final PrototypeStatus[] allValues;
    private static final /* synthetic */ PrototypeStatus[] $VALUES;

    public static PrototypeStatus[] values() {
        return null;
    }

    public static PrototypeStatus valueOf(String string) {
        return null;
    }

    private PrototypeStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PrototypeStatus find(int n) {
        return null;
    }

    private static /* synthetic */ PrototypeStatus[] $values() {
        return null;
    }

    static {
        $VALUES = PrototypeStatus.$values();
        allValues = PrototypeStatus.values();
    }
}

