/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package dji.v5.inner.aircraft.perception;

import android.annotation.SuppressLint;
import dji.sdk.keyvalue.utils.ProductUtil;
import dji.sdk.keyvalue.value.flightassistant.ObstacleAvoidanceState;
import dji.sdk.keyvalue.value.flightassistant.ObstacleAvoidanceStateMsg;
import dji.sdk.keyvalue.value.flightassistant.PerceptionPushOmnidirectionalRadarStatus;
import dji.v5.inner.aircraft.perception.BasePerceptionDelegate;

public class ConsumePerceptionDelegate
extends BasePerceptionDelegate {
    @Override
    public ProductUtil.MachineType getMachineType() {
        return null;
    }

    @Override
    @SuppressLint(value={"MissingSuperCall"})
    protected void observerPerceptionMapInformation() {
    }

    private boolean isEnable(ObstacleAvoidanceState obstacleAvoidanceState) {
        return false;
    }

    private /* synthetic */ void lambda$observerPerceptionMapInformation$1(PerceptionPushOmnidirectionalRadarStatus perceptionPushOmnidirectionalRadarStatus) throws Throwable {
    }

    private /* synthetic */ void lambda$observerPerceptionMapInformation$0(ObstacleAvoidanceStateMsg obstacleAvoidanceStateMsg) throws Throwable {
    }
}

