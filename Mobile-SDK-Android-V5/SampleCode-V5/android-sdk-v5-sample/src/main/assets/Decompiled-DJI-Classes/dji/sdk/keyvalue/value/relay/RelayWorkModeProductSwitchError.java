/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayWorkModeProductSwitchError
extends Enum<RelayWorkModeProductSwitchError>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayWorkModeProductSwitchError NO_ERROR = new RelayWorkModeProductSwitchError(0);
    public static final /* enum */ RelayWorkModeProductSwitchError TIMEOUT = new RelayWorkModeProductSwitchError(1);
    public static final /* enum */ RelayWorkModeProductSwitchError AGAIN = new RelayWorkModeProductSwitchError(2);
    public static final /* enum */ RelayWorkModeProductSwitchError ERROR_PARAM = new RelayWorkModeProductSwitchError(3);
    public static final /* enum */ RelayWorkModeProductSwitchError NOT_SUPPORT = new RelayWorkModeProductSwitchError(4);
    public static final /* enum */ RelayWorkModeProductSwitchError REPEAT_REQUEST = new RelayWorkModeProductSwitchError(5);
    public static final /* enum */ RelayWorkModeProductSwitchError NO_NEED_SWITCH = new RelayWorkModeProductSwitchError(6);
    public static final /* enum */ RelayWorkModeProductSwitchError INTERNAL_ERROR = new RelayWorkModeProductSwitchError(7);
    public static final /* enum */ RelayWorkModeProductSwitchError UNKNOWN = new RelayWorkModeProductSwitchError(65535);
    private int value;
    private static final RelayWorkModeProductSwitchError[] allValues;
    private static final /* synthetic */ RelayWorkModeProductSwitchError[] $VALUES;

    public static RelayWorkModeProductSwitchError[] values() {
        return null;
    }

    public static RelayWorkModeProductSwitchError valueOf(String string) {
        return null;
    }

    private RelayWorkModeProductSwitchError(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayWorkModeProductSwitchError find(int n) {
        return null;
    }

    private static /* synthetic */ RelayWorkModeProductSwitchError[] $values() {
        return null;
    }

    static {
        $VALUES = RelayWorkModeProductSwitchError.$values();
        allValues = RelayWorkModeProductSwitchError.values();
    }
}

