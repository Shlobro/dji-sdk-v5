/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RtkAccountType
extends Enum<RtkAccountType>
implements JNIProguardKeepTag {
    public static final /* enum */ RtkAccountType NTRIP = new RtkAccountType(0);
    public static final /* enum */ RtkAccountType QX = new RtkAccountType(1);
    public static final /* enum */ RtkAccountType UNKNOWN = new RtkAccountType(65535);
    private int value;
    private static final RtkAccountType[] allValues;
    private static final /* synthetic */ RtkAccountType[] $VALUES;

    public static RtkAccountType[] values() {
        return null;
    }

    public static RtkAccountType valueOf(String string) {
        return null;
    }

    private RtkAccountType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RtkAccountType find(int n) {
        return null;
    }

    private static /* synthetic */ RtkAccountType[] $values() {
        return null;
    }

    static {
        $VALUES = RtkAccountType.$values();
        allValues = RtkAccountType.values();
    }
}

