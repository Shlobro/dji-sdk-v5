/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.CameraFlatMode;
import dji.sdk.keyvalue.value.camera.CameraMode;
import dji.sdk.keyvalue.value.camera.CameraShootPhotoMode;
import dji.sdk.keyvalue.value.camera.CameraWorkMode;
import dji.v5.common.callback.CommonCallbacks;

public class KeyCameraMode
extends MSDKKeyInfo<CameraMode> {
    @Override
    public CameraMode getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<CameraMode> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void setValue(CameraMode cameraMode, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<CameraMode> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<CameraMode> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private void processListener(Object object, boolean bl, CommonCallbacks.KeyListener<CameraMode> keyListener, KeyParam keyParam) {
    }

    private boolean isSupportFlatMode(KeyParam keyParam) {
        return false;
    }

    private static /* synthetic */ void lambda$processListener$5(CommonCallbacks.KeyListener keyListener, CameraWorkMode cameraWorkMode, CameraWorkMode cameraWorkMode2) {
    }

    private static /* synthetic */ void lambda$processListener$4(CommonCallbacks.KeyListener keyListener, CameraFlatMode cameraFlatMode, CameraFlatMode cameraFlatMode2) {
    }

    private static /* synthetic */ void lambda$processListener$3(CommonCallbacks.KeyListener keyListener, CameraWorkMode cameraWorkMode, CameraWorkMode cameraWorkMode2) {
    }

    private static /* synthetic */ void lambda$processListener$2(CommonCallbacks.KeyListener keyListener, CameraShootPhotoMode cameraShootPhotoMode, CameraShootPhotoMode cameraShootPhotoMode2) {
    }

    private static /* synthetic */ void lambda$setValue$1(CommonCallbacks.CompletionCallback completionCallback, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$setValue$0(CommonCallbacks.CompletionCallback completionCallback) throws Throwable {
    }
}

