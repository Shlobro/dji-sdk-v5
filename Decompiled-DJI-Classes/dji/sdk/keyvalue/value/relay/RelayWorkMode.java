/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayWorkMode
extends Enum<RelayWorkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayWorkMode NONE = new RelayWorkMode(0);
    public static final /* enum */ RelayWorkMode RELAY = new RelayWorkMode(1);
    public static final /* enum */ RelayWorkMode RTK_BASE = new RelayWorkMode(2);
    public static final /* enum */ RelayWorkMode RTK_ROVER = new RelayWorkMode(3);
    public static final /* enum */ RelayWorkMode COMPAT_RTK = new RelayWorkMode(4);
    public static final /* enum */ RelayWorkMode CLOUD = new RelayWorkMode(5);
    public static final /* enum */ RelayWorkMode WA345 = new RelayWorkMode(6);
    public static final /* enum */ RelayWorkMode TA201 = new RelayWorkMode(7);
    public static final /* enum */ RelayWorkMode EA230 = new RelayWorkMode(9);
    public static final /* enum */ RelayWorkMode PM440 = new RelayWorkMode(10);
    public static final /* enum */ RelayWorkMode UAV_NONE = new RelayWorkMode(256);
    public static final /* enum */ RelayWorkMode UAV_SINGLE_S2 = new RelayWorkMode(257);
    public static final /* enum */ RelayWorkMode UAV_DOUBLE_S2 = new RelayWorkMode(258);
    public static final /* enum */ RelayWorkMode UAV_DOUBLE_S2_WA345 = new RelayWorkMode(259);
    public static final /* enum */ RelayWorkMode UAV_DOUBLE_S2_PM440 = new RelayWorkMode(260);
    public static final /* enum */ RelayWorkMode UNKNOWN = new RelayWorkMode(65535);
    private int value;
    private static final RelayWorkMode[] allValues;
    private static final /* synthetic */ RelayWorkMode[] $VALUES;

    public static RelayWorkMode[] values() {
        return null;
    }

    public static RelayWorkMode valueOf(String string) {
        return null;
    }

    private RelayWorkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayWorkMode find(int n) {
        return null;
    }

    private static /* synthetic */ RelayWorkMode[] $values() {
        return null;
    }

    static {
        $VALUES = RelayWorkMode.$values();
        allValues = RelayWorkMode.values();
    }
}

