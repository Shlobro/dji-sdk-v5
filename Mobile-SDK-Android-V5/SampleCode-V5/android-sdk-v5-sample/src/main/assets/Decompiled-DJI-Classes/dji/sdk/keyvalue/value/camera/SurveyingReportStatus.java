/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SurveyingReportStatus
extends Enum<SurveyingReportStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ SurveyingReportStatus IDLE = new SurveyingReportStatus(0);
    public static final /* enum */ SurveyingReportStatus RECORDING = new SurveyingReportStatus(1);
    public static final /* enum */ SurveyingReportStatus GENERATING = new SurveyingReportStatus(2);
    public static final /* enum */ SurveyingReportStatus FINISH = new SurveyingReportStatus(3);
    public static final /* enum */ SurveyingReportStatus ERROR = new SurveyingReportStatus(4);
    public static final /* enum */ SurveyingReportStatus UNKNOWN = new SurveyingReportStatus(65535);
    private int value;
    private static final SurveyingReportStatus[] allValues;
    private static final /* synthetic */ SurveyingReportStatus[] $VALUES;

    public static SurveyingReportStatus[] values() {
        return null;
    }

    public static SurveyingReportStatus valueOf(String string) {
        return null;
    }

    private SurveyingReportStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SurveyingReportStatus find(int n) {
        return null;
    }

    private static /* synthetic */ SurveyingReportStatus[] $values() {
        return null;
    }

    static {
        $VALUES = SurveyingReportStatus.$values();
        allValues = SurveyingReportStatus.values();
    }
}

