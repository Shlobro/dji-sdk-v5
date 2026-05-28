/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GnssEnvironmentTaskTotalStatusCode
extends Enum<GnssEnvironmentTaskTotalStatusCode>
implements JNIProguardKeepTag {
    public static final /* enum */ GnssEnvironmentTaskTotalStatusCode TASK_NO_FINISH = new GnssEnvironmentTaskTotalStatusCode(0);
    public static final /* enum */ GnssEnvironmentTaskTotalStatusCode TASK_FIRST_FINISH = new GnssEnvironmentTaskTotalStatusCode(1);
    public static final /* enum */ GnssEnvironmentTaskTotalStatusCode TASK_SECOND_FINISH = new GnssEnvironmentTaskTotalStatusCode(2);
    public static final /* enum */ GnssEnvironmentTaskTotalStatusCode UNKNOWN = new GnssEnvironmentTaskTotalStatusCode(255);
    private int value;
    private static final GnssEnvironmentTaskTotalStatusCode[] allValues;
    private static final /* synthetic */ GnssEnvironmentTaskTotalStatusCode[] $VALUES;

    public static GnssEnvironmentTaskTotalStatusCode[] values() {
        return null;
    }

    public static GnssEnvironmentTaskTotalStatusCode valueOf(String string) {
        return null;
    }

    private GnssEnvironmentTaskTotalStatusCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GnssEnvironmentTaskTotalStatusCode find(int n) {
        return null;
    }

    private static /* synthetic */ GnssEnvironmentTaskTotalStatusCode[] $values() {
        return null;
    }

    static {
        $VALUES = GnssEnvironmentTaskTotalStatusCode.$values();
        allValues = GnssEnvironmentTaskTotalStatusCode.values();
    }
}

