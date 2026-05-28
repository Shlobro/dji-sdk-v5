/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.common.DoubleRect;
import dji.v5.common.callback.CommonCallbacks;

public class KeyRegionMeteringArea
extends MSDKKeyInfo<DoubleRect> {
    @Override
    public void setValue(DoubleRect doubleRect, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<DoubleRect> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public DoubleRect getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<DoubleRect> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<DoubleRect> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private boolean isParamValid(DoubleRect doubleRect) {
        return false;
    }

    private static /* synthetic */ void lambda$listen$2(CommonCallbacks.KeyListener keyListener, DoubleRect doubleRect, DoubleRect doubleRect2) {
    }

    private static /* synthetic */ void lambda$setValue$1(CommonCallbacks.CompletionCallback completionCallback, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$setValue$0(CommonCallbacks.CompletionCallback completionCallback) throws Throwable {
    }
}

