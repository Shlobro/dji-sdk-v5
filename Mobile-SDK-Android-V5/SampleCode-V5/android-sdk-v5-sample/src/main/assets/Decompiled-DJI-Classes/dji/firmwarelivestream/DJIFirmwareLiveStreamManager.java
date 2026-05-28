/*
 * Decompiled with CFR 0.152.
 */
package dji.firmwarelivestream;

import dji.sdk.common.CallBack;
import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.keyvalue.value.common.LiveStreamingDeviceState;
import dji.sdk.keyvalue.value.common.LiveStreamingParams;
import dji.sdk.keyvalue.value.common.LiveStreamingRunningState;
import dji.sdk.keyvalue.value.common.LiveStreamingSettings;

public class DJIFirmwareLiveStreamManager {
    private static volatile DJIFirmwareLiveStreamManager mInstance = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIFirmwareLiveStreamManager get() {
        return null;
    }

    private DJIFirmwareLiveStreamManager() {
    }

    public void enterLiveStreamMode(CallBack<Integer> callBack) {
    }

    public void quitLiveStreamMode(CallBack<Integer> callBack) {
    }

    public void connectWiFi(String string2, String string3, CallBack<DJIErrorCode> callBack) {
    }

    public void setStreamParams(LiveStreamingParams liveStreamingParams, CallBack<Integer> callBack) {
    }

    public void startLiveStream(CallBack<Integer> callBack) {
    }

    public void stopLiveStream(CallBack<Integer> callBack) {
    }

    public void stopAndQuitLiveStream(CallBack<Integer> callBack) {
    }

    public void isInLiveStreamMode(CallBack<Boolean> callBack) {
    }

    public void getLiveStreamSettingsInfo(CallBack<LiveStreamingSettings> callBack) {
    }

    public void getLiveStreamDeviceState(CallBack<LiveStreamingDeviceState> callBack) {
    }

    public void setLiveStreamDeviceStateListener(CallBack<LiveStreamingDeviceState> callBack) {
    }

    public void getLiveStreamRunningState(CallBack<LiveStreamingRunningState> callBack) {
    }

    public void setLiveStreamRunningStateListener(CallBack<LiveStreamingRunningState> callBack) {
    }

    private static /* synthetic */ void lambda$setLiveStreamRunningStateListener$24(CallBack callBack, String string2) {
    }

    private static /* synthetic */ void lambda$setLiveStreamRunningStateListener$23(String string2, CallBack callBack) {
    }

    private static /* synthetic */ void lambda$getLiveStreamRunningState$22(CallBack callBack, String string2) {
    }

    private static /* synthetic */ void lambda$getLiveStreamRunningState$21(String string2, CallBack callBack) {
    }

    private static /* synthetic */ void lambda$setLiveStreamDeviceStateListener$20(CallBack callBack, String string2) {
    }

    private static /* synthetic */ void lambda$setLiveStreamDeviceStateListener$19(String string2, CallBack callBack) {
    }

    private static /* synthetic */ void lambda$getLiveStreamDeviceState$18(CallBack callBack, String string2) {
    }

    private static /* synthetic */ void lambda$getLiveStreamDeviceState$17(String string2, CallBack callBack) {
    }

    private static /* synthetic */ void lambda$getLiveStreamSettingsInfo$16(CallBack callBack, String string2) {
    }

    private static /* synthetic */ void lambda$getLiveStreamSettingsInfo$15(String string2, CallBack callBack) {
    }

    private static /* synthetic */ void lambda$isInLiveStreamMode$14(CallBack callBack, LiveStreamingRunningState liveStreamingRunningState) {
    }

    private static /* synthetic */ void lambda$stopAndQuitLiveStream$13(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$stopAndQuitLiveStream$12(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$stopLiveStream$11(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$stopLiveStream$10(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$startLiveStream$9(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$startLiveStream$8(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$setStreamParams$7(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$setStreamParams$6(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$connectWiFi$5(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$connectWiFi$4(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$quitLiveStreamMode$3(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$quitLiveStreamMode$2(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$enterLiveStreamMode$1(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$enterLiveStreamMode$0(CallBack callBack, int n) {
    }
}

