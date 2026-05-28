/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayRtkPostionType
extends Enum<RelayRtkPostionType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayRtkPostionType BASE_STATION_MODE = new RelayRtkPostionType(1);
    public static final /* enum */ RelayRtkPostionType NONE = new RelayRtkPostionType(15);
    public static final /* enum */ RelayRtkPostionType SINGLE_POINT = new RelayRtkPostionType(16);
    public static final /* enum */ RelayRtkPostionType FLOAT = new RelayRtkPostionType(34);
    public static final /* enum */ RelayRtkPostionType FIXED_POINT = new RelayRtkPostionType(50);
    public static final /* enum */ RelayRtkPostionType UNKNOWN = new RelayRtkPostionType(65535);
    private int value;
    private static final RelayRtkPostionType[] allValues;
    private static final /* synthetic */ RelayRtkPostionType[] $VALUES;

    public static RelayRtkPostionType[] values() {
        return null;
    }

    public static RelayRtkPostionType valueOf(String string) {
        return null;
    }

    private RelayRtkPostionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayRtkPostionType find(int n) {
        return null;
    }

    private static /* synthetic */ RelayRtkPostionType[] $values() {
        return null;
    }

    static {
        $VALUES = RelayRtkPostionType.$values();
        allValues = RelayRtkPostionType.values();
    }
}

