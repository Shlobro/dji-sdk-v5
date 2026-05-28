/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKActionInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.common.EmptyMsg;
import dji.sdk.keyvalue.value.gimbal.LightGimbalAdjustInfo;
import dji.v5.common.callback.CommonCallbacks;

public class KeyLightGimbalFineTunePitchInDegrees
extends MSDKActionInfo<LightGimbalAdjustInfo, EmptyMsg> {
    @Override
    public void performAction(LightGimbalAdjustInfo lightGimbalAdjustInfo, CommonCallbacks.CompletionCallbackWithParam<EmptyMsg> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void performAction(CommonCallbacks.CompletionCallbackWithParam<EmptyMsg> completionCallbackWithParam, KeyParam keyParam) {
    }
}

