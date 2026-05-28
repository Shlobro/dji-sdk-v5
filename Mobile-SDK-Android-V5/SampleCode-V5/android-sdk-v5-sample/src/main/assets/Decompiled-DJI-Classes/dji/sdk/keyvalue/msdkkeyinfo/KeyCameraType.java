/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import androidx.annotation.Nullable;
import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.CameraCType;
import dji.sdk.keyvalue.value.camera.CameraType;
import dji.sdk.keyvalue.value.payload.PayloadCameraType;
import dji.v5.common.callback.CommonCallbacks;

public class KeyCameraType
extends MSDKKeyInfo<CameraType> {
    @Override
    public CameraType getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<CameraType> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<CameraType> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<CameraType> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    @Nullable
    private CameraType getCameraTypeFromCameraCType(CameraCType cameraCType, KeyParam keyParam) {
        return null;
    }

    private CameraType getCameraTypeFromPayloadCameraType(PayloadCameraType payloadCameraType) {
        return null;
    }

    private /* synthetic */ void lambda$listen$1(CommonCallbacks.KeyListener keyListener, PayloadCameraType payloadCameraType, PayloadCameraType payloadCameraType2) {
    }

    private /* synthetic */ void lambda$listen$0(CommonCallbacks.KeyListener keyListener, KeyParam keyParam, CameraCType cameraCType, CameraCType cameraCType2) {
    }

    static /* synthetic */ CameraType access$000(KeyCameraType keyCameraType, CameraCType cameraCType, KeyParam keyParam) {
        return null;
    }
}

