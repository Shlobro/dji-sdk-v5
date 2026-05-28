/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SensorState
extends Enum<SensorState>
implements JNIProguardKeepTag {
    public static final /* enum */ SensorState NONE = new SensorState(0);
    public static final /* enum */ SensorState NOT_OK = new SensorState(1);
    public static final /* enum */ SensorState PARTIAL_OK = new SensorState(2);
    public static final /* enum */ SensorState OK = new SensorState(3);
    public static final /* enum */ SensorState UNKNOWN = new SensorState(255);
    private int value;
    private static final SensorState[] allValues;
    private static final /* synthetic */ SensorState[] $VALUES;

    public static SensorState[] values() {
        return null;
    }

    public static SensorState valueOf(String string) {
        return null;
    }

    private SensorState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SensorState find(int n) {
        return null;
    }

    private static /* synthetic */ SensorState[] $values() {
        return null;
    }

    static {
        $VALUES = SensorState.$values();
        allValues = SensorState.values();
    }
}

