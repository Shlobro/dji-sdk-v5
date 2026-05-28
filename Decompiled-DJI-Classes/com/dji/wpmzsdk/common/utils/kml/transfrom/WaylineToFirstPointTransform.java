/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionGotoWaypointMode;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineFlyToWaylineMode;

public class WaylineToFirstPointTransform
implements ModelTransform<WaypointMissionGotoWaypointMode, WaylineFlyToWaylineMode> {
    @Override
    public WaylineFlyToWaylineMode transFrom(WaypointMissionGotoWaypointMode waypointMissionGotoFirstWaypointMode) {
        if (waypointMissionGotoFirstWaypointMode != null) {
            switch (waypointMissionGotoFirstWaypointMode) {
                case GotoWaypointSafely: {
                    return WaylineFlyToWaylineMode.SAFELY;
                }
                case GotoWaypointPointToPoint: {
                    return WaylineFlyToWaylineMode.POINT_TO_POINT;
                }
            }
            return WaylineFlyToWaylineMode.SAFELY;
        }
        return WaylineFlyToWaylineMode.SAFELY;
    }

    @Override
    public WaypointMissionGotoWaypointMode transTo(WaylineFlyToWaylineMode waylineFlyToWaylineMode) {
        if (waylineFlyToWaylineMode != null) {
            switch (waylineFlyToWaylineMode) {
                case SAFELY: {
                    return WaypointMissionGotoWaypointMode.GotoWaypointSafely;
                }
                case POINT_TO_POINT: {
                    return WaypointMissionGotoWaypointMode.GotoWaypointPointToPoint;
                }
            }
            return WaypointMissionGotoWaypointMode.GotoWaypointSafely;
        }
        return WaypointMissionGotoWaypointMode.GotoWaypointSafely;
    }
}

