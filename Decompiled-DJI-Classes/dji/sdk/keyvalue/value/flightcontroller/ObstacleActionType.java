/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ObstacleActionType
extends Enum<ObstacleActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ ObstacleActionType CLOSE = new ObstacleActionType(0);
    public static final /* enum */ ObstacleActionType STOP = new ObstacleActionType(1);
    public static final /* enum */ ObstacleActionType APAS = new ObstacleActionType(2);
    public static final /* enum */ ObstacleActionType UNKNOWN = new ObstacleActionType(65535);
    private int value;
    private static final ObstacleActionType[] allValues;
    private static final /* synthetic */ ObstacleActionType[] $VALUES;

    public static ObstacleActionType[] values() {
        return null;
    }

    public static ObstacleActionType valueOf(String string) {
        return null;
    }

    private ObstacleActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ObstacleActionType find(int n) {
        return null;
    }

    private static /* synthetic */ ObstacleActionType[] $values() {
        return null;
    }

    static {
        $VALUES = ObstacleActionType.$values();
        allValues = ObstacleActionType.values();
    }
}

