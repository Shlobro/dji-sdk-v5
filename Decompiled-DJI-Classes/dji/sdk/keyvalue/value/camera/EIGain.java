/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class EIGain
extends Enum<EIGain>
implements JNIProguardKeepTag {
    public static final /* enum */ EIGain AUTO = new EIGain(0);
    public static final /* enum */ EIGain LOW = new EIGain(1);
    public static final /* enum */ EIGain HIGH = new EIGain(2);
    public static final /* enum */ EIGain UNKNOWN = new EIGain(255);
    private int value;
    private static final EIGain[] allValues;
    private static final /* synthetic */ EIGain[] $VALUES;

    public static EIGain[] values() {
        return null;
    }

    public static EIGain valueOf(String string) {
        return null;
    }

    private EIGain(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EIGain find(int n) {
        return null;
    }

    private static /* synthetic */ EIGain[] $values() {
        return null;
    }

    static {
        $VALUES = EIGain.$values();
        allValues = EIGain.values();
    }
}

