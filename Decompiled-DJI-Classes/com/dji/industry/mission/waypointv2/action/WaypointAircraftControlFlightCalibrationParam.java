/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.ActionTypes;

public class WaypointAircraftControlFlightCalibrationParam {
    private ActionTypes.FlightCalibrationType calibrationType;
    private int calibrationTime;
    private float calibrationDistance;
    private boolean forwardCalibration;

    public WaypointAircraftControlFlightCalibrationParam(Builder builder) {
    }

    public ActionTypes.FlightCalibrationType getCalibrationType() {
        return null;
    }

    public int getCalibrationTime() {
        return 0;
    }

    public float getCalibrationDistance() {
        return 0.0f;
    }

    public boolean isForwardCalibration() {
        return false;
    }

    public static final class Builder {
        private ActionTypes.FlightCalibrationType calibrationType;
        private int calibrationTime;
        private float calibrationDistance;
        private boolean forwardCalibration;

        public Builder setCalibrationType(ActionTypes.FlightCalibrationType flightCalibrationType) {
            return null;
        }

        public Builder setCalibrationTime(int n) {
            return null;
        }

        public Builder setCalibrationDistance(float f2) {
            return null;
        }

        public Builder setForwardCalibration(boolean bl) {
            return null;
        }

        public WaypointAircraftControlFlightCalibrationParam build() {
            return null;
        }

        static /* synthetic */ ActionTypes.FlightCalibrationType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ float access$200(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ boolean access$300(Builder builder) {
            return false;
        }
    }
}

