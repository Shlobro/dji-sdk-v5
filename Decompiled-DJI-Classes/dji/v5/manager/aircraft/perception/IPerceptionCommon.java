/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.perception;

import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType;
import dji.v5.manager.aircraft.perception.data.PerceptionDirection;

public interface IPerceptionCommon {
    @Deprecated
    public void setOverallObstacleAvoidanceEnabled(boolean var1, CommonCallbacks.CompletionCallback var2);

    @Deprecated
    public void getOverallObstacleAvoidanceEnabled(CommonCallbacks.CompletionCallbackWithParam<Boolean> var1);

    public void setObstacleAvoidanceType(ObstacleAvoidanceType var1, CommonCallbacks.CompletionCallback var2);

    public void getObstacleAvoidanceType(CommonCallbacks.CompletionCallbackWithParam<ObstacleAvoidanceType> var1);

    public void setObstacleAvoidanceWarningDistance(double var1, @NonNull PerceptionDirection var3, CommonCallbacks.CompletionCallback var4);

    public void getObstacleAvoidanceWarningDistance(@NonNull PerceptionDirection var1, CommonCallbacks.CompletionCallbackWithParam<Double> var2);

    public void setObstacleAvoidanceBrakingDistance(double var1, @NonNull PerceptionDirection var3, CommonCallbacks.CompletionCallback var4);

    public void getObstacleAvoidanceBrakingDistance(@NonNull PerceptionDirection var1, CommonCallbacks.CompletionCallbackWithParam<Double> var2);
}

