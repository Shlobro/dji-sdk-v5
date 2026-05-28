/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.math.MathKt
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.industry.pilot.data.cache.model.MappingCameraModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import kotlin.Metadata;
import kotlin.math.MathKt;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=2, xi=48, d1={"\u0000$\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004\u001a\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u001a\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u001a\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"L1_LIDAR_FOV", "", "L1_VISIBLE_FOV", "getLidarVisibleOverlapW", "", "model", "Lcom/dji/wpmzsdk/common/utils/kml/model/MappingCameraModel;", "overlapW", "getVisibleOverlapWValue", "isLidarCamera", "", "camera", "Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;", "wpmzsdk_release"})
public final class LidarOverlapWTransformKt {
    private static final double L1_LIDAR_FOV = 70.4;
    private static final double L1_VISIBLE_FOV = 84.0;

    public static final int getLidarVisibleOverlapW(@Nullable MappingCameraModel model, int overlapW) {
        return model != null && MappingCameraType.find(model.getName()) == MappingCameraType.EP800_LIDAR ? LidarOverlapWTransformKt.getVisibleOverlapWValue(overlapW) : overlapW;
    }

    public static final int getVisibleOverlapWValue(int overlapW) {
        double l = Math.tan(Math.toRadians(35.2));
        double v = Math.tan(Math.toRadians(42.0));
        return MathKt.roundToInt((double)((v - l + (double)overlapW / 100.0 * l) / v * 100.0));
    }

    public static final boolean isLidarCamera(@Nullable MappingCameraModel camera) {
        if (camera == null) {
            return false;
        }
        MappingCameraType cameraType = MappingCameraType.find(camera.getName());
        return cameraType == MappingCameraType.EP800_LIDAR;
    }

    public static final boolean isLidarCamera(@Nullable MappingCameraModelGreenDao camera) {
        if (camera == null) {
            return false;
        }
        MappingCameraType cameraType = MappingCameraType.find(camera.getName());
        return cameraType == MappingCameraType.EP800_LIDAR;
    }
}

