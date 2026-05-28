/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.model.LocationCoordinate3D;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraModel;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostAction;
import dji.sdk.wpmz.value.mission.WaylineMappingPitchMode;
import dji.sdk.wpmz.value.mission.WaylineMappingYawMode;
import java.util.List;

public class Mapping2DWaylineModel
implements Cloneable {
    private Long id;
    private int direction;
    private float altitude;
    private float wgs84Altitude;
    private float takeoffSpeed;
    private float speed;
    private float margin;
    private int overlapH;
    private int overlapW;
    private WaypointMissionFinishedAction actionOnFinish;
    private WaylineExitOnRCLostAction lostAction;
    private MappingCameraModel camera;
    private boolean elevationOptimize;
    private int photoMode;
    private int photoFormat;
    private int focusMode;
    private boolean enableDewarping;
    private boolean fiveWayPose;
    private int fiveWayPoseWithGimbalPitch;
    private int echoMode;
    private int sampleRate;
    private int scanMode;
    private boolean needVariegation;
    private boolean enableDsm;
    private float dsmAltitude;
    private List<String> dsmPath;
    private boolean realtimeSurfaceFollow;
    private int altitudeMode;
    private float relativeDistance;
    private boolean enableCalibrate;
    private LocationCoordinate3D takeOffPositionRef;
    private float secureTakeoffHeight;
    private boolean yawParamEnable = false;
    private WaylineMappingYawMode yawParamMode;
    private float yawParamAngle;
    private WaylineMappingPitchMode yawParamGimbalPitchMode;
    private float yawParamGimbalPitchAngle;
    private boolean mappingInclineClimbEnable;

    public int getFiveWayPoseWithGimbalPitch() {
        return this.fiveWayPoseWithGimbalPitch;
    }

    public void setFiveWayPoseWithGimbalPitch(int fiveWayPoseWithGimbalPitch) {
        this.fiveWayPoseWithGimbalPitch = fiveWayPoseWithGimbalPitch;
    }

    public boolean isFiveWayPose() {
        return this.fiveWayPose;
    }

    public void setFiveWayPose(boolean fiveWayPose) {
        this.fiveWayPose = fiveWayPose;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDirection() {
        return this.direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public float getAltitude() {
        return this.altitude;
    }

    public void setAltitude(float alt) {
        this.altitude = alt;
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

    public float getMargin() {
        return this.margin;
    }

    public void setMargin(float margin) {
        this.margin = margin;
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

    public MappingCameraModel getCamera() {
        return this.camera;
    }

    public void setCamera(MappingCameraModel camera) {
        this.camera = camera;
    }

    public boolean isElevationOptimize() {
        return this.elevationOptimize;
    }

    public void setElevationOptimize(boolean elevationOptimize) {
        this.elevationOptimize = elevationOptimize;
    }

    public int getPhotoMode() {
        return this.photoMode;
    }

    public void setPhotoMode(int photoMode) {
        this.photoMode = photoMode;
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

    public boolean isEnableDsm() {
        return this.enableDsm;
    }

    public void setEnableDsm(boolean enableDsm) {
        this.enableDsm = enableDsm;
    }

    public float getDsmAltitude() {
        return this.dsmAltitude;
    }

    public void setDsmAltitude(float dsmAltitude) {
        this.dsmAltitude = dsmAltitude;
    }

    public List<String> getDsmPath() {
        return this.dsmPath;
    }

    public void setDsmPath(List<String> dsmPath) {
        this.dsmPath = dsmPath;
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

    public void setRelativeDistance(float distance) {
        this.relativeDistance = distance;
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

    public LocationCoordinate3D getTakeOffPositionRef() {
        return this.takeOffPositionRef;
    }

    public void setTakeOffPositionRef(LocationCoordinate3D takeOffPositionRef) {
        this.takeOffPositionRef = takeOffPositionRef;
    }

    public boolean isRealtimeSurfaceFollow() {
        return this.realtimeSurfaceFollow;
    }

    public void setRealtimeSurfaceFollow(boolean realtimeSurfaceFollow) {
        this.realtimeSurfaceFollow = realtimeSurfaceFollow;
    }

    public float getSecureTakeoffHeight() {
        return this.secureTakeoffHeight;
    }

    public void setSecureTakeoffHeight(float secureTakeoffHeight) {
        this.secureTakeoffHeight = secureTakeoffHeight;
    }

    public boolean isYawParamEnable() {
        return this.yawParamEnable;
    }

    public void setYawParamEnable(boolean yawParamEnable) {
        this.yawParamEnable = yawParamEnable;
    }

    public WaylineMappingYawMode getYawParamMode() {
        return this.yawParamMode;
    }

    public void setYawParamMode(WaylineMappingYawMode yawParamMode) {
        this.yawParamMode = yawParamMode;
    }

    public float getYawParamAngle() {
        return this.yawParamAngle;
    }

    public void setYawParamAngle(float yawParamAngle) {
        this.yawParamAngle = yawParamAngle;
    }

    public WaylineMappingPitchMode getYawParamGimbalPitchMode() {
        return this.yawParamGimbalPitchMode;
    }

    public void setYawParamGimbalPitchMode(WaylineMappingPitchMode yawParamGimbalPitchMode) {
        this.yawParamGimbalPitchMode = yawParamGimbalPitchMode;
    }

    public float getYawParamGimbalPitchAngle() {
        return this.yawParamGimbalPitchAngle;
    }

    public void setYawParamGimbalPitchAngle(float yawParamGimbalPitchAngle) {
        this.yawParamGimbalPitchAngle = yawParamGimbalPitchAngle;
    }

    public boolean isMappingInclineClimbEnable() {
        return this.mappingInclineClimbEnable;
    }

    public void setMappingInclineClimbEnable(boolean mappingInclineClimbEnable) {
        this.mappingInclineClimbEnable = mappingInclineClimbEnable;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Mapping2DWaylineModel model = (Mapping2DWaylineModel)o;
        if (this.direction != model.direction) {
            return false;
        }
        if (this.altitude != model.altitude) {
            return false;
        }
        if (Float.compare(model.speed, this.speed) != 0) {
            return false;
        }
        if (Float.compare(model.takeoffSpeed, this.takeoffSpeed) != 0) {
            return false;
        }
        if (Float.compare(model.margin, this.margin) != 0) {
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
        if (this.elevationOptimize != model.elevationOptimize) {
            return false;
        }
        if (this.fiveWayPose != model.fiveWayPose) {
            return false;
        }
        if (this.photoMode != model.photoMode) {
            return false;
        }
        if (this.photoFormat != model.photoFormat) {
            return false;
        }
        if (this.focusMode != model.focusMode) {
            return false;
        }
        if (this.enableDewarping != model.enableDewarping) {
            return false;
        }
        if (this.enableDsm != model.enableDsm) {
            return false;
        }
        if (this.camera != null ? !this.camera.equals(model.camera) : model.camera != null) {
            return false;
        }
        if (this.dsmAltitude != model.dsmAltitude) {
            return false;
        }
        if (this.fiveWayPoseWithGimbalPitch != model.fiveWayPoseWithGimbalPitch) {
            return false;
        }
        if (this.altitudeMode != model.altitudeMode) {
            return false;
        }
        if (this.relativeDistance != model.relativeDistance) {
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
        if (this.mappingInclineClimbEnable != model.mappingInclineClimbEnable) {
            return false;
        }
        if (Float.compare(model.secureTakeoffHeight, this.secureTakeoffHeight) != 0) {
            return false;
        }
        return this.dsmPath != null ? this.dsmPath.equals(model.dsmPath) : model.dsmPath == null;
    }

    public int hashCode() {
        int result = this.id != null ? this.id.hashCode() : 0;
        result = 31 * result + this.direction;
        result = 31 * result + (this.altitude != 0.0f ? Float.floatToIntBits(this.altitude) : 0);
        result = 31 * result + (this.speed != 0.0f ? Float.floatToIntBits(this.speed) : 0);
        result = 31 * result + (this.takeoffSpeed != 0.0f ? Float.floatToIntBits(this.takeoffSpeed) : 0);
        result = 31 * result + (this.margin != 0.0f ? Float.floatToIntBits(this.margin) : 0);
        result = 31 * result + this.overlapH;
        result = 31 * result + this.overlapW;
        result = 31 * result + (this.actionOnFinish != null ? this.actionOnFinish.hashCode() : 0);
        result = 31 * result + (this.camera != null ? this.camera.hashCode() : 0);
        result = 31 * result + (this.elevationOptimize ? 1 : 0);
        result = 31 * result + this.photoMode;
        result = 31 * result + this.photoFormat;
        result = 31 * result + this.focusMode;
        result = 31 * result + (this.enableDewarping ? 1 : 0);
        result = 31 * result + (this.fiveWayPose ? 1 : 0);
        result = 31 * result + (this.enableDsm ? 1 : 0);
        result = 31 * result + (this.dsmPath != null ? this.dsmPath.hashCode() : 0);
        result = 31 * result + (this.dsmAltitude != 0.0f ? Float.floatToIntBits(this.dsmAltitude) : 0);
        result = 31 * result + this.fiveWayPoseWithGimbalPitch;
        result = 31 * result + this.altitudeMode;
        result = 31 * result + (this.relativeDistance != 0.0f ? Float.floatToIntBits(this.relativeDistance) : 0);
        result = 31 * result + this.echoMode;
        result = 31 * result + this.sampleRate;
        result = 31 * result + this.scanMode;
        result = 31 * result + (this.needVariegation ? 1 : 0);
        result = 31 * result + (this.enableCalibrate ? 1 : 0);
        result = 31 * result + (this.mappingInclineClimbEnable ? 1 : 0);
        result = 31 * result + (this.secureTakeoffHeight != 0.0f ? Float.floatToIntBits(this.secureTakeoffHeight) : 0);
        return result;
    }

    public Mapping2DWaylineModel clone() {
        Mapping2DWaylineModel model;
        try {
            model = (Mapping2DWaylineModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        if (this.camera != null) {
            model.setCamera(this.camera.clone());
        }
        if (this.dsmPath != null) {
            model.setDsmPath(this.dsmPath);
        }
        return model;
    }
}

