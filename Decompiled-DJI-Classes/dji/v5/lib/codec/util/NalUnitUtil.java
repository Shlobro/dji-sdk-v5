/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.lib.codec.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.lib.codec.model.H264SpsData;
import dji.v5.lib.codec.model.H265SpsData;
import dji.v5.lib.codec.model.SEIData;
import dji.v5.lib.codec.util.CodecByteBuffer;
import dji.v5.lib.codec.util.ParsableNalUnitBitArray;
import java.util.List;

public final class NalUnitUtil {
    private static final String TAG = "NalUnitUtil";
    private static final int NAL_UNIT_HEADER_LENGTH = 3;
    private static final int NAL_UNIT_HEADER_LENGTH2 = 4;
    public static final int EXTENDED_SAR = 255;
    public static final float[] ASPECT_RATIO_IDC_VALUES = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final int NAL_TYPE_H264_NON_IDR = 1;
    public static final int NAL_TYPE_H264_PARTITION_A = 2;
    public static final int NAL_TYPE_H264_PARTITION_B = 3;
    public static final int NAL_TYPE_H264_PARTITION_C = 4;
    public static final int NAL_TYPE_H264_IDR = 5;
    public static final int NAL_TYPE_H264_SEI = 6;
    public static final int NAL_TYPE_H264_SPS = 7;
    public static final int NAL_TYPE_H264_PPS = 8;
    public static final int NAL_TYPE_H264_AUD = 9;
    public static final int NAL_TYPE_H265_TRAIL_R = 1;
    public static final int NAL_TYPE_BLA_W_LP = 16;
    public static final int NAL_TYPE_BLA_W_RADL = 17;
    public static final int NAL_TYPE_BLA_N_LP = 18;
    public static final int NAL_TYPE_H265_IDR_RADL = 19;
    public static final int NAL_TYPE_H265_IDR = 20;
    public static final int NAL_TYPE_CRA_NUT = 21;
    public static final int NAL_TYPE_H265_VPS = 32;
    public static final int NAL_TYPE_H265_SPS = 33;
    public static final int NAL_TYPE_H265_PPS = 34;
    public static final int NAL_TYPE_H265_AUD = 35;
    public static final int NAL_TYPE_H265_SEI = 39;
    public static final int NAL_TYPE_H265_SEI2 = 40;
    private static final int MAX_SEI_PAYLOAD_SIZE = 524288;

    public static int getH264NalUnitType(int n, byte[] byArray, int n2) {
        return 0;
    }

    public static int getH265NalUnitType(int n, byte[] byArray, int n2) {
        return 0;
    }

    public static H264SpsData parseH264SpsNalUnit(int n, byte[] byArray, int n2, int n3) {
        return null;
    }

    public static H265SpsData parseH265SpsNalUnit(int n, byte[] byArray, int n2, int n3) {
        return null;
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int n) {
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
    }

    private static void skipShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
    }

    @Nullable
    public static SEIData parseH264SEIData(int n, byte[] byArray, int n2, int n3) {
        return null;
    }

    @Nullable
    public static SEIData parseH265SEIData(int n, byte[] byArray, int n2, int n3) {
        return null;
    }

    @Nullable
    public static SEIData parseSEIData(byte[] byArray, int n, int n2) {
        return null;
    }

    public static void readRealFrameData(@NonNull byte[] byArray, int n, int n2, @NonNull CodecByteBuffer codecByteBuffer) {
    }

    public static boolean isNalHeader(int n, @NonNull byte[] byArray, int n2) {
        return false;
    }

    public static int getH265StartOffset(int n, @NonNull List<Integer> list, @NonNull byte[] byArray) {
        return 0;
    }

    public static int getH264StartOffset(int n, @NonNull List<Integer> list, @NonNull byte[] byArray) {
        return 0;
    }

    public static int getStartCodeLength(boolean bl) {
        return 0;
    }

    private NalUnitUtil() {
    }
}

