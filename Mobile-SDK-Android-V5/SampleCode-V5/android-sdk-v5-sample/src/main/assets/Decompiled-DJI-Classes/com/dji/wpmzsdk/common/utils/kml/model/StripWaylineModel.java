/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraModel;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostAction;
import java.util.List;

public class StripWaylineModel
implements Cloneable {
    private Long id;
    private float altitude;
    private float wgs84Altitude;
    private float takeoffSpeed;
    private float speed;
    private int overlapH;
    private int overlapW;
    private WaypointMissionFinishedAction actionOnFinish;
    private MissionType type;
    private MappingCameraModel camera;
    private int photoMode;
    private float cutLength;
    private float leftExtend;
    private float rightExtend;
    private boolean hasCenterLine;
    private String startPoints;
    private int photoFormat;
    private boolean enableDewarping;
    private boolean enableSingleLine;
    private int altitudeMode;
    private float relativeDistance;
    private int focusMode;
    private int planMode;
    private int echoMode;
    private int sampleRate;
    private int scanMode;
    private boolean needVariegation;
    private boolean enableCalibrate;
    private WaylineExitOnRCLostAction lostAction;
    private float stripSecureTakeoffHeight;
    private boolean stripEnableDsm;
    private float stripDsmAltitude;
    private List<String> stripDsmPath;
    private boolean stripRealtimeSurfaceFollow;
    private boolean stripInclineClimbEnable;

    public String getStartPoints() {
        return this.startPoints;
    }

    public void setStartPoints(String startPoints) {
        this.startPoints = startPoints;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getAltitude() {
        return this.altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getTakeoffSpeed() {
        return this.takeoffSpeed;
    }

    public void setTakeoffSpeed(float takeoffSpeed) {
        this.takeoffSpeed = takeoffSpeed;
    }

    public int getOverlapH() {
        return this.overlapH;
    }

    public void setOverlapH(int overlapH) {
        this.overlapH = overlapH;
    }

    public int getOverlapW() {
        return this.overlapW;
    }

    public void setOverlapW(int overlapW) {
        this.overlapW = overlapW;
    }

    public WaypointMissionFinishedAction getActionOnFinish() {
        return this.actionOnFinish;
    }

    public void setActionOnFinish(WaypointMissionFinishedAction actionOnFinish) {
        this.actionOnFinish = actionOnFinish;
    }

    public MissionType getType() {
        return this.type;
    }

    public void setType(MissionType type) {
        this.type = type;
    }

    public MappingCameraModel getCamera() {
        return this.camera;
    }

    public void setCamera(MappingCameraModel camera) {
        this.camera = camera;
    }

    public int getPhotoMode() {
        return this.photoMode;
    }

    public void setPhotoMode(int photoMode) {
        this.photoMode = photoMode;
    }

    public float getCutLength() {
        return this.cutLength;
    }

    public void setCutLength(float cutLength) {
        this.cutLength = cutLength;
    }

    public float getLeftExtend() {
        return this.leftExtend;
    }

    public void setLeftExtend(float leftExtend) {
        this.leftExtend = leftExtend;
    }

    public float getRightExtend() {
        return this.rightExtend;
    }

    public void setRightExtend(float rightExtend) {
        this.rightExtend = rightExtend;
    }

    public int getPlanMode() {
        return this.planMode;
    }

    public void setPlanMode(int planMode) {
        this.planMode = planMode;
    }

    public boolean isHasCenterLine() {
        return this.hasCenterLine;
    }

    public void setHasCenterLine(boolean hasCenterLine) {
        this.hasCenterLine = hasCenterLine;
    }

    public int getPhotoFormat() {
        return this.photoFormat;
    }

    public void setPhotoFormat(int photoFormat) {
        this.photoFormat = photoFormat;
    }

    public boolean isEnableDewarping() {
        return this.enableDewarping;
    }

    public void setEnableDewarping(boolean enableDewarping) {
        this.enableDewarping = enableDewarping;
    }

    public boolean isEnableSingleLine() {
        return this.enableSingleLine;
    }

    public void setEnableSingleLine(boolean enableSingleLine) {
        this.enableSingleLine = enableSingleLine;
    }

    public int getAltitudeMode() {
        return this.altitudeMode;
    }

    public void setAltitudeMode(int altitudeMode) {
        this.altitudeMode = altitudeMode;
    }

    public float getRelativeDistance() {
        return this.relativeDistance;
    }

    public void setRelativeDistance(float relativeDistance) {
        this.relativeDistance = relativeDistance;
    }

    public int getFocusMode() {
        return this.focusMode;
    }

    public void setFocusMode(int focusMode) {
        this.focusMode = focusMode;
    }

    public int getEchoMode() {
        return this.echoMode;
    }

    public void setEchoMode(int echoMode) {
        this.echoMode = echoMode;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public void setSampleRate(int sampleRate) {
        this.sampleRate = sampleRate;
    }

    public int getScanMode() {
        return this.scanMode;
    }

    public void setScanMode(int scanMode) {
        this.scanMode = scanMode;
    }

    public boolean isNeedVariegation() {
        return this.needVariegation;
    }

    public void setNeedVariegation(boolean needVariegation) {
        this.needVariegation = needVariegation;
    }

    public boolean isEnableCalibrate() {
        return this.enableCalibrate;
    }

    public void setEnableCalibrate(boolean enableCalibrate) {
        this.enableCalibrate = enableCalibrate;
    }

    public WaylineExitOnRCLostAction getLostAction() {
        return this.lostAction;
    }

    public void setLostAction(WaylineExitOnRCLostAction lostAction) {
        this.lostAction = lostAction;
    }

    public float getWgs84Altitude() {
        return this.wgs84Altitude;
    }

    public void setWgs84Altitude(float wgs84Altitude) {
        this.wgs84Altitude = wgs84Altitude;
    }

    public float getStripSecureTakeoffHeight() {
        return this.stripSecureTakeoffHeight;
    }

    public void setStripSecureTakeoffHeight(float stripSecureTakeoffHeight) {
        this.stripSecureTakeoffHeight = stripSecureTakeoffHeight;
    }

    public boolean isStripEnableDsm() {
        return this.stripEnableDsm;
    }

    public void setStripEnableDsm(boolean stripEnableDsm) {
        this.stripEnableDsm = stripEnableDsm;
    }

    public float getStripDsmAltitude() {
        return this.stripDsmAltitude;
    }

    public void setStripDsmAltitude(float stripDsmAltitude) {
        this.stripDsmAltitude = stripDsmAltitude;
    }

    public List<String> getStripDsmPath() {
        return this.stripDsmPath;
    }

    public void setStripDsmPath(List<String> stripDsmPath) {
        this.stripDsmPath = stripDsmPath;
    }

    public boolean isStripRealtimeSurfaceFollow() {
        return this.stripRealtimeSurfaceFollow;
    }

    public void setStripRealtimeSurfaceFollow(boolean stripRealtimeSurfaceFollow) {
        this.stripRealtimeSurfaceFollow = stripRealtimeSurfaceFollow;
    }

    public boolean isStripInclineClimbEnable() {
        return this.stripInclineClimbEnable;
    }

    public void setStripInclineClimbEnable(boolean stripInclineClimbEnable) {
        this.stripInclineClimbEnable = stripInclineClimbEnable;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        StripWaylineModel model = (StripWaylineModel)o;
        if (this.altitude != model.altitude) {
            return false;
        }
        if (Float.compare(model.speed, this.speed) != 0) {
            return false;
        }
        if (Float.compare(model.takeoffSpeed, this.takeoffSpeed) != 0) {
            return false;
        }
        if (this.overlapH != model.overlapH) {
            return false;
        }
        if (this.overlapW != model.overlapW) {
            return false;
        }
        if (this.id != null ? !this.id.equals(model.id) : model.id != null) {
            return false;
        }
        if (this.actionOnFinish != model.actionOnFinish) {
            return false;
        }
        if (this.type != model.type) {
            return false;
        }
        if (this.photoMode != model.photoMode) {
            return false;
        }
        if (this.cutLength != model.cutLength) {
            return false;
        }
        if (this.leftExtend != model.leftExtend) {
            return false;
        }
        if (this.rightExtend != model.rightExtend) {
            return false;
        }
        if (this.planMode != model.planMode) {
            return false;
        }
        if (this.hasCenterLine != model.hasCenterLine) {
            return false;
        }
        if (this.startPoints == null && model.startPoints != null) {
            return false;
        }
        if (this.startPoints != null && !this.startPoints.equals(model.startPoints)) {
            return false;
        }
        if (this.photoFormat != model.photoFormat) {
            return false;
        }
        if (this.enableDewarping != model.enableDewarping) {
            return false;
        }
        if (this.enableSingleLine != model.enableSingleLine) {
            return false;
        }
        if (this.altitudeMode != model.altitudeMode) {
            return false;
        }
        if (this.relativeDistance != model.relativeDistance) {
            return false;
        }
        if (this.focusMode != model.focusMode) {
            return false;
        }
        if (this.echoMode != model.echoMode) {
            return false;
        }
        if (this.sampleRate != model.sampleRate) {
            return false;
        }
        if (this.scanMode != model.scanMode) {
            return false;
        }
        if (this.needVariegation != model.needVariegation) {
            return false;
        }
        if (this.enableCalibrate != model.enableCalibrate) {
            return false;
        }
        if (this.stripInclineClimbEnable != model.stripInclineClimbEnable) {
            return false;
        }
        if (Float.compare(model.stripSecureTakeoffHeight, this.stripSecureTakeoffHeight) != 0) {
            return false;
        }
        return this.camera != null ? this.camera.equals(model.camera) : model.camera == null;
    }

    public int hashCode() {
        int result = this.id != null ? this.id.hashCode() : 0;
        result = 31 * result + (this.altitude != 0.0f ? Float.floatToIntBits(this.altitude) : 0);
        result = 31 * result + (this.speed != 0.0f ? Float.floatToIntBits(this.speed) : 0);
        result = 31 * result + (this.takeoffSpeed != 0.0f ? Float.floatToIntBits(this.takeoffSpeed) : 0);
        result = 31 * result + this.overlapH;
        result = 31 * result + this.overlapW;
        result = 31 * result + (this.actionOnFinish != null ? this.actionOnFinish.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        result = 31 * result + (this.camera != null ? this.camera.hashCode() : 0);
        result = 31 * result + this.photoMode;
        result = 31 * result + (this.cutLength != 0.0f ? Float.floatToIntBits(this.cutLength) : 0);
        result = 31 * result + (this.leftExtend != 0.0f ? Float.floatToIntBits(this.leftExtend) : 0);
        result = 31 * result + (this.rightExtend != 0.0f ? Float.floatToIntBits(this.rightExtend) : 0);
        result = 31 * result + this.planMode;
        result = 31 * result + (this.hasCenterLine ? 1 : 0);
        result = 31 * result + (this.startPoints != null ? this.startPoints.hashCode() : 0);
        result = 31 * result + this.photoFormat;
        result = 31 * result + (this.enableDewarping ? 1 : 0);
        result = 31 * result + (this.enableSingleLine ? 1 : 0);
        result = 31 * result + this.altitudeMode;
        result = 31 * result + (this.relativeDistance != 0.0f ? Float.floatToIntBits(this.relativeDistance) : 0);
        result = 31 * result + this.focusMode;
        result = 31 * result + this.echoMode;
        result = 31 * result + this.sampleRate;
        result = 31 * result + this.scanMode;
        result = 31 * result + (this.needVariegation ? 1 : 0);
        result = 31 * result + (this.enableCalibrate ? 1 : 0);
        result = 31 * result + (this.stripInclineClimbEnable ? 1 : 0);
        result = 31 * result + (this.stripSecureTakeoffHeight != 0.0f ? Float.floatToIntBits(this.stripSecureTakeoffHeight) : 0);
        return result;
    }

    public StripWaylineModel clone() {
        StripWaylineModel model;
        try {
            model = (StripWaylineModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        if (this.camera != null) {
            model.setCamera(this.camera.clone());
        }
        if (this.startPoints != null) {
            model.setStartPoints(this.startPoints);
        }
        return model;
    }
}

