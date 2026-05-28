/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.inner.aircraft.rtk.network;

import androidx.annotation.NonNull;
import dji.rtk.CoordinateSystem;
import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.keyvalue.value.rtkbasestation.NetworkRTKParam;
import dji.sdk.keyvalue.value.rtkbasestation.RTKCustomNetworkSetting;
import dji.sdk.keyvalue.value.rtkbasestation.RtkAccessInfo;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.rtk.network.BaseNetworkRTKManager;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import org.aspectj.lang.JoinPoint;

public class CMCCRTKManager
extends BaseNetworkRTKManager {
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;

    @Override
    @TrackEvent(eventName="startNetworkRTKService", category="ManagerAnnotation")
    public void startNetworkRTKService(@TrackElements(value="coordinateSystem") CoordinateSystem coordinateSystem, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="stopNetworkRTKService", category="ManagerAnnotation")
    public void stopNetworkRTKService(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void getRtkSettingInfo(NetworkRTKParam networkRTKParam, CoordinateSystem coordinateSystem, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void getRtkSettingInfo(NetworkRTKParam networkRTKParam, CoordinateSystem coordinateSystem, CommonCallbacks.CompletionCallbackWithParam<RTKCustomNetworkSetting> completionCallbackWithParam) {
    }

    private void getRTKEncData(CommonCallbacks.CompletionCallbackWithParam<NetworkRTKParam> completionCallbackWithParam) {
    }

    private void getRtkAccessInfo(NetworkRTKParam networkRTKParam, CommonCallbacks.CompletionCallbackWithParam<RtkAccessInfo> completionCallbackWithParam) {
    }

    private static /* synthetic */ void lambda$stopNetworkRTKService$0(CommonCallbacks.CompletionCallback completionCallback, DJIErrorCode dJIErrorCode) {
    }

    static /* synthetic */ void access$000(CMCCRTKManager cMCCRTKManager, NetworkRTKParam networkRTKParam, CoordinateSystem coordinateSystem, CommonCallbacks.CompletionCallback completionCallback) {
    }

    static {
        CMCCRTKManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }
}

