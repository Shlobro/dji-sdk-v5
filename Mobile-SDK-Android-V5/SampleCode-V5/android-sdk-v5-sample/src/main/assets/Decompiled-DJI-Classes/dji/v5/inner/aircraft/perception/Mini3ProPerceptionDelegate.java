/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.inner.aircraft.perception;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.flightcontroller.ObstacleActionType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.perception.ConsumePerceptionDelegate;
import dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType;

public class Mini3ProPerceptionDelegate
extends ConsumePerceptionDelegate {
    @Override
    public void setObstacleAvoidanceType(ObstacleAvoidanceType obstacleAvoidanceType, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getObstacleAvoidanceType(@NonNull CommonCallbacks.CompletionCallbackWithParam<ObstacleAvoidanceType> completionCallbackWithParam) {
    }

    @Override
    protected void observeOtherListener() {
    }

    private /* synthetic */ void lambda$observeOtherListener$0(ObstacleActionType obstacleActionType, ObstacleActionType obstacleActionType2) {
    }
}

