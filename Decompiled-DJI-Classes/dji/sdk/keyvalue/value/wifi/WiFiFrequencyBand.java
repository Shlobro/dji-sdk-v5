/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.wifi;

import dji.jni.JNIProguardKeepTag;

public final class WiFiFrequencyBand
extends Enum<WiFiFrequencyBand>
implements JNIProguardKeepTag {
    public static final /* enum */ WiFiFrequencyBand BAND_2_DOT_4G = new WiFiFrequencyBand(0);
    public static final /* enum */ WiFiFrequencyBand BAND_5G = new WiFiFrequencyBand(1);
    public static final /* enum */ WiFiFrequencyBand BAND_DUAL = new WiFiFrequencyBand(2);
    public static final /* enum */ WiFiFrequencyBand UNKNOWN = new WiFiFrequencyBand(65535);
    private int value;
    private static final WiFiFrequencyBand[] allValues;
    private static final /* synthetic */ WiFiFrequencyBand[] $VALUES;

    public static WiFiFrequencyBand[] values() {
        return null;
    }

    public static WiFiFrequencyBand valueOf(String string) {
        return null;
    }

    private WiFiFrequencyBand(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WiFiFrequencyBand find(int n) {
        return null;
    }

    private static /* synthetic */ WiFiFrequencyBand[] $values() {
        return null;
    }

    static {
        $VALUES = WiFiFrequencyBand.$values();
        allValues = WiFiFrequencyBand.values();
    }
}

