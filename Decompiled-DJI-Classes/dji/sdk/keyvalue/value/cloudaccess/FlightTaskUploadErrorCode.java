/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class FlightTaskUploadErrorCode
extends Enum<FlightTaskUploadErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightTaskUploadErrorCode NO_ERROR = new FlightTaskUploadErrorCode(0);
    public static final /* enum */ FlightTaskUploadErrorCode PRJ_ORG_UUID_EMPTT = new FlightTaskUploadErrorCode(1);
    public static final /* enum */ FlightTaskUploadErrorCode INVALID_PARAMS = new FlightTaskUploadErrorCode(2);
    public static final /* enum */ FlightTaskUploadErrorCode FILE_UUID_NOT_FOUND = new FlightTaskUploadErrorCode(3);
    public static final /* enum */ FlightTaskUploadErrorCode GET_RC_SN_FAIL = new FlightTaskUploadErrorCode(4);
    public static final /* enum */ FlightTaskUploadErrorCode NOT_UPLOADING = new FlightTaskUploadErrorCode(5);
    public static final /* enum */ FlightTaskUploadErrorCode UPLOADING = new FlightTaskUploadErrorCode(6);
    public static final /* enum */ FlightTaskUploadErrorCode MEMORY_OBJECT_IS_REMOVED = new FlightTaskUploadErrorCode(31);
    public static final /* enum */ FlightTaskUploadErrorCode UNKNOWN = new FlightTaskUploadErrorCode(65535);
    private int value;
    private static final FlightTaskUploadErrorCode[] allValues;
    private static final /* synthetic */ FlightTaskUploadErrorCode[] $VALUES;

    public static FlightTaskUploadErrorCode[] values() {
        return null;
    }

    public static FlightTaskUploadErrorCode valueOf(String string) {
        return null;
    }

    private FlightTaskUploadErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightTaskUploadErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ FlightTaskUploadErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = FlightTaskUploadErrorCode.$values();
        allValues = FlightTaskUploadErrorCode.values();
    }
}

