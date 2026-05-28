/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.rtkbasestation.RTKBaseStationResetPasswordInfo;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.rtk.station.ConnectedRTKStationInfoListener;
import dji.v5.manager.aircraft.rtk.station.RTKStationConnectStatusListener;
import dji.v5.manager.aircraft.rtk.station.SearchRTKStationListener;

public interface IRTKStationManager {
    public void init();

    public void startSearchRTKStation(@NonNull CommonCallbacks.CompletionCallback var1);

    public void addSearchRTKStationListener(@NonNull SearchRTKStationListener var1);

    public void removeSearchRTKStationListener(@NonNull SearchRTKStationListener var1);

    public void stopSearchRTKStation(@NonNull CommonCallbacks.CompletionCallback var1);

    public void startConnectToRTKStation(int var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void removeRTKStationConnectStatusListener(@NonNull RTKStationConnectStatusListener var1);

    public void addRTKStationConnectStatusListener(@NonNull RTKStationConnectStatusListener var1);

    public void addConnectedRTKStationInfoListener(@NonNull ConnectedRTKStationInfoListener var1);

    public void removeConnectedRTKStationInfoListener(@NonNull ConnectedRTKStationInfoListener var1);

    public void loginRTKStation(String var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void setRTKStationReferencePosition(LocationCoordinate3D var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void getRTKStationReferencePosition(@NonNull CommonCallbacks.CompletionCallbackWithParam<LocationCoordinate3D> var1);

    public void resetRTKStationReferencePosition(@NonNull CommonCallbacks.CompletionCallback var1);

    public void resetRTKStationPassword(RTKBaseStationResetPasswordInfo var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void setRTKStationName(String var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void clearAllSearchRTKStationListener();

    public void clearAllRTKStationConnectStatusListener();

    public void clearAllConnectedRTKStationInfoListener();

    public void destroy();
}

