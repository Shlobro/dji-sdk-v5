/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.gimbal.GimbalMode;
import dji.v5.common.callback.CommonCallbacks;

public class KeyGimbalMode
extends MSDKKeyInfo<GimbalMode> {
    private static final String IDENTIFIER = "GimbalMode";

    @Override
    public void setValue(GimbalMode gimbalMode, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public GimbalMode getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<GimbalMode> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<GimbalMode> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<GimbalMode> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    public DJIKey<GimbalMode> getKey(KeyParam keyParam) {
        return null;
    }
}

