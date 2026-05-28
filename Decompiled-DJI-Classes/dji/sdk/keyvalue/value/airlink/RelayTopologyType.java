/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class RelayTopologyType
extends Enum<RelayTopologyType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayTopologyType NONE = new RelayTopologyType(0);
    public static final /* enum */ RelayTopologyType P2MP_FIXED_1 = new RelayTopologyType(1);
    public static final /* enum */ RelayTopologyType P2MP_FIXED_2 = new RelayTopologyType(2);
    public static final /* enum */ RelayTopologyType P2MP_FIXED_MULTI_PATH = new RelayTopologyType(3);
    public static final /* enum */ RelayTopologyType MP2P_FIXED_1 = new RelayTopologyType(4);
    public static final /* enum */ RelayTopologyType MP2P_FIXED_2 = new RelayTopologyType(5);
    public static final /* enum */ RelayTopologyType MP2P_FIXED_MULTI_PATH = new RelayTopologyType(6);
    public static final /* enum */ RelayTopologyType UNKNOWN = new RelayTopologyType(65535);
    private int value;
    private static final RelayTopologyType[] allValues;
    private static final /* synthetic */ RelayTopologyType[] $VALUES;

    public static RelayTopologyType[] values() {
        return null;
    }

    public static RelayTopologyType valueOf(String string) {
        return null;
    }

    private RelayTopologyType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayTopologyType find(int n) {
        return null;
    }

    private static /* synthetic */ RelayTopologyType[] $values() {
        return null;
    }

    static {
        $VALUES = RelayTopologyType.$values();
        allValues = RelayTopologyType.values();
    }
}

