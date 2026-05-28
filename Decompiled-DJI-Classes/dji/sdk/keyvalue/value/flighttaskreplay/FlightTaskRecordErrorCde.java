/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flighttaskreplay;

import dji.jni.JNIProguardKeepTag;

public final class FlightTaskRecordErrorCde
extends Enum<FlightTaskRecordErrorCde>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightTaskRecordErrorCde NO_ERROR = new FlightTaskRecordErrorCde(0);
    public static final /* enum */ FlightTaskRecordErrorCde INVALID_STATE = new FlightTaskRecordErrorCde(1);
    public static final /* enum */ FlightTaskRecordErrorCde NOT_CONFIG_YET = new FlightTaskRecordErrorCde(2);
    public static final /* enum */ FlightTaskRecordErrorCde FILE_IS_RECORDING = new FlightTaskRecordErrorCde(3);
    public static final /* enum */ FlightTaskRecordErrorCde RECORDER_IS_NIL = new FlightTaskRecordErrorCde(50);
    public static final /* enum */ FlightTaskRecordErrorCde MEMORY_OBJECT_IS_REMOVED = new FlightTaskRecordErrorCde(51);
    public static final /* enum */ FlightTaskRecordErrorCde FILE_PROCESSOR_NIL = new FlightTaskRecordErrorCde(52);
    public static final /* enum */ FlightTaskRecordErrorCde MAKE_DIR_FAILED = new FlightTaskRecordErrorCde(100);
    public static final /* enum */ FlightTaskRecordErrorCde CREATE_FILE_FAILED = new FlightTaskRecordErrorCde(101);
    public static final /* enum */ FlightTaskRecordErrorCde OPEN_FILE_ERROR = new FlightTaskRecordErrorCde(102);
    public static final /* enum */ FlightTaskRecordErrorCde ZIP_FILE_FAILED = new FlightTaskRecordErrorCde(103);
    public static final /* enum */ FlightTaskRecordErrorCde FILE_PATH_INVALID = new FlightTaskRecordErrorCde(104);
    public static final /* enum */ FlightTaskRecordErrorCde UNKNOWN = new FlightTaskRecordErrorCde(65535);
    private int value;
    private static final FlightTaskRecordErrorCde[] allValues;
    private static final /* synthetic */ FlightTaskRecordErrorCde[] $VALUES;

    public static FlightTaskRecordErrorCde[] values() {
        return null;
    }

    public static FlightTaskRecordErrorCde valueOf(String string) {
        return null;
    }

    private FlightTaskRecordErrorCde(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightTaskRecordErrorCde find(int n) {
        return null;
    }

    private static /* synthetic */ FlightTaskRecordErrorCde[] $values() {
        return null;
    }

    static {
        $VALUES = FlightTaskRecordErrorCde.$values();
        allValues = FlightTaskRecordErrorCde.values();
    }
}

