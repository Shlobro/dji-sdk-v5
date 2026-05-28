/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RelayBroadcastPeriod
extends Enum<RelayBroadcastPeriod>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayBroadcastPeriod ONE_SECOND = new RelayBroadcastPeriod(0);
    public static final /* enum */ RelayBroadcastPeriod TWO_SECOND = new RelayBroadcastPeriod(1);
    public static final /* enum */ RelayBroadcastPeriod FOUR_SECOND = new RelayBroadcastPeriod(2);
    public static final /* enum */ RelayBroadcastPeriod UNKNOWN = new RelayBroadcastPeriod(65535);
    private int value;
    private static final RelayBroadcastPeriod[] allValues;
    private static final /* synthetic */ RelayBroadcastPeriod[] $VALUES;

    public static RelayBroadcastPeriod[] values() {
        return null;
    }

    public static RelayBroadcastPeriod valueOf(String string) {
        return null;
    }

    private RelayBroadcastPeriod(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayBroadcastPeriod find(int n) {
        return null;
    }

    private static /* synthetic */ RelayBroadcastPeriod[] $values() {
        return null;
    }

    static {
        $VALUES = RelayBroadcastPeriod.$values();
        allValues = RelayBroadcastPeriod.values();
    }
}

