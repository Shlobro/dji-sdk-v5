/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class CaliSatelliteSignal
extends Enum<CaliSatelliteSignal>
implements JNIProguardKeepTag {
    public static final /* enum */ CaliSatelliteSignal WEAK = new CaliSatelliteSignal(0);
    public static final /* enum */ CaliSatelliteSignal MEDIUM = new CaliSatelliteSignal(1);
    public static final /* enum */ CaliSatelliteSignal GOOD = new CaliSatelliteSignal(2);
    public static final /* enum */ CaliSatelliteSignal UNKNOWN = new CaliSatelliteSignal(65535);
    private int value;
    private static final CaliSatelliteSignal[] allValues;
    private static final /* synthetic */ CaliSatelliteSignal[] $VALUES;

    public static CaliSatelliteSignal[] values() {
        return null;
    }

    public static CaliSatelliteSignal valueOf(String string) {
        return null;
    }

    private CaliSatelliteSignal(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CaliSatelliteSignal find(int n) {
        return null;
    }

    private static /* synthetic */ CaliSatelliteSignal[] $values() {
        return null;
    }

    static {
        $VALUES = CaliSatelliteSignal.$values();
        allValues = CaliSatelliteSignal.values();
    }
}

