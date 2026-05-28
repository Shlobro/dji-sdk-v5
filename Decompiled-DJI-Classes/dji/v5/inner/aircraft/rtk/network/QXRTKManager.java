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
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.rtk.network.BaseNetworkRTKManager;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import org.aspectj.lang.JoinPoint;

public class QXRTKManager
extends BaseNetworkRTKManager {
    private CoordinateSystem currentCoordinateSystem;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;

    @Override
    @TrackEvent(eventName="startNetworkRTKService", category="ManagerAnnotation")
    public void startNetworkRTKService(@TrackElements(value="coordinateSystem") CoordinateSystem coordinateSystem, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="startNetworkRTKService", category="ManagerAnnotation")
    public void startNetworkRTKService(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void doStartNetworkRTKService(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void getRTKDssInfo(NetworkRTKParam networkRTKParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="stopNetworkRTKService", category="ManagerAnnotation")
    public void stopNetworkRTKService(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getNetworkRTKCoordinateSystem(@NonNull CommonCallbacks.CompletionCallbackWithParam<CoordinateSystem> completionCallbackWithParam) {
    }

    private static /* synthetic */ void lambda$stopNetworkRTKService$0(CommonCallbacks.CompletionCallback completionCallback, DJIErrorCode dJIErrorCode) {
    }

    static /* synthetic */ void access$000(QXRTKManager qXRTKManager, NetworkRTKParam networkRTKParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    static /* synthetic */ CoordinateSystem access$100(QXRTKManager qXRTKManager) {
        return null;
    }

    static {
        QXRTKManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }
}

