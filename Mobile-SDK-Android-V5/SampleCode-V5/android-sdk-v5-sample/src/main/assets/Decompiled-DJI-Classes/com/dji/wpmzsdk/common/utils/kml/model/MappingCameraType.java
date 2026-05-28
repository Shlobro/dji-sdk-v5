/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

public enum MappingCameraType {
    P4("Phantom 4", 3.6f, 6.2f, 4.65f, 2322.6f, 0, 0),
    P4P("Phantom 4 Pro", 8.8f, 13.13f, 8.76f, 3650.0f, 0, 0),
    P4R("Phantom 4 RTK", 8.8f, 13.13f, 8.76f, 3650.0f, 0, 0),
    P4PV2("Phantom 4 Pro V2.0", 8.8f, 13.13f, 8.76f, 3650.0f, 0, 0),
    P4A("Phantom 4 Advanced", 8.8f, 13.13f, 8.76f, 3650.0f, 0, 0),
    SHARE_102S("PSDK 102S", 25.0f, 23.5f, 15.6f, 0.0f, 6000, 4000),
    X7_24MM("X7 ( 24mm )", 24.0f, 23.5f, 15.7f, 0.0f, 6016, 4008),
    X7_35MM("X7 ( 35mm )", 35.0f, 23.5f, 15.7f, 0.0f, 6016, 4008),
    WM245_ZOOM("Mavic 2 Enterprise ZOOM", 4.4f, 5.57f, 4.17f, 0.0f, 4000, 3000),
    WM246("Mavic 2 Enterprise DUAL", 4.49f, 5.57f, 4.17f, 0.0f, 4056, 3040),
    EP800_LIDAR("Zenmuse L1 LiDAR Mapping", 8.8f, 13.13f, 8.76f, 0.0f, 5472, 3648),
    EP800_VISUAL("Zenmuse L1 Photogrammetry", 8.8f, 13.13f, 8.76f, 0.0f, 5472, 3648),
    GD610("Zenmuse H20 WIDE", 4.5f, 6.29f, 4.71f, 0.0f, 4056, 3040),
    GD610T_WIDE("Zenmuse H20T WIDE", 4.5f, 6.29f, 4.71f, 0.0f, 4056, 3040),
    GD610_IR("Zenmuse H20T IR", 13.5f, 7.68f, 6.14f, 0.0f, 640, 512),
    GD610_WIDE_IR("Zenmuse H20T WIDE IR", 13.5f, 7.68f, 6.14f, 0.0f, 640, 512),
    GD612_WIDE("Zenmuse H20N WIDE", 4.46f, 5.76f, 3.24f, 0.0f, 1932, 1092),
    GD612_IR("Zenmuse H20N IR", 12.0f, 7.68f, 6.14f, 0.0f, 640, 512),
    GD612_WIDE_IR("Zenmuse H20N WIDE IR", 12.0f, 7.68f, 6.14f, 0.0f, 640, 512),
    EP600_24MM("Zenmuse P1 ( 24mm )", 24.0f, 36.0f, 24.0f, 0.0f, 8192, 5460),
    EP600_35MM("Zenmuse P1 ( 35mm )", 35.0f, 36.0f, 24.0f, 0.0f, 8192, 5460),
    EP600_50MM("Zenmuse P1 ( 50mm )", 50.0f, 36.0f, 24.0f, 0.0f, 8192, 5460),
    PM320("M30 WIDE", 4.5f, 6.4f, 4.8f, 0.0f, 4000, 3000),
    PM320T_WIDE("M30T WIDE", 4.5f, 6.4f, 4.8f, 0.0f, 4000, 3000),
    PM320_IR("M30T IR", 9.1f, 7.68f, 6.14f, 0.0f, 640, 512),
    PM320_WIDE_IR("M30T WIDE IR", 9.1f, 7.68f, 6.14f, 0.0f, 640, 512),
    WM265_WIDE("M3E WIDE", 12.29f, 17.42f, 13.06f, 0.0f, 5280, 3956),
    WM265_T_WIDE("M3T WIDE", 4.55f, 6.4f, 4.8f, 0.0f, 4000, 3000),
    WM265_IR("M3T IR", 9.1f, 7.68f, 6.14f, 0.0f, 640, 512),
    WM265_WIDE_IR("M3T WIDE IR", 9.1f, 7.68f, 6.14f, 0.0f, 640, 512),
    WM265_M_WIDE("M3M WIDE", 12.29f, 17.42f, 13.06f, 0.0f, 5280, 3956),
    WM265_M_NARROWBAND("M3M R G RE NIR", 4.34f, 5.18f, 3.89f, 0.0f, 2592, 1944),
    WM265_M_WIDE_NARROWBAND("M3M WIDE R G RE NIR", 4.34f, 5.18f, 3.89f, 0.0f, 2592, 1944),
    OTHER("Custom Camera", 0.0f, 0.0f, 0.0f, 0.0f, 0, 0),
    NULL("", 0.0f, 0.0f, 0.0f, 0.0f, 0, 0);

