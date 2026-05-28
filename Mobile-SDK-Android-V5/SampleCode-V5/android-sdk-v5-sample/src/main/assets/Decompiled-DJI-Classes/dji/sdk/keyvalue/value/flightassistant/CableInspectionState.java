/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class CableInspectionState
extends Enum<CableInspectionState>
implements JNIProguardKeepTag {
    public static final /* enum */ CableInspectionState STANDBY = new CableInspectionState(0);
    public static final /* enum */ CableInspectionState ADJUST_POS = new CableInspectionState(1);
    public static final /* enum */ CableInspectionState WAITING = new CableInspectionState(2);
    public static final /* enum */ CableInspectionState CALIBRATION = new CableInspectionState(3);
    public static final /* enum */ CableInspectionState CAM_CONFIG = new CableInspectionState(4);
    public static final /* enum */ CableInspectionState FOLLOW = new CableInspectionState(5);
    public static final /* enum */ CableInspectionState FINISH = new CableInspectionState(6);
    public static final /* enum */ CableInspectionState UNKNOWN = new CableInspectionState(65535);
    private int value;
    private static final CableInspectionState[] allValues;
    private static final /* synthetic */ CableInspectionState[] $VALUES;

    public static CableInspectionState[] values() {
        return null;
    }

    public static CableInspectionState valueOf(String string) {
        return null;
    }

    private CableInspectionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CableInspectionState find(int n) {
        return null;
    }

    private static /* synthetic */ CableInspectionState[] $values() {
        return null;
    }

    static {
        $VALUES = CableInspectionState.$values();
        allValues = CableInspectionState.values();
    }
}

