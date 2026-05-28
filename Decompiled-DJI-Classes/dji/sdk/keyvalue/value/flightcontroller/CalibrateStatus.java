/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CalibrateStatus
extends Enum<CalibrateStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ CalibrateStatus START = new CalibrateStatus(0);
    public static final /* enum */ CalibrateStatus PROCESSING = new CalibrateStatus(1);
    public static final /* enum */ CalibrateStatus SUCCESSFUL = new CalibrateStatus(2);
    public static final /* enum */ CalibrateStatus FAILED = new CalibrateStatus(3);
    public static final /* enum */ CalibrateStatus UNKNOWN = new CalibrateStatus(65535);
    private int value;
    private static final CalibrateStatus[] allValues;
    private static final /* synthetic */ CalibrateStatus[] $VALUES;

    public static CalibrateStatus[] values() {
        return null;
    }

    public static CalibrateStatus valueOf(String string) {
        return null;
    }

    private CalibrateStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CalibrateStatus find(int n) {
        return null;
    }

    private static /* synthetic */ CalibrateStatus[] $values() {
        return null;
    }

    static {
        $VALUES = CalibrateStatus.$values();
        allValues = CalibrateStatus.values();
    }
}

