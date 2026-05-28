/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlyToMissionState
extends Enum<FlyToMissionState>
implements JNIProguardKeepTag {
    public static final /* enum */ FlyToMissionState IDLE = new FlyToMissionState(0);
    public static final /* enum */ FlyToMissionState PREPARE = new FlyToMissionState(1);
    public static final /* enum */ FlyToMissionState LAUNCH_PRE = new FlyToMissionState(2);
    public static final /* enum */ FlyToMissionState LAUNCH = new FlyToMissionState(3);
    public static final /* enum */ FlyToMissionState MARCHON = new FlyToMissionState(4);
    public static final /* enum */ FlyToMissionState INTERRUPTED = new FlyToMissionState(5);
    public static final /* enum */ FlyToMissionState FINISHED = new FlyToMissionState(6);
    public static final /* enum */ FlyToMissionState UNKNOWN = new FlyToMissionState(65535);
    private int value;
    private static final FlyToMissionState[] allValues;
    private static final /* synthetic */ FlyToMissionState[] $VALUES;

    public static FlyToMissionState[] values() {
        return null;
    }

    public static FlyToMissionState valueOf(String string) {
        return null;
    }

    private FlyToMissionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlyToMissionState find(int n) {
        return null;
    }

    private static /* synthetic */ FlyToMissionState[] $values() {
        return null;
    }

    static {
        $VALUES = FlyToMissionState.$values();
        allValues = FlyToMissionState.values();
    }
}

