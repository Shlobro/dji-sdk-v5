/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.rtk.RTKLocationInfoListener;
import dji.v5.manager.aircraft.rtk.RTKSystemStateListener;
import dji.v5.manager.interfaces.INetworkRTKManager;
import dji.v5.manager.interfaces.IRTKStationManager;

public interface IRTKCenter {
    public void init();

    public void destroy();

    public INetworkRTKManager getQXRTKManager();

    public INetworkRTKManager getCustomRTKManager();

    public INetworkRTKManager getCMCCRTKManager();

    public IRTKStationManager getRTKStationManager();

    public void setAircraftRTKModuleEnabled(boolean var1, CommonCallbacks.CompletionCallback var2);

    public void getAircraftRTKModuleEnabled(CommonCallbacks.CompletionCallbackWithParam<Boolean> var1);

    public void setRTKReferenceStationSource(RTKReferenceStationSource var1, CommonCallbacks.CompletionCallback var2);

    public void getRTKReferenceStationSource(CommonCallbacks.CompletionCallbackWithParam<RTKReferenceStationSource> var1);

    public void addRTKLocationInfoListener(RTKLocationInfoListener var1);

    public void removeRTKLocationInfoListener(RTKLocationInfoListener var1);

    public void clearAllRTKLocationInfoListener();

    public void addRTKSystemStateListener(RTKSystemStateListener var1);

    public void removeRTKSystemStateListener(RTKSystemStateListener var1);

    public void clearAllRTKSystemStateListener();

    public void setRTKMaintainAccuracyEnabled(boolean var1, CommonCallbacks.CompletionCallback var2);

    public void getRTKMaintainAccuracyEnabled(CommonCallbacks.CompletionCallbackWithParam<Boolean> var1);
}

