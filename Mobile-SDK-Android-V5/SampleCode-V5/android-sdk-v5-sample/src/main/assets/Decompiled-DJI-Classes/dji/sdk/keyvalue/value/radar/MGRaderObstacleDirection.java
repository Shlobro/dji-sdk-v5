/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.radar;

import dji.jni.JNIProguardKeepTag;

public final class MGRaderObstacleDirection
extends Enum<MGRaderObstacleDirection>
implements JNIProguardKeepTag {
    public static final /* enum */ MGRaderObstacleDirection FRONT = new MGRaderObstacleDirection(0);
    public static final /* enum */ MGRaderObstacleDirection BACK = new MGRaderObstacleDirection(1);
    public static final /* enum */ MGRaderObstacleDirection UP = new MGRaderObstacleDirection(2);
    public static final /* enum */ MGRaderObstacleDirection LEFT = new MGRaderObstacleDirection(3);
    public static final /* enum */ MGRaderObstacleDirection RIGHT = new MGRaderObstacleDirection(4);
    public static final /* enum */ MGRaderObstacleDirection UNKNOWN = new MGRaderObstacleDirection(65535);
    private int value;
    private static final MGRaderObstacleDirection[] allValues;
    private static final /* synthetic */ MGRaderObstacleDirection[] $VALUES;

    public static MGRaderObstacleDirection[] values() {
        return null;
    }

    public static MGRaderObstacleDirection valueOf(String string) {
        return null;
    }

    private MGRaderObstacleDirection(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGRaderObstacleDirection find(int n) {
        return null;
    }

    private static /* synthetic */ MGRaderObstacleDirection[] $values() {
        return null;
    }

    static {
        $VALUES = MGRaderObstacleDirection.$values();
        allValues = MGRaderObstacleDirection.values();
    }
}

