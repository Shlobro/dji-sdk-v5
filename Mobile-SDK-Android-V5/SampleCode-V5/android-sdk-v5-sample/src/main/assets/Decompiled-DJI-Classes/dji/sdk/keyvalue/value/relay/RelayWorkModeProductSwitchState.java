/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayWorkModeProductSwitchState
extends Enum<RelayWorkModeProductSwitchState>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayWorkModeProductSwitchState IDLE = new RelayWorkModeProductSwitchState(0);
    public static final /* enum */ RelayWorkModeProductSwitchState SWITCH_ON_GOING = new RelayWorkModeProductSwitchState(1);
    public static final /* enum */ RelayWorkModeProductSwitchState SWITCH_SUCCESS = new RelayWorkModeProductSwitchState(2);
    public static final /* enum */ RelayWorkModeProductSwitchState SWITCH_FAILED = new RelayWorkModeProductSwitchState(3);
    public static final /* enum */ RelayWorkModeProductSwitchState NOT_READY = new RelayWorkModeProductSwitchState(4);
    public static final /* enum */ RelayWorkModeProductSwitchState UNKNOWN = new RelayWorkModeProductSwitchState(65535);
    private int value;
    private static final RelayWorkModeProductSwitchState[] allValues;
    private static final /* synthetic */ RelayWorkModeProductSwitchState[] $VALUES;

    public static RelayWorkModeProductSwitchState[] values() {
        return null;
    }

    public static RelayWorkModeProductSwitchState valueOf(String string) {
        return null;
    }

    private RelayWorkModeProductSwitchState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayWorkModeProductSwitchState find(int n) {
        return null;
    }

    private static /* synthetic */ RelayWorkModeProductSwitchState[] $values() {
        return null;
    }

    static {
        $VALUES = RelayWorkModeProductSwitchState.$values();
        allValues = RelayWorkModeProductSwitchState.values();
    }
}

