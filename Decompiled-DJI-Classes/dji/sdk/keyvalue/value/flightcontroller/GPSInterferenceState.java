/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GPSInterferenceState
extends Enum<GPSInterferenceState>
implements JNIProguardKeepTag {
    public static final /* enum */ GPSInterferenceState INVALID = new GPSInterferenceState(0);
    public static final /* enum */ GPSInterferenceState OK = new GPSInterferenceState(1);
    public static final /* enum */ GPSInterferenceState WARNING = new GPSInterferenceState(2);
    public static final /* enum */ GPSInterferenceState CRITICAL = new GPSInterferenceState(3);
    public static final /* enum */ GPSInterferenceState UNKNOWN = new GPSInterferenceState(65535);
    private int value;
    private static final GPSInterferenceState[] allValues;
    private static final /* synthetic */ GPSInterferenceState[] $VALUES;

    public static GPSInterferenceState[] values() {
        return null;
    }

    public static GPSInterferenceState valueOf(String string) {
        return null;
    }

    private GPSInterferenceState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GPSInterferenceState find(int n) {
        return null;
    }

    private static /* synthetic */ GPSInterferenceState[] $values() {
        return null;
    }

    static {
        $VALUES = GPSInterferenceState.$values();
        allValues = GPSInterferenceState.values();
    }
}

