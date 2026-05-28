/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayWorkStatus
extends Enum<RelayWorkStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayWorkStatus NORMAL = new RelayWorkStatus(0);
    public static final /* enum */ RelayWorkStatus LOCAL_DEBUG = new RelayWorkStatus(1);
    public static final /* enum */ RelayWorkStatus REMOTE_DEBUG = new RelayWorkStatus(2);
    public static final /* enum */ RelayWorkStatus UPGRADE = new RelayWorkStatus(3);
    public static final /* enum */ RelayWorkStatus EXECUTE_TASK = new RelayWorkStatus(4);
    public static final /* enum */ RelayWorkStatus GO_HOME = new RelayWorkStatus(5);
    public static final /* enum */ RelayWorkStatus MANUAL_FLIGHT = new RelayWorkStatus(6);
    public static final /* enum */ RelayWorkStatus UNKNOWN = new RelayWorkStatus(65535);
    private int value;
    private static final RelayWorkStatus[] allValues;
    private static final /* synthetic */ RelayWorkStatus[] $VALUES;

    public static RelayWorkStatus[] values() {
        return null;
    }

    public static RelayWorkStatus valueOf(String string) {
        return null;
    }

    private RelayWorkStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayWorkStatus find(int n) {
        return null;
    }

    private static /* synthetic */ RelayWorkStatus[] $values() {
        return null;
    }

    static {
        $VALUES = RelayWorkStatus.$values();
        allValues = RelayWorkStatus.values();
    }
}

