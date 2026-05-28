/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GnssEnvironmentTaskStageCode
extends Enum<GnssEnvironmentTaskStageCode>
implements JNIProguardKeepTag {
    public static final /* enum */ GnssEnvironmentTaskStageCode TASK_STAGE_NO_START = new GnssEnvironmentTaskStageCode(0);
    public static final /* enum */ GnssEnvironmentTaskStageCode TASK_STAGE_FAIL = new GnssEnvironmentTaskStageCode(1);
    public static final /* enum */ GnssEnvironmentTaskStageCode TASK_STAGE_FINISH = new GnssEnvironmentTaskStageCode(2);
    public static final /* enum */ GnssEnvironmentTaskStageCode UNKNOWN = new GnssEnvironmentTaskStageCode(255);
    private int value;
    private static final GnssEnvironmentTaskStageCode[] allValues;
    private static final /* synthetic */ GnssEnvironmentTaskStageCode[] $VALUES;

    public static GnssEnvironmentTaskStageCode[] values() {
        return null;
    }

    public static GnssEnvironmentTaskStageCode valueOf(String string) {
        return null;
    }

    private GnssEnvironmentTaskStageCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GnssEnvironmentTaskStageCode find(int n) {
        return null;
    }

    private static /* synthetic */ GnssEnvironmentTaskStageCode[] $values() {
        return null;
    }

    static {
        $VALUES = GnssEnvironmentTaskStageCode.$values();
        allValues = GnssEnvironmentTaskStageCode.values();
    }
}

