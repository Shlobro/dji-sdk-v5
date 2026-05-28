/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawMode;

public class WaylineHeadingModeTransform
implements ModelTransform<WaypointMissionHeadingMode, WaylineWaypointYawMode> {
    @Override
    public WaylineWaypointYawMode transFrom(WaypointMissionHeadingMode waypointMissionHeadingMode) {
        if (waypointMissionHeadingMode != null) {
            switch (waypointMissionHeadingMode) {
                case AUTO: {
                    return WaylineWaypointYawMode.FOLLOW_WAYLINE;
                }
                case USING_INITIAL_DIRECTION: {
                    return WaylineWaypointYawMode.FIXED;
                }
                case CONTROL_BY_REMOTE_CONTROLLER: {
                    return WaylineWaypointYawMode.MANUALLY;
                }
                case USING_WAYPOINT_HEADING: {
                    return WaylineWaypointYawMode.SMOOTH_TRANSITION;
                }
                case TOWARD_POINT_OF_INTEREST: {
                    return WaylineWaypointYawMode.TOWARD_POI;
                }
            }
            return WaylineWaypointYawMode.FOLLOW_WAYLINE;
        }
        return WaylineWaypointYawMode.FOLLOW_WAYLINE;
    }

    @Override
    public WaypointMissionHeadingMode transTo(WaylineWaypointYawMode waylineWaypointYawMode) {
        if (waylineWaypointYawMode != null) {
            switch (waylineWaypointYawMode) {
                case FOLLOW_WAYLINE: {
                    return WaypointMissionHeadingMode.AUTO;
                }
                case FIXED: {
                    return WaypointMissionHeadingMode.USING_INITIAL_DIRECTION;
                }
                case MANUALLY: {
                    return WaypointMissionHeadingMode.CONTROL_BY_REMOTE_CONTROLLER;
                }
                case SMOOTH_TRANSITION: {
                    return WaypointMissionHeadingMode.USING_WAYPOINT_HEADING;
                }
                case TOWARD_POI: {
                    return WaypointMissionHeadingMode.TOWARD_POINT_OF_INTEREST;
                }
            }
            return WaypointMissionHeadingMode.AUTO;
        }
        return WaypointMissionHeadingMode.AUTO;
    }
}

