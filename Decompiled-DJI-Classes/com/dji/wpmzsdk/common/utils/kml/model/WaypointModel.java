/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.CollectionUtil;
import com.dji.wpmzsdk.common.utils.kml.converter.PilotWaypointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.converter.PilotWaypointTurnModeKt;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointV2MissionTypes;
import com.dji.wpmzsdk.common.utils.kml.model.PointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionModel;
import java.util.List;
import java.util.Objects;

public class WaypointModel
implements Cloneable {
    private Long id;
    private double latitude;
    private double longitude;
    private float altitude;
    private float wgs84Altitude;
    private int heading;
    private float cornerRadius;
    private float speed;
    private float gimbalPitch;
    private PointTurnMode turnMode;
    private List<WaypointActionModel> actions;
    private int index;
    private boolean useWaylineAltitude = true;
    private boolean useWaylineSpeed = true;
    private boolean useWaylineHeadMode;
    private boolean useWaylinePointType;
    private boolean useWaylineAction = false;
    @Deprecated
    private WaypointV2MissionTypes.WaypointV2FlightPathMode waypointType;
    private PilotWaypointTurnMode waypointTurnMode;
    private WaypointMissionHeadingMode headingMode;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public float getAltitude() {
        return this.altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public void setUseWaylineAltitude(boolean useWaylineAltitude) {
        this.useWaylineAltitude = useWaylineAltitude;
    }

    public int getHeading() {
        return this.heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void setCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getGimbalPitch() {
        return this.gimbalPitch;
    }

    public void setGimbalPitch(float gimbalPitch) {
        this.gimbalPitch = gimbalPitch;
    }

    public PointTurnMode getTurnMode() {
        return this.turnMode;
    }

    public void setTurnMode(PointTurnMode turnMode) {
        this.turnMode = turnMode;
    }

    public List<WaypointActionModel> getActions() {
        return this.actions;
    }

    public void setActions(List<WaypointActionModel> actions) {
        this.actions = actions;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isUseWaylineSpeed() {
        return this.useWaylineSpeed;
    }

    public void setUseWaylineSpeed(boolean useWaylineSpeed) {
        this.useWaylineSpeed = useWaylineSpeed;
    }

    public boolean isUseWaylineHeadMode() {
        return this.useWaylineHeadMode;
    }

    public void setUseWaylineHeadMode(boolean useWaylineHeadMode) {
        this.useWaylineHeadMode = useWaylineHeadMode;
    }

    public WaypointMissionHeadingMode getHeadingMode() {
        return this.headingMode;
    }

    public void setHeadingMode(WaypointMissionHeadingMode headingMode) {
        this.headingMode = headingMode;
    }

    public boolean isUseWaylinePointType() {
        return this.useWaylinePointType;
    }

    public void setUseWaylinePointType(boolean useWaylinePointType) {
        this.useWaylinePointType = useWaylinePointType;
    }

    public boolean isUseWaylineAction() {
        return this.useWaylineAction;
    }

    public void setUseWaylineAction(boolean useWaylineAction) {
        this.useWaylineAction = useWaylineAction;
    }

    public void setWaypointType(WaypointV2MissionTypes.WaypointV2FlightPathMode waypointType) {
        this.waypointType = waypointType;
        if (waypointType != null) {
            this.waypointTurnMode = PilotWaypointTurnModeKt.convert(waypointType);
        }
    }

    public PilotWaypointTurnMode getWaypointTurnMode() {
        return this.waypointTurnMode;
    }

    public void setWaypointTurnMode(PilotWaypointTurnMode waypointTurnMode) {
        this.waypointTurnMode = waypointTurnMode;
    }

    public float getWgs84Altitude() {
        return this.wgs84Altitude;
    }

    public void setWgs84Altitude(float wgs84Altitude) {
        this.wgs84Altitude = wgs84Altitude;
    }

    public boolean isUseWaylineAltitude() {
        return this.useWaylineAltitude;
    }

    public boolean hasPreciseShotAction() {
        if (this.actions == null || this.actions.isEmpty()) {
            return false;
        }
        for (WaypointActionModel actionItem : this.actions) {
            if (!actionItem.isPreciseShotAction()) continue;
            return true;
        }
        return false;
    }

    public WaypointModel clone() {
        WaypointModel model;
        try {
            model = (WaypointModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
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
        WaypointModel that = (WaypointModel)o;
        return Double.compare(that.latitude, this.latitude) == 0 && Double.compare(that.longitude, this.longitude) == 0 && Float.compare(that.altitude, this.altitude) == 0 && this.heading == that.heading && Float.compare(that.cornerRadius, this.cornerRadius) == 0 && Float.compare(that.speed, this.speed) == 0 && Float.compare(that.gimbalPitch, this.gimbalPitch) == 0 && this.index == that.index && this.useWaylineAltitude == that.useWaylineAltitude && this.useWaylineSpeed == that.useWaylineSpeed && this.useWaylineHeadMode == that.useWaylineHeadMode && this.useWaylinePointType == that.useWaylinePointType && Objects.equals(this.id, that.id) && this.turnMode == that.turnMode && Objects.equals(this.actions, that.actions) && this.waypointTurnMode == that.waypointTurnMode && this.useWaylineAction == that.useWaylineAction && this.headingMode == that.headingMode;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.latitude, this.longitude, Float.valueOf(this.altitude), this.heading, Float.valueOf(this.cornerRadius), Float.valueOf(this.speed), Float.valueOf(this.gimbalPitch), this.turnMode, this.actions, this.index, this.useWaylineAltitude, this.useWaylineSpeed, this.useWaylineHeadMode, this.useWaylinePointType, this.waypointTurnMode, this.headingMode, this.useWaylineAction});
    }
}

