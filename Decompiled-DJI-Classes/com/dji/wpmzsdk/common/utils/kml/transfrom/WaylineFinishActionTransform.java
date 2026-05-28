/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineFinishedAction;

public class WaylineFinishActionTransform
implements ModelTransform<WaypointMissionFinishedAction, WaylineFinishedAction> {
    @Override
    public WaylineFinishedAction transFrom(WaypointMissionFinishedAction waypointMissionFinishedAction) {
        if (waypointMissionFinishedAction != null) {
            switch (waypointMissionFinishedAction) {
                case GO_HOME: {
                    return WaylineFinishedAction.GO_HOME;
                }
                case AUTO_LAND: {
                    return WaylineFinishedAction.AUTO_LAND;
                }
                case GO_FIRST_WAYPOINT: {
                    return WaylineFinishedAction.GOTO_FIRST_WAYPOINT;
                }
                case NO_ACTION: {
                    return WaylineFinishedAction.NO_ACTION;
                }
            }
            return WaylineFinishedAction.GO_HOME;
        }
        return WaylineFinishedAction.GO_HOME;
    }

    @Override
    public WaypointMissionFinishedAction transTo(WaylineFinishedAction waylineFinishedAction) {
        if (waylineFinishedAction != null) {
            switch (waylineFinishedAction) {
                case GO_HOME: {
                    return WaypointMissionFinishedAction.GO_HOME;
                }
                case AUTO_LAND: {
                    return WaypointMissionFinishedAction.AUTO_LAND;
                }
                case GOTO_FIRST_WAYPOINT: {
                    return WaypointMissionFinishedAction.GO_FIRST_WAYPOINT;
                }
                case NO_ACTION: {
                    return WaypointMissionFinishedAction.NO_ACTION;
                }
            }
            return WaypointMissionFinishedAction.GO_HOME;
        }
        return WaypointMissionFinishedAction.GO_HOME;
    }
}

