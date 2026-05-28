/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.v5.common.callback.CommonCallbacks;

public class KeyThermalFocalLength
extends MSDKKeyInfo<Integer> {
    public static final int UNIT_CONVERSION_RATE = 10;

    @Override
    public Integer getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<Integer> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<Integer> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<Integer> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private Integer getConversionValue(Integer n) {
        return null;
    }

    private /* synthetic */ void lambda$listen$0(CommonCallbacks.KeyListener keyListener, Integer n, Integer n2) {
    }
}

