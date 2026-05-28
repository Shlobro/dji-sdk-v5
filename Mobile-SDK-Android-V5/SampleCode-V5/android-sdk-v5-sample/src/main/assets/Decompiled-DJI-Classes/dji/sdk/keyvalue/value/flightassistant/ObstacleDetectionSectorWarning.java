/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class ObstacleDetectionSectorWarning
extends Enum<ObstacleDetectionSectorWarning>
implements JNIProguardKeepTag {
    public static final /* enum */ ObstacleDetectionSectorWarning INVALID = new ObstacleDetectionSectorWarning(0);
    public static final /* enum */ ObstacleDetectionSectorWarning LEVEL_1 = new ObstacleDetectionSectorWarning(1);
    public static final /* enum */ ObstacleDetectionSectorWarning LEVEL_2 = new ObstacleDetectionSectorWarning(2);
    public static final /* enum */ ObstacleDetectionSectorWarning LEVEL_3 = new ObstacleDetectionSectorWarning(3);
    public static final /* enum */ ObstacleDetectionSectorWarning LEVEL_4 = new ObstacleDetectionSectorWarning(4);
    public static final /* enum */ ObstacleDetectionSectorWarning LEVEL_5 = new ObstacleDetectionSectorWarning(5);
    public static final /* enum */ ObstacleDetectionSectorWarning LEVEL_6 = new ObstacleDetectionSectorWarning(6);
    public static final /* enum */ ObstacleDetectionSectorWarning UNKNOWN = new ObstacleDetectionSectorWarning(65535);
    private int value;
    private static final ObstacleDetectionSectorWarning[] allValues;
    private static final /* synthetic */ ObstacleDetectionSectorWarning[] $VALUES;

    public static ObstacleDetectionSectorWarning[] values() {
        return null;
    }

    public static ObstacleDetectionSectorWarning valueOf(String string) {
        return null;
    }

    private ObstacleDetectionSectorWarning(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ObstacleDetectionSectorWarning find(int n) {
        return null;
    }

    private static /* synthetic */ ObstacleDetectionSectorWarning[] $values() {
        return null;
    }

    static {
        $VALUES = ObstacleDetectionSectorWarning.$values();
        allValues = ObstacleDetectionSectorWarning.values();
    }
}

