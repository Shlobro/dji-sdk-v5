/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionSensorPosition
extends Enum<VisionSensorPosition>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionSensorPosition NOSE = new VisionSensorPosition(0);
    public static final /* enum */ VisionSensorPosition TAIL = new VisionSensorPosition(1);
    public static final /* enum */ VisionSensorPosition RIGHT = new VisionSensorPosition(2);
    public static final /* enum */ VisionSensorPosition LEFT = new VisionSensorPosition(3);
    public static final /* enum */ VisionSensorPosition UNKNOWN = new VisionSensorPosition(65535);
    private int value;
    private static final VisionSensorPosition[] allValues;
    private static final /* synthetic */ VisionSensorPosition[] $VALUES;

    public static VisionSensorPosition[] values() {
        return null;
    }

    public static VisionSensorPosition valueOf(String string) {
        return null;
    }

    private VisionSensorPosition(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionSensorPosition find(int n) {
        return null;
    }

    private static /* synthetic */ VisionSensorPosition[] $values() {
        return null;
    }

    static {
        $VALUES = VisionSensorPosition.$values();
        allValues = VisionSensorPosition.values();
    }
}

