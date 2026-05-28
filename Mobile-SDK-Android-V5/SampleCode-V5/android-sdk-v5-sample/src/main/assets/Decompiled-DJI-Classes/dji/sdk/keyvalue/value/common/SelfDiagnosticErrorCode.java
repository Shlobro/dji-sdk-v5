/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SelfDiagnosticErrorCode
extends Enum<SelfDiagnosticErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ SelfDiagnosticErrorCode ACK_SIZE_ERROR = new SelfDiagnosticErrorCode(2);
    public static final /* enum */ SelfDiagnosticErrorCode PROTO_VER_ERROR = new SelfDiagnosticErrorCode(1);
    public static final /* enum */ SelfDiagnosticErrorCode NO_ERROR = new SelfDiagnosticErrorCode(0);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_FAILURE = new SelfDiagnosticErrorCode(-1001);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_TIMEOUT = new SelfDiagnosticErrorCode(-1002);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_PARAM = new SelfDiagnosticErrorCode(-1003);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_STATUS = new SelfDiagnosticErrorCode(-1004);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_BUSY = new SelfDiagnosticErrorCode(-1005);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_NO_MEM = new SelfDiagnosticErrorCode(-1006);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_NO_RSRC = new SelfDiagnosticErrorCode(-1007);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_HARDWARE = new SelfDiagnosticErrorCode(-1008);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_NO_FEATURE = new SelfDiagnosticErrorCode(-1009);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_MISMATCH = new SelfDiagnosticErrorCode(-1010);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_DATA = new SelfDiagnosticErrorCode(-1011);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_TRY_LATER = new SelfDiagnosticErrorCode(-1012);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_NOT_IMPLEMENTED = new SelfDiagnosticErrorCode(-1013);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_CANCELLED = new SelfDiagnosticErrorCode(-1014);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_NOT_FOUND = new SelfDiagnosticErrorCode(-1015);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_FILTER_THROW = new SelfDiagnosticErrorCode(-1016);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_AGAIN = new SelfDiagnosticErrorCode(-1017);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_OUT_OF_RANGE = new SelfDiagnosticErrorCode(-1018);
    public static final /* enum */ SelfDiagnosticErrorCode ERROR_OUT_OF_DATA = new SelfDiagnosticErrorCode(-1019);
    public static final /* enum */ SelfDiagnosticErrorCode UNKNOWN = new SelfDiagnosticErrorCode(65535);
    private int value;
    private static final SelfDiagnosticErrorCode[] allValues;
    private static final /* synthetic */ SelfDiagnosticErrorCode[] $VALUES;

    public static SelfDiagnosticErrorCode[] values() {
        return null;
    }

    public static SelfDiagnosticErrorCode valueOf(String string) {
        return null;
    }

    private SelfDiagnosticErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SelfDiagnosticErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ SelfDiagnosticErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = SelfDiagnosticErrorCode.$values();
        allValues = SelfDiagnosticErrorCode.values();
    }
}

