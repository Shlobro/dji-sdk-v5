/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class NavigationSatelliteSystem
extends Enum<NavigationSatelliteSystem>
implements JNIProguardKeepTag {
    public static final /* enum */ NavigationSatelliteSystem GPS_GLONASS = new NavigationSatelliteSystem(0);
    public static final /* enum */ NavigationSatelliteSystem BEIDOU = new NavigationSatelliteSystem(1);
    public static final /* enum */ NavigationSatelliteSystem UNKNOWN = new NavigationSatelliteSystem(65535);
    private int value;
    private static final NavigationSatelliteSystem[] allValues;
    private static final /* synthetic */ NavigationSatelliteSystem[] $VALUES;

    public static NavigationSatelliteSystem[] values() {
        return null;
    }

    public static NavigationSatelliteSystem valueOf(String string) {
        return null;
    }

    private NavigationSatelliteSystem(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static NavigationSatelliteSystem find(int n) {
        return null;
    }

    private static /* synthetic */ NavigationSatelliteSystem[] $values() {
        return null;
    }

    static {
        $VALUES = NavigationSatelliteSystem.$values();
        allValues = NavigationSatelliteSystem.values();
    }
}

