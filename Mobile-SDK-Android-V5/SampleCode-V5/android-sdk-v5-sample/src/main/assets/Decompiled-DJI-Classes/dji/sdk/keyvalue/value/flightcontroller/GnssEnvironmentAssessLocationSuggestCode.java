/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GnssEnvironmentAssessLocationSuggestCode
extends Enum<GnssEnvironmentAssessLocationSuggestCode>
implements JNIProguardKeepTag {
    public static final /* enum */ GnssEnvironmentAssessLocationSuggestCode NO_SUGGEST = new GnssEnvironmentAssessLocationSuggestCode(0);
    public static final /* enum */ GnssEnvironmentAssessLocationSuggestCode NORTH_BLOCK = new GnssEnvironmentAssessLocationSuggestCode(17);
    public static final /* enum */ GnssEnvironmentAssessLocationSuggestCode SOUTH_BLOCK = new GnssEnvironmentAssessLocationSuggestCode(18);
    public static final /* enum */ GnssEnvironmentAssessLocationSuggestCode EAST_BLOCK = new GnssEnvironmentAssessLocationSuggestCode(19);
    public static final /* enum */ GnssEnvironmentAssessLocationSuggestCode WEST_BLOCK = new GnssEnvironmentAssessLocationSuggestCode(20);
    public static final /* enum */ GnssEnvironmentAssessLocationSuggestCode NORTH_EAST_BLOCK = new GnssEnvironmentAssessLocationSuggestCode(21);
    public static final /* enum */ GnssEnvironmentAssessLocationSuggestCode NORTH_WEST_BLOCK = new GnssEnvironmentAssessLocationSuggestCode(22);
    public static final /* enum */ GnssEnvironmentAssessLocationSuggestCode SOUTH_EAST_BLOCK = new GnssEnvironmentAssessLocationSuggestCode(23);
    public static final /* enum */ GnssEnvironmentAssessLocationSuggestCode SOUTH_WEST_BLOCK = new GnssEnvironmentAssessLocationSuggestCode(24);
    public static final /* enum */ GnssEnvironmentAssessLocationSuggestCode UNKNOWN = new GnssEnvironmentAssessLocationSuggestCode(255);
    private int value;
    private static final GnssEnvironmentAssessLocationSuggestCode[] allValues;
    private static final /* synthetic */ GnssEnvironmentAssessLocationSuggestCode[] $VALUES;

    public static GnssEnvironmentAssessLocationSuggestCode[] values() {
        return null;
    }

    public static GnssEnvironmentAssessLocationSuggestCode valueOf(String string) {
        return null;
    }

    private GnssEnvironmentAssessLocationSuggestCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GnssEnvironmentAssessLocationSuggestCode find(int n) {
        return null;
    }

    private static /* synthetic */ GnssEnvironmentAssessLocationSuggestCode[] $values() {
        return null;
    }

    static {
        $VALUES = GnssEnvironmentAssessLocationSuggestCode.$values();
        allValues = GnssEnvironmentAssessLocationSuggestCode.values();
    }
}

