/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.ByteResult;
import dji.sdk.wpmz.value.ByteStream;
import dji.sdk.wpmz.value.ByteStreamHelper;
import dji.sdk.wpmz.value.base.DJIValue;
import dji.sdk.wpmz.value.mission.LimitCircleAreaParam;
import dji.sdk.wpmz.value.mission.LimitPolygonAreaParam;
import dji.sdk.wpmz.value.mission.MappingStripMergedRegion;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import dji.sdk.wpmz.value.mission.WaylineOverlap;
import dji.sdk.wpmz.value.mission.WaylineTemplateShootType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineTemplateMappingStripInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean caliFlightEnable = false;
    Boolean elevationOptimizeEnable = false;
    WaylineTemplateShootType shootType = WaylineTemplateShootType.UNKNOWN;
    Boolean isShootTypeSet = false;
    Integer direction = 0;
    Boolean singleLineEnable = false;
    Double cuttingDistance = 0.0;
    Boolean boundaryOptimEnable = false;
    Integer leftExtend = 0;
    Integer rightExtend = 0;
    Boolean includeCenterEnable = false;
    WaylineOverlap overlap;
    List<WaylineLocationCoordinate3D> coordinates = new ArrayList<WaylineLocationCoordinate3D>();
    Double height = 0.0;
    Double ellipsoidHeight = 0.0;
    List<MappingStripMergedRegion> mergedRegions = new ArrayList<MappingStripMergedRegion>();
    Boolean useTemplateAltitude = false;
    Boolean efficiencyFlightModeEnable = false;
    List<LimitCircleAreaParam> circleLimitAreas = new ArrayList<LimitCircleAreaParam>();
    List<LimitPolygonAreaParam> polygonLimitAreas = new ArrayList<LimitPolygonAreaParam>();

    public WaylineTemplateMappingStripInfo() {
    }

    public WaylineTemplateMappingStripInfo(Boolean caliFlightEnable, Boolean elevationOptimizeEnable, WaylineTemplateShootType shootType, Boolean isShootTypeSet, Integer direction, Boolean singleLineEnable, Double cuttingDistance, Boolean boundaryOptimEnable, Integer leftExtend, Integer rightExtend, Boolean includeCenterEnable, WaylineOverlap overlap, List<WaylineLocationCoordinate3D> coordinates, Double height, Double ellipsoidHeight, List<MappingStripMergedRegion> mergedRegions, Boolean useTemplateAltitude, Boolean efficiencyFlightModeEnable, List<LimitCircleAreaParam> circleLimitAreas, List<LimitPolygonAreaParam> polygonLimitAreas) {
        if (caliFlightEnable != null) {
            this.caliFlightEnable = caliFlightEnable;
        }
        if (elevationOptimizeEnable != null) {
            this.elevationOptimizeEnable = elevationOptimizeEnable;
        }
        if (shootType != null) {
            this.shootType = shootType;
        }
        if (isShootTypeSet != null) {
            this.isShootTypeSet = isShootTypeSet;
        }
        if (direction != null) {
            this.direction = direction;
        }
        if (singleLineEnable != null) {
            this.singleLineEnable = singleLineEnable;
        }
        if (cuttingDistance != null) {
            this.cuttingDistance = cuttingDistance;
        }
        if (boundaryOptimEnable != null) {
            this.boundaryOptimEnable = boundaryOptimEnable;
        }
        if (leftExtend != null) {
            this.leftExtend = leftExtend;
        }
        if (rightExtend != null) {
            this.rightExtend = rightExtend;
        }
        if (includeCenterEnable != null) {
            this.includeCenterEnable = includeCenterEnable;
        }
        if (overlap != null) {
            this.overlap = overlap;
        }
        if (coordinates != null) {
            this.coordinates = coordinates;
        }
        if (height != null) {
            this.height = height;
        }
        if (ellipsoidHeight != null) {
            this.ellipsoidHeight = ellipsoidHeight;
        }
        if (mergedRegions != null) {
            this.mergedRegions = mergedRegions;
        }
        if (useTemplateAltitude != null) {
            this.useTemplateAltitude = useTemplateAltitude;
        }
        if (efficiencyFlightModeEnable != null) {
            this.efficiencyFlightModeEnable = efficiencyFlightModeEnable;
        }
        if (circleLimitAreas != null) {
            this.circleLimitAreas = circleLimitAreas;
        }
        if (polygonLimitAreas != null) {
            this.polygonLimitAreas = polygonLimitAreas;
        }
    }

    public static WaylineTemplateMappingStripInfo fromJson(String jsonString) {
        WaylineTemplateMappingStripInfo tmpValueResult_ = new WaylineTemplateMappingStripInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.caliFlightEnable = jsonObj.getBoolean("caliFlightEnable");
            tmpValueResult_.elevationOptimizeEnable = jsonObj.getBoolean("elevationOptimizeEnable");
            tmpValueResult_.shootType = WaylineTemplateShootType.find(jsonObj.getInt("shootType"));
            tmpValueResult_.isShootTypeSet = jsonObj.getBoolean("isShootTypeSet");
            tmpValueResult_.direction = jsonObj.getInt("direction");
            tmpValueResult_.singleLineEnable = jsonObj.getBoolean("singleLineEnable");
            tmpValueResult_.cuttingDistance = jsonObj.getDouble("cuttingDistance");
            tmpValueResult_.boundaryOptimEnable = jsonObj.getBoolean("boundaryOptimEnable");
            tmpValueResult_.leftExtend = jsonObj.getInt("leftExtend");
            tmpValueResult_.rightExtend = jsonObj.getInt("rightExtend");
            tmpValueResult_.includeCenterEnable = jsonObj.getBoolean("includeCenterEnable");
            tmpValueResult_.overlap = WaylineOverlap.fromJson(jsonObj.getJSONObject("overlap").toString());
            JSONArray coordinatesJsonArr = jsonObj.getJSONArray("coordinates");
            for (int i = 0; i < coordinatesJsonArr.length(); ++i) {
                tmpValueResult_.coordinates.add(WaylineLocationCoordinate3D.fromJson(coordinatesJsonArr.getString(i)));
            }
            tmpValueResult_.height = jsonObj.getDouble("height");
            tmpValueResult_.ellipsoidHeight = jsonObj.getDouble("ellipsoidHeight");
            JSONArray mergedRegionsJsonArr = jsonObj.getJSONArray("mergedRegions");
            for (int i = 0; i < mergedRegionsJsonArr.length(); ++i) {
                tmpValueResult_.mergedRegions.add(MappingStripMergedRegion.fromJson(mergedRegionsJsonArr.getString(i)));
            }
            tmpValueResult_.useTemplateAltitude = jsonObj.getBoolean("useTemplateAltitude");
            tmpValueResult_.efficiencyFlightModeEnable = jsonObj.getBoolean("efficiencyFlightModeEnable");
            JSONArray circleLimitAreasJsonArr = jsonObj.getJSONArray("circleLimitAreas");
            for (int i = 0; i < circleLimitAreasJsonArr.length(); ++i) {
                tmpValueResult_.circleLimitAreas.add(LimitCircleAreaParam.fromJson(circleLimitAreasJsonArr.getString(i)));
            }
            JSONArray polygonLimitAreasJsonArr = jsonObj.getJSONArray("polygonLimitAreas");
            for (int i = 0; i < polygonLimitAreasJsonArr.length(); ++i) {
                tmpValueResult_.polygonLimitAreas.add(LimitPolygonAreaParam.fromJson(polygonLimitAreasJsonArr.getString(i)));
            }
        }
        catch (Exception e) {
            tmpValueResult_ = null;
        }
        return tmpValueResult_;
    }

    @Override
    public JSONObject toJson() {
        JSONObject json = null;
        try {
            int i;
            json = new JSONObject();
            if (null != this.caliFlightEnable) {
                json.put("caliFlightEnable", (Object)this.caliFlightEnable);
            }
            if (null != this.elevationOptimizeEnable) {
                json.put("elevationOptimizeEnable", (Object)this.elevationOptimizeEnable);
            }
            if (null != this.shootType) {
                json.put("shootType", this.shootType.value());
            }
            if (null != this.isShootTypeSet) {
                json.put("isShootTypeSet", (Object)this.isShootTypeSet);
            }
            if (null != this.direction) {
                json.put("direction", (Object)this.direction);
            }
            if (null != this.singleLineEnable) {
                json.put("singleLineEnable", (Object)this.singleLineEnable);
            }
            if (null != this.cuttingDistance) {
                json.put("cuttingDistance", (Object)this.cuttingDistance);
            }
            if (null != this.boundaryOptimEnable) {
                json.put("boundaryOptimEnable", (Object)this.boundaryOptimEnable);
            }
            if (null != this.leftExtend) {
                json.put("leftExtend", (Object)this.leftExtend);
            }
            if (null != this.rightExtend) {
                json.put("rightExtend", (Object)this.rightExtend);
            }
            if (null != this.includeCenterEnable) {
                json.put("includeCenterEnable", (Object)this.includeCenterEnable);
            }
            if (null != this.overlap) {
                json.put("overlap", (Object)this.overlap.toJson());
            }
            if (null != this.coordinates) {
                JSONArray json_arr_coordinates = new JSONArray();
                for (i = 0; i < this.coordinates.size(); ++i) {
                    json_arr_coordinates.put((Object)this.coordinates.get(i).toJson());
                }
                json.put("coordinates", (Object)json_arr_coordinates);
            }
            if (null != this.height) {
                json.put("height", (Object)this.height);
            }
            if (null != this.ellipsoidHeight) {
                json.put("ellipsoidHeight", (Object)this.ellipsoidHeight);
            }
            if (null != this.mergedRegions) {
                JSONArray json_arr_mergedRegions = new JSONArray();
                for (i = 0; i < this.mergedRegions.size(); ++i) {
                    json_arr_mergedRegions.put((Object)this.mergedRegions.get(i).toJson());
                }
                json.put("mergedRegions", (Object)json_arr_mergedRegions);
            }
            if (null != this.useTemplateAltitude) {
                json.put("useTemplateAltitude", (Object)this.useTemplateAltitude);
            }
            if (null != this.efficiencyFlightModeEnable) {
                json.put("efficiencyFlightModeEnable", (Object)this.efficiencyFlightModeEnable);
            }
            if (null != this.circleLimitAreas) {
                JSONArray json_arr_circleLimitAreas = new JSONArray();
                for (i = 0; i < this.circleLimitAreas.size(); ++i) {
                    json_arr_circleLimitAreas.put((Object)this.circleLimitAreas.get(i).toJson());
                }
                json.put("circleLimitAreas", (Object)json_arr_circleLimitAreas);
            }
            if (null != this.polygonLimitAreas) {
                JSONArray json_arr_polygonLimitAreas = new JSONArray();
                for (i = 0; i < this.polygonLimitAreas.size(); ++i) {
                    json_arr_polygonLimitAreas.put((Object)this.polygonLimitAreas.get(i).toJson());
                }
                json.put("polygonLimitAreas", (Object)json_arr_polygonLimitAreas);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public int serializedLength() {
        int serializedLength = 0;
        serializedLength += ByteStreamHelper.booleanGetLength(this.caliFlightEnable);
        serializedLength += ByteStreamHelper.booleanGetLength(this.elevationOptimizeEnable);
        serializedLength += ByteStreamHelper.integerGetLength(this.shootType.value());
        serializedLength += ByteStreamHelper.booleanGetLength(this.isShootTypeSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.direction);
        serializedLength += ByteStreamHelper.booleanGetLength(this.singleLineEnable);
        serializedLength += ByteStreamHelper.doubleGetLength(this.cuttingDistance);
        serializedLength += ByteStreamHelper.booleanGetLength(this.boundaryOptimEnable);
        serializedLength += ByteStreamHelper.integerGetLength(this.leftExtend);
        serializedLength += ByteStreamHelper.integerGetLength(this.rightExtend);
        serializedLength += ByteStreamHelper.booleanGetLength(this.includeCenterEnable);
        serializedLength += ByteStreamHelper.getLength(this.overlap, WaylineOverlap.class);
        serializedLength += ByteStreamHelper.arrayGetLength(this.coordinates);
        serializedLength += ByteStreamHelper.doubleGetLength(this.height);
        serializedLength += ByteStreamHelper.doubleGetLength(this.ellipsoidHeight);
        serializedLength += ByteStreamHelper.arrayGetLength(this.mergedRegions);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useTemplateAltitude);
        serializedLength += ByteStreamHelper.booleanGetLength(this.efficiencyFlightModeEnable);
        serializedLength += ByteStreamHelper.arrayGetLength(this.circleLimitAreas);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.polygonLimitAreas);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.caliFlightEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.elevationOptimizeEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.shootType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isShootTypeSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.direction, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.singleLineEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.cuttingDistance, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.boundaryOptimEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.leftExtend, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.rightExtend, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.includeCenterEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.overlap, serializedIndex, WaylineOverlap.class);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.coordinates, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.height, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.ellipsoidHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.mergedRegions, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useTemplateAltitude, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.efficiencyFlightModeEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.circleLimitAreas, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.polygonLimitAreas, serializedIndex);
        return serializedIndex;
    }

    @Override
    public byte[] toBytes() {
        byte[] resultBytes = new byte[this.serializedLength()];
        this.toBytes(resultBytes, 0);
        return resultBytes;
    }

    @Override
    public int fromBytes(byte[] data, int deserilizationIndex) {
        ByteResult<Boolean> tmpCaliFlightEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.caliFlightEnable = (Boolean)tmpCaliFlightEnable.result;
        deserilizationIndex = tmpCaliFlightEnable.endIndex;
        ByteResult<Boolean> tmpElevationOptimizeEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.elevationOptimizeEnable = (Boolean)tmpElevationOptimizeEnable.result;
        deserilizationIndex = tmpElevationOptimizeEnable.endIndex;
        ByteResult<Integer> tmpShootType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.shootType = WaylineTemplateShootType.find((Integer)tmpShootType.result);
        deserilizationIndex = tmpShootType.endIndex;
        ByteResult<Boolean> tmpIsShootTypeSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isShootTypeSet = (Boolean)tmpIsShootTypeSet.result;
        deserilizationIndex = tmpIsShootTypeSet.endIndex;
        ByteResult<Integer> tmpDirection = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.direction = (Integer)tmpDirection.result;
        deserilizationIndex = tmpDirection.endIndex;
        ByteResult<Boolean> tmpSingleLineEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.singleLineEnable = (Boolean)tmpSingleLineEnable.result;
        deserilizationIndex = tmpSingleLineEnable.endIndex;
        ByteResult<Double> tmpCuttingDistance = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.cuttingDistance = (Double)tmpCuttingDistance.result;
        deserilizationIndex = tmpCuttingDistance.endIndex;
        ByteResult<Boolean> tmpBoundaryOptimEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.boundaryOptimEnable = (Boolean)tmpBoundaryOptimEnable.result;
        deserilizationIndex = tmpBoundaryOptimEnable.endIndex;
        ByteResult<Integer> tmpLeftExtend = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.leftExtend = (Integer)tmpLeftExtend.result;
        deserilizationIndex = tmpLeftExtend.endIndex;
        ByteResult<Integer> tmpRightExtend = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.rightExtend = (Integer)tmpRightExtend.result;
        deserilizationIndex = tmpRightExtend.endIndex;
        ByteResult<Boolean> tmpIncludeCenterEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.includeCenterEnable = (Boolean)tmpIncludeCenterEnable.result;
        deserilizationIndex = tmpIncludeCenterEnable.endIndex;
        ByteResult<WaylineOverlap> tmpOverlap = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineOverlap.class);
        this.overlap = (WaylineOverlap)tmpOverlap.result;
        deserilizationIndex = tmpOverlap.endIndex;
        ByteResult<List<WaylineLocationCoordinate3D>> tmpCoordinates = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.coordinates = (List)tmpCoordinates.result;
        deserilizationIndex = tmpCoordinates.endIndex;
        ByteResult<Double> tmpHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.height = (Double)tmpHeight.result;
        deserilizationIndex = tmpHeight.endIndex;
        ByteResult<Double> tmpEllipsoidHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.ellipsoidHeight = (Double)tmpEllipsoidHeight.result;
        deserilizationIndex = tmpEllipsoidHeight.endIndex;
        ByteResult<List<MappingStripMergedRegion>> tmpMergedRegions = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, MappingStripMergedRegion.class);
        this.mergedRegions = (List)tmpMergedRegions.result;
        deserilizationIndex = tmpMergedRegions.endIndex;
        ByteResult<Boolean> tmpUseTemplateAltitude = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useTemplateAltitude = (Boolean)tmpUseTemplateAltitude.result;
        deserilizationIndex = tmpUseTemplateAltitude.endIndex;
        ByteResult<Boolean> tmpEfficiencyFlightModeEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.efficiencyFlightModeEnable = (Boolean)tmpEfficiencyFlightModeEnable.result;
        deserilizationIndex = tmpEfficiencyFlightModeEnable.endIndex;
        ByteResult<List<LimitCircleAreaParam>> tmpCircleLimitAreas = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, LimitCircleAreaParam.class);
        this.circleLimitAreas = (List)tmpCircleLimitAreas.result;
        deserilizationIndex = tmpCircleLimitAreas.endIndex;
        ByteResult<List<LimitPolygonAreaParam>> tmpPolygonLimitAreas = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, LimitPolygonAreaParam.class);
        this.polygonLimitAreas = (List)tmpPolygonLimitAreas.result;
        deserilizationIndex = tmpPolygonLimitAreas.endIndex;
        return deserilizationIndex;
    }

    public Boolean getCaliFlightEnable() {
        return this.caliFlightEnable;
    }

    public void setCaliFlightEnable(Boolean caliFlightEnable) {
        this.caliFlightEnable = caliFlightEnable;
    }

    public Boolean getElevationOptimizeEnable() {
        return this.elevationOptimizeEnable;
    }

    public void setElevationOptimizeEnable(Boolean elevationOptimizeEnable) {
        this.elevationOptimizeEnable = elevationOptimizeEnable;
    }

    public WaylineTemplateShootType getShootType() {
        return this.shootType;
    }

    public void setShootType(WaylineTemplateShootType shootType) {
        this.shootType = shootType;
    }

    public Boolean getIsShootTypeSet() {
        return this.isShootTypeSet;
    }

    public void setIsShootTypeSet(Boolean isShootTypeSet) {
        this.isShootTypeSet = isShootTypeSet;
    }

    public Integer getDirection() {
        return this.direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Boolean getSingleLineEnable() {
        return this.singleLineEnable;
    }

    public void setSingleLineEnable(Boolean singleLineEnable) {
        this.singleLineEnable = singleLineEnable;
    }

    public Double getCuttingDistance() {
        return this.cuttingDistance;
    }

    public void setCuttingDistance(Double cuttingDistance) {
        this.cuttingDistance = cuttingDistance;
    }

    public Boolean getBoundaryOptimEnable() {
        return this.boundaryOptimEnable;
    }

    public void setBoundaryOptimEnable(Boolean boundaryOptimEnable) {
        this.boundaryOptimEnable = boundaryOptimEnable;
    }

    public Integer getLeftExtend() {
        return this.leftExtend;
    }

    public void setLeftExtend(Integer leftExtend) {
        this.leftExtend = leftExtend;
    }

    public Integer getRightExtend() {
        return this.rightExtend;
    }

    public void setRightExtend(Integer rightExtend) {
        this.rightExtend = rightExtend;
    }

    public Boolean getIncludeCenterEnable() {
        return this.includeCenterEnable;
    }

    public void setIncludeCenterEnable(Boolean includeCenterEnable) {
        this.includeCenterEnable = includeCenterEnable;
    }

    public WaylineOverlap getOverlap() {
        return this.overlap;
    }

    public void setOverlap(WaylineOverlap overlap) {
        this.overlap = overlap;
    }

    public List<WaylineLocationCoordinate3D> getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(List<WaylineLocationCoordinate3D> coordinates) {
        this.coordinates = coordinates;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getEllipsoidHeight() {
        return this.ellipsoidHeight;
    }

    public void setEllipsoidHeight(Double ellipsoidHeight) {
        this.ellipsoidHeight = ellipsoidHeight;
    }

    public List<MappingStripMergedRegion> getMergedRegions() {
        return this.mergedRegions;
    }

    public void setMergedRegions(List<MappingStripMergedRegion> mergedRegions) {
        this.mergedRegions = mergedRegions;
    }

    public Boolean getUseTemplateAltitude() {
        return this.useTemplateAltitude;
    }

    public void setUseTemplateAltitude(Boolean useTemplateAltitude) {
        this.useTemplateAltitude = useTemplateAltitude;
    }

    public Boolean getEfficiencyFlightModeEnable() {
        return this.efficiencyFlightModeEnable;
    }

    public void setEfficiencyFlightModeEnable(Boolean efficiencyFlightModeEnable) {
        this.efficiencyFlightModeEnable = efficiencyFlightModeEnable;
    }

    public List<LimitCircleAreaParam> getCircleLimitAreas() {
        return this.circleLimitAreas;
    }

    public void setCircleLimitAreas(List<LimitCircleAreaParam> circleLimitAreas) {
        this.circleLimitAreas = circleLimitAreas;
    }

    public List<LimitPolygonAreaParam> getPolygonLimitAreas() {
        return this.polygonLimitAreas;
    }

    public void setPolygonLimitAreas(List<LimitPolygonAreaParam> polygonLimitAreas) {
        this.polygonLimitAreas = polygonLimitAreas;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTemplateMappingStripInfo)) {
            return false;
        }
        WaylineTemplateMappingStripInfo that = (WaylineTemplateMappingStripInfo)o;
        return Objects.equals(this.caliFlightEnable, that.caliFlightEnable) && Objects.equals(this.elevationOptimizeEnable, that.elevationOptimizeEnable) && Objects.equals(this.shootType, that.shootType) && Objects.equals(this.isShootTypeSet, that.isShootTypeSet) && Objects.equals(this.direction, that.direction) && Objects.equals(this.singleLineEnable, that.singleLineEnable) && Objects.equals(this.cuttingDistance, that.cuttingDistance) && Objects.equals(this.boundaryOptimEnable, that.boundaryOptimEnable) && Objects.equals(this.leftExtend, that.leftExtend) && Objects.equals(this.rightExtend, that.rightExtend) && Objects.equals(this.includeCenterEnable, that.includeCenterEnable) && Objects.equals(this.overlap, that.overlap) && Objects.equals(this.coordinates, that.coordinates) && Objects.equals(this.height, that.height) && Objects.equals(this.ellipsoidHeight, that.ellipsoidHeight) && Objects.equals(this.mergedRegions, that.mergedRegions) && Objects.equals(this.useTemplateAltitude, that.useTemplateAltitude) && Objects.equals(this.efficiencyFlightModeEnable, that.efficiencyFlightModeEnable) && Objects.equals(this.circleLimitAreas, that.circleLimitAreas) && Objects.equals(this.polygonLimitAreas, that.polygonLimitAreas);
    }

    public int hashCode() {
        return Objects.hash(this.caliFlightEnable, this.elevationOptimizeEnable, this.shootType, this.isShootTypeSet, this.direction, this.singleLineEnable, this.cuttingDistance, this.boundaryOptimEnable, this.leftExtend, this.rightExtend, this.includeCenterEnable, this.overlap, this.coordinates, this.height, this.ellipsoidHeight, this.mergedRegions, this.useTemplateAltitude, this.efficiencyFlightModeEnable, this.circleLimitAreas, this.polygonLimitAreas);
    }
}

