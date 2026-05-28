/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.ActionTypes;
import com.dji.industry.mission.waypointv2.action.WaypointAircraftControlFlightCalibrationParam;
import com.dji.industry.mission.waypointv2.action.WaypointAircraftControlRotateYawParam;
import com.dji.industry.mission.waypointv2.action.WaypointAircraftControlStartStopFlyParam;

public class WaypointAircraftControlParam {
    private final WaypointAircraftControlRotateYawParam rotateYawParam;
    private final WaypointAircraftControlStartStopFlyParam flyControlParam;
    private final ActionTypes.AircraftControlType aircraftControlType;
    private final WaypointAircraftControlFlightCalibrationParam flightCalibrationParam;

    public WaypointAircraftControlParam(Builder builder) {
    }

    public WaypointAircraftControlRotateYawParam getRotateYawParam() {
        return null;
    }

    public WaypointAircraftControlStartStopFlyParam getFlyControlParam() {
        return null;
    }

    public ActionTypes.AircraftControlType getAircraftControlType() {
        return null;
    }

    public WaypointAircraftControlFlightCalibrationParam getFlightCalibrationParam() {
        return null;
    }

    public static final class Builder {
        private ActionTypes.AircraftControlType aircraftControlType;
        private WaypointAircraftControlRotateYawParam rotateYawParam;
        private WaypointAircraftControlStartStopFlyParam flyControlParam;
        private WaypointAircraftControlFlightCalibrationParam flightCalibrationParam;

        public Builder setRotateYawParam(WaypointAircraftControlRotateYawParam waypointAircraftControlRotateYawParam) {
            return null;
        }

        public Builder setFlyControlParam(WaypointAircraftControlStartStopFlyParam waypointAircraftControlStartStopFlyParam) {
            return null;
        }

        public Builder setAircraftControlType(ActionTypes.AircraftControlType aircraftControlType) {
            return null;
        }

        public Builder setFlightCalibrationParam(WaypointAircraftControlFlightCalibrationParam waypointAircraftControlFlightCalibrationParam) {
            return null;
        }

        public WaypointAircraftControlParam build() {
            return null;
        }

        static /* synthetic */ WaypointAircraftControlRotateYawParam access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointAircraftControlStartStopFlyParam access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ ActionTypes.AircraftControlType access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointAircraftControlFlightCalibrationParam access$300(Builder builder) {
            return null;
        }
    }
}

