/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayChargeStatus
extends Enum<RelayChargeStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayChargeStatus NONE = new RelayChargeStatus(0);
    public static final /* enum */ RelayChargeStatus DISCHARGING = new RelayChargeStatus(1);
    public static final /* enum */ RelayChargeStatus FULL_CHARGED = new RelayChargeStatus(2);
    public static final /* enum */ RelayChargeStatus CHARGING = new RelayChargeStatus(3);
    public static final /* enum */ RelayChargeStatus UNKNOWN = new RelayChargeStatus(65535);
    private int value;
    private static final RelayChargeStatus[] allValues;
    private static final /* synthetic */ RelayChargeStatus[] $VALUES;

    public static RelayChargeStatus[] values() {
        return null;
    }

    public static RelayChargeStatus valueOf(String string) {
        return null;
    }

    private RelayChargeStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayChargeStatus find(int n) {
        return null;
    }

    private static /* synthetic */ RelayChargeStatus[] $values() {
        return null;
    }

    static {
        $VALUES = RelayChargeStatus.$values();
        allValues = RelayChargeStatus.values();
    }
}

