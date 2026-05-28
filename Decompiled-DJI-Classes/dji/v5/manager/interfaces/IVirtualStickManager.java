/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.flightcontroller.VirtualStickFlightControlParam;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.virtualstick.IStick;
import dji.v5.manager.aircraft.virtualstick.VirtualStickStateListener;

public interface IVirtualStickManager {
    public IStick getLeftStick();

    public IStick getRightStick();

    public void enableVirtualStick(CommonCallbacks.CompletionCallback var1);

    public void disableVirtualStick(CommonCallbacks.CompletionCallback var1);

    public void setVirtualStickStateListener(VirtualStickStateListener var1);

    public void removeVirtualStickStateListener(VirtualStickStateListener var1);

    public void clearAllVirtualStickStateListener();

    public void setVirtualStickAdvancedModeEnabled(boolean var1);

    public void sendVirtualStickAdvancedParam(@NonNull VirtualStickFlightControlParam var1);

    public void setSpeedLevel(double var1);

    public double getSpeedLevel();

    public void init();

    public void destroy();
}

