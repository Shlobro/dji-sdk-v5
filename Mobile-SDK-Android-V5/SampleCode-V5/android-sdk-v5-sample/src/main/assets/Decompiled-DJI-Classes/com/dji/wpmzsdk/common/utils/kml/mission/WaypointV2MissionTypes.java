/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.mission;

public class WaypointV2MissionTypes {

    public static enum WaypointV2HeadingMode {
        AUTO(0),
        FIXED(1),
        MANUAL(2),
        WAYPOINT_CUSTOM(3),
        TOWARD_POINT_OF_INTEREST(4),
        GIMBAL_YAW_FOLLOW(5),
        UNKNOWN(255);

        private int value;

        private WaypointV2HeadingMode(int value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }

        public boolean _equals(int b) {
            return this.value == b;
        }

        public static WaypointV2HeadingMode find(int value) {
            WaypointV2HeadingMode result = UNKNOWN;
            for (int i = 0; i < WaypointV2HeadingMode.values().length; ++i) {
                if (!WaypointV2HeadingMode.values()[i]._equals(value)) continue;
                result = WaypointV2HeadingMode.values()[i];
                break;
            }
            return result;
        }
    }

    public static enum WaypointV2TurnMode {
        CLOCKWISE(0),
        COUNTER_CLOCKWISE(1),
        UNKNOWN(255);

        private int value;

        private WaypointV2TurnMode(int value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }

        public boolean _equals(int b) {
            return this.value == b;
        }

        public static WaypointV2TurnMode find(int value) {
            WaypointV2TurnMode result = CLOCKWISE;
            for (int i = 0; i < WaypointV2TurnMode.values().length; ++i) {
                if (!WaypointV2TurnMode.values()[i]._equals(value)) continue;
                result = WaypointV2TurnMode.values()[i];
                break;
            }
            return result;
        }
    }

    public static enum MissionGotoWaypointMode {
        SAFELY(0),
        POINT_TO_POINT(1);

        private int value;

        private MissionGotoWaypointMode(int value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }

        public boolean _equals(int b) {
            return this.value == b;
        }

        public static MissionGotoWaypointMode find(int value) {
            MissionGotoWaypointMode result = SAFELY;
            for (int i = 0; i < MissionGotoWaypointMode.values().length; ++i) {
                if (!MissionGotoWaypointMode.values()[i]._equals(value)) continue;
                result = MissionGotoWaypointMode.values()[i];
                break;
            }
            return result;
        }
    }

    public static enum MissionFinishedAction {
        NO_ACTION(0),
        GO_HOME(1),
        AUTO_LAND(2),
        GO_FIRST_WAYPOINT(3),
        CONTINUE_UNTIL_STOP(4);

        private int value;

        private MissionFinishedAction(int value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }

        public boolean _equals(int b) {
            return this.value == b;
        }

        public static MissionFinishedAction find(int value) {
            MissionFinishedAction result = NO_ACTION;
            for (int i = 0; i < MissionFinishedAction.values().length; ++i) {
                if (!MissionFinishedAction.values()[i]._equals(value)) continue;
                result = MissionFinishedAction.values()[i];
                break;
            }
            return result;
        }
    }

    public static enum WaypointV2FlightPathMode {
        CURVATURE_CONTINUOUS_PASSED(0),
        GOTO_POINT_CURVE_AND_STOP(1),
        GOTO_POINT_STRAIGHT_LINE_AND_STOP(2),
        COORDINATE_TURN(3),
        GOTO_FIRST_POINT_ALONG_STRAIGHT_LINE(4),
        STRAIGHT_OUT(5),
        UNKNOWN(255);

        private int value;

        private WaypointV2FlightPathMode(int value) {
            this.value = value;
        }

        public int value() {
            return this.value;
        }

        public boolean _equals(int b) {
            return this.value == b;
        }

        public static WaypointV2FlightPathMode find(int value) {
            WaypointV2FlightPathMode result = UNKNOWN;
            for (int i = 0; i < WaypointV2FlightPathMode.values().length; ++i) {
                if (!WaypointV2FlightPathMode.values()[i]._equals(value)) continue;
                result = WaypointV2FlightPathMode.values()[i];
                break;
            }
            return result;
        }
    }
}

