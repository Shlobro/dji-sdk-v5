/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.common.DoubleValueConfig;
import dji.v5.common.callback.CommonCallbacks;

public class KeyMaxHorizontalSpeedInSportRange
extends MSDKKeyInfo<DoubleValueConfig> {
    @Override
    public DoubleValueConfig getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<DoubleValueConfig> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<DoubleValueConfig> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<DoubleValueConfig> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private DJIKey<DoubleValueConfig> getCSDKKey(KeyParam keyParam) {
        return null;
    }
}

