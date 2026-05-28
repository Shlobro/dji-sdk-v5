/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.sdk.keyvalue.value.camera;

import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.camera.CameraType;
import dji.sdk.keyvalue.value.camera.LiveViewSourceCameraType;

public final class CameraVideoStreamSourceType
extends Enum<CameraVideoStreamSourceType> {
    public static final /* enum */ CameraVideoStreamSourceType DEFAULT_CAMERA = new CameraVideoStreamSourceType(0);
    public static final /* enum */ CameraVideoStreamSourceType WIDE_CAMERA = new CameraVideoStreamSourceType(1);
    public static final /* enum */ CameraVideoStreamSourceType ZOOM_CAMERA = new CameraVideoStreamSourceType(2);
    public static final /* enum */ CameraVideoStreamSourceType INFRARED_CAMERA = new CameraVideoStreamSourceType(3);
    public static final /* enum */ CameraVideoStreamSourceType NDVI_CAMERA = new CameraVideoStreamSourceType(4);
    public static final /* enum */ CameraVideoStreamSourceType VISION_CAMERA = new CameraVideoStreamSourceType(7);
    public static final /* enum */ CameraVideoStreamSourceType MS_G_CAMERA = new CameraVideoStreamSourceType(8);
    public static final /* enum */ CameraVideoStreamSourceType MS_R_CAMERA = new CameraVideoStreamSourceType(9);
    public static final /* enum */ CameraVideoStreamSourceType MS_RE_CAMERA = new CameraVideoStreamSourceType(10);
    public static final /* enum */ CameraVideoStreamSourceType MS_NIR_CAMERA = new CameraVideoStreamSourceType(11);
    public static final /* enum */ CameraVideoStreamSourceType POINT_CLOUD_CAMERA = new CameraVideoStreamSourceType(14);
    public static final /* enum */ CameraVideoStreamSourceType UNKNOWN = new CameraVideoStreamSourceType(65535);
    public static final /* enum */ CameraVideoStreamSourceType RGB_CAMERA = new CameraVideoStreamSourceType(100000);
    private int value;
    private static final CameraVideoStreamSourceType[] allValues;
    private static final /* synthetic */ CameraVideoStreamSourceType[] $VALUES;

    public static CameraVideoStreamSourceType[] values() {
        return null;
    }

    public static CameraVideoStreamSourceType valueOf(String string) {
        return null;
    }

    private CameraVideoStreamSourceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static CameraVideoStreamSourceType find(int n) {
        return null;
    }

    public LiveViewSourceCameraType toLiveViewSourceCameraType(CameraType cameraType) {
        return null;
    }

    @Nullable
    public static CameraVideoStreamSourceType find(LiveViewSourceCameraType liveViewSourceCameraType, CameraType cameraType) {
        return null;
    }

    public static CameraVideoStreamSourceType find(LiveViewSourceCameraType liveViewSourceCameraType) {
        return null;
    }

    private static /* synthetic */ CameraVideoStreamSourceType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraVideoStreamSourceType.$values();
        allValues = CameraVideoStreamSourceType.values();
    }
}

