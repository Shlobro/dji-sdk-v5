/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class FrequencyBand
extends Enum<FrequencyBand>
implements JNIProguardKeepTag {
    public static final /* enum */ FrequencyBand BAND_MULTI = new FrequencyBand(0);
    public static final /* enum */ FrequencyBand BAND_2_DOT_4G = new FrequencyBand(1);
    public static final /* enum */ FrequencyBand BAND_5_DOT_8G = new FrequencyBand(2);
    public static final /* enum */ FrequencyBand BAND_1_DOT_4G = new FrequencyBand(3);
    public static final /* enum */ FrequencyBand BAND_5_DOT_7G = new FrequencyBand(4);
    public static final /* enum */ FrequencyBand BAND_5_DOT_2G = new FrequencyBand(5);
    public static final /* enum */ FrequencyBand BAND_SUB_2G = new FrequencyBand(6);
    public static final /* enum */ FrequencyBand UNKNOWN = new FrequencyBand(65535);
    private int value;
    private static final FrequencyBand[] allValues;
    private static final /* synthetic */ FrequencyBand[] $VALUES;

    public static FrequencyBand[] values() {
        return null;
    }

    public static FrequencyBand valueOf(String string) {
        return null;
    }

    private FrequencyBand(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FrequencyBand find(int n) {
        return null;
    }

    private static /* synthetic */ FrequencyBand[] $values() {
        return null;
    }

    static {
        $VALUES = FrequencyBand.$values();
        allValues = FrequencyBand.values();
    }
}

