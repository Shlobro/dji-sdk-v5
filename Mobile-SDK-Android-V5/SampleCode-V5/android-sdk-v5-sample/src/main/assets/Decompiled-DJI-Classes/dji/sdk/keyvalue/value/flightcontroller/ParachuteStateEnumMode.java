/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ParachuteStateEnumMode
extends Enum<ParachuteStateEnumMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ParachuteStateEnumMode REAL = new ParachuteStateEnumMode(0);
    public static final /* enum */ ParachuteStateEnumMode SIM = new ParachuteStateEnumMode(1);
    public static final /* enum */ ParachuteStateEnumMode UNKNOWN = new ParachuteStateEnumMode(255);
    private int value;
    private static final ParachuteStateEnumMode[] allValues;
    private static final /* synthetic */ ParachuteStateEnumMode[] $VALUES;

    public static ParachuteStateEnumMode[] values() {
        return null;
    }

    public static ParachuteStateEnumMode valueOf(String string) {
        return null;
    }

    private ParachuteStateEnumMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ParachuteStateEnumMode find(int n) {
        return null;
    }

    private static /* synthetic */ ParachuteStateEnumMode[] $values() {
        return null;
    }

    static {
        $VALUES = ParachuteStateEnumMode.$values();
        allValues = ParachuteStateEnumMode.values();
    }
}

