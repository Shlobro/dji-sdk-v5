/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.model.PointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawPathMode;

public class WaylineTurnModeTransform
implements ModelTransform<PointTurnMode, WaylineWaypointYawPathMode> {
    @Override
    public WaylineWaypointYawPathMode transFrom(PointTurnMode pointTurnMode) {
        if (pointTurnMode != null) {
            switch (pointTurnMode) {
                case AUTO: {
                    return WaylineWaypointYawPathMode.FOLLOW_BAD_ARC;
                }
                case CLOCKWISE: {
                    return WaylineWaypointYawPathMode.CLOCKWISE;
                }
                case COUNTER_CLOCKWISE: {
                    return WaylineWaypointYawPathMode.COUNTER_CLOCKWISE;
                }
            }
            return WaylineWaypointYawPathMode.FOLLOW_BAD_ARC;
        }
        return WaylineWaypointYawPathMode.FOLLOW_BAD_ARC;
    }

    @Override
    public PointTurnMode transTo(WaylineWaypointYawPathMode waylineWaypointTurnEvenlyPathMode) {
        if (waylineWaypointTurnEvenlyPathMode != null) {
            switch (waylineWaypointTurnEvenlyPathMode) {
                case FOLLOW_BAD_ARC: {
                    return PointTurnMode.AUTO;
                }
                case CLOCKWISE: {
                    return PointTurnMode.CLOCKWISE;
                }
                case COUNTER_CLOCKWISE: {
                    return PointTurnMode.COUNTER_CLOCKWISE;
                }
            }
            return PointTurnMode.AUTO;
        }
        return PointTurnMode.AUTO;
    }
}

