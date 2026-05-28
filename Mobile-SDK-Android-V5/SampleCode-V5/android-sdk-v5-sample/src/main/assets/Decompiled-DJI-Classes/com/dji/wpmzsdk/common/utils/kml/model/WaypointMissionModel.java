/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.CollectionUtil;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaylineModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointModel;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import java.util.List;
import java.util.Objects;

public class WaypointMissionModel
implements Cloneable {
    private Long id;
    private MissionInfoModel missionInfo;
    private WaylineModel wayline;
    private List<WaypointModel> waypoints;
    private MissionTransformData transformData;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MissionInfoModel getMissionInfo() {
        return this.missionInfo;
    }

    public void setMissionInfo(MissionInfoModel missionInfo) {
        this.missionInfo = missionInfo;
    }

    public WaylineModel getWayline() {
        return this.wayline;
    }

    public void setWayline(WaylineModel wayline) {
        this.wayline = wayline;
    }

    public List<WaypointModel> getWaypoints() {
        return this.waypoints;
    }

    public void setWaypoints(List<WaypointModel> waypoints) {
        this.waypoints = waypoints;
    }

    public MissionTransformData getTransformData() {
        return this.transformData;
    }

    public void setTransformData(MissionTransformData transformData) {
        this.transformData = transformData;
    }

    public WaypointMissionModel clone() {
        WaypointMissionModel model;
        try {
            model = (WaypointMissionModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        if (this.wayline != null) {
            model.setWayline(this.wayline.clone());
        }
        if (this.missionInfo != null) {
            model.setMissionInfo(this.missionInfo.clone());
        }
        model.setWaypoints(CollectionUtil.transform(this.waypoints, WaypointModel::clone));
        return model;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        WaypointMissionModel that = (WaypointMissionModel)o;
        return Objects.equals(this.id, that.id) && Objects.equals(this.missionInfo, that.missionInfo) && Objects.equals(this.wayline, that.wayline) && Objects.equals(this.waypoints, that.waypoints);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.missionInfo, this.wayline, this.waypoints);
    }
}

