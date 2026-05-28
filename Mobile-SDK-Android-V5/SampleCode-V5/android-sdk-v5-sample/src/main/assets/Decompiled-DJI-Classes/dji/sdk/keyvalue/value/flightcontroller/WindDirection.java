/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class WindDirection
extends Enum<WindDirection>
implements JNIProguardKeepTag {
    public static final /* enum */ WindDirection WINDLESS = new WindDirection(0);
    public static final /* enum */ WindDirection NORTH = new WindDirection(1);
    public static final /* enum */ WindDirection NORTH_EAST = new WindDirection(2);
    public static final /* enum */ WindDirection EAST = new WindDirection(3);
    public static final /* enum */ WindDirection SOUTH_EAST = new WindDirection(4);
    public static final /* enum */ WindDirection SOUTH = new WindDirection(5);
    public static final /* enum */ WindDirection SOUTH_WEST = new WindDirection(6);
    public static final /* enum */ WindDirection WEST = new WindDirection(7);
    public static final /* enum */ WindDirection NORTH_WEST = new WindDirection(8);
    public static final /* enum */ WindDirection UNKNOWN = new WindDirection(65535);
    private int value;
    private static final WindDirection[] allValues;
    private static final /* synthetic */ WindDirection[] $VALUES;

    public static WindDirection[] values() {
        return null;
    }

    public static WindDirection valueOf(String string) {
        return null;
    }

    private WindDirection(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WindDirection find(int n) {
        return null;
    }

    private static /* synthetic */ WindDirection[] $values() {
        return null;
    }

    static {
        $VALUES = WindDirection.$values();
        allValues = WindDirection.values();
    }
}

