/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class HomeLocationType
extends Enum<HomeLocationType>
implements JNIProguardKeepTag {
    public static final /* enum */ HomeLocationType AIRCRAFT_LOACTON = new HomeLocationType(0);
    public static final /* enum */ HomeLocationType RC_LOCATION = new HomeLocationType(1);
    public static final /* enum */ HomeLocationType APP_LOCATION = new HomeLocationType(2);
    public static final /* enum */ HomeLocationType SDK_LOCATION = new HomeLocationType(3);
    public static final /* enum */ HomeLocationType DRONE_NEST_LOCATION = new HomeLocationType(4);
    public static final /* enum */ HomeLocationType UNKNOWN = new HomeLocationType(65535);
    private int value;
    private static final HomeLocationType[] allValues;
    private static final /* synthetic */ HomeLocationType[] $VALUES;

    public static HomeLocationType[] values() {
        return null;
    }

    public static HomeLocationType valueOf(String string) {
        return null;
    }

    private HomeLocationType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HomeLocationType find(int n) {
        return null;
    }

    private static /* synthetic */ HomeLocationType[] $values() {
        return null;
    }

    static {
        $VALUES = HomeLocationType.$values();
        allValues = HomeLocationType.values();
    }
}

