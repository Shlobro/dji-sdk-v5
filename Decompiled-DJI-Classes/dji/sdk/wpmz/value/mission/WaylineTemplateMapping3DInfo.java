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
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import dji.sdk.wpmz.value.mission.WaylineOverlap;
import dji.sdk.wpmz.value.mission.WaylineTemplateShootType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineTemplateMapping3DInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean caliFlightEnable = false;
    Integer inclinedGimbalPitch = 0;
    Double inclinedFlightSpeed = 0.0;
    WaylineTemplateShootType shootType = WaylineTemplateShootType.UNKNOWN;
    Boolean isShootTypeSet = false;
    Integer direction = 0;
    Double margin = 0.0;
    WaylineOverlap overlap;
    List<WaylineLocationCoordinate3D> coordinates = new ArrayList<WaylineLocationCoordinate3D>();
    Double height = 0.0;
    Double ellipsoidHeight = 0.0;
    Boolean efficiencyFlightModeEnable = false;
    List<LimitCircleAreaParam> circleLimitAreas = new ArrayList<LimitCircleAreaParam>();
    List<LimitPolygonAreaParam> polygonLimitAreas = new ArrayList<LimitPolygonAreaParam>();

    public WaylineTemplateMapping3DInfo() {
    }

    public WaylineTemplateMapping3DInfo(Boolean caliFlightEnable, Integer inclinedGimbalPitch, Double inclinedFlightSpeed, WaylineTemplateShootType shootType, Boolean isShootTypeSet, Integer direction, Double margin, WaylineOverlap overlap, List<WaylineLocationCoordinate3D> coordinates, Double height, Double ellipsoidHeight, Boolean efficiencyFlightModeEnable, List<LimitCircleAreaParam> circleLimitAreas, List<LimitPolygonAreaParam> polygonLimitAreas) {
        if (caliFlightEnable != null) {
            this.caliFlightEnable = caliFlightEnable;
        }
        if (inclinedGimbalPitch != null) {
            this.inclinedGimbalPitch = inclinedGimbalPitch;
        }
        if (inclinedFlightSpeed != null) {
            this.inclinedFlightSpeed = inclinedFlightSpeed;
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
        if (margin != null) {
            this.margin = margin;
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

    public static WaylineTemplateMapping3DInfo fromJson(String jsonString) {
        WaylineTemplateMapping3DInfo tmpValueResult_ = new WaylineTemplateMapping3DInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.caliFlightEnable = jsonObj.getBoolean("caliFlightEnable");
            tmpValueResult_.inclinedGimbalPitch = jsonObj.getInt("inclinedGimbalPitch");
            tmpValueResult_.inclinedFlightSpeed = jsonObj.getDouble("inclinedFlightSpeed");
            tmpValueResult_.shootType = WaylineTemplateShootType.find(jsonObj.getInt("shootType"));
            tmpValueResult_.isShootTypeSet = jsonObj.getBoolean("isShootTypeSet");
            tmpValueResult_.direction = jsonObj.getInt("direction");
            tmpValueResult_.margin = jsonObj.getDouble("margin");
            tmpValueResult_.overlap = WaylineOverlap.fromJson(jsonObj.getJSONObject("overlap").toString());
            JSONArray coordinatesJsonArr = jsonObj.getJSONArray("coordinates");
            for (int i = 0; i < coordinatesJsonArr.length(); ++i) {
                tmpValueResult_.coordinates.add(WaylineLocationCoordinate3D.fromJson(coordinatesJsonArr.getString(i)));
            }
            tmpValueResult_.height = jsonObj.getDouble("height");
            tmpValueResult_.ellipsoidHeight = jsonObj.getDouble("ellipsoidHeight");
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
            if (null != this.inclinedGimbalPitch) {
                json.put("inclinedGimbalPitch", (Object)this.inclinedGimbalPitch);
            }
            if (null != this.inclinedFlightSpeed) {
                json.put("inclinedFlightSpeed", (Object)this.inclinedFlightSpeed);
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
            if (null != this.margin) {
                json.put("margin", (Object)this.margin);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.inclinedGimbalPitch);
        serializedLength += ByteStreamHelper.doubleGetLength(this.inclinedFlightSpeed);
        serializedLength += ByteStreamHelper.integerGetLength(this.shootType.value());
        serializedLength += ByteStreamHelper.booleanGetLength(this.isShootTypeSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.direction);
        serializedLength += ByteStreamHelper.doubleGetLength(this.margin);
        serializedLength += ByteStreamHelper.getLength(this.overlap, WaylineOverlap.class);
        serializedLength += ByteStreamHelper.arrayGetLength(this.coordinates);
        serializedLength += ByteStreamHelper.doubleGetLength(this.height);
        serializedLength += ByteStreamHelper.doubleGetLength(this.ellipsoidHeight);
        serializedLength += ByteStreamHelper.booleanGetLength(this.efficiencyFlightModeEnable);
        serializedLength += ByteStreamHelper.arrayGetLength(this.circleLimitAreas);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.polygonLimitAreas);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.caliFlightEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.inclinedGimbalPitch, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.inclinedFlightSpeed, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.shootType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isShootTypeSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.direction, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.margin, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.overlap, serializedIndex, WaylineOverlap.class);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.coordinates, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.height, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.ellipsoidHeight, serializedIndex);
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
        ByteResult<Integer> tmpInclinedGimbalPitch = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.inclinedGimbalPitch = (Integer)tmpInclinedGimbalPitch.result;
        deserilizationIndex = tmpInclinedGimbalPitch.endIndex;
        ByteResult<Double> tmpInclinedFlightSpeed = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.inclinedFlightSpeed = (Double)tmpInclinedFlightSpeed.result;
        deserilizationIndex = tmpInclinedFlightSpeed.endIndex;
        ByteResult<Integer> tmpShootType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.shootType = WaylineTemplateShootType.find((Integer)tmpShootType.result);
        deserilizationIndex = tmpShootType.endIndex;
        ByteResult<Boolean> tmpIsShootTypeSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isShootTypeSet = (Boolean)tmpIsShootTypeSet.result;
        deserilizationIndex = tmpIsShootTypeSet.endIndex;
        ByteResult<Integer> tmpDirection = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.direction = (Integer)tmpDirection.result;
        deserilizationIndex = tmpDirection.endIndex;
        ByteResult<Double> tmpMargin = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.margin = (Double)tmpMargin.result;
        deserilizationIndex = tmpMargin.endIndex;
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

    public Integer getInclinedGimbalPitch() {
        return this.inclinedGimbalPitch;
    }

    public void setInclinedGimbalPitch(Integer inclinedGimbalPitch) {
        this.inclinedGimbalPitch = inclinedGimbalPitch;
    }

    public Double getInclinedFlightSpeed() {
        return this.inclinedFlightSpeed;
    }

    public void setInclinedFlightSpeed(Double inclinedFlightSpeed) {
        this.inclinedFlightSpeed = inclinedFlightSpeed;
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

    public Double getMargin() {
        return this.margin;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
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
        if (!(o instanceof WaylineTemplateMapping3DInfo)) {
            return false;
        }
        WaylineTemplateMapping3DInfo that = (WaylineTemplateMapping3DInfo)o;
        return Objects.equals(this.caliFlightEnable, that.caliFlightEnable) && Objects.equals(this.inclinedGimbalPitch, that.inclinedGimbalPitch) && Objects.equals(this.inclinedFlightSpeed, that.inclinedFlightSpeed) && Objects.equals(this.shootType, that.shootType) && Objects.equals(this.isShootTypeSet, that.isShootTypeSet) && Objects.equals(this.direction, that.direction) && Objects.equals(this.margin, that.margin) && Objects.equals(this.overlap, that.overlap) && Objects.equals(this.coordinates, that.coordinates) && Objects.equals(this.height, that.height) && Objects.equals(this.ellipsoidHeight, that.ellipsoidHeight) && Objects.equals(this.efficiencyFlightModeEnable, that.efficiencyFlightModeEnable) && Objects.equals(this.circleLimitAreas, that.circleLimitAreas) && Objects.equals(this.polygonLimitAreas, that.polygonLimitAreas);
    }

    public int hashCode() {
        return Objects.hash(this.caliFlightEnable, this.inclinedGimbalPitch, this.inclinedFlightSpeed, this.shootType, this.isShootTypeSet, this.direction, this.margin, this.overlap, this.coordinates, this.height, this.ellipsoidHeight, this.efficiencyFlightModeEnable, this.circleLimitAreas, this.polygonLimitAreas);
    }
}

