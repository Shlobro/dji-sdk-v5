/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGFarmFlyDirection
extends Enum<MGFarmFlyDirection>
implements JNIProguardKeepTag {
    public static final /* enum */ MGFarmFlyDirection LEFT = new MGFarmFlyDirection(1);
    public static final /* enum */ MGFarmFlyDirection RIGHT = new MGFarmFlyDirection(2);
    public static final /* enum */ MGFarmFlyDirection UNKNOWN = new MGFarmFlyDirection(65535);
    private int value;
    private static final MGFarmFlyDirection[] allValues;
    private static final /* synthetic */ MGFarmFlyDirection[] $VALUES;

    public static MGFarmFlyDirection[] values() {
        return null;
    }

    public static MGFarmFlyDirection valueOf(String string) {
        return null;
    }

    private MGFarmFlyDirection(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGFarmFlyDirection find(int n) {
        return null;
    }

    private static /* synthetic */ MGFarmFlyDirection[] $values() {
        return null;
    }

    static {
        $VALUES = MGFarmFlyDirection.$values();
        allValues = MGFarmFlyDirection.values();
    }
}

