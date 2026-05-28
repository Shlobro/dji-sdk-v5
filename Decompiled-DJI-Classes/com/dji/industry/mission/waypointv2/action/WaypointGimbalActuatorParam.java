/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.ActionTypes;
import com.dji.industry.mission.waypointv2.action.WaypointGimbalStartPathShootingParam;
import com.dji.industry.mission.waypointv2.action.WaypointGimbalStopPathShootingParam;
import com.dji.industry.mission.waypointv2.gimbal.Rotation;

public class WaypointGimbalActuatorParam {
    private ActionTypes.GimbalOperationType operationType;
    private Rotation rotation;
    private WaypointGimbalStartPathShootingParam startPathShootingParam;
    private WaypointGimbalStopPathShootingParam stopPathShootingParam;

    private WaypointGimbalActuatorParam(Builder builder) {
    }

    public ActionTypes.GimbalOperationType getOperationType() {
        return null;
    }

    public Rotation getRotation() {
        return null;
    }

    public WaypointGimbalStartPathShootingParam getStartPathShootingParam() {
        return null;
    }

    public WaypointGimbalStopPathShootingParam getStopPathShootingParam() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ WaypointGimbalActuatorParam(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private ActionTypes.GimbalOperationType operationType;
        private Rotation rotation;
        private WaypointGimbalStartPathShootingParam startPathShootingParam;
        private WaypointGimbalStopPathShootingParam stopPathShootingParam;

        public Builder operationType(ActionTypes.GimbalOperationType gimbalOperationType) {
            return null;
        }

        public Builder rotation(Rotation rotation) {
            return null;
        }

        public Builder startPathShooting(WaypointGimbalStartPathShootingParam waypointGimbalStartPathShootingParam) {
            return null;
        }

        public Builder stopPathShooting(WaypointGimbalStopPathShootingParam waypointGimbalStopPathShootingParam) {
            return null;
        }

        public WaypointGimbalActuatorParam build() {
            return null;
        }

        static /* synthetic */ ActionTypes.GimbalOperationType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ Rotation access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointGimbalStartPathShootingParam access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointGimbalStopPathShootingParam access$300(Builder builder) {
            return null;
        }
    }
}

