/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RelayBinSwitchStatus
extends Enum<RelayBinSwitchStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayBinSwitchStatus INVALID = new RelayBinSwitchStatus(0);
    public static final /* enum */ RelayBinSwitchStatus ONGOING = new RelayBinSwitchStatus(1);
    public static final /* enum */ RelayBinSwitchStatus DONE = new RelayBinSwitchStatus(2);
    public static final /* enum */ RelayBinSwitchStatus UNKNOWN = new RelayBinSwitchStatus(65535);
    private int value;
    private static final RelayBinSwitchStatus[] allValues;
    private static final /* synthetic */ RelayBinSwitchStatus[] $VALUES;

    public static RelayBinSwitchStatus[] values() {
        return null;
    }

    public static RelayBinSwitchStatus valueOf(String string) {
        return null;
    }

    private RelayBinSwitchStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayBinSwitchStatus find(int n) {
        return null;
    }

    private static /* synthetic */ RelayBinSwitchStatus[] $values() {
        return null;
    }

    static {
        $VALUES = RelayBinSwitchStatus.$values();
        allValues = RelayBinSwitchStatus.values();
    }
}

