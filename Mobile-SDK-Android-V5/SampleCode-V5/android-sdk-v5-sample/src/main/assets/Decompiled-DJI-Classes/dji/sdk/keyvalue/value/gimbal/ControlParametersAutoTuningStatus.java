/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class ControlParametersAutoTuningStatus
extends Enum<ControlParametersAutoTuningStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ ControlParametersAutoTuningStatus NOT_START = new ControlParametersAutoTuningStatus(0);
    public static final /* enum */ ControlParametersAutoTuningStatus IN_PROCESS = new ControlParametersAutoTuningStatus(1);
    public static final /* enum */ ControlParametersAutoTuningStatus FINISHED = new ControlParametersAutoTuningStatus(2);
    public static final /* enum */ ControlParametersAutoTuningStatus ERROR = new ControlParametersAutoTuningStatus(3);
    public static final /* enum */ ControlParametersAutoTuningStatus UNKNOWN = new ControlParametersAutoTuningStatus(100);
    private int value;
    private static final ControlParametersAutoTuningStatus[] allValues;
    private static final /* synthetic */ ControlParametersAutoTuningStatus[] $VALUES;

    public static ControlParametersAutoTuningStatus[] values() {
        return null;
    }

    public static ControlParametersAutoTuningStatus valueOf(String string) {
        return null;
    }

    private ControlParametersAutoTuningStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ControlParametersAutoTuningStatus find(int n) {
        return null;
    }

    private static /* synthetic */ ControlParametersAutoTuningStatus[] $values() {
        return null;
    }

    static {
        $VALUES = ControlParametersAutoTuningStatus.$values();
        allValues = ControlParametersAutoTuningStatus.values();
    }
}

