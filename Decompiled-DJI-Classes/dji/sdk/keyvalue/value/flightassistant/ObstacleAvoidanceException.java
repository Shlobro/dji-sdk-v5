/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class ObstacleAvoidanceException
extends Enum<ObstacleAvoidanceException>
implements JNIProguardKeepTag {
    public static final /* enum */ ObstacleAvoidanceException OA_STATUS_OK = new ObstacleAvoidanceException(0);
    public static final /* enum */ ObstacleAvoidanceException CPU_LOADING_TOO_HIGH = new ObstacleAvoidanceException(1);
    public static final /* enum */ ObstacleAvoidanceException NEAR_FLY_LIMIT_BOUNDARY = new ObstacleAvoidanceException(2);
    public static final /* enum */ ObstacleAvoidanceException VISION_ERR = new ObstacleAvoidanceException(3);
    public static final /* enum */ ObstacleAvoidanceException ATTI_MODE = new ObstacleAvoidanceException(4);
    public static final /* enum */ ObstacleAvoidanceException IS_MCU_CTRL = new ObstacleAvoidanceException(5);
    public static final /* enum */ ObstacleAvoidanceException LOW_POWER = new ObstacleAvoidanceException(6);
    public static final /* enum */ ObstacleAvoidanceException UNKNOWN = new ObstacleAvoidanceException(255);
    private int value;
    private static final ObstacleAvoidanceException[] allValues;
    private static final /* synthetic */ ObstacleAvoidanceException[] $VALUES;

    public static ObstacleAvoidanceException[] values() {
        return null;
    }

    public static ObstacleAvoidanceException valueOf(String string) {
        return null;
    }

    private ObstacleAvoidanceException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ObstacleAvoidanceException find(int n) {
        return null;
    }

    private static /* synthetic */ ObstacleAvoidanceException[] $values() {
        return null;
    }

    static {
        $VALUES = ObstacleAvoidanceException.$values();
        allValues = ObstacleAvoidanceException.values();
    }
}

