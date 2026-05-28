/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.waypoint3;

import dji.v5.common.error.IDJIError;
import dji.v5.manager.aircraft.waypoint3.model.WaylineExecutingInfo;

public interface WaylineExecutingInfoListener {
    public void onWaylineExecutingInfoUpdate(WaylineExecutingInfo var1);

    default public void onWaylineExecutingInterruptReasonUpdate(IDJIError iDJIError) {
    }
}

