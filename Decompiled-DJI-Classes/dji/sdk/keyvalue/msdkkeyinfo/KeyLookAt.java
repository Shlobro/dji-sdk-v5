/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKActionInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.common.EmptyMsg;
import dji.sdk.keyvalue.value.flightassistant.SmartTrackSubMode;
import dji.sdk.keyvalue.value.flightcontroller.LookAtInfo;
import dji.sdk.keyvalue.value.flightcontroller.LookAtMode;
import dji.v5.common.callback.CommonCallbacks;

public class KeyLookAt
extends MSDKActionInfo<LookAtInfo, EmptyMsg> {
    @Override
    public void performAction(LookAtInfo lookAtInfo, CommonCallbacks.CompletionCallbackWithParam<EmptyMsg> completionCallbackWithParam, KeyParam keyParam) {
    }

    private SmartTrackSubMode toSmartTrackSubMode(LookAtMode lookAtMode) {
        return null;
    }
}

