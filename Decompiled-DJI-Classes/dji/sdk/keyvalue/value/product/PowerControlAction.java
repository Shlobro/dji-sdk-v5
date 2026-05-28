/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class PowerControlAction
extends Enum<PowerControlAction>
implements JNIProguardKeepTag {
    public static final /* enum */ PowerControlAction WARM_REBOOT = new PowerControlAction(0);
    public static final /* enum */ PowerControlAction COLD_REBOOT = new PowerControlAction(1);
    public static final /* enum */ PowerControlAction POWER_OFF = new PowerControlAction(2);
    public static final /* enum */ PowerControlAction UNKNOWN = new PowerControlAction(65535);
    private int value;
    private static final PowerControlAction[] allValues;
    private static final /* synthetic */ PowerControlAction[] $VALUES;

    public static PowerControlAction[] values() {
        return null;
    }

    public static PowerControlAction valueOf(String string) {
        return null;
    }

    private PowerControlAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PowerControlAction find(int n) {
        return null;
    }

    private static /* synthetic */ PowerControlAction[] $values() {
        return null;
    }

    static {
        $VALUES = PowerControlAction.$values();
        allValues = PowerControlAction.values();
    }
}

