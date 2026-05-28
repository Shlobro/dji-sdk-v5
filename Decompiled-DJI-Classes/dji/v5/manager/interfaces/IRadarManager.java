/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.perception.data.PerceptionDirection;
import dji.v5.manager.aircraft.perception.listener.ObstacleDataListener;
import dji.v5.manager.aircraft.perception.radar.RadarInformationListener;

public interface IRadarManager {
    public void addObstacleDataListener(ObstacleDataListener var1);

    public void removeObstacleDataListener(ObstacleDataListener var1);

    public void clearAllObstacleDataListener();

    public void addRadarInformationListener(RadarInformationListener var1);

    public void removeRadarInformationListener(RadarInformationListener var1);

    public void clearAllRadarInformationListener();

    public void setObstacleAvoidanceEnabled(boolean var1, @NonNull PerceptionDirection var2, CommonCallbacks.CompletionCallback var3);

    public void getObstacleAvoidanceEnabled(@NonNull PerceptionDirection var1, @NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> var2);

    public void init();

    public void destroy();
}

