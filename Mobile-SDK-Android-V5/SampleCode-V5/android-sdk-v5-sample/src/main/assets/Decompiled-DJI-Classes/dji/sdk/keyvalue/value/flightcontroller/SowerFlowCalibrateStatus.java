/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class SowerFlowCalibrateStatus
extends Enum<SowerFlowCalibrateStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ SowerFlowCalibrateStatus START = new SowerFlowCalibrateStatus(0);
    public static final /* enum */ SowerFlowCalibrateStatus PROCESSING = new SowerFlowCalibrateStatus(1);
    public static final /* enum */ SowerFlowCalibrateStatus SUCCESSFUL = new SowerFlowCalibrateStatus(2);
    public static final /* enum */ SowerFlowCalibrateStatus FAILED = new SowerFlowCalibrateStatus(3);
    public static final /* enum */ SowerFlowCalibrateStatus CONTINUE = new SowerFlowCalibrateStatus(10);
    public static final /* enum */ SowerFlowCalibrateStatus PAUSE = new SowerFlowCalibrateStatus(11);
    public static final /* enum */ SowerFlowCalibrateStatus UNKNOWN = new SowerFlowCalibrateStatus(65535);
    private int value;
    private static final SowerFlowCalibrateStatus[] allValues;
    private static final /* synthetic */ SowerFlowCalibrateStatus[] $VALUES;

    public static SowerFlowCalibrateStatus[] values() {
        return null;
    }

    public static SowerFlowCalibrateStatus valueOf(String string) {
        return null;
    }

    private SowerFlowCalibrateStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SowerFlowCalibrateStatus find(int n) {
        return null;
    }

    private static /* synthetic */ SowerFlowCalibrateStatus[] $values() {
        return null;
    }

    static {
        $VALUES = SowerFlowCalibrateStatus.$values();
        allValues = SowerFlowCalibrateStatus.values();
    }
}

