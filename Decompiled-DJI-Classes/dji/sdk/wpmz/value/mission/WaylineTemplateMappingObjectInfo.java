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
import dji.sdk.wpmz.value.mission.SupplementPrismModel;
import dji.sdk.wpmz.value.mission.WaylineEulerAngle;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import dji.sdk.wpmz.value.mission.WaylineOverlap;
import dji.sdk.wpmz.value.mission.WaylineTemplateShootType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineTemplateMappingObjectInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WaylineLocationCoordinate3D> coordinates = new ArrayList<WaylineLocationCoordinate3D>();
    Double height = 0.0;
    WaylineEulerAngle angle;
    List<String> pointCloudFilePath = new ArrayList<String>();
    Double safetyWaylineBottomHeight = 0.0;
    WaylineOverlap overlap;
    WaylineTemplateShootType shootType = WaylineTemplateShootType.UNKNOWN;
    Boolean isShootTypeSet = false;
    List<SupplementPrismModel> supplementPrismModels = new ArrayList<SupplementPrismModel>();

    public WaylineTemplateMappingObjectInfo() {
    }

    public WaylineTemplateMappingObjectInfo(List<WaylineLocationCoordinate3D> coordinates, Double height, WaylineEulerAngle angle, List<String> pointCloudFilePath, Double safetyWaylineBottomHeight, WaylineOverlap overlap, WaylineTemplateShootType shootType, Boolean isShootTypeSet, List<SupplementPrismModel> supplementPrismModels) {
        if (coordinates != null) {
            this.coordinates = coordinates;
        }
        if (height != null) {
            this.height = height;
        }
        if (angle != null) {
            this.angle = angle;
        }
        if (pointCloudFilePath != null) {
            this.pointCloudFilePath = pointCloudFilePath;
        }
        if (safetyWaylineBottomHeight != null) {
            this.safetyWaylineBottomHeight = safetyWaylineBottomHeight;
        }
        if (overlap != null) {
            this.overlap = overlap;
        }
        if (shootType != null) {
            this.shootType = shootType;
        }
        if (isShootTypeSet != null) {
            this.isShootTypeSet = isShootTypeSet;
        }
        if (supplementPrismModels != null) {
            this.supplementPrismModels = supplementPrismModels;
        }
    }

    public static WaylineTemplateMappingObjectInfo fromJson(String jsonString) {
        WaylineTemplateMappingObjectInfo tmpValueResult_ = new WaylineTemplateMappingObjectInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            JSONArray coordinatesJsonArr = jsonObj.getJSONArray("coordinates");
            for (int i = 0; i < coordinatesJsonArr.length(); ++i) {
                tmpValueResult_.coordinates.add(WaylineLocationCoordinate3D.fromJson(coordinatesJsonArr.getString(i)));
            }
            tmpValueResult_.height = jsonObj.getDouble("height");
            tmpValueResult_.angle = WaylineEulerAngle.fromJson(jsonObj.getJSONObject("angle").toString());
            JSONArray pointCloudFilePathJsonArr = jsonObj.getJSONArray("pointCloudFilePath");
            for (int i = 0; i < pointCloudFilePathJsonArr.length(); ++i) {
                tmpValueResult_.pointCloudFilePath.add(pointCloudFilePathJsonArr.getString(i));
            }
            tmpValueResult_.safetyWaylineBottomHeight = jsonObj.getDouble("safetyWaylineBottomHeight");
            tmpValueResult_.overlap = WaylineOverlap.fromJson(jsonObj.getJSONObject("overlap").toString());
            tmpValueResult_.shootType = WaylineTemplateShootType.find(jsonObj.getInt("shootType"));
            tmpValueResult_.isShootTypeSet = jsonObj.getBoolean("isShootTypeSet");
            JSONArray supplementPrismModelsJsonArr = jsonObj.getJSONArray("supplementPrismModels");
            for (int i = 0; i < supplementPrismModelsJsonArr.length(); ++i) {
                tmpValueResult_.supplementPrismModels.add(SupplementPrismModel.fromJson(supplementPrismModelsJsonArr.getString(i)));
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
            if (null != this.angle) {
                json.put("angle", (Object)this.angle.toJson());
            }
            if (null != this.pointCloudFilePath) {
                JSONArray json_arr_pointCloudFilePath = new JSONArray();
                for (i = 0; i < this.pointCloudFilePath.size(); ++i) {
                    json_arr_pointCloudFilePath.put((Object)this.pointCloudFilePath.get(i));
                }
                json.put("pointCloudFilePath", (Object)json_arr_pointCloudFilePath);
            }
            if (null != this.safetyWaylineBottomHeight) {
                json.put("safetyWaylineBottomHeight", (Object)this.safetyWaylineBottomHeight);
            }
            if (null != this.overlap) {
                json.put("overlap", (Object)this.overlap.toJson());
            }
            if (null != this.shootType) {
                json.put("shootType", this.shootType.value());
            }
            if (null != this.isShootTypeSet) {
                json.put("isShootTypeSet", (Object)this.isShootTypeSet);
            }
            if (null != this.supplementPrismModels) {
                JSONArray json_arr_supplementPrismModels = new JSONArray();
                for (i = 0; i < this.supplementPrismModels.size(); ++i) {
                    json_arr_supplementPrismModels.put((Object)this.supplementPrismModels.get(i).toJson());
                }
                json.put("supplementPrismModels", (Object)json_arr_supplementPrismModels);
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
        serializedLength += ByteStreamHelper.arrayGetLength(this.coordinates);
        serializedLength += ByteStreamHelper.doubleGetLength(this.height);
        serializedLength += ByteStreamHelper.getLength(this.angle, WaylineEulerAngle.class);
        serializedLength += ByteStreamHelper.stringArrayGetLength(this.pointCloudFilePath);
        serializedLength += ByteStreamHelper.doubleGetLength(this.safetyWaylineBottomHeight);
        serializedLength += ByteStreamHelper.getLength(this.overlap, WaylineOverlap.class);
        serializedLength += ByteStreamHelper.integerGetLength(this.shootType.value());
        serializedLength += ByteStreamHelper.booleanGetLength(this.isShootTypeSet);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.supplementPrismModels);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.coordinates, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.height, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.angle, serializedIndex, WaylineEulerAngle.class);
        serializedIndex = ByteStreamHelper.stringArrayToBytes(resultBytes, this.pointCloudFilePath, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.safetyWaylineBottomHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.overlap, serializedIndex, WaylineOverlap.class);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.shootType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isShootTypeSet, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.supplementPrismModels, serializedIndex);
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
        ByteResult<List<WaylineLocationCoordinate3D>> tmpCoordinates = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.coordinates = (List)tmpCoordinates.result;
        deserilizationIndex = tmpCoordinates.endIndex;
        ByteResult<Double> tmpHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.height = (Double)tmpHeight.result;
        deserilizationIndex = tmpHeight.endIndex;
        ByteResult<WaylineEulerAngle> tmpAngle = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineEulerAngle.class);
        this.angle = (WaylineEulerAngle)tmpAngle.result;
        deserilizationIndex = tmpAngle.endIndex;
        ByteResult<List<String>> tmpPointCloudFilePath = ByteStreamHelper.stringArrayFromBytes(data, deserilizationIndex);
        this.pointCloudFilePath = (List)tmpPointCloudFilePath.result;
        deserilizationIndex = tmpPointCloudFilePath.endIndex;
        ByteResult<Double> tmpSafetyWaylineBottomHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.safetyWaylineBottomHeight = (Double)tmpSafetyWaylineBottomHeight.result;
        deserilizationIndex = tmpSafetyWaylineBottomHeight.endIndex;
        ByteResult<WaylineOverlap> tmpOverlap = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineOverlap.class);
        this.overlap = (WaylineOverlap)tmpOverlap.result;
        deserilizationIndex = tmpOverlap.endIndex;
        ByteResult<Integer> tmpShootType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.shootType = WaylineTemplateShootType.find((Integer)tmpShootType.result);
        deserilizationIndex = tmpShootType.endIndex;
        ByteResult<Boolean> tmpIsShootTypeSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isShootTypeSet = (Boolean)tmpIsShootTypeSet.result;
        deserilizationIndex = tmpIsShootTypeSet.endIndex;
        ByteResult<List<SupplementPrismModel>> tmpSupplementPrismModels = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, SupplementPrismModel.class);
        this.supplementPrismModels = (List)tmpSupplementPrismModels.result;
        deserilizationIndex = tmpSupplementPrismModels.endIndex;
        return deserilizationIndex;
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

    public WaylineEulerAngle getAngle() {
        return this.angle;
    }

    public void setAngle(WaylineEulerAngle angle) {
        this.angle = angle;
    }

    public List<String> getPointCloudFilePath() {
        return this.pointCloudFilePath;
    }

    public void setPointCloudFilePath(List<String> pointCloudFilePath) {
        this.pointCloudFilePath = pointCloudFilePath;
    }

    public Double getSafetyWaylineBottomHeight() {
        return this.safetyWaylineBottomHeight;
    }

    public void setSafetyWaylineBottomHeight(Double safetyWaylineBottomHeight) {
        this.safetyWaylineBottomHeight = safetyWaylineBottomHeight;
    }

    public WaylineOverlap getOverlap() {
        return this.overlap;
    }

    public void setOverlap(WaylineOverlap overlap) {
        this.overlap = overlap;
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

    public List<SupplementPrismModel> getSupplementPrismModels() {
        return this.supplementPrismModels;
    }

    public void setSupplementPrismModels(List<SupplementPrismModel> supplementPrismModels) {
        this.supplementPrismModels = supplementPrismModels;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTemplateMappingObjectInfo)) {
            return false;
        }
        WaylineTemplateMappingObjectInfo that = (WaylineTemplateMappingObjectInfo)o;
        return Objects.equals(this.coordinates, that.coordinates) && Objects.equals(this.height, that.height) && Objects.equals(this.angle, that.angle) && Objects.equals(this.pointCloudFilePath, that.pointCloudFilePath) && Objects.equals(this.safetyWaylineBottomHeight, that.safetyWaylineBottomHeight) && Objects.equals(this.overlap, that.overlap) && Objects.equals(this.shootType, that.shootType) && Objects.equals(this.isShootTypeSet, that.isShootTypeSet) && Objects.equals(this.supplementPrismModels, that.supplementPrismModels);
    }

    public int hashCode() {
        return Objects.hash(this.coordinates, this.height, this.angle, this.pointCloudFilePath, this.safetyWaylineBottomHeight, this.overlap, this.shootType, this.isShootTypeSet, this.supplementPrismModels);
    }
}

