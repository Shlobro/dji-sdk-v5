/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.flightcontroller.CountDownLandingInfo;
import dji.sdk.keyvalue.value.flightcontroller.FCAutoRTHReason;
import dji.sdk.keyvalue.value.flightcontroller.LowBatteryRTHInfo;
import dji.v5.common.callback.CommonCallbacks;

public class KeyLowBatteryRTHInfo
extends MSDKKeyInfo<LowBatteryRTHInfo> {
    private FCAutoRTHReason fcAutoRTHReason;
    private CountDownLandingInfo countDownLandingInfo;

    private void fillLowBatteryRTHInfo(LowBatteryRTHInfo lowBatteryRTHInfo) {
    }

    @Override
    public LowBatteryRTHInfo getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<LowBatteryRTHInfo> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<LowBatteryRTHInfo> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<LowBatteryRTHInfo> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    public static boolean isUseNewGoHomeProtocol() {
        return false;
    }

    private /* synthetic */ void lambda$listen$2(CommonCallbacks.KeyListener keyListener, LowBatteryRTHInfo lowBatteryRTHInfo, LowBatteryRTHInfo lowBatteryRTHInfo2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$new$1(CountDownLandingInfo countDownLandingInfo, CountDownLandingInfo countDownLandingInfo2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$new$0(FCAutoRTHReason fCAutoRTHReason, FCAutoRTHReason fCAutoRTHReason2) {
    }

    static /* synthetic */ void access$000(KeyLowBatteryRTHInfo keyLowBatteryRTHInfo, LowBatteryRTHInfo lowBatteryRTHInfo) {
    }
}

