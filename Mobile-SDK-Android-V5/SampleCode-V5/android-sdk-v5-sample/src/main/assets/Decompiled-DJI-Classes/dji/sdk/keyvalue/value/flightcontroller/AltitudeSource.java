/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AltitudeSource
extends Enum<AltitudeSource>
implements JNIProguardKeepTag {
    public static final /* enum */ AltitudeSource GPS = new AltitudeSource(0);
    public static final /* enum */ AltitudeSource BAROMETER = new AltitudeSource(1);
    public static final /* enum */ AltitudeSource UNKNOWN = new AltitudeSource(65535);
    private int value;
    private static final AltitudeSource[] allValues;
    private static final /* synthetic */ AltitudeSource[] $VALUES;

    public static AltitudeSource[] values() {
        return null;
    }

    public static AltitudeSource valueOf(String string) {
        return null;
    }

    private AltitudeSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AltitudeSource find(int n) {
        return null;
    }

    private static /* synthetic */ AltitudeSource[] $values() {
        return null;
    }

    static {
        $VALUES = AltitudeSource.$values();
        allValues = AltitudeSource.values();
    }
}

