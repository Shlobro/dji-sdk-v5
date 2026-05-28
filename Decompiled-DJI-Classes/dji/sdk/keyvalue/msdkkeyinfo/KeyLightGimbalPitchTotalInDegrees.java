/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.gimbal.LightGimbalTotalAdjustInfo;
import dji.sdk.keyvalue.value.payload.LightGimbalAdjustStateMsg;
import dji.v5.common.callback.CommonCallbacks;

public class KeyLightGimbalPitchTotalInDegrees
extends MSDKKeyInfo<LightGimbalTotalAdjustInfo> {
    @Override
    public LightGimbalTotalAdjustInfo getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<LightGimbalTotalAdjustInfo> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<LightGimbalTotalAdjustInfo> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<LightGimbalTotalAdjustInfo> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    private void processListener(Object object, boolean bl, CommonCallbacks.KeyListener<LightGimbalTotalAdjustInfo> keyListener, KeyParam keyParam) {
    }

    private LightGimbalTotalAdjustInfo convertGimbalStatusInfo(LightGimbalAdjustStateMsg lightGimbalAdjustStateMsg) {
        return null;
    }

    private /* synthetic */ void lambda$processListener$0(CommonCallbacks.KeyListener keyListener, LightGimbalAdjustStateMsg lightGimbalAdjustStateMsg, LightGimbalAdjustStateMsg lightGimbalAdjustStateMsg2) {
    }

    static /* synthetic */ LightGimbalTotalAdjustInfo access$000(KeyLightGimbalPitchTotalInDegrees keyLightGimbalPitchTotalInDegrees, LightGimbalAdjustStateMsg lightGimbalAdjustStateMsg) {
        return null;
    }
}

