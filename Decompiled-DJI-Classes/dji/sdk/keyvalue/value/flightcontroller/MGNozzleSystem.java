/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class MGNozzleSystem
extends Enum<MGNozzleSystem>
implements JNIProguardKeepTag {
    public static final /* enum */ MGNozzleSystem PRESSURE = new MGNozzleSystem(0);
    public static final /* enum */ MGNozzleSystem CENTRIFUGE = new MGNozzleSystem(1);
    public static final /* enum */ MGNozzleSystem UNKNOWN = new MGNozzleSystem(65535);
    private int value;
    private static final MGNozzleSystem[] allValues;
    private static final /* synthetic */ MGNozzleSystem[] $VALUES;

    public static MGNozzleSystem[] values() {
        return null;
    }

    public static MGNozzleSystem valueOf(String string) {
        return null;
    }

    private MGNozzleSystem(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGNozzleSystem find(int n) {
        return null;
    }

    private static /* synthetic */ MGNozzleSystem[] $values() {
        return null;
    }

    static {
        $VALUES = MGNozzleSystem.$values();
        allValues = MGNozzleSystem.values();
    }
}

