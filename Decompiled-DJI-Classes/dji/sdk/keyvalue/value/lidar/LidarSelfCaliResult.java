/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class LidarSelfCaliResult
extends Enum<LidarSelfCaliResult>
implements JNIProguardKeepTag {
    public static final /* enum */ LidarSelfCaliResult SUC = new LidarSelfCaliResult(0);
    public static final /* enum */ LidarSelfCaliResult FAILED_PROTECT_COVER = new LidarSelfCaliResult(1);
    public static final /* enum */ LidarSelfCaliResult FAILED_PROTECT_FAIL_PROCESS = new LidarSelfCaliResult(2);
    public static final /* enum */ LidarSelfCaliResult UNKNOWN = new LidarSelfCaliResult(65535);
    private int value;
    private static final LidarSelfCaliResult[] allValues;
    private static final /* synthetic */ LidarSelfCaliResult[] $VALUES;

    public static LidarSelfCaliResult[] values() {
        return null;
    }

    public static LidarSelfCaliResult valueOf(String string) {
        return null;
    }

    private LidarSelfCaliResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LidarSelfCaliResult find(int n) {
        return null;
    }

    private static /* synthetic */ LidarSelfCaliResult[] $values() {
        return null;
    }

    static {
        $VALUES = LidarSelfCaliResult.$values();
        allValues = LidarSelfCaliResult.values();
    }
}

