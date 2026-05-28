/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class EnhanceWarnSwitch
extends Enum<EnhanceWarnSwitch>
implements JNIProguardKeepTag {
    public static final /* enum */ EnhanceWarnSwitch ALARM_ACTION_STOP = new EnhanceWarnSwitch(0);
    public static final /* enum */ EnhanceWarnSwitch ALARM_ACTION_START = new EnhanceWarnSwitch(1);
    public static final /* enum */ EnhanceWarnSwitch ALARM_ACTION_EXIT = new EnhanceWarnSwitch(2);
    public static final /* enum */ EnhanceWarnSwitch UNKNOWN = new EnhanceWarnSwitch(65535);
    private int value;
    private static final EnhanceWarnSwitch[] allValues;
    private static final /* synthetic */ EnhanceWarnSwitch[] $VALUES;

    public static EnhanceWarnSwitch[] values() {
        return null;
    }

    public static EnhanceWarnSwitch valueOf(String string) {
        return null;
    }

    private EnhanceWarnSwitch(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EnhanceWarnSwitch find(int n) {
        return null;
    }

    private static /* synthetic */ EnhanceWarnSwitch[] $values() {
        return null;
    }

    static {
        $VALUES = EnhanceWarnSwitch.$values();
        allValues = EnhanceWarnSwitch.values();
    }
}

