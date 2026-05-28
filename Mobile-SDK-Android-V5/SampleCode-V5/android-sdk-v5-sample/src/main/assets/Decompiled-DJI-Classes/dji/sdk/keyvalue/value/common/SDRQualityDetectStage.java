/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SDRQualityDetectStage
extends Enum<SDRQualityDetectStage>
implements JNIProguardKeepTag {
    public static final /* enum */ SDRQualityDetectStage DJI_SDR_DETECT_STAGE_IDLE = new SDRQualityDetectStage(0);
    public static final /* enum */ SDRQualityDetectStage DJI_SDR_DETECT_STAGE_DOWNLOAD_24G = new SDRQualityDetectStage(1);
    public static final /* enum */ SDRQualityDetectStage DJI_SDR_DETECT_STAGE_UPLOAD_24G = new SDRQualityDetectStage(2);
    public static final /* enum */ SDRQualityDetectStage DJI_SDR_DETECT_STAGE_UPLOAD_58G = new SDRQualityDetectStage(3);
    public static final /* enum */ SDRQualityDetectStage DJI_SDR_DETECT_STAGE_EVALUATE = new SDRQualityDetectStage(4);
    public static final /* enum */ SDRQualityDetectStage UNKNOWN = new SDRQualityDetectStage(65535);
    private int value;
    private static final SDRQualityDetectStage[] allValues;
    private static final /* synthetic */ SDRQualityDetectStage[] $VALUES;

    public static SDRQualityDetectStage[] values() {
        return null;
    }

    public static SDRQualityDetectStage valueOf(String string) {
        return null;
    }

    private SDRQualityDetectStage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SDRQualityDetectStage find(int n) {
        return null;
    }

    private static /* synthetic */ SDRQualityDetectStage[] $values() {
        return null;
    }

    static {
        $VALUES = SDRQualityDetectStage.$values();
        allValues = SDRQualityDetectStage.values();
    }
}

