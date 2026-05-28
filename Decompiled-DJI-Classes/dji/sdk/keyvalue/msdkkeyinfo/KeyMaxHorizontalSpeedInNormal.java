/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.v5.common.callback.CommonCallbacks;

public class KeyMaxHorizontalSpeedInNormal
extends MSDKKeyInfo<Double> {
    @Override
    public Double getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void setValue(Double d2, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<Double> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<Double> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<Double> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private DJIKey<Double> getCSDKKey(KeyParam keyParam) {
        return null;
    }
}

