/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SensorType
extends Enum<SensorType>
implements JNIProguardKeepTag {
    public static final /* enum */ SensorType VISION = new SensorType(0);
    public static final /* enum */ SensorType TOF = new SensorType(1);
    public static final /* enum */ SensorType LIDAR = new SensorType(2);
    public static final /* enum */ SensorType RADAR = new SensorType(3);
    public static final /* enum */ SensorType UNKNOWN = new SensorType(255);
    private int value;
    private static final SensorType[] allValues;
    private static final /* synthetic */ SensorType[] $VALUES;

    public static SensorType[] values() {
        return null;
    }

    public static SensorType valueOf(String string) {
        return null;
    }

    private SensorType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SensorType find(int n) {
        return null;
    }

    private static /* synthetic */ SensorType[] $values() {
        return null;
    }

    static {
        $VALUES = SensorType.$values();
        allValues = SensorType.values();
    }
}

