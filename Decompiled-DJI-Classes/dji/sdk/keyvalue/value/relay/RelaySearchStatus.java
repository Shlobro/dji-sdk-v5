/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelaySearchStatus
extends Enum<RelaySearchStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ RelaySearchStatus IDLE = new RelaySearchStatus(0);
    public static final /* enum */ RelaySearchStatus SEARCHING = new RelaySearchStatus(1);
    public static final /* enum */ RelaySearchStatus CONNECT = new RelaySearchStatus(2);
    public static final /* enum */ RelaySearchStatus UNKNOWN = new RelaySearchStatus(65535);
    private int value;
    private static final RelaySearchStatus[] allValues;
    private static final /* synthetic */ RelaySearchStatus[] $VALUES;

    public static RelaySearchStatus[] values() {
        return null;
    }

    public static RelaySearchStatus valueOf(String string) {
        return null;
    }

    private RelaySearchStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelaySearchStatus find(int n) {
        return null;
    }

    private static /* synthetic */ RelaySearchStatus[] $values() {
        return null;
    }

    static {
        $VALUES = RelaySearchStatus.$values();
        allValues = RelaySearchStatus.values();
    }
}

