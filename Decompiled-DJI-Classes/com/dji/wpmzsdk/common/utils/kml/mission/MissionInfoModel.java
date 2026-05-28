/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.mission;

import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.RTKReferenceStationSource;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoExtModel;
import java.util.Objects;

public class MissionInfoModel
implements Cloneable {
    private Long id;
    private String uuid;
    private String name;
    private long createTime;
    private long updateTime;
    private MissionType type;
    private String diagram;
    private double latitude;
    private double longitude;
    private String locationDesc;
    private float distance;
    private float duration;
    private int pointCount;
    private float area;
    private float gsd;
    private float inclinedGsd;
    private boolean collected;
    private RTKReferenceStationSource rtkStation;
    private MissionInfoExtModel extInfo;
    private String localWPMZPath;

    public String getLocalWPMZPath() {
        return this.localWPMZPath;
    }

    public void setLocalWPMZPath(String localWPMZPath) {
        this.localWPMZPath = localWPMZPath;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public String getDiagram() {
        return this.diagram;
    }

    public void setDiagram(String diagram) {
        this.diagram = diagram;
    }

    public String getLocationDesc() {
        return this.locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    public MissionType getType() {
        return this.type;
    }

    public void setType(MissionType type) {
        this.type = type;
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

    public float getDistance() {
        return this.distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getDuration() {
        return this.duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public int getPointCount() {
        return this.pointCount;
    }

    public void setPointCount(int pointCount) {
        this.pointCount = pointCount;
    }

    public float getArea() {
        return this.area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getGsd() {
        return this.gsd;
    }

    public void setGsd(float gsd) {
        this.gsd = gsd;
    }

    public float getInclinedGsd() {
        return this.inclinedGsd;
    }

    public void setInclinedGsd(float inclinedGsd) {
        this.inclinedGsd = inclinedGsd;
    }

    public boolean isCollected() {
        return this.collected;
    }

    public void setCollected(boolean collected) {
        this.collected = collected;
    }

    public RTKReferenceStationSource getRtkStation() {
        return this.rtkStation;
    }

    public void setRtkStation(RTKReferenceStationSource rtkStation) {
        this.rtkStation = rtkStation;
    }

    public MissionInfoExtModel getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(MissionInfoExtModel extInfo) {
        this.extInfo = extInfo;
    }

    public MissionInfoModel clone() {
        MissionInfoModel model = null;
        try {
            model = (MissionInfoModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return model;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MissionInfoModel that = (MissionInfoModel)o;
        if (this.createTime != that.createTime) {
            return false;
        }
        if (this.updateTime != that.updateTime) {
            return false;
        }
        if (Double.compare(that.latitude, this.latitude) != 0) {
            return false;
        }
        if (Double.compare(that.longitude, this.longitude) != 0) {
            return false;
        }
        if (Float.compare(that.distance, this.distance) != 0) {
            return false;
        }
        if (Float.compare(that.duration, this.duration) != 0) {
            return false;
        }
        if (this.collected != that.collected) {
            return false;
        }
        if (this.rtkStation != that.rtkStation) {
            return false;
        }
        if (!Objects.equals(this.extInfo, that.extInfo)) {
            return false;
        }
        if (this.id != null ? !this.id.equals(that.id) : that.id != null) {
            return false;
        }
        if (this.uuid != null ? !this.uuid.equals(that.uuid) : that.uuid != null) {
            return false;
        }
        if (this.name != null ? !this.name.equals(that.name) : that.name != null) {
            return false;
        }
        if (this.type != that.type) {
            return false;
        }
        if (this.diagram != null ? !this.diagram.equals(that.diagram) : that.diagram != null) {
            return false;
        }
        return this.locationDesc != null ? this.locationDesc.equals(that.locationDesc) : that.locationDesc == null;
    }

    public int hashCode() {
        int result = this.id != null ? this.id.hashCode() : 0;
        result = 31 * result + (this.uuid != null ? this.uuid.hashCode() : 0);
        result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
        result = 31 * result + (int)(this.createTime ^ this.createTime >>> 32);
        result = 31 * result + (int)(this.updateTime ^ this.updateTime >>> 32);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        result = 31 * result + (this.diagram != null ? this.diagram.hashCode() : 0);
        long temp = Double.doubleToLongBits(this.latitude);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(this.longitude);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        result = 31 * result + (this.locationDesc != null ? this.locationDesc.hashCode() : 0);
        result = 31 * result + (this.distance != 0.0f ? Float.floatToIntBits(this.distance) : 0);
        result = 31 * result + (this.duration != 0.0f ? Float.floatToIntBits(this.duration) : 0);
        result = 31 * result + (this.collected ? 1 : 0);
        result = 31 * result + (this.rtkStation != null ? this.rtkStation.hashCode() : 0);
        result = 31 * result + (this.extInfo != null ? this.extInfo.hashCode() : 0);
        return result;
    }

    public short getExecuteMissionId() {
        return (short)(this.name + this.updateTime).hashCode();
    }
}

