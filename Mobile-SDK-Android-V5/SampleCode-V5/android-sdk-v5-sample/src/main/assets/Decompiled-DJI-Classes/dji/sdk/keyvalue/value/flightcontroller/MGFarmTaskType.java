/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGFarmTaskType
extends Enum<MGFarmTaskType>
implements JNIProguardKeepTag {
    public static final /* enum */ MGFarmTaskType M = new MGFarmTaskType(1);
    public static final /* enum */ MGFarmTaskType AB = new MGFarmTaskType(2);
    public static final /* enum */ MGFarmTaskType M2 = new MGFarmTaskType(3);
    public static final /* enum */ MGFarmTaskType WP = new MGFarmTaskType(4);
    public static final /* enum */ MGFarmTaskType UNKNOWN = new MGFarmTaskType(65535);
    private int value;
    private static final MGFarmTaskType[] allValues;
    private static final /* synthetic */ MGFarmTaskType[] $VALUES;

    public static MGFarmTaskType[] values() {
        return null;
    }

    public static MGFarmTaskType valueOf(String string) {
        return null;
    }

    private MGFarmTaskType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGFarmTaskType find(int n) {
        return null;
    }

    private static /* synthetic */ MGFarmTaskType[] $values() {
        return null;
    }

    static {
        $VALUES = MGFarmTaskType.$values();
        allValues = MGFarmTaskType.values();
    }
}

