/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.devicebinding.DeviceBindingState;
import dji.v5.manager.aircraft.devicebinding.DeviceBindingStateListener;

public interface IDeviceBindingManager {
    public DeviceBindingState getDeviceBindingStateSync();

    public void getDeviceBindingStateAsync(CommonCallbacks.CompletionCallbackWithParam<DeviceBindingState> var1);

    public void addDeviceBindingStateListener(@NonNull DeviceBindingStateListener var1);

    public void removeDeviceBindingStateListener(@NonNull DeviceBindingStateListener var1);

    public void clearAllListeners();

    public void init();

    public void destroy();
}

