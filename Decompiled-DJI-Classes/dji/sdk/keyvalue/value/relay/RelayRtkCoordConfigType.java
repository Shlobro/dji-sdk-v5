/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayRtkCoordConfigType
extends Enum<RelayRtkCoordConfigType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayRtkCoordConfigType INVALID = new RelayRtkCoordConfigType(0);
    public static final /* enum */ RelayRtkCoordConfigType MANUAL = new RelayRtkCoordConfigType(1);
    public static final /* enum */ RelayRtkCoordConfigType NET_RTK = new RelayRtkCoordConfigType(2);
    public static final /* enum */ RelayRtkCoordConfigType UNKNOWN = new RelayRtkCoordConfigType(65535);
    private int value;
    private static final RelayRtkCoordConfigType[] allValues;
    private static final /* synthetic */ RelayRtkCoordConfigType[] $VALUES;

    public static RelayRtkCoordConfigType[] values() {
        return null;
    }

    public static RelayRtkCoordConfigType valueOf(String string) {
        return null;
    }

    private RelayRtkCoordConfigType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayRtkCoordConfigType find(int n) {
        return null;
    }

    private static /* synthetic */ RelayRtkCoordConfigType[] $values() {
        return null;
    }

    static {
        $VALUES = RelayRtkCoordConfigType.$values();
        allValues = RelayRtkCoordConfigType.values();
    }
}

