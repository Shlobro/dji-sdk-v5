/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class SatelliteSignal
extends Enum<SatelliteSignal>
implements JNIProguardKeepTag {
    public static final /* enum */ SatelliteSignal WEAK = new SatelliteSignal(0);
    public static final /* enum */ SatelliteSignal GOOD = new SatelliteSignal(1);
    public static final /* enum */ SatelliteSignal UNKNOWN = new SatelliteSignal(65535);
    private int value;
    private static final SatelliteSignal[] allValues;
    private static final /* synthetic */ SatelliteSignal[] $VALUES;

    public static SatelliteSignal[] values() {
        return null;
    }

    public static SatelliteSignal valueOf(String string) {
        return null;
    }

    private SatelliteSignal(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SatelliteSignal find(int n) {
        return null;
    }

    private static /* synthetic */ SatelliteSignal[] $values() {
        return null;
    }

    static {
        $VALUES = SatelliteSignal.$values();
        allValues = SatelliteSignal.values();
    }
}

