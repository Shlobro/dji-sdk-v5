/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

public class ActionTypes {

    public static final class CameraIntervalShotType
    extends Enum<CameraIntervalShotType> {
        public static final /* enum */ CameraIntervalShotType SINGLE = new CameraIntervalShotType(0);
        public static final /* enum */ CameraIntervalShotType MULTIPLE = new CameraIntervalShotType(1);
        public static final /* enum */ CameraIntervalShotType TIMELAPSE = new CameraIntervalShotType(2);
        public static final /* enum */ CameraIntervalShotType PANO = new CameraIntervalShotType(3);
        private int value;
        private static final CameraIntervalShotType[] values;
        private static final /* synthetic */ CameraIntervalShotType[] $VALUES;

        public static CameraIntervalShotType[] values() {
            return null;
        }

        public static CameraIntervalShotType valueOf(String string) {
            return null;
        }

        private CameraIntervalShotType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static CameraIntervalShotType find(int n) {
            return null;
        }

        private static /* synthetic */ CameraIntervalShotType[] $values() {
            return null;
        }

        static {
            $VALUES = CameraIntervalShotType.$values();
            values = CameraIntervalShotType.values();
        }
    }

    public static final class RecordPointCloudOperateType
    extends Enum<RecordPointCloudOperateType> {
        public static final /* enum */ RecordPointCloudOperateType STOP_RECORD_POINT_CLOUD = new RecordPointCloudOperateType(0);
        public static final /* enum */ RecordPointCloudOperateType START_RECORD_POINT_CLOUD = new RecordPointCloudOperateType(1);
        public static final /* enum */ RecordPointCloudOperateType PAUSE_RECORD_POINT_CLOUD = new RecordPointCloudOperateType(2);
        public static final /* enum */ RecordPointCloudOperateType RESUME_RECORD_POINT_CLOUD = new RecordPointCloudOperateType(3);
        private int value;
        private static final RecordPointCloudOperateType[] values;
        private static final /* synthetic */ RecordPointCloudOperateType[] $VALUES;

        public static RecordPointCloudOperateType[] values() {
            return null;
        }

        public static RecordPointCloudOperateType valueOf(String string) {
            return null;
        }

        private RecordPointCloudOperateType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static RecordPointCloudOperateType find(int n) {
            return null;
        }

        private static /* synthetic */ RecordPointCloudOperateType[] $values() {
            return null;
        }

        static {
            $VALUES = RecordPointCloudOperateType.$values();
            values = RecordPointCloudOperateType.values();
        }
    }

    public static final class DJISYSType
    extends Enum<DJISYSType> {
        public static final /* enum */ DJISYSType UNKNOWN = new DJISYSType(0);
        public static final /* enum */ DJISYSType RECORD_POINT_CLOUD = new DJISYSType(1);
        private int value;
        private static final DJISYSType[] values;
        private static final /* synthetic */ DJISYSType[] $VALUES;

        public static DJISYSType[] values() {
            return null;
        }

        public static DJISYSType valueOf(String string) {
            return null;
        }

        private DJISYSType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static DJISYSType find(int n) {
            return null;
        }

        private static /* synthetic */ DJISYSType[] $values() {
            return null;
        }

        static {
            $VALUES = DJISYSType.$values();
            values = DJISYSType.values();
        }
    }

