/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.model.CameraType;

public class CameraUtil {
    public static boolean isSupportPreciseShot(CameraType cameraType) {
        return cameraType == CameraType.DJICameraTypeGD610DualLight || cameraType == CameraType.DJICameraTypeGD610TripleLight || cameraType == CameraType.DJICameraTypePM320DualLight || cameraType == CameraType.DJICameraTypePM320TripleLight;
    }

    public static String getCameraDisplayName() {
        return "DEFAULTCAMERA";
    }
}

