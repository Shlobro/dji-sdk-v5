/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.utils;

import dji.sdk.keyvalue.value.camera.CameraFlatMode;
import dji.sdk.keyvalue.value.camera.CameraMode;
import dji.sdk.keyvalue.value.camera.CameraShootPhotoMode;
import dji.sdk.keyvalue.value.camera.CameraType;
import dji.sdk.keyvalue.value.camera.CameraWorkMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CameraModeUtil {
    private static HashMap<CameraType, List<CameraMode>> localSpecialHandleCameraMap = new HashMap();

    public static CameraFlatMode getCameraFlatMode(CameraMode cameraMode) {
        return null;
    }

    public static CameraWorkMode getCameraWorkMode(CameraMode cameraMode) {
        return null;
    }

    public static CameraMode getCameraMode(CameraFlatMode cameraFlatMode) {
        return null;
    }

    public static CameraMode getCameraMode(CameraShootPhotoMode cameraShootPhotoMode) {
        return null;
    }

    public static CameraMode getCameraMode(CameraWorkMode cameraWorkMode) {
        return null;
    }

    public static CameraShootPhotoMode getCameraShootPhotoMode(CameraMode cameraMode) {
        return null;
    }

    public static List<CameraWorkMode> getCameraWorkMode(List<CameraMode> list) {
        return null;
    }

    public static List<CameraFlatMode> getCameraFlatMode(List<CameraMode> list) {
        return null;
    }

    public static List<CameraMode> flatModeToCameraMode(List<CameraFlatMode> list) {
        return null;
    }

    public static List<CameraMode> workModeToCameraMode(List<CameraWorkMode> list) {
        return null;
    }

    public static boolean isNeedSpecialHandleCamera(CameraType cameraType) {
        return false;
    }

    public static List<CameraMode> getCameraMode(CameraType cameraType) {
        return null;
    }

    private CameraModeUtil() {
    }

    static {
        localSpecialHandleCameraMap.put(CameraType.ZENMUSE_L1, new ArrayList<CameraMode>(Arrays.asList(CameraMode.PHOTO_NORMAL, CameraMode.PHOTO_INTERVAL, CameraMode.VIDEO_NORMAL)));
    }
}

