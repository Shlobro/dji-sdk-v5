/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PrecisionChartTransRequestState
extends Enum<PrecisionChartTransRequestState>
implements JNIProguardKeepTag {
    public static final /* enum */ PrecisionChartTransRequestState REQUEST_SUCCESS = new PrecisionChartTransRequestState(0);
    public static final /* enum */ PrecisionChartTransRequestState CHART_EXIST = new PrecisionChartTransRequestState(1);
    public static final /* enum */ PrecisionChartTransRequestState OPERATION_ABNORMAL = new PrecisionChartTransRequestState(2);
    public static final /* enum */ PrecisionChartTransRequestState UNKNOWN = new PrecisionChartTransRequestState(65535);
    private int value;
    private static final PrecisionChartTransRequestState[] allValues;
    private static final /* synthetic */ PrecisionChartTransRequestState[] $VALUES;

    public static PrecisionChartTransRequestState[] values() {
        return null;
    }

    public static PrecisionChartTransRequestState valueOf(String string) {
        return null;
    }

    private PrecisionChartTransRequestState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PrecisionChartTransRequestState find(int n) {
        return null;
    }

    private static /* synthetic */ PrecisionChartTransRequestState[] $values() {
        return null;
    }

    static {
        $VALUES = PrecisionChartTransRequestState.$values();
        allValues = PrecisionChartTransRequestState.values();
    }
}

