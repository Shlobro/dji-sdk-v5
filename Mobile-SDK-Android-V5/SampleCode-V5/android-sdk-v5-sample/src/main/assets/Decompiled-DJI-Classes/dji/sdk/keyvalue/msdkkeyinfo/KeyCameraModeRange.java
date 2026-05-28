/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.CameraMode;
import dji.v5.common.callback.CommonCallbacks;
import java.util.List;

public class KeyCameraModeRange
extends MSDKKeyInfo<List<CameraMode>> {
    @Override
    public List<CameraMode> getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<List<CameraMode>> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<List<CameraMode>> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<List<CameraMode>> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private void processListener(Object object, boolean bl, CommonCallbacks.KeyListener<List<CameraMode>> keyListener, KeyParam keyParam) {
    }

    private boolean isSupportFlatMode(KeyParam keyParam) {
        return false;
    }

    private static /* synthetic */ void lambda$processListener$1(CommonCallbacks.KeyListener keyListener, List list, List list2) {
    }

    private static /* synthetic */ void lambda$processListener$0(CommonCallbacks.KeyListener keyListener, List list, List list2) {
    }
}

