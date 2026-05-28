/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class FlightTaskUploadState
extends Enum<FlightTaskUploadState>
implements JNIProguardKeepTag {
    public static final /* enum */ FlightTaskUploadState IDEL = new FlightTaskUploadState(0);
    public static final /* enum */ FlightTaskUploadState UPLOADING = new FlightTaskUploadState(1);
    public static final /* enum */ FlightTaskUploadState UPLOAD_SUCCESS = new FlightTaskUploadState(2);
    public static final /* enum */ FlightTaskUploadState UPLOAD_FAIL = new FlightTaskUploadState(3);
    public static final /* enum */ FlightTaskUploadState UPLOAD_CANCEL = new FlightTaskUploadState(4);
    public static final /* enum */ FlightTaskUploadState UNKNOWN = new FlightTaskUploadState(65535);
    private int value;
    private static final FlightTaskUploadState[] allValues;
    private static final /* synthetic */ FlightTaskUploadState[] $VALUES;

    public static FlightTaskUploadState[] values() {
        return null;
    }

    public static FlightTaskUploadState valueOf(String string) {
        return null;
    }

    private FlightTaskUploadState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlightTaskUploadState find(int n) {
        return null;
    }

    private static /* synthetic */ FlightTaskUploadState[] $values() {
        return null;
    }

    static {
        $VALUES = FlightTaskUploadState.$values();
        allValues = FlightTaskUploadState.values();
    }
}

