/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionDetectionDistanceLevel
extends Enum<VisionDetectionDistanceLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionDetectionDistanceLevel LEVEL_0 = new VisionDetectionDistanceLevel(0);
    public static final /* enum */ VisionDetectionDistanceLevel LEVEL_1 = new VisionDetectionDistanceLevel(1);
    public static final /* enum */ VisionDetectionDistanceLevel LEVEL_2 = new VisionDetectionDistanceLevel(2);
    public static final /* enum */ VisionDetectionDistanceLevel LEVEL_3 = new VisionDetectionDistanceLevel(3);
    public static final /* enum */ VisionDetectionDistanceLevel UNKNOWN = new VisionDetectionDistanceLevel(65535);
    private int value;
    private static final VisionDetectionDistanceLevel[] allValues;
    private static final /* synthetic */ VisionDetectionDistanceLevel[] $VALUES;

    public static VisionDetectionDistanceLevel[] values() {
        return null;
    }

    public static VisionDetectionDistanceLevel valueOf(String string) {
        return null;
    }

    private VisionDetectionDistanceLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionDetectionDistanceLevel find(int n) {
        return null;
    }

    private static /* synthetic */ VisionDetectionDistanceLevel[] $values() {
        return null;
    }

    static {
        $VALUES = VisionDetectionDistanceLevel.$values();
        allValues = VisionDetectionDistanceLevel.values();
    }
}

