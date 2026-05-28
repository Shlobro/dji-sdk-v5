/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.rtk.CoordinateSystem;
import dji.sdk.keyvalue.value.rtkbasestation.RTKCustomNetworkSetting;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.rtk.network.INetworkServiceInfoListener;

public interface INetworkRTKManager {
    public void init();

    public void destroy();

    public RTKCustomNetworkSetting getCustomNetworkRTKSettings();

    public void setCustomNetworkRTKSettings(RTKCustomNetworkSetting var1);

    @Deprecated
    public void startNetworkRTKService(CommonCallbacks.CompletionCallback var1);

    public void startNetworkRTKService(CoordinateSystem var1, CommonCallbacks.CompletionCallback var2);

    public void stopNetworkRTKService(@NonNull CommonCallbacks.CompletionCallback var1);

    public void addNetworkRTKServiceInfoListener(@NonNull INetworkServiceInfoListener var1);

    public void removeNetworkRTKServiceInfoListener(@NonNull INetworkServiceInfoListener var1);

    public void clearAllNetworkRTKServiceInfoListener();

    public void getNetworkRTKCoordinateSystem(@NonNull CommonCallbacks.CompletionCallbackWithParam<CoordinateSystem> var1);
}

