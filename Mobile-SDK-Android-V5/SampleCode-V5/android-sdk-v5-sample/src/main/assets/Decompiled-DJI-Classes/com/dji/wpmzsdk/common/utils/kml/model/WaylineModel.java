/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.CollectionUtil;
import com.dji.wpmzsdk.common.utils.kml.DroneTypeUtils;
import com.dji.wpmzsdk.common.utils.kml.converter.PilotWaypointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.data.DroneInfoModel;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionGotoWaypointMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionModel;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostAction;
import java.util.List;
import java.util.Objects;

public class WaylineModel
implements Cloneable {
    private Long id;
    private float altitude;
    private float autoFlightSpeed;
    private WaypointMissionGotoWaypointMode gotoFirstPointMode;
    private WaypointMissionFinishedAction actionOnFinish;
    private WaypointMissionHeadingMode headingMode;
    private double poiLatitude;
    private double poiLongitude;
    private boolean gimbalPitchRotationEnable;
    private PilotWaypointTurnMode waypointTurnMode;
    private DroneInfoModel droneInfo;
    private boolean flightCali;
    private WaylineExitOnRCLostAction lostAction;
    private float secureTakeoffHeight;
    private List<WaypointActionModel> actions;

    public boolean isAdvanceWayLine() {
        return this.droneInfo != null && (DroneTypeUtils.isPM430OrPM431(this.droneInfo.getDroneType()) || DroneTypeUtils.isPM320(this.droneInfo.getDroneType()) || DroneTypeUtils.isWM265(this.droneInfo.getDroneType()));
    }

    public DroneInfoModel getDroneInfo() {
        return this.droneInfo;
    }

    public void setDroneInfo(DroneInfoModel droneInfo) {
        this.droneInfo = droneInfo;
    }

    public PilotWaypointTurnMode getWaypointTurnMode() {
        return this.waypointTurnMode;
    }

    public void setWaypointTurnMode(PilotWaypointTurnMode waypointTurnMode) {
        this.waypointTurnMode = waypointTurnMode;
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

    public float getAutoFlightSpeed() {
        return this.autoFlightSpeed;
    }

    public void setAutoFlightSpeed(float autoFlightSpeed) {
        this.autoFlightSpeed = autoFlightSpeed;
    }

    public WaypointMissionGotoWaypointMode getGotoFirstPointMode() {
        return this.gotoFirstPointMode;
    }

    public void setGotoFirstPointMode(WaypointMissionGotoWaypointMode gotoFirstPointMode) {
        this.gotoFirstPointMode = gotoFirstPointMode;
    }

    public WaypointMissionFinishedAction getActionOnFinish() {
        return this.actionOnFinish;
    }

    public void setActionOnFinish(WaypointMissionFinishedAction actionOnFinish) {
        this.actionOnFinish = actionOnFinish;
    }

    public WaypointMissionHeadingMode getHeadingMode() {
        return this.headingMode;
    }

    public void setHeadingMode(WaypointMissionHeadingMode headingMode) {
        this.headingMode = headingMode;
    }

    public double getPoiLatitude() {
        return this.poiLatitude;
    }

    public void setPoiLatitude(double poiLatitude) {
        this.poiLatitude = poiLatitude;
    }

    public double getPoiLongitude() {
        return this.poiLongitude;
    }

    public void setPoiLongitude(double poiLongitude) {
        this.poiLongitude = poiLongitude;
    }

    public boolean isGimbalPitchRotationEnable() {
        return this.gimbalPitchRotationEnable;
    }

    public void setGimbalPitchRotationEnable(boolean gimbalPitchRotationEnable) {
        this.gimbalPitchRotationEnable = gimbalPitchRotationEnable;
    }

    public boolean isFlightCali() {
        return this.flightCali;
    }

    public void setFlightCali(boolean flightCali) {
        this.flightCali = flightCali;
    }

    public WaylineExitOnRCLostAction getLostAction() {
        return this.lostAction;
    }

    public void setLostAction(WaylineExitOnRCLostAction lostAction) {
        this.lostAction = lostAction;
    }

    public float getSecureTakeoffHeight() {
        return this.secureTakeoffHeight;
    }

    public void setSecureTakeoffHeight(float secureTakeoffHeight) {
        this.secureTakeoffHeight = secureTakeoffHeight;
    }

    public List<WaypointActionModel> getActions() {
        return this.actions;
    }

    public void setActions(List<WaypointActionModel> actions) {
        this.actions = actions;
    }

    public WaylineModel clone() {
        WaylineModel model = null;
        try {
            model = (WaylineModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        if (this.droneInfo != null) {
            model.setDroneInfo(this.droneInfo.clone());
        }
        model.setActions(CollectionUtil.transform(this.actions, WaypointActionModel::clone));
        return model;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        WaylineModel that = (WaylineModel)o;
        return Float.compare(that.altitude, this.altitude) == 0 && Float.compare(that.autoFlightSpeed, this.autoFlightSpeed) == 0 && Double.compare(that.poiLatitude, this.poiLatitude) == 0 && Double.compare(that.poiLongitude, this.poiLongitude) == 0 && this.gimbalPitchRotationEnable == that.gimbalPitchRotationEnable && Objects.equals(this.id, that.id) && this.gotoFirstPointMode == that.gotoFirstPointMode && this.actionOnFinish == that.actionOnFinish && this.headingMode == that.headingMode && this.waypointTurnMode == that.waypointTurnMode && Objects.equals(this.actions, that.actions) && Objects.equals(this.droneInfo, that.droneInfo) && this.flightCali == that.flightCali && this.secureTakeoffHeight == that.secureTakeoffHeight;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, Float.valueOf(this.altitude), Float.valueOf(this.autoFlightSpeed), this.gotoFirstPointMode, this.actionOnFinish, this.headingMode, this.poiLatitude, this.poiLongitude, this.gimbalPitchRotationEnable, this.waypointTurnMode, this.droneInfo, this.flightCali, Float.valueOf(this.secureTakeoffHeight), this.actions});
    }
}

