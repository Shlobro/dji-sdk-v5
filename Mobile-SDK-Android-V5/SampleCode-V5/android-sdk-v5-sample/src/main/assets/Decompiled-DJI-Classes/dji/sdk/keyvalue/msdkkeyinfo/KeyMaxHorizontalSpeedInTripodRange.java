/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.common.DoubleValueConfig;
import dji.v5.common.callback.CommonCallbacks;

public class KeyMaxHorizontalSpeedInTripodRange
extends MSDKKeyInfo<DoubleValueConfig> {
    private static final double TRIPOD_MIN_VALUE = 1.0;
    private static final double TRIPOD_MAX_VALUE = 2.8;
    private static final double TRIPOD_DEFAULT_VALUE = 2.8;

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

    private boolean isInEURule() {
        return false;
    }

    private DoubleValueConfig getMergedTripodRangeInEU(KeyParam keyParam) {
        return null;
    }

    private DoubleValueConfig getMergedTripodRangeInEU(KeyParam keyParam, DoubleValueConfig doubleValueConfig) {
        return null;
    }

    private /* synthetic */ void lambda$listen$1(CommonCallbacks.KeyListener keyListener, KeyParam keyParam, DoubleValueConfig doubleValueConfig, DoubleValueConfig doubleValueConfig2) {
    }

    private /* synthetic */ void lambda$listen$0(CommonCallbacks.KeyListener keyListener, KeyParam keyParam, DoubleValueConfig doubleValueConfig, DoubleValueConfig doubleValueConfig2) {
    }

    static /* synthetic */ DoubleValueConfig access$000(KeyMaxHorizontalSpeedInTripodRange keyMaxHorizontalSpeedInTripodRange, KeyParam keyParam, DoubleValueConfig doubleValueConfig) {
        return null;
    }
}

