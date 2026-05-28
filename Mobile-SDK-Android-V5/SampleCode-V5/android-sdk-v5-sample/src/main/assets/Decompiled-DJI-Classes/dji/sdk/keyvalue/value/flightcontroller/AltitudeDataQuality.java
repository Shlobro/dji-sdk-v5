/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AltitudeDataQuality
extends Enum<AltitudeDataQuality>
implements JNIProguardKeepTag {
    public static final /* enum */ AltitudeDataQuality VERY_BAD = new AltitudeDataQuality(0);
    public static final /* enum */ AltitudeDataQuality BAD = new AltitudeDataQuality(1);
    public static final /* enum */ AltitudeDataQuality WEAK = new AltitudeDataQuality(2);
    public static final /* enum */ AltitudeDataQuality MEDIUM = new AltitudeDataQuality(3);
    public static final /* enum */ AltitudeDataQuality GOOD = new AltitudeDataQuality(4);
    public static final /* enum */ AltitudeDataQuality EXCELENT = new AltitudeDataQuality(5);
    public static final /* enum */ AltitudeDataQuality UNKNOWN = new AltitudeDataQuality(65535);
    private int value;
    private static final AltitudeDataQuality[] allValues;
    private static final /* synthetic */ AltitudeDataQuality[] $VALUES;

    public static AltitudeDataQuality[] values() {
        return null;
    }

    public static AltitudeDataQuality valueOf(String string) {
        return null;
    }

    private AltitudeDataQuality(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AltitudeDataQuality find(int n) {
        return null;
    }

    private static /* synthetic */ AltitudeDataQuality[] $values() {
        return null;
    }

    static {
        $VALUES = AltitudeDataQuality.$values();
        allValues = AltitudeDataQuality.values();
    }
}

