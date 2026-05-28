/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestCoverControlResult
extends Enum<DroneNestCoverControlResult>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestCoverControlResult SUCCESSED = new DroneNestCoverControlResult(0);
    public static final /* enum */ DroneNestCoverControlResult TASK_BUSY = new DroneNestCoverControlResult(1);
    public static final /* enum */ DroneNestCoverControlResult UNSUPPORT_CMD = new DroneNestCoverControlResult(2);
    public static final /* enum */ DroneNestCoverControlResult EMERGENCY = new DroneNestCoverControlResult(3);
    public static final /* enum */ DroneNestCoverControlResult ABNORMAL = new DroneNestCoverControlResult(4);
    public static final /* enum */ DroneNestCoverControlResult UNKNOWN = new DroneNestCoverControlResult(255);
    private int value;
    private static final DroneNestCoverControlResult[] allValues;
    private static final /* synthetic */ DroneNestCoverControlResult[] $VALUES;

    public static DroneNestCoverControlResult[] values() {
        return null;
    }

    public static DroneNestCoverControlResult valueOf(String string) {
        return null;
    }

    private DroneNestCoverControlResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestCoverControlResult find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestCoverControlResult[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestCoverControlResult.$values();
        allValues = DroneNestCoverControlResult.values();
    }
}

