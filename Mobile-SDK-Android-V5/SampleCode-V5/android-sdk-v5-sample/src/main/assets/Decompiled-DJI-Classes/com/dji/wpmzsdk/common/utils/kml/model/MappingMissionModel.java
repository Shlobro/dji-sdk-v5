/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.CollectionUtil;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.EdgePointModel;
import com.dji.wpmzsdk.common.utils.kml.model.Mapping2DWaylineModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import java.util.List;

public class MappingMissionModel
implements Cloneable {
    private Long id;
    private MissionInfoModel missionInfo;
    private Mapping2DWaylineModel mappingWayline;
    private List<EdgePointModel> edgePoints;
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

    public Mapping2DWaylineModel getMappingWayline() {
        return this.mappingWayline;
    }

    public void setMappingWayline(Mapping2DWaylineModel mappingWayline) {
        this.mappingWayline = mappingWayline;
    }

    public List<EdgePointModel> getEdgePoints() {
        return this.edgePoints;
    }

    public void setEdgePoints(List<EdgePointModel> edgePoints) {
        this.edgePoints = edgePoints;
    }

    public MissionTransformData getTransformData() {
        return this.transformData;
    }

    public void setTransformData(MissionTransformData transformData) {
        this.transformData = transformData;
    }

    public MappingCameraType getCameraType() {
        String name = this.mappingWayline.getCamera().getName();
        for (MappingCameraType type : MappingCameraType.values()) {
            if (!type.getNameStr().equals(name) || type == MappingCameraType.OTHER) continue;
            return type;
        }
        return MappingCameraType.OTHER;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MappingMissionModel that = (MappingMissionModel)o;
        if (this.id != null ? !this.id.equals(that.id) : that.id != null) {
            return false;
        }
        if (this.missionInfo != null ? !this.missionInfo.equals(that.missionInfo) : that.missionInfo != null) {
            return false;
        }
        if (this.mappingWayline != null ? !this.mappingWayline.equals(that.mappingWayline) : that.mappingWayline != null) {
            return false;
        }
        return this.edgePoints != null ? this.edgePoints.equals(that.edgePoints) : that.edgePoints == null;
    }

    public int hashCode() {
        int result = this.id != null ? this.id.hashCode() : 0;
        result = 31 * result + (this.missionInfo != null ? this.missionInfo.hashCode() : 0);
        result = 31 * result + (this.mappingWayline != null ? this.mappingWayline.hashCode() : 0);
        result = 31 * result + (this.edgePoints != null ? this.edgePoints.hashCode() : 0);
        return result;
    }

    public MappingMissionModel clone() {
        MappingMissionModel model;
        try {
            model = (MappingMissionModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        if (this.mappingWayline != null) {
            model.setMappingWayline(this.mappingWayline.clone());
        }
        if (this.missionInfo != null) {
            model.setMissionInfo(this.missionInfo.clone());
        }
        model.setEdgePoints(CollectionUtil.transform(this.edgePoints, EdgePointModel::clone));
        return model;
    }

    public String toString() {
        return "MappingMissionModel{id=" + this.id + ", missionInfo=" + this.missionInfo + ", mappingWayline=" + this.mappingWayline + ", edgePoints=" + this.edgePoints + ", transformData=" + this.transformData + '}';
    }
}

