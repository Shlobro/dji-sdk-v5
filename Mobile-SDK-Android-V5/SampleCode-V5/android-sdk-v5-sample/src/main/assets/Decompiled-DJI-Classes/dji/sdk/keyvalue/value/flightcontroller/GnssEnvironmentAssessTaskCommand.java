/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GnssEnvironmentAssessTaskCommand
extends Enum<GnssEnvironmentAssessTaskCommand>
implements JNIProguardKeepTag {
    public static final /* enum */ GnssEnvironmentAssessTaskCommand TASK_START_FIRST = new GnssEnvironmentAssessTaskCommand(0);
    public static final /* enum */ GnssEnvironmentAssessTaskCommand TASK_START_SECOND = new GnssEnvironmentAssessTaskCommand(1);
    public static final /* enum */ GnssEnvironmentAssessTaskCommand TASK_ABORT = new GnssEnvironmentAssessTaskCommand(2);
    public static final /* enum */ GnssEnvironmentAssessTaskCommand TASK_DELETE = new GnssEnvironmentAssessTaskCommand(3);
    public static final /* enum */ GnssEnvironmentAssessTaskCommand TASK_RENAME = new GnssEnvironmentAssessTaskCommand(4);
    public static final /* enum */ GnssEnvironmentAssessTaskCommand TASK_START_DOWNLOAD = new GnssEnvironmentAssessTaskCommand(5);
    public static final /* enum */ GnssEnvironmentAssessTaskCommand UNKNOWN = new GnssEnvironmentAssessTaskCommand(255);
    private int value;
    private static final GnssEnvironmentAssessTaskCommand[] allValues;
    private static final /* synthetic */ GnssEnvironmentAssessTaskCommand[] $VALUES;

    public static GnssEnvironmentAssessTaskCommand[] values() {
        return null;
    }

    public static GnssEnvironmentAssessTaskCommand valueOf(String string) {
        return null;
    }

    private GnssEnvironmentAssessTaskCommand(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GnssEnvironmentAssessTaskCommand find(int n) {
        return null;
    }

    private static /* synthetic */ GnssEnvironmentAssessTaskCommand[] $values() {
        return null;
    }

    static {
        $VALUES = GnssEnvironmentAssessTaskCommand.$values();
        allValues = GnssEnvironmentAssessTaskCommand.values();
    }
}

