/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.MultiSpectralDisplayMode;
import dji.sdk.keyvalue.value.camera.ThermalDisplayMode;
import dji.v5.common.callback.CommonCallbacks;

public class KeyMultiSpectralDisplayMode
extends MSDKKeyInfo<MultiSpectralDisplayMode> {
    @Override
    public MultiSpectralDisplayMode getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<MultiSpectralDisplayMode> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void setValue(MultiSpectralDisplayMode multiSpectralDisplayMode, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<MultiSpectralDisplayMode> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<MultiSpectralDisplayMode> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    private static /* synthetic */ void lambda$listen$0(CommonCallbacks.KeyListener keyListener, ThermalDisplayMode thermalDisplayMode, ThermalDisplayMode thermalDisplayMode2) {
    }
}

