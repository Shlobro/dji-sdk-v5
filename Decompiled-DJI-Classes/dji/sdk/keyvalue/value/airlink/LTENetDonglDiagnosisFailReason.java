/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class LTENetDonglDiagnosisFailReason
extends Enum<LTENetDonglDiagnosisFailReason>
implements JNIProguardKeepTag {
    public static final /* enum */ LTENetDonglDiagnosisFailReason NO_ERROR = new LTENetDonglDiagnosisFailReason(0);
    public static final /* enum */ LTENetDonglDiagnosisFailReason NO_DONGLE = new LTENetDonglDiagnosisFailReason(1);
    public static final /* enum */ LTENetDonglDiagnosisFailReason NO_SIM = new LTENetDonglDiagnosisFailReason(2);
    public static final /* enum */ LTENetDonglDiagnosisFailReason NETWORK_UNREACHABLE = new LTENetDonglDiagnosisFailReason(3);
    public static final /* enum */ LTENetDonglDiagnosisFailReason INVALID_CA = new LTENetDonglDiagnosisFailReason(4);
    public static final /* enum */ LTENetDonglDiagnosisFailReason INVALID_DATE = new LTENetDonglDiagnosisFailReason(5);
    public static final /* enum */ LTENetDonglDiagnosisFailReason COUNTRY_CODE = new LTENetDonglDiagnosisFailReason(6);
    public static final /* enum */ LTENetDonglDiagnosisFailReason UNKNOWN = new LTENetDonglDiagnosisFailReason(7);
    private int value;
    private static final LTENetDonglDiagnosisFailReason[] allValues;
    private static final /* synthetic */ LTENetDonglDiagnosisFailReason[] $VALUES;

    public static LTENetDonglDiagnosisFailReason[] values() {
        return null;
    }

    public static LTENetDonglDiagnosisFailReason valueOf(String string) {
        return null;
    }

    private LTENetDonglDiagnosisFailReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LTENetDonglDiagnosisFailReason find(int n) {
        return null;
    }

    private static /* synthetic */ LTENetDonglDiagnosisFailReason[] $values() {
        return null;
    }

    static {
        $VALUES = LTENetDonglDiagnosisFailReason.$values();
        allValues = LTENetDonglDiagnosisFailReason.values();
    }
}

