/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.CameraType;
import dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType;
import dji.v5.common.callback.CommonCallbacks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KeyCameraVideoStreamSourceRange
extends MSDKKeyInfo<List<CameraVideoStreamSourceType>> {
    public static final List<CameraVideoStreamSourceType> DEFAULT = new ArrayList<CameraVideoStreamSourceType>(Collections.singletonList(CameraVideoStreamSourceType.DEFAULT_CAMERA));
    public static final List<CameraVideoStreamSourceType> DOUBLE = new ArrayList<CameraVideoStreamSourceType>(Arrays.asList(CameraVideoStreamSourceType.WIDE_CAMERA, CameraVideoStreamSourceType.ZOOM_CAMERA));
    public static final List<CameraVideoStreamSourceType> TRIPLE = new ArrayList<CameraVideoStreamSourceType>(Arrays.asList(CameraVideoStreamSourceType.WIDE_CAMERA, CameraVideoStreamSourceType.ZOOM_CAMERA, CameraVideoStreamSourceType.INFRARED_CAMERA));
    public static final List<CameraVideoStreamSourceType> M3MRange = new ArrayList<CameraVideoStreamSourceType>(Arrays.asList(CameraVideoStreamSourceType.RGB_CAMERA, CameraVideoStreamSourceType.NDVI_CAMERA, CameraVideoStreamSourceType.MS_G_CAMERA, CameraVideoStreamSourceType.MS_R_CAMERA, CameraVideoStreamSourceType.MS_RE_CAMERA, CameraVideoStreamSourceType.MS_NIR_CAMERA));
    public static final List<CameraVideoStreamSourceType> L2Range = new ArrayList<CameraVideoStreamSourceType>(Arrays.asList(CameraVideoStreamSourceType.WIDE_CAMERA, CameraVideoStreamSourceType.POINT_CLOUD_CAMERA));
    public static final List<CameraVideoStreamSourceType> L3Range = new ArrayList<CameraVideoStreamSourceType>(Arrays.asList(CameraVideoStreamSourceType.WIDE_CAMERA, CameraVideoStreamSourceType.POINT_CLOUD_CAMERA));

    @Override
    public List<CameraVideoStreamSourceType> getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<List<CameraVideoStreamSourceType>> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<List<CameraVideoStreamSourceType>> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<List<CameraVideoStreamSourceType>> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private static /* synthetic */ void lambda$listen$0(CommonCallbacks.KeyListener keyListener, CameraType cameraType, CameraType cameraType2) {
    }
}

