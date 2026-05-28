/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.inner.aircraft.rtk.network;

import androidx.annotation.NonNull;
import dji.rtk.CoordinateSystem;
import dji.rtk.callback.NetworkServiceState;
import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.keyvalue.value.rtkbasestation.RTKCustomNetworkSetting;
import dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.aircraft.rtk.network.INetworkServiceInfoListener;
import dji.v5.manager.interfaces.INetworkRTKManager;
import java.util.List;

class BaseNetworkRTKManager
implements INetworkRTKManager {
    private List<INetworkServiceInfoListener> serviceInfoCallbacks;
    protected RTKServiceState currentRTKServiceState;
    private DJIErrorCode currentDJIErrorCode;
    protected DJIAnalyticsPerformHelper analyticsPerformHelper;
    private NetworkServiceState.StateCallback csdkRtkListener;

    BaseNetworkRTKManager() {
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public RTKCustomNetworkSetting getCustomNetworkRTKSettings() {
        return null;
    }

    @Override
    public void setCustomNetworkRTKSettings(RTKCustomNetworkSetting rTKCustomNetworkSetting) {
    }

    @Override
    public void startNetworkRTKService(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startNetworkRTKService(CoordinateSystem coordinateSystem, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void stopNetworkRTKService(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void addNetworkRTKServiceInfoListener(@NonNull INetworkServiceInfoListener iNetworkServiceInfoListener) {
    }

    protected boolean isServiceEnabledForModule() {
        return false;
    }

    @Override
    public void removeNetworkRTKServiceInfoListener(@NonNull INetworkServiceInfoListener iNetworkServiceInfoListener) {
    }

    @Override
    public void clearAllNetworkRTKServiceInfoListener() {
    }

    @Override
    public void getNetworkRTKCoordinateSystem(@NonNull CommonCallbacks.CompletionCallbackWithParam<CoordinateSystem> completionCallbackWithParam) {
    }

    protected void notifyAllListenerState() {
    }

    private void notifyAllListenerError() {
    }

    public String getUserId() {
        return null;
    }

    protected boolean isInChina() {
        return false;
    }

    static /* synthetic */ DJIErrorCode access$002(BaseNetworkRTKManager baseNetworkRTKManager, DJIErrorCode dJIErrorCode) {
        return null;
    }

    static /* synthetic */ void access$100(BaseNetworkRTKManager baseNetworkRTKManager) {
    }
}

