/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcUnits
extends Enum<RcUnits>
implements JNIProguardKeepTag {
    public static final /* enum */ RcUnits UNITS_INCH = new RcUnits(0);
    public static final /* enum */ RcUnits UNITS_METRIC = new RcUnits(1);
    public static final /* enum */ RcUnits UNKNOWN = new RcUnits(65535);
    private int value;
    private static final RcUnits[] allValues;
    private static final /* synthetic */ RcUnits[] $VALUES;

    public static RcUnits[] values() {
        return null;
    }

    public static RcUnits valueOf(String string) {
        return null;
    }

    private RcUnits(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcUnits find(int n) {
        return null;
    }

    private static /* synthetic */ RcUnits[] $values() {
        return null;
    }

    static {
        $VALUES = RcUnits.$values();
        allValues = RcUnits.values();
    }
}

