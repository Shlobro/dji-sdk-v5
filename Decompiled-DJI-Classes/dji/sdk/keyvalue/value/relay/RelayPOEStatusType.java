/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayPOEStatusType
extends Enum<RelayPOEStatusType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayPOEStatusType NONE = new RelayPOEStatusType(0);
    public static final /* enum */ RelayPOEStatusType NOT_SUPPORT = new RelayPOEStatusType(1);
    public static final /* enum */ RelayPOEStatusType CHARGE_POWER_25_5W = new RelayPOEStatusType(2);
    public static final /* enum */ RelayPOEStatusType CHARGE_POWER_51W = new RelayPOEStatusType(3);
    public static final /* enum */ RelayPOEStatusType CHARGE_POWER_71W = new RelayPOEStatusType(4);
    public static final /* enum */ RelayPOEStatusType UNKNOWN = new RelayPOEStatusType(65535);
    private int value;
    private static final RelayPOEStatusType[] allValues;
    private static final /* synthetic */ RelayPOEStatusType[] $VALUES;

    public static RelayPOEStatusType[] values() {
        return null;
    }

    public static RelayPOEStatusType valueOf(String string) {
        return null;
    }

    private RelayPOEStatusType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayPOEStatusType find(int n) {
        return null;
    }

    private static /* synthetic */ RelayPOEStatusType[] $values() {
        return null;
    }

    static {
        $VALUES = RelayPOEStatusType.$values();
        allValues = RelayPOEStatusType.values();
    }
}

