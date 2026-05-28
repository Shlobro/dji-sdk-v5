/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AirSenseDirection
extends Enum<AirSenseDirection>
implements JNIProguardKeepTag {
    public static final /* enum */ AirSenseDirection NORTH = new AirSenseDirection(0);
    public static final /* enum */ AirSenseDirection NORTH_EAST = new AirSenseDirection(1);
    public static final /* enum */ AirSenseDirection EAST = new AirSenseDirection(2);
    public static final /* enum */ AirSenseDirection SOUTH_EAST = new AirSenseDirection(3);
    public static final /* enum */ AirSenseDirection SOUTH = new AirSenseDirection(4);
    public static final /* enum */ AirSenseDirection SOUTH_WEST = new AirSenseDirection(5);
    public static final /* enum */ AirSenseDirection WEST = new AirSenseDirection(6);
    public static final /* enum */ AirSenseDirection NORTH_WEST = new AirSenseDirection(7);
    public static final /* enum */ AirSenseDirection UNKNOWN = new AirSenseDirection(65535);
    private int value;
    private static final AirSenseDirection[] allValues;
    private static final /* synthetic */ AirSenseDirection[] $VALUES;

    public static AirSenseDirection[] values() {
        return null;
    }

    public static AirSenseDirection valueOf(String string) {
        return null;
    }

    private AirSenseDirection(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AirSenseDirection find(int n) {
        return null;
    }

    private static /* synthetic */ AirSenseDirection[] $values() {
        return null;
    }

    static {
        $VALUES = AirSenseDirection.$values();
        allValues = AirSenseDirection.values();
    }
}

