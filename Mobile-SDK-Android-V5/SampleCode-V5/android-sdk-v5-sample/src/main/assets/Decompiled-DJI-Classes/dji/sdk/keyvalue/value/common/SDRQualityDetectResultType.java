/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SDRQualityDetectResultType
extends Enum<SDRQualityDetectResultType>
implements JNIProguardKeepTag {
    public static final /* enum */ SDRQualityDetectResultType DJI_SDR_QUALITY_LEVEL_EXCELLENT = new SDRQualityDetectResultType(0);
    public static final /* enum */ SDRQualityDetectResultType DJI_SDR_QUALITY_LEVEL_GOOD = new SDRQualityDetectResultType(1);
    public static final /* enum */ SDRQualityDetectResultType DJI_SDR_QUALITY_LEVEL_POOR = new SDRQualityDetectResultType(2);
    public static final /* enum */ SDRQualityDetectResultType UNKNOWN = new SDRQualityDetectResultType(65535);
    private int value;
    private static final SDRQualityDetectResultType[] allValues;
    private static final /* synthetic */ SDRQualityDetectResultType[] $VALUES;

    public static SDRQualityDetectResultType[] values() {
        return null;
    }

    public static SDRQualityDetectResultType valueOf(String string) {
        return null;
    }

    private SDRQualityDetectResultType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SDRQualityDetectResultType find(int n) {
        return null;
    }

    private static /* synthetic */ SDRQualityDetectResultType[] $values() {
        return null;
    }

    static {
        $VALUES = SDRQualityDetectResultType.$values();
        allValues = SDRQualityDetectResultType.values();
    }
}

