/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.perception;

import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.perception.data.PerceptionDirection;
import dji.v5.manager.aircraft.perception.listener.ObstacleDataListener;
import dji.v5.manager.aircraft.perception.listener.PerceptionInformationListener;

public interface IVisualManager {
    public void setObstacleAvoidanceEnabled(boolean var1, @NonNull PerceptionDirection var2, CommonCallbacks.CompletionCallback var3);

    public void getObstacleAvoidanceEnabled(@NonNull PerceptionDirection var1, @NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> var2);

    public void setVisionPositioningEnabled(boolean var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void getVisionPositioningEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> var1);

    public void addPerceptionInformationListener(@NonNull PerceptionInformationListener var1);

    public void removePerceptionInformationListener(@NonNull PerceptionInformationListener var1);

    public void clearAllPerceptionInformationListener();

    public void addObstacleDataListener(ObstacleDataListener var1);

    public void removeObstacleDataListener(ObstacleDataListener var1);

    public void clearAllObstacleDataListener();

    public void setPrecisionLandingEnabled(boolean var1, @NonNull CommonCallbacks.CompletionCallback var2);

    public void getPrecisionLandingEnabled(@NonNull CommonCallbacks.CompletionCallbackWithParam<Boolean> var1);
}

