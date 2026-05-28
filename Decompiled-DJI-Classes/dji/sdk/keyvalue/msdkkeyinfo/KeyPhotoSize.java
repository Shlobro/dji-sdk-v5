/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.PhotoSize;
import dji.v5.common.callback.CommonCallbacks;

public class KeyPhotoSize
extends MSDKKeyInfo<PhotoSize> {
    @Override
    public PhotoSize getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<PhotoSize> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void setValue(PhotoSize photoSize, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<PhotoSize> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<PhotoSize> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private void processListener(Object object, boolean bl, CommonCallbacks.KeyListener<PhotoSize> keyListener, KeyParam keyParam) {
    }

    private void setPhotoSize(PhotoSize photoSize, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    private static /* synthetic */ void lambda$processListener$0(CommonCallbacks.KeyListener keyListener, PhotoSize photoSize, PhotoSize photoSize2) {
    }

    static /* synthetic */ void access$000(KeyPhotoSize keyPhotoSize, PhotoSize photoSize, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }
}

