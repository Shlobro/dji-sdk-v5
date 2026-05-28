/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GnssType
extends Enum<GnssType>
implements JNIProguardKeepTag {
    public static final /* enum */ GnssType GPS = new GnssType(0);
    public static final /* enum */ GnssType BDS = new GnssType(1);
    public static final /* enum */ GnssType UNKNOWN = new GnssType(65535);
    private int value;
    private static final GnssType[] allValues;
    private static final /* synthetic */ GnssType[] $VALUES;

    public static GnssType[] values() {
        return null;
    }

    public static GnssType valueOf(String string) {
        return null;
    }

    private GnssType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GnssType find(int n) {
        return null;
    }

    private static /* synthetic */ GnssType[] $values() {
        return null;
    }

    static {
        $VALUES = GnssType.$values();
        allValues = GnssType.values();
    }
}

