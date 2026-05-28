/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.remotecontroller.ControlMode;
import dji.sdk.keyvalue.value.remotecontroller.RcControllerModeMsg;
import dji.v5.common.callback.CommonCallbacks;

public class KeyControlMode
extends MSDKKeyInfo<ControlMode> {
    @Override
    public ControlMode getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<ControlMode> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void setValue(ControlMode controlMode, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    private void setValueWithRcControllerMsg(RcControllerModeMsg rcControllerModeMsg, ControlMode controlMode, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    static /* synthetic */ void access$000(KeyControlMode keyControlMode, RcControllerModeMsg rcControllerModeMsg, ControlMode controlMode, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }
}

