/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class ObstacleAvoidanceState
extends Enum<ObstacleAvoidanceState>
implements JNIProguardKeepTag {
    public static final /* enum */ ObstacleAvoidanceState NONE = new ObstacleAvoidanceState(0);
    public static final /* enum */ ObstacleAvoidanceState STOP = new ObstacleAvoidanceState(1);
    public static final /* enum */ ObstacleAvoidanceState BYPASS = new ObstacleAvoidanceState(2);
    public static final /* enum */ ObstacleAvoidanceState UNKNOWN = new ObstacleAvoidanceState(255);
    private int value;
    private static final ObstacleAvoidanceState[] allValues;
    private static final /* synthetic */ ObstacleAvoidanceState[] $VALUES;

    public static ObstacleAvoidanceState[] values() {
        return null;
    }

    public static ObstacleAvoidanceState valueOf(String string) {
        return null;
    }

    private ObstacleAvoidanceState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ObstacleAvoidanceState find(int n) {
        return null;
    }

    private static /* synthetic */ ObstacleAvoidanceState[] $values() {
        return null;
    }

    static {
        $VALUES = ObstacleAvoidanceState.$values();
        allValues = ObstacleAvoidanceState.values();
    }
}

