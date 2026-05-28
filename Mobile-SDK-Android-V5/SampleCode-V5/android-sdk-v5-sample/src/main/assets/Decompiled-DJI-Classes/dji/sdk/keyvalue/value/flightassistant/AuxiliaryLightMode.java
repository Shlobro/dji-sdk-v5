/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class AuxiliaryLightMode
extends Enum<AuxiliaryLightMode>
implements JNIProguardKeepTag {
    public static final /* enum */ AuxiliaryLightMode AUTO = new AuxiliaryLightMode(0);
    public static final /* enum */ AuxiliaryLightMode ON = new AuxiliaryLightMode(1);
    public static final /* enum */ AuxiliaryLightMode OFF = new AuxiliaryLightMode(2);
    public static final /* enum */ AuxiliaryLightMode BEACON = new AuxiliaryLightMode(3);
    public static final /* enum */ AuxiliaryLightMode UNKNOWN = new AuxiliaryLightMode(65535);
    private int value;
    private static final AuxiliaryLightMode[] allValues;
    private static final /* synthetic */ AuxiliaryLightMode[] $VALUES;

    public static AuxiliaryLightMode[] values() {
        return null;
    }

    public static AuxiliaryLightMode valueOf(String string) {
        return null;
    }

    private AuxiliaryLightMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AuxiliaryLightMode find(int n) {
        return null;
    }

    private static /* synthetic */ AuxiliaryLightMode[] $values() {
        return null;
    }

    static {
        $VALUES = AuxiliaryLightMode.$values();
        allValues = AuxiliaryLightMode.values();
    }
}

