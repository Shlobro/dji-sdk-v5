/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGFarmCmd
extends Enum<MGFarmCmd>
implements JNIProguardKeepTag {
    public static final /* enum */ MGFarmCmd ENTER = new MGFarmCmd(1);
    public static final /* enum */ MGFarmCmd START = new MGFarmCmd(2);
    public static final /* enum */ MGFarmCmd END = new MGFarmCmd(3);
    public static final /* enum */ MGFarmCmd UNKNOWN = new MGFarmCmd(65535);
    private int value;
    private static final MGFarmCmd[] allValues;
    private static final /* synthetic */ MGFarmCmd[] $VALUES;

    public static MGFarmCmd[] values() {
        return null;
    }

    public static MGFarmCmd valueOf(String string) {
        return null;
    }

    private MGFarmCmd(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGFarmCmd find(int n) {
        return null;
    }

    private static /* synthetic */ MGFarmCmd[] $values() {
        return null;
    }

    static {
        $VALUES = MGFarmCmd.$values();
        allValues = MGFarmCmd.values();
    }
}

