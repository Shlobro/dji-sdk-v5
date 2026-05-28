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
import dji.sdk.keyvalue.value.rtkbasestation.RTKCustomNetworkSetting;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.rtk.network.BaseNetworkRTKManager;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import org.aspectj.lang.JoinPoint;

public class CustomNetworkRTKManager
extends BaseNetworkRTKManager {
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;

    @Override
    public RTKCustomNetworkSetting getCustomNetworkRTKSettings() {
        return null;
    }

    @Override
    @TrackEvent(eventName="setCustomNetworkRTKSettings", category="ManagerAnnotation")
    public void setCustomNetworkRTKSettings(@TrackElements(value="settings") RTKCustomNetworkSetting rTKCustomNetworkSetting) {
    }

    @Override
    public void startNetworkRTKService(CoordinateSystem coordinateSystem, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startNetworkRTKService(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="stopNetworkRTKService", category="ManagerAnnotation")
    public void stopNetworkRTKService(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    private static /* synthetic */ void lambda$stopNetworkRTKService$2(CommonCallbacks.CompletionCallback completionCallback, DJIErrorCode dJIErrorCode) {
    }

    private /* synthetic */ void lambda$startNetworkRTKService$1(CommonCallbacks.CompletionCallback completionCallback, DJIErrorCode dJIErrorCode) {
    }

    private /* synthetic */ void lambda$startNetworkRTKService$0(CommonCallbacks.CompletionCallback completionCallback, CoordinateSystem coordinateSystem, DJIErrorCode dJIErrorCode) {
    }

    static {
        CustomNetworkRTKManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }
}

