/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGFarmWorkMode
extends Enum<MGFarmWorkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ MGFarmWorkMode FLOW_SPEED = new MGFarmWorkMode(1);
    public static final /* enum */ MGFarmWorkMode DOSAGE = new MGFarmWorkMode(2);
    public static final /* enum */ MGFarmWorkMode UNKNOWN = new MGFarmWorkMode(65535);
    private int value;
    private static final MGFarmWorkMode[] allValues;
    private static final /* synthetic */ MGFarmWorkMode[] $VALUES;

    public static MGFarmWorkMode[] values() {
        return null;
    }

    public static MGFarmWorkMode valueOf(String string) {
        return null;
    }

    private MGFarmWorkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGFarmWorkMode find(int n) {
        return null;
    }

    private static /* synthetic */ MGFarmWorkMode[] $values() {
        return null;
    }

    static {
        $VALUES = MGFarmWorkMode.$values();
        allValues = MGFarmWorkMode.values();
    }
}

