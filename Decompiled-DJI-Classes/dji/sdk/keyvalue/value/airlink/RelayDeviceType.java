/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class RelayDeviceType
extends Enum<RelayDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayDeviceType T_UVA = new RelayDeviceType(0);
    public static final /* enum */ RelayDeviceType R_UVA = new RelayDeviceType(1);
    public static final /* enum */ RelayDeviceType UNKNOWN = new RelayDeviceType(65535);
    private int value;
    private static final RelayDeviceType[] allValues;
    private static final /* synthetic */ RelayDeviceType[] $VALUES;

    public static RelayDeviceType[] values() {
        return null;
    }

    public static RelayDeviceType valueOf(String string) {
        return null;
    }

    private RelayDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ RelayDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = RelayDeviceType.$values();
        allValues = RelayDeviceType.values();
    }
}

