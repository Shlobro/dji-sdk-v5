/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKActionInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.common.EmptyMsg;
import dji.v5.common.callback.CommonCallbacks;

public class KeyLowBatteryRTHConfirm
extends MSDKActionInfo<Boolean, EmptyMsg> {
    @Override
    public void performAction(CommonCallbacks.CompletionCallbackWithParam<EmptyMsg> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void performAction(Boolean bl, CommonCallbacks.CompletionCallbackWithParam<EmptyMsg> completionCallbackWithParam, KeyParam keyParam) {
    }

    public static boolean isUseNewGoHomeProtocol() {
        return false;
    }
}

