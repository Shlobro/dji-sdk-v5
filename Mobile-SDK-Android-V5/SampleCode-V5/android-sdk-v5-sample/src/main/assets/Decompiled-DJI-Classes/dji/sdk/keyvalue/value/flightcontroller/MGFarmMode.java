/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGFarmMode
extends Enum<MGFarmMode>
implements JNIProguardKeepTag {
    public static final /* enum */ MGFarmMode MANUAL = new MGFarmMode(1);
    public static final /* enum */ MGFarmMode AUTOMATIC = new MGFarmMode(2);
    public static final /* enum */ MGFarmMode UNKNOWN = new MGFarmMode(65535);
    private int value;
    private static final MGFarmMode[] allValues;
    private static final /* synthetic */ MGFarmMode[] $VALUES;

    public static MGFarmMode[] values() {
        return null;
    }

    public static MGFarmMode valueOf(String string) {
        return null;
    }

    private MGFarmMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGFarmMode find(int n) {
        return null;
    }

    private static /* synthetic */ MGFarmMode[] $values() {
        return null;
    }

    static {
        $VALUES = MGFarmMode.$values();
        allValues = MGFarmMode.values();
    }
}

