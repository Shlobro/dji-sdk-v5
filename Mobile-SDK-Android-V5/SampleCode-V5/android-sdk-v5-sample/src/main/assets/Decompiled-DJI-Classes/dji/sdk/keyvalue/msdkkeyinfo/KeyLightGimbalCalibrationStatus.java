/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.gimbal.GimbalCalibrationStatusInfo;
import dji.sdk.keyvalue.value.payload.LightGimbalAutoAdjustMsg;
import dji.v5.common.callback.CommonCallbacks;

public class KeyLightGimbalCalibrationStatus
extends MSDKKeyInfo<GimbalCalibrationStatusInfo> {
    @Override
    public GimbalCalibrationStatusInfo getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<GimbalCalibrationStatusInfo> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<GimbalCalibrationStatusInfo> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<GimbalCalibrationStatusInfo> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    private void processListener(Object object, boolean bl, CommonCallbacks.KeyListener<GimbalCalibrationStatusInfo> keyListener, KeyParam keyParam) {
    }

    private GimbalCalibrationStatusInfo convertGimbalStatusInfo(LightGimbalAutoAdjustMsg lightGimbalAutoAdjustMsg) {
        return null;
    }

    private /* synthetic */ void lambda$processListener$0(CommonCallbacks.KeyListener keyListener, LightGimbalAutoAdjustMsg lightGimbalAutoAdjustMsg, LightGimbalAutoAdjustMsg lightGimbalAutoAdjustMsg2) {
    }

    static /* synthetic */ GimbalCalibrationStatusInfo access$000(KeyLightGimbalCalibrationStatus keyLightGimbalCalibrationStatus, LightGimbalAutoAdjustMsg lightGimbalAutoAdjustMsg) {
        return null;
    }
}

