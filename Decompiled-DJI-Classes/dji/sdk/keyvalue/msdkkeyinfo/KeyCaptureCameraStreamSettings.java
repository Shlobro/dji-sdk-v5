/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.CameraStreamSettingsInfo;
import dji.sdk.keyvalue.value.camera.CameraStreamSettingsMsg;
import dji.v5.common.callback.CommonCallbacks;

public class KeyCaptureCameraStreamSettings
extends MSDKKeyInfo<CameraStreamSettingsInfo> {
    @Override
    public CameraStreamSettingsInfo getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void setValue(CameraStreamSettingsInfo cameraStreamSettingsInfo, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<CameraStreamSettingsInfo> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<CameraStreamSettingsInfo> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<CameraStreamSettingsInfo> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    private /* synthetic */ void lambda$listen$0(CommonCallbacks.KeyListener keyListener, KeyParam keyParam, CameraStreamSettingsMsg cameraStreamSettingsMsg, CameraStreamSettingsMsg cameraStreamSettingsMsg2) {
    }
}

