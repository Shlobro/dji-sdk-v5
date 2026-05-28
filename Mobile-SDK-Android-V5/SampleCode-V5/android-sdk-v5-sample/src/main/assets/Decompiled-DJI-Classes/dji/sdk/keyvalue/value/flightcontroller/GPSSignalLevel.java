/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GPSSignalLevel
extends Enum<GPSSignalLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ GPSSignalLevel LEVEL_0 = new GPSSignalLevel(0);
    public static final /* enum */ GPSSignalLevel LEVEL_1 = new GPSSignalLevel(1);
    public static final /* enum */ GPSSignalLevel LEVEL_2 = new GPSSignalLevel(2);
    public static final /* enum */ GPSSignalLevel LEVEL_3 = new GPSSignalLevel(3);
    public static final /* enum */ GPSSignalLevel LEVEL_4 = new GPSSignalLevel(4);
    public static final /* enum */ GPSSignalLevel LEVEL_5 = new GPSSignalLevel(5);
    public static final /* enum */ GPSSignalLevel LEVEL_10 = new GPSSignalLevel(10);
    public static final /* enum */ GPSSignalLevel LEVEL_NONE = new GPSSignalLevel(65534);
    public static final /* enum */ GPSSignalLevel UNKNOWN = new GPSSignalLevel(65535);
    private int value;
    private static final GPSSignalLevel[] allValues;
    private static final /* synthetic */ GPSSignalLevel[] $VALUES;

    public static GPSSignalLevel[] values() {
        return null;
    }

    public static GPSSignalLevel valueOf(String string) {
        return null;
    }

    private GPSSignalLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GPSSignalLevel find(int n) {
        return null;
    }

    private static /* synthetic */ GPSSignalLevel[] $values() {
        return null;
    }

    static {
        $VALUES = GPSSignalLevel.$values();
        allValues = GPSSignalLevel.values();
    }
}

