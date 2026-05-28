/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SDRQualityDetectRet
extends Enum<SDRQualityDetectRet>
implements JNIProguardKeepTag {
    public static final /* enum */ SDRQualityDetectRet DJI_SDR_DETECT_RET_OK = new SDRQualityDetectRet(0);
    public static final /* enum */ SDRQualityDetectRet DJI_SDR_DETECT_RET_ONGOING = new SDRQualityDetectRet(1);
    public static final /* enum */ SDRQualityDetectRet DJI_SDR_DETECT_RET_START_FAIL = new SDRQualityDetectRet(2);
    public static final /* enum */ SDRQualityDetectRet DJI_SDR_DETECT_RET_STOP_FAIL = new SDRQualityDetectRet(3);
    public static final /* enum */ SDRQualityDetectRet DJI_SDR_DETECT_RET_DETECT_FAIL = new SDRQualityDetectRet(4);
    public static final /* enum */ SDRQualityDetectRet DJI_SDR_DETECT_RET_INVALID_PARAM = new SDRQualityDetectRet(5);
    public static final /* enum */ SDRQualityDetectRet DJI_SDR_DETECT_RET_FC_MODE_SET_FAIL = new SDRQualityDetectRet(6);
    public static final /* enum */ SDRQualityDetectRet DJI_SDR_DETECT_RET_UNKNOWN = new SDRQualityDetectRet(7);
    public static final /* enum */ SDRQualityDetectRet UNKNOWN = new SDRQualityDetectRet(65535);
    private int value;
    private static final SDRQualityDetectRet[] allValues;
    private static final /* synthetic */ SDRQualityDetectRet[] $VALUES;

    public static SDRQualityDetectRet[] values() {
        return null;
    }

    public static SDRQualityDetectRet valueOf(String string) {
        return null;
    }

    private SDRQualityDetectRet(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SDRQualityDetectRet find(int n) {
        return null;
    }

    private static /* synthetic */ SDRQualityDetectRet[] $values() {
        return null;
    }

    static {
        $VALUES = SDRQualityDetectRet.$values();
        allValues = SDRQualityDetectRet.values();
    }
}

