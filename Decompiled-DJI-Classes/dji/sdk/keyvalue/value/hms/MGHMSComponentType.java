/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;

public final class MGHMSComponentType
extends Enum<MGHMSComponentType>
implements JNIProguardKeepTag {
    public static final /* enum */ MGHMSComponentType AIRCRAFT = new MGHMSComponentType(0);
    public static final /* enum */ MGHMSComponentType CHARGEING_BOX = new MGHMSComponentType(1);
    public static final /* enum */ MGHMSComponentType UNKNOWN = new MGHMSComponentType(65535);
    private int value;
    private static final MGHMSComponentType[] allValues;
    private static final /* synthetic */ MGHMSComponentType[] $VALUES;

    public static MGHMSComponentType[] values() {
        return null;
    }

    public static MGHMSComponentType valueOf(String string) {
        return null;
    }

    private MGHMSComponentType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGHMSComponentType find(int n) {
        return null;
    }

    private static /* synthetic */ MGHMSComponentType[] $values() {
        return null;
    }

    static {
        $VALUES = MGHMSComponentType.$values();
        allValues = MGHMSComponentType.values();
    }
}

