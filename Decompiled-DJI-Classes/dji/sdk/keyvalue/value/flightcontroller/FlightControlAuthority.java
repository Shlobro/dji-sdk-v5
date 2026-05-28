/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlightControlAuthority
extends Enum<FlightControlAuthority>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightControlAuthority RC = new FlightControlAuthority(0);
    public static final /* enum */ FlightControlAuthority MSDK = new FlightControlAuthority(1);
    public static final /* enum */ FlightControlAuthority AUTO_TEST = new FlightControlAuthority(2);
    public static final /* enum */ FlightControlAuthority OSDK = new FlightControlAuthority(3);
    public static final /* enum */ FlightControlAuthority AIRPORT = new FlightControlAuthority(4);
    public static final /* enum */ FlightControlAuthority UNKNOWN = new FlightControlAuthority(65535);
    private int value;
    private static final FlightControlAuthority[] allValues;
    private static final /* synthetic */ FlightControlAuthority[] $VALUES;

    public static FlightControlAuthority[] values() {
        return null;
    }

    public static FlightControlAuthority valueOf(String string) {
        return null;
    }

    private FlightControlAuthority(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightControlAuthority find(int n) {
        return null;
    }

    private static /* synthetic */ FlightControlAuthority[] $values() {
        return null;
    }

    static {
        $VALUES = FlightControlAuthority.$values();
        allValues = FlightControlAuthority.values();
    }
}

