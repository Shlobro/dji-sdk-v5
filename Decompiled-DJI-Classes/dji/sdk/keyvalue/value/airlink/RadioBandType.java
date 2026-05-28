/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class RadioBandType
extends Enum<RadioBandType>
implements JNIProguardKeepTag {
    public static final /* enum */ RadioBandType RADIO_BAND_2_4_GHZ = new RadioBandType(1);
    public static final /* enum */ RadioBandType RADIO_BAND_5_1_GHZ = new RadioBandType(2);
    public static final /* enum */ RadioBandType RADIO_BAND_5_8_GHZ = new RadioBandType(4);
    public static final /* enum */ RadioBandType UNKNOWN = new RadioBandType(65535);
    private int value;
    private static final RadioBandType[] allValues;
    private static final /* synthetic */ RadioBandType[] $VALUES;

    public static RadioBandType[] values() {
        return null;
    }

    public static RadioBandType valueOf(String string) {
        return null;
    }

    private RadioBandType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RadioBandType find(int n) {
        return null;
    }

    private static /* synthetic */ RadioBandType[] $values() {
        return null;
    }

    static {
        $VALUES = RadioBandType.$values();
        allValues = RadioBandType.values();
    }
}

