/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import android.util.Pair;
import com.dji.wpmzsdk.common.utils.kml.converter.PilotWaypointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineWaypointTurnMode;

public class WaylineWaypointTypeTransform
implements ModelTransform<PilotWaypointTurnMode, Pair<WaylineWaypointTurnMode, Boolean>> {
    @Override
    public Pair<WaylineWaypointTurnMode, Boolean> transFrom(PilotWaypointTurnMode waypointTurnMode) {
        WaylineWaypointTurnMode turnMode = WaylineWaypointTurnMode.TO_POINT_AND_STOP_WITH_DISCONTINUITY_CURVATURE;
        boolean useStraightLine = true;
        if (waypointTurnMode != null) {
            switch (waypointTurnMode) {
                case POINT_PASS_CURVATURE: {
                    turnMode = WaylineWaypointTurnMode.TO_POINT_AND_PASS_WITH_CONTINUITY_CURVATURE;
                    useStraightLine = false;
                    break;
                }
                case POINT_STOP_CURVATURE: {
                    turnMode = WaylineWaypointTurnMode.TO_POINT_AND_STOP_WITH_CONTINUITY_CURVATURE;
                    useStraightLine = false;
                    break;
                }
                case COORDINATE_TURN: {
                    turnMode = WaylineWaypointTurnMode.COORDINATE_TURN;
                    useStraightLine = true;
                    break;
                }
                case POINT_PASS_SMOOTH: {
                    turnMode = WaylineWaypointTurnMode.TO_POINT_AND_PASS_WITH_CONTINUITY_CURVATURE;
                    useStraightLine = true;
                    break;
                }
            }
        }
        return Pair.create((Object)turnMode, (Object)useStraightLine);
    }

    @Override
    public PilotWaypointTurnMode transTo(Pair<WaylineWaypointTurnMode, Boolean> waylineWaypointFlyMode) {
        if (waylineWaypointFlyMode != null) {
            boolean useStraightLine = (Boolean)waylineWaypointFlyMode.second;
            if (waylineWaypointFlyMode.first == WaylineWaypointTurnMode.COORDINATE_TURN) {
                return PilotWaypointTurnMode.COORDINATE_TURN;
            }
            if (waylineWaypointFlyMode.first == WaylineWaypointTurnMode.TO_POINT_AND_STOP_WITH_DISCONTINUITY_CURVATURE) {
                return PilotWaypointTurnMode.POINT_STOP_STRAIGHT;
            }
            if (waylineWaypointFlyMode.first == WaylineWaypointTurnMode.TO_POINT_AND_STOP_WITH_CONTINUITY_CURVATURE) {
                return PilotWaypointTurnMode.POINT_STOP_CURVATURE;
            }
            if (waylineWaypointFlyMode.first == WaylineWaypointTurnMode.TO_POINT_AND_PASS_WITH_CONTINUITY_CURVATURE) {
                return useStraightLine ? PilotWaypointTurnMode.POINT_PASS_SMOOTH : PilotWaypointTurnMode.POINT_PASS_CURVATURE;
            }
        }
        return PilotWaypointTurnMode.POINT_STOP_STRAIGHT;
    }
}

