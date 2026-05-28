/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType;
import dji.sdk.keyvalue.value.camera.LiveViewSourceCameraType;
import dji.v5.common.callback.CommonCallbacks;

public class KeyCameraVideoStreamSource
extends MSDKKeyInfo<CameraVideoStreamSourceType> {
    @Override
    public CameraVideoStreamSourceType getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void setValue(CameraVideoStreamSourceType cameraVideoStreamSourceType, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<CameraVideoStreamSourceType> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<CameraVideoStreamSourceType> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<CameraVideoStreamSourceType> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private CameraVideoStreamSourceType getCameraVideoStreamSourceTypeValue(LiveViewSourceCameraType liveViewSourceCameraType, KeyParam keyParam) {
        return null;
    }

    private /* synthetic */ void lambda$listen$0(CommonCallbacks.KeyListener keyListener, KeyParam keyParam, LiveViewSourceCameraType liveViewSourceCameraType, LiveViewSourceCameraType liveViewSourceCameraType2) {
    }

    static /* synthetic */ CameraVideoStreamSourceType access$000(KeyCameraVideoStreamSource keyCameraVideoStreamSource, LiveViewSourceCameraType liveViewSourceCameraType, KeyParam keyParam) {
        return null;
    }
}

