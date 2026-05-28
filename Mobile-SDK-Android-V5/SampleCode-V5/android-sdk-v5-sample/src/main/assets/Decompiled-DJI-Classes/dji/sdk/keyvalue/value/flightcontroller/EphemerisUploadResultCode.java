/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class EphemerisUploadResultCode
extends Enum<EphemerisUploadResultCode>
implements JNIProguardKeepTag {
    public static final /* enum */ EphemerisUploadResultCode EPHEMERIS_UPLOAD_SUCCESS = new EphemerisUploadResultCode(0);
    public static final /* enum */ EphemerisUploadResultCode EPHEMERIS_GET_FAILED = new EphemerisUploadResultCode(16);
    public static final /* enum */ EphemerisUploadResultCode EPHEMERIS_UNZIP_FAILED = new EphemerisUploadResultCode(17);
    public static final /* enum */ EphemerisUploadResultCode UNKNOWN = new EphemerisUploadResultCode(65535);
    private int value;
    private static final EphemerisUploadResultCode[] allValues;
    private static final /* synthetic */ EphemerisUploadResultCode[] $VALUES;

    public static EphemerisUploadResultCode[] values() {
        return null;
    }

    public static EphemerisUploadResultCode valueOf(String string) {
        return null;
    }

    private EphemerisUploadResultCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EphemerisUploadResultCode find(int n) {
        return null;
    }

    private static /* synthetic */ EphemerisUploadResultCode[] $values() {
        return null;
    }

    static {
        $VALUES = EphemerisUploadResultCode.$values();
        allValues = EphemerisUploadResultCode.values();
    }
}

