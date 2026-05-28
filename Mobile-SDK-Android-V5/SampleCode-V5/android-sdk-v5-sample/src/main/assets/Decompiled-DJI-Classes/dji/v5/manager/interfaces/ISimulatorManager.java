/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.simulator.InitializationSettings;
import dji.v5.manager.aircraft.simulator.SimulatorStatusListener;
import dji.v5.manager.aircraft.simulator.SimulatorWindInfo;

public interface ISimulatorManager {
    public boolean isSimulatorEnabled();

    public void enableSimulator(@NonNull InitializationSettings var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void disableSimulator(@Nullable CommonCallbacks.CompletionCallback var1);

    public void addSimulatorStateListener(@NonNull SimulatorStatusListener var1);

    public void removeSimulatorStateListener(@NonNull SimulatorStatusListener var1);

    public void clearAllSimulatorStateListener();

    public void setFlyZoneLimitationEnabled(boolean var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void getFlyZoneLimitationEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> var1);

    public void setWindSpeed(SimulatorWindInfo var1);
}