    public static final class GimbalPathCycleMode
    extends Enum<GimbalPathCycleMode> {
        public static final /* enum */ GimbalPathCycleMode ONCE = new GimbalPathCycleMode(0);
        public static final /* enum */ GimbalPathCycleMode UNLIMITED = new GimbalPathCycleMode(1);
        private int value;
        private static final GimbalPathCycleMode[] values;
        private static final /* synthetic */ GimbalPathCycleMode[] $VALUES;

        public static GimbalPathCycleMode[] values() {
            return null;
        }

        public static GimbalPathCycleMode valueOf(String string) {
            return null;
        }

        private GimbalPathCycleMode(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static GimbalPathCycleMode find(int n) {
            return null;
        }

        private static /* synthetic */ GimbalPathCycleMode[] $values() {
            return null;
        }

        static {
            $VALUES = GimbalPathCycleMode.$values();
            values = GimbalPathCycleMode.values();
        }
    }

    public static final class CameraCustomNameType
    extends Enum<CameraCustomNameType> {
        public static final /* enum */ CameraCustomNameType UNKNOWN = new CameraCustomNameType(0);
        public static final /* enum */ CameraCustomNameType FILE = new CameraCustomNameType(1);
        public static final /* enum */ CameraCustomNameType DIR = new CameraCustomNameType(2);
        private int value;
        private static final CameraCustomNameType[] values;
        private static final /* synthetic */ CameraCustomNameType[] $VALUES;

        public static CameraCustomNameType[] values() {
            return null;
        }

        public static CameraCustomNameType valueOf(String string) {
            return null;
        }

        private CameraCustomNameType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static CameraCustomNameType find(int n) {
            return null;
        }

        private static /* synthetic */ CameraCustomNameType[] $values() {
            return null;
        }

        static {
            $VALUES = CameraCustomNameType.$values();
            values = CameraCustomNameType.values();
        }
    }

    public static final class NavigationType
    extends Enum<NavigationType> {
        public static final /* enum */ NavigationType UNKNOWN = new NavigationType(0);
        public static final /* enum */ NavigationType ACCURATE_SHOOT_PHOTO = new NavigationType(1);
        private int value;
        private static final /* synthetic */ NavigationType[] $VALUES;

        public static NavigationType[] values() {
            return null;
        }

        public static NavigationType valueOf(String string) {
            return null;
        }

        private NavigationType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static NavigationType find(int n) {
            return null;
        }

        private static /* synthetic */ NavigationType[] $values() {
            return null;
        }

        static {
            $VALUES = NavigationType.$values();
        }
    }

    public static final class FlightCalibrationType
    extends Enum<FlightCalibrationType> {
        public static final /* enum */ FlightCalibrationType UNKNOWN = new FlightCalibrationType(255);
        public static final /* enum */ FlightCalibrationType SpeedUpAndSlowDown = new FlightCalibrationType(0);
        private int value;
        private static final /* synthetic */ FlightCalibrationType[] $VALUES;

        public static FlightCalibrationType[] values() {
            return null;
        }

        public static FlightCalibrationType valueOf(String string) {
            return null;
        }

        private FlightCalibrationType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static FlightCalibrationType find(int n) {
            return null;
        }

        private static /* synthetic */ FlightCalibrationType[] $values() {
            return null;
        }

        static {
            $VALUES = FlightCalibrationType.$values();
        }
    }

    public static final class AircraftControlType
    extends Enum<AircraftControlType> {
        public static final /* enum */ AircraftControlType UNKNOWN = new AircraftControlType(0);
        public static final /* enum */ AircraftControlType ROTATE_YAW = new AircraftControlType(1);
        public static final /* enum */ AircraftControlType START_STOP_FLY = new AircraftControlType(2);
        public static final /* enum */ AircraftControlType FlightCalibration = new AircraftControlType(3);
        private int value;
        private static final /* synthetic */ AircraftControlType[] $VALUES;

        public static AircraftControlType[] values() {
            return null;
        }

        public static AircraftControlType valueOf(String string) {
            return null;
        }

        private AircraftControlType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static AircraftControlType find(int n) {
            return null;
        }

        private static /* synthetic */ AircraftControlType[] $values() {
            return null;
        }

        static {
            $VALUES = AircraftControlType.$values();
        }
    }

    public static final class CameraOperationType
    extends Enum<CameraOperationType> {
        public static final /* enum */ CameraOperationType SHOOT_SINGLE_PHOTO = new CameraOperationType(1);
        public static final /* enum */ CameraOperationType START_RECORD_VIDEO = new CameraOperationType(2);
        public static final /* enum */ CameraOperationType STOP_RECORD_VIDEO = new CameraOperationType(3);
        public static final /* enum */ CameraOperationType FOCUS = new CameraOperationType(4);
        public static final /* enum */ CameraOperationType ZOOM = new CameraOperationType(5);
        public static final /* enum */ CameraOperationType CUSTOM_NAME = new CameraOperationType(6);
        public static final /* enum */ CameraOperationType FOCUS_MODE = new CameraOperationType(7);
        public static final /* enum */ CameraOperationType START_INTERVAL_SHOT = new CameraOperationType(8);
        public static final /* enum */ CameraOperationType STOP_INTERVAL_SHOT = new CameraOperationType(9);
        public static final /* enum */ CameraOperationType UNKNOWN = new CameraOperationType(0);
        private int value;
        private static final /* synthetic */ CameraOperationType[] $VALUES;

        public static CameraOperationType[] values() {
            return null;
        }

        public static CameraOperationType valueOf(String string) {
            return null;
        }

        private CameraOperationType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static CameraOperationType find(int n) {
            return null;
        }

        private static /* synthetic */ CameraOperationType[] $values() {
            return null;
        }

        static {
            $VALUES = CameraOperationType.$values();
        }
    }

    public static final class GimbalOperationType
    extends Enum<GimbalOperationType> {
        public static final /* enum */ GimbalOperationType ROTATE_GIMBAL = new GimbalOperationType(1);
        public static final /* enum */ GimbalOperationType AIRCRAFT_CONTROL_GIMBAL = new GimbalOperationType(2);
        public static final /* enum */ GimbalOperationType START_GIMBAL_PATH_SHOOTING = new GimbalOperationType(3);
        public static final /* enum */ GimbalOperationType STOP_GIMBAL_PATH_SHOOTING = new GimbalOperationType(4);
        public static final /* enum */ GimbalOperationType UNKNOWN = new GimbalOperationType(0);
        private int value;
        private static final /* synthetic */ GimbalOperationType[] $VALUES;

        public static GimbalOperationType[] values() {
            return null;
        }

        public static GimbalOperationType valueOf(String string) {
            return null;
        }

        private GimbalOperationType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static GimbalOperationType find(int n) {
            return null;
        }

        private static /* synthetic */ GimbalOperationType[] $values() {
            return null;
        }

        static {
            $VALUES = GimbalOperationType.$values();
        }
    }

    public static final class ActionActuatorType
    extends Enum<ActionActuatorType> {
        public static final /* enum */ ActionActuatorType CAMERA = new ActionActuatorType(1);
        public static final /* enum */ ActionActuatorType GIMBAL = new ActionActuatorType(2);
        public static final /* enum */ ActionActuatorType SPRAY = new ActionActuatorType(3);
        public static final /* enum */ ActionActuatorType AIRCRAFT_CONTROL = new ActionActuatorType(4);
        public static final /* enum */ ActionActuatorType PLAYLOAD = new ActionActuatorType(5);
        public static final /* enum */ ActionActuatorType NAVIGATION = new ActionActuatorType(6);
        public static final /* enum */ ActionActuatorType DJISYS = new ActionActuatorType(7);
        public static final /* enum */ ActionActuatorType UNKNOWN = new ActionActuatorType(255);
        private int value;
        private static final /* synthetic */ ActionActuatorType[] $VALUES;

        public static ActionActuatorType[] values() {
            return null;
        }

        public static ActionActuatorType valueOf(String string) {
            return null;
        }

        private ActionActuatorType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static ActionActuatorType find(int n) {
            return null;
        }

        private static /* synthetic */ ActionActuatorType[] $values() {
            return null;
        }

        static {
            $VALUES = ActionActuatorType.$values();
        }
    }

    public static final class ActionTriggerType
    extends Enum<ActionTriggerType> {
        public static final /* enum */ ActionTriggerType COMPLEX_REACH_POINTS = new ActionTriggerType(1);
        public static final /* enum */ ActionTriggerType ASSOCIATE = new ActionTriggerType(2);
        public static final /* enum */ ActionTriggerType TRAJECTORY = new ActionTriggerType(3);
        public static final /* enum */ ActionTriggerType SIMPLE_INTERVAL = new ActionTriggerType(4);
        public static final /* enum */ ActionTriggerType REACH_POINT = new ActionTriggerType(5);
        public static final /* enum */ ActionTriggerType UNKNOWN = new ActionTriggerType(0);
        private int value;
        private static final /* synthetic */ ActionTriggerType[] $VALUES;

        public static ActionTriggerType[] values() {
            return null;
        }

        public static ActionTriggerType valueOf(String string) {
            return null;
        }

        private ActionTriggerType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static ActionTriggerType find(int n) {
            return null;
        }

        private static /* synthetic */ ActionTriggerType[] $values() {
            return null;
        }

        static {
            $VALUES = ActionTriggerType.$values();
        }
    }

    public static final class ActionIntervalType
    extends Enum<ActionIntervalType> {
        public static final /* enum */ ActionIntervalType TIME = new ActionIntervalType(1);
        public static final /* enum */ ActionIntervalType DISTANCE = new ActionIntervalType(2);
        public static final /* enum */ ActionIntervalType UNKNOWN = new ActionIntervalType(0);
        private int value;
        private static final /* synthetic */ ActionIntervalType[] $VALUES;

        public static ActionIntervalType[] values() {
            return null;
        }

        public static ActionIntervalType valueOf(String string) {
            return null;
        }

        private ActionIntervalType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static ActionIntervalType find(int n) {
            return null;
        }

        private static /* synthetic */ ActionIntervalType[] $values() {
            return null;
        }

        static {
            $VALUES = ActionIntervalType.$values();
        }
    }

    public static final class AssociatedTimingType
    extends Enum<AssociatedTimingType> {
        public static final /* enum */ AssociatedTimingType SIMULTANEOUSLY = new AssociatedTimingType(1);
        public static final /* enum */ AssociatedTimingType AFTER_FINISHED = new AssociatedTimingType(2);
        public static final /* enum */ AssociatedTimingType UNKNOWN = new AssociatedTimingType(0);
        private int value;
        private static final /* synthetic */ AssociatedTimingType[] $VALUES;

        public static AssociatedTimingType[] values() {
            return null;
        }

        public static AssociatedTimingType valueOf(String string) {
            return null;
        }

        private AssociatedTimingType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static AssociatedTimingType find(int n) {
            return null;
        }

        private static /* synthetic */ AssociatedTimingType[] $values() {
            return null;
        }

        static {
            $VALUES = AssociatedTimingType.$values();
        }
    }
}

