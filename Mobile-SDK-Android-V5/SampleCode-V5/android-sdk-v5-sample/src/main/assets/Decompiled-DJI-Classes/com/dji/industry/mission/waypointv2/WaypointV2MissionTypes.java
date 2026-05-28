/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2;

public class WaypointV2MissionTypes {

    public static final class WaypointV2HeadingMode
    extends Enum<WaypointV2HeadingMode> {
        public static final /* enum */ WaypointV2HeadingMode AUTO = new WaypointV2HeadingMode(0);
        public static final /* enum */ WaypointV2HeadingMode FIXED = new WaypointV2HeadingMode(1);
        public static final /* enum */ WaypointV2HeadingMode MANUAL = new WaypointV2HeadingMode(2);
        public static final /* enum */ WaypointV2HeadingMode WAYPOINT_CUSTOM = new WaypointV2HeadingMode(3);
        public static final /* enum */ WaypointV2HeadingMode TOWARD_POINT_OF_INTEREST = new WaypointV2HeadingMode(4);
        public static final /* enum */ WaypointV2HeadingMode GIMBAL_YAW_FOLLOW = new WaypointV2HeadingMode(5);
        public static final /* enum */ WaypointV2HeadingMode UNKNOWN = new WaypointV2HeadingMode(255);
        private int value;
        private static final /* synthetic */ WaypointV2HeadingMode[] $VALUES;

        public static WaypointV2HeadingMode[] values() {
            return null;
        }

        public static WaypointV2HeadingMode valueOf(String string) {
            return null;
        }

        private WaypointV2HeadingMode(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static WaypointV2HeadingMode find(int n) {
            return null;
        }

        private static /* synthetic */ WaypointV2HeadingMode[] $values() {
            return null;
        }

        static {
            $VALUES = WaypointV2HeadingMode.$values();
        }
    }

    public static final class WaypointV2TurnMode
    extends Enum<WaypointV2TurnMode> {
        public static final /* enum */ WaypointV2TurnMode CLOCKWISE = new WaypointV2TurnMode(0);
        public static final /* enum */ WaypointV2TurnMode COUNTER_CLOCKWISE = new WaypointV2TurnMode(1);
        public static final /* enum */ WaypointV2TurnMode UNKNOWN = new WaypointV2TurnMode(255);
        private int value;
        private static final /* synthetic */ WaypointV2TurnMode[] $VALUES;

        public static WaypointV2TurnMode[] values() {
            return null;
        }

        public static WaypointV2TurnMode valueOf(String string) {
            return null;
        }

        private WaypointV2TurnMode(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static WaypointV2TurnMode find(int n) {
            return null;
        }

        private static /* synthetic */ WaypointV2TurnMode[] $values() {
            return null;
        }

        static {
            $VALUES = WaypointV2TurnMode.$values();
        }
    }

    public static final class MissionGotoWaypointMode
    extends Enum<MissionGotoWaypointMode> {
        public static final /* enum */ MissionGotoWaypointMode SAFELY = new MissionGotoWaypointMode(0);
        public static final /* enum */ MissionGotoWaypointMode POINT_TO_POINT = new MissionGotoWaypointMode(1);
        private int value;
        private static final /* synthetic */ MissionGotoWaypointMode[] $VALUES;

        public static MissionGotoWaypointMode[] values() {
            return null;
        }

        public static MissionGotoWaypointMode valueOf(String string) {
            return null;
        }

        private MissionGotoWaypointMode(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static MissionGotoWaypointMode find(int n) {
            return null;
        }

        private static /* synthetic */ MissionGotoWaypointMode[] $values() {
            return null;
        }

        static {
            $VALUES = MissionGotoWaypointMode.$values();
        }
    }

    public static final class MissionFinishedAction
    extends Enum<MissionFinishedAction> {
        public static final /* enum */ MissionFinishedAction NO_ACTION = new MissionFinishedAction(0);
        public static final /* enum */ MissionFinishedAction GO_HOME = new MissionFinishedAction(1);
        public static final /* enum */ MissionFinishedAction AUTO_LAND = new MissionFinishedAction(2);
        public static final /* enum */ MissionFinishedAction GO_FIRST_WAYPOINT = new MissionFinishedAction(3);
        public static final /* enum */ MissionFinishedAction CONTINUE_UNTIL_STOP = new MissionFinishedAction(4);
        private int value;
        private static final /* synthetic */ MissionFinishedAction[] $VALUES;

        public static MissionFinishedAction[] values() {
            return null;
        }

        public static MissionFinishedAction valueOf(String string) {
            return null;
        }

        private MissionFinishedAction(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static MissionFinishedAction find(int n) {
            return null;
        }

        private static /* synthetic */ MissionFinishedAction[] $values() {
            return null;
        }

        static {
            $VALUES = MissionFinishedAction.$values();
        }
    }

    public static final class WaypointV2FlightPathMode
    extends Enum<WaypointV2FlightPathMode> {
        public static final /* enum */ WaypointV2FlightPathMode CURVATURE_CONTINUOUS_PASSED = new WaypointV2FlightPathMode(0);
        public static final /* enum */ WaypointV2FlightPathMode GOTO_POINT_CURVE_AND_STOP = new WaypointV2FlightPathMode(1);
        public static final /* enum */ WaypointV2FlightPathMode GOTO_POINT_STRAIGHT_LINE_AND_STOP = new WaypointV2FlightPathMode(2);
        public static final /* enum */ WaypointV2FlightPathMode COORDINATE_TURN = new WaypointV2FlightPathMode(3);
        public static final /* enum */ WaypointV2FlightPathMode GOTO_FIRST_POINT_ALONG_STRAIGHT_LINE = new WaypointV2FlightPathMode(4);
        public static final /* enum */ WaypointV2FlightPathMode STRAIGHT_OUT = new WaypointV2FlightPathMode(5);
        public static final /* enum */ WaypointV2FlightPathMode UNKNOWN = new WaypointV2FlightPathMode(255);
        private int value;
        private static final /* synthetic */ WaypointV2FlightPathMode[] $VALUES;

        public static WaypointV2FlightPathMode[] values() {
            return null;
        }

        public static WaypointV2FlightPathMode valueOf(String string) {
            return null;
        }

        private WaypointV2FlightPathMode(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static WaypointV2FlightPathMode find(int n) {
            return null;
        }

        private static /* synthetic */ WaypointV2FlightPathMode[] $values() {
            return null;
        }

        static {
            $VALUES = WaypointV2FlightPathMode.$values();
        }
    }
}

