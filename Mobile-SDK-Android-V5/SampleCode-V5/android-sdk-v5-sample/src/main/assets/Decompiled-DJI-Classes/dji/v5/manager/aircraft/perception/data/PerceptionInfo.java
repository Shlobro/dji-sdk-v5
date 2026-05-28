/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.perception.data;

import dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType;
import dji.v5.utils.common.LogUtils;

public class PerceptionInfo {
    public static final String TAG = LogUtils.getTag("PerceptionInfo");
    private ObstacleAvoidanceType obstacleAvoidanceType;
    private boolean isOverallObstacleAvoidanceEnabled;
    private boolean isUpwardObstacleAvoidanceEnabled;
    private boolean isDownwardObstacleAvoidanceEnabled;
    private boolean isHorizontalObstacleAvoidanceEnabled;
    private boolean isVisionPositioningEnabled;
    private boolean isPrecisionLandingEnabled;
    private double horizontalObstacleAvoidanceWarningDistance;
    private double downwardObstacleAvoidanceWarningDistance;
    private double upwardObstacleAvoidanceWarningDistance;
    private double horizontalObstacleAvoidanceBrakingDistance;
    private double downwardObstacleAvoidanceBrakingDistance;
    private double upwardObstacleAvoidanceBrakingDistance;
    private Boolean isUpwardObstacleAvoidanceWorking;
    private Boolean isLeftSideObstacleAvoidanceWorking;
    private Boolean isRightSideObstacleAvoidanceWorking;
    private Boolean isBackwardObstacleAvoidanceWorking;
    private Boolean isForwardObstacleAvoidanceWorking;
    private Boolean isDownwardObstacleAvoidanceWorking;

    public Boolean getUpwardObstacleAvoidanceWorking() {
        return null;
    }

    public Boolean getLeftSideObstacleAvoidanceWorking() {
        return null;
    }

    public Boolean getRightSideObstacleAvoidanceWorking() {
        return null;
    }

    public Boolean getBackwardObstacleAvoidanceWorking() {
        return null;
    }

    public Boolean getForwardObstacleAvoidanceWorking() {
        return null;
    }

    public Boolean getDownwardObstacleAvoidanceWorking() {
        return null;
    }

    @Deprecated
    public boolean isOverallObstacleAvoidanceEnabled() {
        return false;
    }

    public boolean isUpwardObstacleAvoidanceEnabled() {
        return false;
    }

    public boolean isDownwardObstacleAvoidanceEnabled() {
        return false;
    }

    public boolean isHorizontalObstacleAvoidanceEnabled() {
        return false;
    }

    public double getHorizontalObstacleAvoidanceWarningDistance() {
        return 0.0;
    }

    public double getDownwardObstacleAvoidanceWarningDistance() {
        return 0.0;
    }

    public double getUpwardObstacleAvoidanceWarningDistance() {
        return 0.0;
    }

    public double getHorizontalObstacleAvoidanceBrakingDistance() {
        return 0.0;
    }

    public double getDownwardObstacleAvoidanceBrakingDistance() {
        return 0.0;
    }

    public double getUpwardObstacleAvoidanceBrakingDistance() {
        return 0.0;
    }

    public boolean isVisionPositioningEnabled() {
        return false;
    }

    public boolean isPrecisionLandingEnabled() {
        return false;
    }

    public ObstacleAvoidanceType getObstacleAvoidanceType() {
        return null;
    }

    public String toString() {
        return null;
    }
}

