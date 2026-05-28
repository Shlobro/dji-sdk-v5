/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayRtkSelfCaliState
extends Enum<RelayRtkSelfCaliState>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayRtkSelfCaliState IDEL = new RelayRtkSelfCaliState(0);
    public static final /* enum */ RelayRtkSelfCaliState WORKING = new RelayRtkSelfCaliState(1);
    public static final /* enum */ RelayRtkSelfCaliState COMPLETE = new RelayRtkSelfCaliState(2);
    public static final /* enum */ RelayRtkSelfCaliState FAILED = new RelayRtkSelfCaliState(3);
    public static final /* enum */ RelayRtkSelfCaliState UNKNOWN = new RelayRtkSelfCaliState(65535);
    private int value;
    private static final RelayRtkSelfCaliState[] allValues;
    private static final /* synthetic */ RelayRtkSelfCaliState[] $VALUES;

    public static RelayRtkSelfCaliState[] values() {
        return null;
    }

    public static RelayRtkSelfCaliState valueOf(String string) {
        return null;
    }

    private RelayRtkSelfCaliState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayRtkSelfCaliState find(int n) {
        return null;
    }

    private static /* synthetic */ RelayRtkSelfCaliState[] $values() {
        return null;
    }

    static {
        $VALUES = RelayRtkSelfCaliState.$values();
        allValues = RelayRtkSelfCaliState.values();
    }
}

