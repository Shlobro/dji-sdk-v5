/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class LidarDataSampleRateMode
extends Enum<LidarDataSampleRateMode>
implements JNIProguardKeepTag {
    public static final /* enum */ LidarDataSampleRateMode RATE_240K_HZ = new LidarDataSampleRateMode(0);
    public static final /* enum */ LidarDataSampleRateMode RATE_160K_HZ = new LidarDataSampleRateMode(1);
    public static final /* enum */ LidarDataSampleRateMode RATE_120K_HZ = new LidarDataSampleRateMode(2);
    public static final /* enum */ LidarDataSampleRateMode RATE_80K_HZ = new LidarDataSampleRateMode(3);
    public static final /* enum */ LidarDataSampleRateMode RATE_180K_HZ = new LidarDataSampleRateMode(4);
    public static final /* enum */ LidarDataSampleRateMode RATE_60K_HZ = new LidarDataSampleRateMode(5);
    public static final /* enum */ LidarDataSampleRateMode RATE_100K_HZ = new LidarDataSampleRateMode(6);
    public static final /* enum */ LidarDataSampleRateMode RATE_350K_HZ = new LidarDataSampleRateMode(7);
    public static final /* enum */ LidarDataSampleRateMode RATE_1M_HZ = new LidarDataSampleRateMode(8);
    public static final /* enum */ LidarDataSampleRateMode RATE_2M_HZ = new LidarDataSampleRateMode(9);
    public static final /* enum */ LidarDataSampleRateMode UNKNOWN = new LidarDataSampleRateMode(65535);
    private int value;
    private static final LidarDataSampleRateMode[] allValues;
    private static final /* synthetic */ LidarDataSampleRateMode[] $VALUES;

    public static LidarDataSampleRateMode[] values() {
        return null;
    }

    public static LidarDataSampleRateMode valueOf(String string) {
        return null;
    }

    private LidarDataSampleRateMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LidarDataSampleRateMode find(int n) {
        return null;
    }

    private static /* synthetic */ LidarDataSampleRateMode[] $values() {
        return null;
    }

    static {
        $VALUES = LidarDataSampleRateMode.$values();
        allValues = LidarDataSampleRateMode.values();
    }
}

