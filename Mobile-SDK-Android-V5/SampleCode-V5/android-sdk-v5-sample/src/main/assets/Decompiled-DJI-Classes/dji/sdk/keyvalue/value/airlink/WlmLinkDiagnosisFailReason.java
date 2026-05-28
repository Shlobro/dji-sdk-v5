/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmLinkDiagnosisFailReason
extends Enum<WlmLinkDiagnosisFailReason>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmLinkDiagnosisFailReason NO_ERROR = new WlmLinkDiagnosisFailReason(0);
    public static final /* enum */ WlmLinkDiagnosisFailReason NO_DONGLE = new WlmLinkDiagnosisFailReason(1);
    public static final /* enum */ WlmLinkDiagnosisFailReason NO_SIM = new WlmLinkDiagnosisFailReason(2);
    public static final /* enum */ WlmLinkDiagnosisFailReason NETWORK_UNREACHABLE = new WlmLinkDiagnosisFailReason(3);
    public static final /* enum */ WlmLinkDiagnosisFailReason INVALID_CA = new WlmLinkDiagnosisFailReason(4);
    public static final /* enum */ WlmLinkDiagnosisFailReason INVALID_DATE = new WlmLinkDiagnosisFailReason(5);
    public static final /* enum */ WlmLinkDiagnosisFailReason COUNTRY_CODE = new WlmLinkDiagnosisFailReason(6);
    public static final /* enum */ WlmLinkDiagnosisFailReason UNKNOWN = new WlmLinkDiagnosisFailReason(7);
    private int value;
    private static final WlmLinkDiagnosisFailReason[] allValues;
    private static final /* synthetic */ WlmLinkDiagnosisFailReason[] $VALUES;

    public static WlmLinkDiagnosisFailReason[] values() {
        return null;
    }

    public static WlmLinkDiagnosisFailReason valueOf(String string) {
        return null;
    }

    private WlmLinkDiagnosisFailReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmLinkDiagnosisFailReason find(int n) {
        return null;
    }

    private static /* synthetic */ WlmLinkDiagnosisFailReason[] $values() {
        return null;
    }

    static {
        $VALUES = WlmLinkDiagnosisFailReason.$values();
        allValues = WlmLinkDiagnosisFailReason.values();
    }
}

