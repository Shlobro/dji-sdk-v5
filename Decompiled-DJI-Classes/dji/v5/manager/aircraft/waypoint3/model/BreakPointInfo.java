/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.waypoint3.model;

import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.v5.manager.aircraft.waypoint3.model.RecoverActionType;

public class BreakPointInfo {
    private Integer waylineID;
    private Integer waypointID;
    private Double segmentPogress;
    private LocationCoordinate3D location;
    private RecoverActionType recoverActionType;

    public Integer getWaylineID() {
        return null;
    }

    public void setWaylineID(Integer n) {
    }

    public Integer getWaypointID() {
        return null;
    }

    public void setWaypointID(Integer n) {
    }

    public Double getSegmentProgress() {
        return null;
    }

    public void setSegmentProgress(Double d2) {
    }

    public RecoverActionType getRecoverActionType() {
        return null;
    }

    public void setRecoverActionType(RecoverActionType recoverActionType) {
    }

    public void setLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public LocationCoordinate3D getLocation() {
        return null;
    }

    public BreakPointInfo(Integer n, Integer n2, Double d2, LocationCoordinate3D locationCoordinate3D, RecoverActionType recoverActionType) {
    }

    public BreakPointInfo(Integer n, Integer n2, Double d2) {
    }

    public static class Builder {
        private Integer waylineID;
        private Integer waypointID;
        private Double segmentProgress;
        private RecoverActionType recoverActionType;
        private LocationCoordinate3D locationCoordinate3D;

        public Builder setWaylineID(Integer n) {
            return null;
        }

        public Builder setWaypointID(Integer n) {
            return null;
        }

        public Builder setSegmentProgress(Double d2) {
            return null;
        }

        public Builder setInterruptRecoverActionType(RecoverActionType recoverActionType) {
            return null;
        }

        public Builder setLocation(LocationCoordinate3D locationCoordinate3D) {
            return null;
        }

        public BreakPointInfo build() {
            return null;
        }
    }
}

