/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.flightcontroller.CountDownLandingInfo;
import dji.sdk.keyvalue.value.flightcontroller.GoHomeInfo;
import dji.v5.common.callback.CommonCallbacks;

public class KeyGoHomeInfo
extends MSDKKeyInfo<GoHomeInfo> {
    @Override
    public GoHomeInfo getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<GoHomeInfo> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<GoHomeInfo> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<GoHomeInfo> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    public GoHomeInfo toGoHomeInfo(CountDownLandingInfo countDownLandingInfo) {
        return null;
    }

    private /* synthetic */ void lambda$listen$0(CommonCallbacks.KeyListener keyListener, CountDownLandingInfo countDownLandingInfo, CountDownLandingInfo countDownLandingInfo2) {
    }
}

