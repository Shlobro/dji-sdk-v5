/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class LidarSelfCaliStage
extends Enum<LidarSelfCaliStage>
implements JNIProguardKeepTag {
    public static final /* enum */ LidarSelfCaliStage PROTECT_COVER = new LidarSelfCaliStage(0);
    public static final /* enum */ LidarSelfCaliStage DOING = new LidarSelfCaliStage(1);
    public static final /* enum */ LidarSelfCaliStage DONE = new LidarSelfCaliStage(2);
    public static final /* enum */ LidarSelfCaliStage UNKNOWN = new LidarSelfCaliStage(65535);
    private int value;
    private static final LidarSelfCaliStage[] allValues;
    private static final /* synthetic */ LidarSelfCaliStage[] $VALUES;

    public static LidarSelfCaliStage[] values() {
        return null;
    }

    public static LidarSelfCaliStage valueOf(String string) {
        return null;
    }

    private LidarSelfCaliStage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LidarSelfCaliStage find(int n) {
        return null;
    }

    private static /* synthetic */ LidarSelfCaliStage[] $values() {
        return null;
    }

    static {
        $VALUES = LidarSelfCaliStage.$values();
        allValues = LidarSelfCaliStage.values();
    }
}

