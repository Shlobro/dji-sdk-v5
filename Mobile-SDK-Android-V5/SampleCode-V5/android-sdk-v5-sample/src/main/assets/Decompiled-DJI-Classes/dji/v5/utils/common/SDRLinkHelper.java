/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.common;

public class SDRLinkHelper {
    public static final int ORIGINAL_NF_840M_START_FREQ = 820;
    public static final int ORIGINAL_NF_1DOT4G_START_FREQ = 1400;
    public static final int ORIGINAL_NF_2DOT4G_START_FREQ = 2400;
    public static final int ORIGINAL_NF_5DOT8G_START_FREQ = 5470;
    public static final int ORIGINAL_NF_840M_START_INDEX = 362;
    public static final int ORIGINAL_NF_840M_END_INDEX = 368;
    public static final int ORIGINAL_NF_1DOT4G_START_INDEX = 614;
    public static final int ORIGINAL_NF_1DOT4G_END_INDEX = 629;
    public static final int ORIGINAL_NF_2DOT4G_START_INDEX = 1001;
    public static final int ORIGINAL_NF_2DOT4G_END_INDEX = 1084;
    public static final int ORIGINAL_NF_5DOT7G_START_INDEX = 2464;
    public static final int ORIGINAL_NF_5DOT7G_END_INDEX = 2570;
    public static final int ORIGINAL_NF_5DOT8G_START_INDEX = 2539;
    public static final int ORIGINAL_NF_5DOT8G_END_INDEX = 2664;
    public static final int ORIGINAL_NF_5DOT2G_START_INDEX = 2084;
    public static final int ORIGINAL_NF_5DOT2G_END_INDEX = 2283;
    private static final int[] ORIGINAL_NF_5DOT7G_INDEXS = new int[]{2474, 2494, 2514, 2534, 2559};
    private static final int NF_840M_MIN_INDEX = 342;
    private static final int NF_1DOT4G_MIN_INDEX = 584;
    private static final int NF_2DOT4G_MIN_INDEX = 1001;
    private static final int NF_5DOT8G_MIN_INDEX = 2284;
    public static final int RANGE_SIZE_10MHZ = 5;
    public static final int RANGE_SIZE_20MHZ = 10;
    public static final int RANGE_SIZE_40MHZ = 20;

    private SDRLinkHelper() {
    }

    public static int convertFrequencyFormFrequencyPointIndex(int n) {
        return 0;
    }

    public static int convertFrequencyPointFromFrequencyIndex(int n) {
        return 0;
    }

    public static boolean isFrequencyIndexIn2dot4G(int n) {
        return false;
    }

    public static boolean isFrequencyIndexIn5dot8G(int n) {
        return false;
    }

    public static boolean isFrequencyIndex5dot2G(int n) {
        return false;
    }

    public static boolean isFrequencyIndexIn5dot7G(int n) {
        return false;
    }

    public static boolean isFrequencyIndexIn840M(int n) {
        return false;
    }

    public static boolean isFrequencyIndexIn1dot4G(int n) {
        return false;
    }

    private static boolean checkIn5dot7GNfIndexs(int n) {
        return false;
    }
}

