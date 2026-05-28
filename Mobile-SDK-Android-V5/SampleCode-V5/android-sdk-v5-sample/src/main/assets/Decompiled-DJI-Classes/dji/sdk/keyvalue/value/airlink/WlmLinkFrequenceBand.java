/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmLinkFrequenceBand
extends Enum<WlmLinkFrequenceBand>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmLinkFrequenceBand BAND_2_DOT_4G = new WlmLinkFrequenceBand(0);
    public static final /* enum */ WlmLinkFrequenceBand BAND_5_DOT_8G = new WlmLinkFrequenceBand(1);
    public static final /* enum */ WlmLinkFrequenceBand BAND_DUAL = new WlmLinkFrequenceBand(2);
    public static final /* enum */ WlmLinkFrequenceBand UNKNOWN = new WlmLinkFrequenceBand(65535);
    private int value;
    private static final WlmLinkFrequenceBand[] allValues;
    private static final /* synthetic */ WlmLinkFrequenceBand[] $VALUES;

    public static WlmLinkFrequenceBand[] values() {
        return null;
    }

    public static WlmLinkFrequenceBand valueOf(String string) {
        return null;
    }

    private WlmLinkFrequenceBand(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmLinkFrequenceBand find(int n) {
        return null;
    }

    private static /* synthetic */ WlmLinkFrequenceBand[] $values() {
        return null;
    }

    static {
        $VALUES = WlmLinkFrequenceBand.$values();
        allValues = WlmLinkFrequenceBand.values();
    }
}

