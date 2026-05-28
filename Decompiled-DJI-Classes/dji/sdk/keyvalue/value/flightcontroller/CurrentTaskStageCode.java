/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CurrentTaskStageCode
extends Enum<CurrentTaskStageCode>
implements JNIProguardKeepTag {
    public static final /* enum */ CurrentTaskStageCode TASK_STAGE_ONE = new CurrentTaskStageCode(1);
    public static final /* enum */ CurrentTaskStageCode TASK_STAGE_TWO = new CurrentTaskStageCode(2);
    public static final /* enum */ CurrentTaskStageCode UNKNOWN = new CurrentTaskStageCode(255);
    private int value;
    private static final CurrentTaskStageCode[] allValues;
    private static final /* synthetic */ CurrentTaskStageCode[] $VALUES;

    public static CurrentTaskStageCode[] values() {
        return null;
    }

    public static CurrentTaskStageCode valueOf(String string) {
        return null;
    }

    private CurrentTaskStageCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CurrentTaskStageCode find(int n) {
        return null;
    }

    private static /* synthetic */ CurrentTaskStageCode[] $values() {
        return null;
    }

    static {
        $VALUES = CurrentTaskStageCode.$values();
        allValues = CurrentTaskStageCode.values();
    }
}

