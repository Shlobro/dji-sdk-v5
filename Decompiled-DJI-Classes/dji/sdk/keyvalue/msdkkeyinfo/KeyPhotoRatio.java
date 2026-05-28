/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.PhotoRatio;
import dji.v5.common.callback.CommonCallbacks;

public class KeyPhotoRatio
extends MSDKKeyInfo<PhotoRatio> {
    @Override
    public void setValue(PhotoRatio photoRatio, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public PhotoRatio getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<PhotoRatio> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<PhotoRatio> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<PhotoRatio> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private void processListener(Object object, boolean bl, CommonCallbacks.KeyListener<PhotoRatio> keyListener, KeyParam keyParam) {
    }

    private static /* synthetic */ void lambda$processListener$0(CommonCallbacks.KeyListener keyListener, PhotoRatio photoRatio, PhotoRatio photoRatio2) {
    }
}

