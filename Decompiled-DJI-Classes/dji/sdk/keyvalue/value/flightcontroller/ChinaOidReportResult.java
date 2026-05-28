/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ChinaOidReportResult
extends Enum<ChinaOidReportResult>
implements JNIProguardKeepTag {
    public static final /* enum */ ChinaOidReportResult NONE = new ChinaOidReportResult(0);
    public static final /* enum */ ChinaOidReportResult NO_ERROR = new ChinaOidReportResult(1);
    public static final /* enum */ ChinaOidReportResult FAIL_NETWORK_DISCONNECT = new ChinaOidReportResult(2);
    public static final /* enum */ ChinaOidReportResult FAIL_NETWORK_TIMEOUT = new ChinaOidReportResult(3);
    public static final /* enum */ ChinaOidReportResult FAIL_DATA_SIZE_ERROR = new ChinaOidReportResult(4);
    public static final /* enum */ ChinaOidReportResult GENERAL_FAIL = new ChinaOidReportResult(5);
    public static final /* enum */ ChinaOidReportResult UNKNOWN = new ChinaOidReportResult(65535);
    private int value;
    private static final ChinaOidReportResult[] allValues;
    private static final /* synthetic */ ChinaOidReportResult[] $VALUES;

    public static ChinaOidReportResult[] values() {
        return null;
    }

    public static ChinaOidReportResult valueOf(String string) {
        return null;
    }

    private ChinaOidReportResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ChinaOidReportResult find(int n) {
        return null;
    }

    private static /* synthetic */ ChinaOidReportResult[] $values() {
        return null;
    }

    static {
        $VALUES = ChinaOidReportResult.$values();
        allValues = ChinaOidReportResult.values();
    }
}

