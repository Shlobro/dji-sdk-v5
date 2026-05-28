/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.CollectionUtil;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.StripEdgePointModel;
import com.dji.wpmzsdk.common.utils.kml.model.StripWaylineModel;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import java.util.List;

public class StripMissionModel
implements Cloneable {
    private Long id;
    private MissionInfoModel missionInfo;
    private StripWaylineModel stripWayline;
    private List<StripEdgePointModel> edgePoints;
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

    public StripWaylineModel getStripWayline() {
        return this.stripWayline;
    }

    public void setStripWayline(StripWaylineModel stripWayline) {
        this.stripWayline = stripWayline;
    }

    public List<StripEdgePointModel> getEdgePoints() {
        return this.edgePoints;
    }

    public void setEdgePoints(List<StripEdgePointModel> edgePoints) {
        this.edgePoints = edgePoints;
    }

    public MissionTransformData getTransformData() {
        return this.transformData;
    }

    public void setTransformData(MissionTransformData transformData) {
        this.transformData = transformData;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        StripMissionModel that = (StripMissionModel)o;
        if (this.id != null ? !this.id.equals(that.id) : that.id != null) {
            return false;
        }
        if (this.missionInfo != null ? !this.missionInfo.equals(that.missionInfo) : that.missionInfo != null) {
            return false;
        }
        if (this.stripWayline != null ? !this.stripWayline.equals(that.stripWayline) : that.stripWayline != null) {
            return false;
        }
        return this.edgePoints != null ? this.edgePoints.equals(that.edgePoints) : that.edgePoints == null;
    }

    public int hashCode() {
        int result = this.id != null ? this.id.hashCode() : 0;
        result = 31 * result + (this.missionInfo != null ? this.missionInfo.hashCode() : 0);
        result = 31 * result + (this.stripWayline != null ? this.stripWayline.hashCode() : 0);
        result = 31 * result + (this.edgePoints != null ? this.edgePoints.hashCode() : 0);
        return result;
    }

    public StripMissionModel clone() {
        StripMissionModel model;
        try {
            model = (StripMissionModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        if (this.stripWayline != null) {
            model.setStripWayline(this.stripWayline.clone());
        }
        if (this.missionInfo != null) {
            model.setMissionInfo(this.missionInfo.clone());
        }
        model.setEdgePoints(CollectionUtil.transform(this.edgePoints, StripEdgePointModel::clone));
        return model;
    }
}

