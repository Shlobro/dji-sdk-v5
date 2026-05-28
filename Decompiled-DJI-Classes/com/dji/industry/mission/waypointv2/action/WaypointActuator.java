/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.ActionTypes;
import com.dji.industry.mission.waypointv2.action.WaypointAircraftControlParam;
import com.dji.industry.mission.waypointv2.action.WaypointCameraActuatorParam;
import com.dji.industry.mission.waypointv2.action.WaypointDJISYSActuatorParam;
import com.dji.industry.mission.waypointv2.action.WaypointGimbalActuatorParam;
import com.dji.industry.mission.waypointv2.action.WaypointNavigationActionParam;
import com.dji.industry.mission.waypointv2.action.WaypointPayloadOperationActuatorParam;

public class WaypointActuator {
    private final ActionTypes.ActionActuatorType actuatorType;
    private final int actuatorIndex;
    private final int subActuatorIndex;
    private final WaypointCameraActuatorParam cameraActuatorParam;
    private final WaypointGimbalActuatorParam gimbalActuatorParam;
    private final WaypointAircraftControlParam aircraftControlActuatorParam;
    private final WaypointPayloadOperationActuatorParam payloadActuatorParam;
    private final WaypointNavigationActionParam navigationActionParam;
    private final WaypointDJISYSActuatorParam djiSYSActuatorParam;

    public WaypointActuator(Builder builder) {
    }

    public ActionTypes.ActionActuatorType getActuatorType() {
        return null;
    }

    public WaypointCameraActuatorParam getCameraActuatorParam() {
        return null;
    }

    public WaypointGimbalActuatorParam getGimbalActuatorParam() {
        return null;
    }

    public WaypointAircraftControlParam getAircraftControlActuatorParam() {
        return null;
    }

    public WaypointPayloadOperationActuatorParam getPayloadActuatorParam() {
        return null;
    }

    public WaypointNavigationActionParam getNavigationActionParam() {
        return null;
    }

    public WaypointDJISYSActuatorParam getDjiSYSActuatorParam() {
        return null;
    }

    public int getActuatorIndex() {
        return 0;
    }

    public int getSubActuatorIndex() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public static final class Builder {
        private ActionTypes.ActionActuatorType actuatorType;
        private int actuatorIndex;
        private int subActuatorIndex;
        private WaypointCameraActuatorParam cameraActuatorParam;
        private WaypointGimbalActuatorParam gimbalActuatorParam;
        private WaypointAircraftControlParam aircraftControlActuatorParam;
        private WaypointPayloadOperationActuatorParam payloadActuatorParam;
        private WaypointNavigationActionParam navigationActionParam;
        private WaypointDJISYSActuatorParam djiSYSActuatorParam;

        public Builder setActuatorType(ActionTypes.ActionActuatorType actionActuatorType) {
            return null;
        }

        public Builder setCameraActuatorParam(WaypointCameraActuatorParam waypointCameraActuatorParam) {
            return null;
        }

        public Builder setGimbalActuatorParam(WaypointGimbalActuatorParam waypointGimbalActuatorParam) {
            return null;
        }

        public Builder setAircraftControlActuatorParam(WaypointAircraftControlParam waypointAircraftControlParam) {
            return null;
        }

        public Builder setPayloadActuatorParam(WaypointPayloadOperationActuatorParam waypointPayloadOperationActuatorParam) {
            return null;
        }

        public Builder setNavigationActionParam(WaypointNavigationActionParam waypointNavigationActionParam) {
            return null;
        }

        public Builder setDJISYSActuatorParam(WaypointDJISYSActuatorParam waypointDJISYSActuatorParam) {
            return null;
        }

        public Builder setActuatorIndex(int n) {
            return null;
        }

        public Builder setSubActuatorIndex(int n) {
            return null;
        }

        public WaypointActuator build() {
            return null;
        }

        static /* synthetic */ ActionTypes.ActionActuatorType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$200(Builder builder) {
            return 0;
        }

        static /* synthetic */ WaypointCameraActuatorParam access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointGimbalActuatorParam access$400(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointAircraftControlParam access$500(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointPayloadOperationActuatorParam access$600(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointNavigationActionParam access$700(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointDJISYSActuatorParam access$800(Builder builder) {
            return null;
        }
    }
}

