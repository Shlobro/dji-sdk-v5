/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class MeasuringStatus
extends Enum<MeasuringStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ MeasuringStatus STATUS_OK = new MeasuringStatus(0);
    public static final /* enum */ MeasuringStatus STATUS_TEMP_LOW = new MeasuringStatus(128);
    public static final /* enum */ MeasuringStatus STATUS_TEMP_HIGH = new MeasuringStatus(129);
    public static final /* enum */ MeasuringStatus STATUS_SHIFT_SWITCHING = new MeasuringStatus(130);
    public static final /* enum */ MeasuringStatus STATUS_LOST_DATA = new MeasuringStatus(131);
    public static final /* enum */ MeasuringStatus STATUS_INITIALIZING = new MeasuringStatus(132);
    public static final /* enum */ MeasuringStatus STATUS_FAIL = new MeasuringStatus(133);
    public static final /* enum */ MeasuringStatus UNKNOWN = new MeasuringStatus(134);
    private int value;
    private static final MeasuringStatus[] allValues;
    private static final /* synthetic */ MeasuringStatus[] $VALUES;

    public static MeasuringStatus[] values() {
        return null;
    }

    public static MeasuringStatus valueOf(String string) {
        return null;
    }

    private MeasuringStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MeasuringStatus find(int n) {
        return null;
    }

    private static /* synthetic */ MeasuringStatus[] $values() {
        return null;
    }

    static {
        $VALUES = MeasuringStatus.$values();
        allValues = MeasuringStatus.values();
    }
}

