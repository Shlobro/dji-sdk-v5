/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.utils;

import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraVideoStreamSourceRange;
import dji.sdk.keyvalue.value.camera.CameraFlatMode;
import dji.sdk.keyvalue.value.camera.CameraType;
import dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType;
import dji.sdk.keyvalue.value.camera.ThermalDigitalZoomFactor;
import dji.sdk.keyvalue.value.camera.VideoResolutionFrameRate;
import dji.sdk.keyvalue.value.common.CameraLensType;
import dji.v5.utils.common.LogUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CameraUtil {
    public static final String TAG = LogUtils.getTag("CameraUtil");
    public static final String M3E_CAMERA_FIRMWARE_VERSION = "99.99.99.99";
    private static final int[] H20_AND_H20T_CAMERA_FOCAL_LENGTH_VALUES = new int[]{317, 326, 335, 345, 354, 364, 373, 384, 394, 404, 415, 425, 436, 447, 459, 470, 482, 493, 506, 518, 531, 544, 557, 571, 584, 598, 613, 626, 641, 656, 671, 688, 704, 720, 736, 754, 770, 789, 807, 825, 844, 862, 882, 902, 922, 943, 964, 987, 1009, 1031, 1054, 1078, 1102, 1125, 1151, 1178, 1202, 1230, 1256, 1283, 1314, 1343, 1372, 1402, 1433, 1465, 1498, 1528, 1562, 1598, 1631, 1669, 1703, 1743, 1779, 1817, 1861, 1901, 1941, 1984, 2027, 2072, 2118, 2159, 2208, 2258, 2304, 2357, 2405, 2461, 2512, 2565, 2627, 2683, 2741, 2801, 2862, 2926, 2982, 3050, 3120, 3182, 3258, 3324, 3393, 3465, 3551, 3629, 3695, 3778, 3865, 3940, 4034, 4116, 4202, 4310, 4386, 4485, 4591, 4680, 4775, 4903, 4985, 5102, 5231, 5337, 5454, 5562};
    private static final int[] H20N_CAMERA_FOCAL_LENGTH_VALUES = new int[]{327, 331, 333, 337, 340, 343, 346, 350, 353, 357, 360, 363, 367, 371, 374, 378, 382, 386, 390, 394, 398, 402, 406, 411, 415, 419, 424, 428, 433, 438, 442, 447, 452, 457, 462, 468, 473, 478, 484, 490, 495, 501, 507, 513, 519, 525, 532, 539, 546, 552, 560, 567, 574, 582, 589, 598, 606, 614, 622, 631, 641, 649, 659, 669, 679, 689, 700, 710, 721, 733, 744, 756, 769, 782, 796, 808, 823, 838, 852, 868, 884, 901, 918, 938, 956, 974, 995, 1017, 1037, 1060, 1084, 1111, 1136, 1162, 1191, 1222, 1253, 1286, 1319, 1357, 1397, 1437, 1480, 1524, 1574, 1626, 1680, 1741, 1805, 1872, 1947, 2027, 2111, 2205, 2306, 2420, 2542, 2673, 2831, 2993, 3191, 3410, 3655, 3946, 4268, 4675, 5148, 5745};
    private static final int[] M30_CAMERA_FOCAL_LENGTH_VALUES = new int[]{480, 504, 528, 552, 576, 600, 624, 648, 672, 696, 720, 744, 768, 792, 816, 840, 864, 888, 912, 936, 960, 984, 1008, 1032, 1056, 1080, 1104, 1128, 1141, 1147, 1155, 1165, 1174, 1182, 1194, 1203, 1212, 1224, 1233, 1246, 1256, 1266, 1280, 1290, 1301, 1315, 1326, 1341, 1353, 1365, 1380, 1393, 1405, 1422, 1434, 1447, 1465, 1478, 1496, 1510, 1524, 1544, 1558, 1573, 1593, 1608, 1629, 1645, 1661, 1682, 1699, 1715, 1738, 1755, 1778, 1796, 1814, 1838, 1857, 1875, 1900, 1919, 1939, 1965, 1985, 2011, 2032, 2052, 2080, 2101, 2122, 2151, 2172, 2201, 2223, 2246, 2276, 2299, 2322, 2352, 2376, 2407, 2431, 2455, 2487, 2512, 2536, 2569, 2594, 2620, 2653, 2679, 2713, 2739, 2765, 2800, 2826, 2853, 2888, 2915, 2951, 2978, 3005, 3042, 3069, 3097, 3134, 3162, 3199, 3227, 3255, 3293, 3321, 3350, 3388, 3416, 3445, 3483, 3512, 3550, 3579, 3608, 3646, 3675, 3704, 3742, 3771, 3809, 3838, 3866, 3904, 3932, 3960, 3997, 4025, 4061};
    private static final int[] H30_CAMERA_FOCAL_LENGTH_VALUES = new int[]{334, 349, 369, 389, 406, 426, 443, 463, 482, 503, 520, 540, 560, 580, 600, 624, 644, 663, 686, 706, 730, 750, 774, 797, 821, 848, 870, 893, 921, 947, 970, 998, 1027, 1054, 1081, 1112, 1141, 1171, 1203, 1231, 1265, 1298, 1333, 1364, 1399, 1436, 1470, 1507, 1548, 1581, 1622, 1660, 1705, 1742, 1787, 1828, 1873, 1918, 1963, 2009, 2055, 2107, 2153, 2204, 2255, 2307, 2362, 2418, 2469, 2526, 2582, 2644, 2704, 2765, 2826, 2887, 2947, 3015, 3081, 3155, 3221, 3287, 3359, 3437, 3505, 3583, 3656, 3741, 3813, 3897, 3980, 4066, 4141, 4232, 4310, 4401, 4492, 4584, 4687, 4776, 4865, 4976, 5084, 5171, 5286, 5395, 5467, 5576, 5694, 5822, 5908, 6050, 6165, 6279, 6418, 6492, 6639, 6716, 6874, 7040, 7136, 7231, 7429, 7532, 7634, 7854, 7963, 8093};
    private static final int[] M3_CAMERA_FOCAL_LENGTH_VALUES = new int[]{240};
    private static final int[] M4_FOCAL_LENGTH_GEARS = new int[]{1, 3, 7, 14, 28, 56, 112};
    private static final int[] M4_CAMERA_FOCAL_LENGTH_VALUES = new int[]{240, 700, 1680, 3360, 6720, 13440, 26880};
    private static final int[] H20N_IR_ZOOM_TIMES_RANGE = new int[]{2, 4, 8, 16, 32};
    private static final int[] H20N_IR_ZOOM_FOCAL_LENGTH_RANGE = new int[]{520, 1164, 2328, 4656, 9312};
    private static final int[] M30T_IR_ZOOM_TIMES_RANGE = new int[]{2, 5, 10, 20};
    private static final int[] M30_IR_ZOOM_FOCAL_LENGTH_RANGE = new int[]{400, 1204, 2407, 4800};
    private static final int[] H20T_IR_ZOOM_TIMES_RANGE = new int[]{1, 2, 4, 8};
    private static final int[] DEFAULT_IR_ZOOM_TIMES_RANGE = new int[]{1, 2, 4};
    private static final int[] M3T_IR_ZOOM_TIMES_RANGE = new int[]{2, 4, 7, 14, 28};
    private static final int[] M3T_IR_ZOOM_FOCAL_LENGTH_RANGE = new int[]{400, 960, 1680, 3360, 6720};
    private static final int[] M3TA_IR_ZOOM_FOCAL_LENGTH_RANGE = new int[]{480, 960, 1680, 3360, 6720};
    private static final int[] H30T_IR_ZOOM_TIMES_RANGE = new int[]{2, 4, 8, 16, 32};
    private static final int[] H30T_IR_ZOOM_FOCAL_LENGTH_RANGE = new int[]{520, 960, 1920, 3840, 7680};
    private static final int[] M4T_IR_ZOOM_TIMES_RANGE = new int[]{2, 4, 7, 14, 28};
    private static final int[] M4T_IR_ZOOM_FOCAL_LENGTH_RANGE = new int[]{527, 960, 1680, 3360, 6720};
    private static final int[] DEFAULT_FOCAL_LENGTH_GEARS = new int[]{2, 5, 10, 20, 40, 80, 160, 200};
    private static final int[] H20N_FOCAL_LENGTH_GEARS = new int[]{2, 4, 8, 16, 32, 64, 128};
    private static final int[] M30_SERIES_FOCAL_LENGTH_GEARS = new int[]{2, 5, 10, 20, 40, 80, 160, 200};
    private static final int[] H30_FOCAL_LENGTH_GEARS = new int[]{2, 5, 10, 20, 40, 80, 160, 200, 320, 400};
    private static final int[] M3_FOCAL_LENGTH_GEARS = new int[]{1, 2, 4, 7, 14, 28, 56};
    private static final int[] L2_FOCAL_LENGTH_GEARS = new int[0];
    private static final int[] DEFAULT_LIGHT_FOCAL_LENGTH_GEARS = new int[]{2, 5, 10, 15};
    private static final int[] H20N_LIGHT_FOCAL_LENGTH_GEARS = new int[]{2, 4, 8, 16};
    private static final int[] M30_LIGHT_FOCAL_LENGTH_GEARS = new int[]{5, 10, 15};
    private static final Map<CameraType, List<CameraVideoStreamSourceType>> STREAM_STORAGE_SOURCE_RANGE_MAP = new HashMap<CameraType, List<CameraVideoStreamSourceType>>();
    private static final int[] MINI3_PRO_QUICK_ZOOM_SCALE_SEQ_SHOOT = new int[]{1, 2};
    private static final int[] MINI3_PRO_QUICK_ZOOM_SCALE_SEQ_1080P = new int[]{1, 2, 4};
    private static final int[] MINI3_PRO_QUICK_ZOOM_SCALE_SEQ_27K = new int[]{1, 2, 3};
    private static final int[] MINI3_PRO_QUICK_ZOOM_SCALE_SEQ_4K_LOW_FPS = new int[]{1, 2};
    private static final int[] MINI3_QUICK_ZOOM_SCALE_SEQ_SHOOT = new int[]{1, 2};
    private static final int[] MINI3_QUICK_ZOOM_SCALE_SEQ_4K = new int[]{1, 2};
    private static final int[] MINI3_QUICK_ZOOM_SCALE_SEQ_27K = new int[]{1, 2, 3};
    private static final int[] MINI3_QUICK_ZOOM_SCALE_SEQ_1080P = new int[]{1, 2, 4};
    private static final int[] EMPTY_ARRAY = new int[0];
    private static final int[] MINI4_PRO_QUICK_ZOOM_SCALE_SEQ_SHOOT = new int[]{1, 2, 3};
    private static final Map<CameraType, List<CameraVideoStreamSourceType>> cameraTypeMap;

    public static List<CameraVideoStreamSourceType> getStreamStorageSourceRange(CameraType cameraType) {
        return null;
    }

    public static boolean isM3ESeriesCamera(int n) {
        return false;
    }

    public static boolean isM3ESeriesCamera(CameraType cameraType) {
        return false;
    }

    public static boolean isM4SeriesCamera(int n) {
        return false;
    }

    public static boolean isM4SeriesCamera(CameraType cameraType) {
        return false;
    }

    public static boolean isM4DSeriesCamera(int n) {
        return false;
    }

    public static boolean isM4DSeriesCamera(CameraType cameraType) {
        return false;
    }

    public static boolean isM300SeriesCamera(int n) {
        return false;
    }

    public static boolean isM300SeriesCamera(CameraType cameraType) {
        return false;
    }

    public static boolean isM30SeriesCamera(int n) {
        return false;
    }

    public static boolean isM30SeriesCamera(CameraType cameraType) {
        return false;
    }

    public static boolean isM3M(CameraType cameraType) {
        return false;
    }

    public static boolean isM3T(CameraType cameraType) {
        return false;
    }

    public static boolean isM3E(CameraType cameraType) {
        return false;
    }

    public static boolean isM3TA(CameraType cameraType) {
        return false;
    }

    public static boolean isM4T(CameraType cameraType) {
        return false;
    }

    public static boolean isM4E(CameraType cameraType) {
        return false;
    }

    public static boolean isM4TD(CameraType cameraType) {
        return false;
    }

    public static boolean isM4D(CameraType cameraType) {
        return false;
    }

    public static boolean isH20NCamera(CameraType cameraType) {
        return false;
    }

    private static boolean isH20NCamera(int n) {
        return false;
    }

    public static boolean isL2Camera(CameraType cameraType) {
        return false;
    }

    public static boolean isL3Camera(CameraType cameraType) {
        return false;
    }

    public static boolean isPayloadCamera(CameraType cameraType) {
        return false;
    }

    public static boolean isH30SeriesCamera(int n) {
        return false;
    }

    public static boolean isH30SeriesCamera(CameraType cameraType) {
        return false;
    }

    public static float getFocalMultiple(int n) {
        return 0.0f;
    }

    public static float getFocalLengthOffset(int n) {
        return 0.0f;
    }

    public static int[] getFocalLengthValues(int n) {
        return null;
    }

    public static int[] getLightFocalLengthValues(int n) {
        return null;
    }

    public static ThermalDigitalZoomFactor ratioToThermalDigitalZoomFactor(double d2) {
        return null;
    }

    public static boolean isUseIrDigitalZoomFactor(int n) {
        return false;
    }

    public static int getIrMinFocalLength(int n) {
        return 0;
    }

    public static int[] getIrZoomFocalLengthRange(int n) {
        return null;
    }

    public static int[] getIrZoomTimesRange(int n) {
        return null;
    }

    public static int[] getFocalLengthGears(int n) {
        return null;
    }

    public static int getSubStepCount(int n) {
        return 0;
    }

    public static int[] getFocalLengthGears(CameraType cameraType) {
        return null;
    }

    public static boolean isSupportMultiLens(int n) {
        return false;
    }

    public static boolean isSupportMultiLens(CameraType cameraType) {
        return false;
    }

    public static boolean isRGBLensCamera(CameraType cameraType) {
        return false;
    }

    public static CameraType getCameraType(int n) {
        return null;
    }

    public static List<CameraVideoStreamSourceType> getCameraLensRange(CameraType cameraType) {
        return null;
    }

    public static List<CameraVideoStreamSourceType> getCameraLensRangeForNew(CameraType cameraType) {
        return null;
    }

    private CameraUtil() {
    }

    public static int[] getQuickZoomSeq() {
        return null;
    }

    private static int[] getQuickZoomSeqMini3Pro(CameraFlatMode cameraFlatMode, VideoResolutionFrameRate videoResolutionFrameRate) {
        return null;
    }

    private static int[] getQuickZoomSeqMini4Pro(CameraFlatMode cameraFlatMode) {
        return null;
    }

    private static int[] getQuickZoomSeqMini3Pro(VideoResolutionFrameRate videoResolutionFrameRate) {
        return null;
    }

    private static int[] getQuickZoomSeqMini3(CameraFlatMode cameraFlatMode, VideoResolutionFrameRate videoResolutionFrameRate) {
        return null;
    }

    private static int[] getQuickZoomSeqMini3(VideoResolutionFrameRate videoResolutionFrameRate) {
        return null;
    }

    public static boolean isSpotMeteringRectAreaSupported(int n) {
        return false;
    }

    public static CameraVideoStreamSourceType getVideoStreamSourceType(CameraLensType cameraLensType) {
        return null;
    }

    static {
        STREAM_STORAGE_SOURCE_RANGE_MAP.put(CameraType.M4E, Arrays.asList(CameraVideoStreamSourceType.WIDE_CAMERA, CameraVideoStreamSourceType.ZOOM_CAMERA));
        STREAM_STORAGE_SOURCE_RANGE_MAP.put(CameraType.M4D, Arrays.asList(CameraVideoStreamSourceType.WIDE_CAMERA, CameraVideoStreamSourceType.ZOOM_CAMERA));
        cameraTypeMap = new HashMap<CameraType, List<CameraVideoStreamSourceType>>();
        cameraTypeMap.put(CameraType.ZENMUSE_H20T, KeyCameraVideoStreamSourceRange.TRIPLE);
        cameraTypeMap.put(CameraType.ZENMUSE_H20N, KeyCameraVideoStreamSourceRange.TRIPLE);
        cameraTypeMap.put(CameraType.M30T, KeyCameraVideoStreamSourceRange.TRIPLE);
        cameraTypeMap.put(CameraType.M3T, KeyCameraVideoStreamSourceRange.TRIPLE);
        cameraTypeMap.put(CameraType.M3TA, KeyCameraVideoStreamSourceRange.TRIPLE);
        cameraTypeMap.put(CameraType.M4T, KeyCameraVideoStreamSourceRange.TRIPLE);
        cameraTypeMap.put(CameraType.M4TD, KeyCameraVideoStreamSourceRange.TRIPLE);
        cameraTypeMap.put(CameraType.ZENMUSE_H30T, KeyCameraVideoStreamSourceRange.TRIPLE);
        cameraTypeMap.put(CameraType.ZENMUSE_H20, KeyCameraVideoStreamSourceRange.DOUBLE);
        cameraTypeMap.put(CameraType.ZENMUSE_H30, KeyCameraVideoStreamSourceRange.DOUBLE);
        cameraTypeMap.put(CameraType.M30, KeyCameraVideoStreamSourceRange.DOUBLE);
        cameraTypeMap.put(CameraType.M3E, KeyCameraVideoStreamSourceRange.DOUBLE);
        cameraTypeMap.put(CameraType.M4E, KeyCameraVideoStreamSourceRange.DOUBLE);
        cameraTypeMap.put(CameraType.M4D, KeyCameraVideoStreamSourceRange.DOUBLE);
        cameraTypeMap.put(CameraType.ZENMUSE_L1, KeyCameraVideoStreamSourceRange.DOUBLE);
        cameraTypeMap.put(CameraType.M3M, KeyCameraVideoStreamSourceRange.M3MRange);
        cameraTypeMap.put(CameraType.ZENMUSE_L2, KeyCameraVideoStreamSourceRange.L2Range);
        cameraTypeMap.put(CameraType.ZENMUSE_L3, KeyCameraVideoStreamSourceRange.L3Range);
    }
}