    private final String nameStr;
    private final float focalLength;
    private final float sensorW;
    private final float sensorH;
    private final float gsdBase;
    private final int imageWidth;
    private final int imageHeight;

    private MappingCameraType(String nameStr, float focalLength, float sensorW, float sensorH, float gsdBase, int imageWidth, int imageHeight) {
        this.nameStr = nameStr;
        this.focalLength = focalLength;
        this.sensorW = sensorW;
        this.sensorH = sensorH;
        this.gsdBase = gsdBase;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
    }

    public String getNameStr() {
        return this.nameStr;
    }

    public float getFocalLength() {
        return this.focalLength;
    }

    public float getSensorW() {
        return this.sensorW;
    }

    public float getSensorH() {
        return this.sensorH;
    }

    public float getGsdBase() {
        return this.gsdBase;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public static boolean contains(String name) {
        for (MappingCameraType type : MappingCameraType.values()) {
            if (!type.nameStr.equals(name)) continue;
            return true;
        }
        return false;
    }

    public static MappingCameraType find(String name) {
        for (MappingCameraType type : MappingCameraType.values()) {
            if (!type.nameStr.equals(name)) continue;
            return type;
        }
        return OTHER;
    }

    public static boolean isP4Series(MappingCameraType type) {
        return type == P4 || type == P4P || type == P4A || type == P4PV2 || type == P4R;
    }

    public static boolean isEP600(MappingCameraType type) {
        return type == EP600_35MM || type == EP600_24MM || type == EP600_50MM;
    }

    public static boolean isEP800(MappingCameraType type) {
        return type == EP800_VISUAL || type == EP800_LIDAR;
    }

    public static boolean isSupportAdvanceSetting(MappingCameraType type) {
        return MappingCameraType.isEP600(type) || MappingCameraType.isEP800(type);
    }

    public static boolean isSupportAbsAlt(MappingCameraType type) {
        return MappingCameraType.isEP600(type) || type == P4R || MappingCameraType.isEP800(type) || MappingCameraType.isGD610Series(type) || type == SHARE_102S || MappingCameraType.isPM320Series(type) || MappingCameraType.isWM265Series(type);
    }

    public static boolean isGD610Series(MappingCameraType type) {
        return type == GD610 || type == GD610T_WIDE || type == GD610_IR || type == GD610_WIDE_IR || type == GD612_WIDE || type == GD612_IR || type == GD612_WIDE_IR;
    }

    public static boolean isPM320Series(MappingCameraType type) {
        return type == PM320 || type == PM320T_WIDE || type == PM320_IR || type == PM320_WIDE_IR;
    }

    public static boolean isPM430OrPM431Series(MappingCameraType type) {
        return type == SHARE_102S || type == X7_24MM || type == X7_35MM || MappingCameraType.isEP800(type) || MappingCameraType.isEP600(type) || MappingCameraType.isGD610Series(type);
    }

    public static boolean isWM265Series(MappingCameraType type) {
        return type == WM265_WIDE || type == WM265_T_WIDE || type == WM265_IR || type == WM265_WIDE_IR || type == WM265_M_WIDE || type == WM265_M_NARROWBAND || type == WM265_M_WIDE_NARROWBAND;
    }

    public static boolean isSupportSmartObliquePitch(MappingCameraType type) {
        return type == WM265_WIDE || type == WM265_M_WIDE;
    }

    public static String getDroneDesc(MappingCameraType type) {
        if (MappingCameraType.isSupportSmartObliquePitch(type)) {
            return "wm265";
        }
        if (MappingCameraType.isEP600(type)) {
            return "ep600";
        }
        return "";
    }

    public static boolean isSupportSafeTakeoff(MappingCameraType type) {
        return MappingCameraType.isWM265Series(type) || MappingCameraType.isPM320Series(type) || MappingCameraType.isPM430OrPM431Series(type);
    }

    public static boolean isSupportDsm(MappingCameraType type) {
        return !MappingCameraType.isP4Series(type) && type != WM245_ZOOM && type != WM246;
    }

    public static boolean isUnsupportedDevice(MappingCameraType type) {
        return MappingCameraType.isP4Series(type) || type == X7_24MM || type == X7_35MM || type == WM245_ZOOM || type == WM246;
    }

    public static boolean isTerraMappingCamera(MappingCameraType cameraType) {
        return cameraType == PM320 || cameraType == PM320T_WIDE || cameraType == PM320_IR || cameraType == GD610 || cameraType == GD610T_WIDE || cameraType == GD610_IR || cameraType == GD612_WIDE || cameraType == GD612_IR || cameraType == WM265_WIDE || cameraType == WM265_T_WIDE || cameraType == WM265_IR || MappingCameraType.isTerraMappingWideIrCamera(cameraType);
    }

    public static boolean isTerraMappingWideIrCamera(MappingCameraType cameraType) {
        return cameraType == PM320_WIDE_IR || cameraType == GD610_WIDE_IR || cameraType == GD612_WIDE_IR || cameraType == WM265_WIDE_IR;
    }
}

