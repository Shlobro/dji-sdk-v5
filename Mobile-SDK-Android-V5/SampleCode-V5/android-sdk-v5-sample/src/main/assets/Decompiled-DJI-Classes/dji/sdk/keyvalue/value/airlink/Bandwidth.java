/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class Bandwidth
extends Enum<Bandwidth>
implements JNIProguardKeepTag {
    public static final /* enum */ Bandwidth BANDWIDTH_20MHZ = new Bandwidth(0);
    public static final /* enum */ Bandwidth BANDWIDTH_10MHZ = new Bandwidth(1);
    public static final /* enum */ Bandwidth BANDWIDTH_40MHZ = new Bandwidth(2);
    public static final /* enum */ Bandwidth BANDWIDTH_5MHZ = new Bandwidth(3);
    public static final /* enum */ Bandwidth BANDWIDTH_60MHZ = new Bandwidth(4);
    public static final /* enum */ Bandwidth BANDWIDTH_80MHZ = new Bandwidth(5);
    public static final /* enum */ Bandwidth UNKNOWN = new Bandwidth(65535);
    private int value;
    private static final Bandwidth[] allValues;
    private static final /* synthetic */ Bandwidth[] $VALUES;

    public static Bandwidth[] values() {
        return null;
    }

    public static Bandwidth valueOf(String string) {
        return null;
    }

    private Bandwidth(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static Bandwidth find(int n) {
        return null;
    }

    private static /* synthetic */ Bandwidth[] $values() {
        return null;
    }

    static {
        $VALUES = Bandwidth.$values();
        allValues = Bandwidth.values();
    }
}

