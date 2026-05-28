/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.inner.aircraft.perception;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.value.flightcontroller.ObstacleActionType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.aircraft.perception.IndustryPerceptionDelegate;
import dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType;
import dji.v5.manager.aircraft.perception.data.PerceptionDirection;

public class M400PerceptionDelegate
extends IndustryPerceptionDelegate {
    private boolean isApasMode;

    @Override
    public void setObstacleAvoidanceType(ObstacleAvoidanceType obstacleAvoidanceType, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getObstacleAvoidanceType(@NonNull CommonCallbacks.CompletionCallbackWithParam<ObstacleAvoidanceType> completionCallbackWithParam) {
    }

    @Override
    protected void observeOtherListener() {
    }

    @Override
    public void setObstacleAvoidanceEnabled(boolean bl, @NonNull PerceptionDirection perceptionDirection, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    protected void updateOverallObstacleAvoidanceEnable() {
    }

    @Override
    protected DJIKey<Boolean> getUpwardsAvoidanceEnableKey() {
        return null;
    }

    @Override
    protected DJIKey<Boolean> getHorizontalAvoidanceEnableKey() {
        return null;
    }

    private /* synthetic */ void lambda$observeOtherListener$0(ObstacleActionType obstacleActionType, ObstacleActionType obstacleActionType2) {
    }
}

