/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class EphemerisUploadCommandCode
extends Enum<EphemerisUploadCommandCode>
implements JNIProguardKeepTag {
    public static final /* enum */ EphemerisUploadCommandCode NOMRAL_UPLOAD = new EphemerisUploadCommandCode(0);
    public static final /* enum */ EphemerisUploadCommandCode GET_RESULT_UPLOAD = new EphemerisUploadCommandCode(1);
    public static final /* enum */ EphemerisUploadCommandCode UNKNOWN = new EphemerisUploadCommandCode(65535);
    private int value;
    private static final EphemerisUploadCommandCode[] allValues;
    private static final /* synthetic */ EphemerisUploadCommandCode[] $VALUES;

    public static EphemerisUploadCommandCode[] values() {
        return null;
    }

    public static EphemerisUploadCommandCode valueOf(String string) {
        return null;
    }

    private EphemerisUploadCommandCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EphemerisUploadCommandCode find(int n) {
        return null;
    }

    private static /* synthetic */ EphemerisUploadCommandCode[] $values() {
        return null;
    }

    static {
        $VALUES = EphemerisUploadCommandCode.$values();
        allValues = EphemerisUploadCommandCode.values();
    }
}

