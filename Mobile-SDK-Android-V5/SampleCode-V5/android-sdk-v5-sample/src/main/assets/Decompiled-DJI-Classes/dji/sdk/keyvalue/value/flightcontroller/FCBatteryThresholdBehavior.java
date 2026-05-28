/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCBatteryThresholdBehavior
extends Enum<FCBatteryThresholdBehavior>
implements JNIProguardKeepTag {
    public static final /* enum */ FCBatteryThresholdBehavior FLY_NORMALLY = new FCBatteryThresholdBehavior(0);
    public static final /* enum */ FCBatteryThresholdBehavior GO_HOME = new FCBatteryThresholdBehavior(1);
    public static final /* enum */ FCBatteryThresholdBehavior LAND_IMMEDIATELY = new FCBatteryThresholdBehavior(2);
    public static final /* enum */ FCBatteryThresholdBehavior UNKNOWN = new FCBatteryThresholdBehavior(65535);
    private int value;
    private static final FCBatteryThresholdBehavior[] allValues;
    private static final /* synthetic */ FCBatteryThresholdBehavior[] $VALUES;

    public static FCBatteryThresholdBehavior[] values() {
        return null;
    }

    public static FCBatteryThresholdBehavior valueOf(String string) {
        return null;
    }

    private FCBatteryThresholdBehavior(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCBatteryThresholdBehavior find(int n) {
        return null;
    }

    private static /* synthetic */ FCBatteryThresholdBehavior[] $values() {
        return null;
    }

    static {
        $VALUES = FCBatteryThresholdBehavior.$values();
        allValues = FCBatteryThresholdBehavior.values();
    }
}

