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
import dji.sdk.wpmz.value.mission.WaylineCustomPayloadActionInfo;
import dji.sdk.wpmz.value.mission.WaylinePayloadType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylinePayloadInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String payloadName = "";
    Integer payloadPositionIndex = 0;
    Boolean isPayloadPositionIndexSet = false;
    WaylinePayloadType payloadType = WaylinePayloadType.UNKNOWN;
    Integer payloadSubType = 0;
    Boolean isSetThirdPartyCameraParam = false;
    Double focalLength = 0.0;
    Double sensorW = 0.0;
    Double sensorH = 0.0;
    Integer imageW = 0;
    Integer imageH = 0;
    Double minShootInterval = 0.0;
    List<WaylineCustomPayloadActionInfo> customActionInfos = new ArrayList<WaylineCustomPayloadActionInfo>();

    public WaylinePayloadInfo() {
    }

    public WaylinePayloadInfo(String payloadName, Integer payloadPositionIndex, Boolean isPayloadPositionIndexSet, WaylinePayloadType payloadType, Integer payloadSubType, Boolean isSetThirdPartyCameraParam, Double focalLength, Double sensorW, Double sensorH, Integer imageW, Integer imageH, Double minShootInterval, List<WaylineCustomPayloadActionInfo> customActionInfos) {
        if (payloadName != null) {
            this.payloadName = payloadName;
        }
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (isPayloadPositionIndexSet != null) {
            this.isPayloadPositionIndexSet = isPayloadPositionIndexSet;
        }
        if (payloadType != null) {
            this.payloadType = payloadType;
        }
        if (payloadSubType != null) {
            this.payloadSubType = payloadSubType;
        }
        if (isSetThirdPartyCameraParam != null) {
            this.isSetThirdPartyCameraParam = isSetThirdPartyCameraParam;
        }
        if (focalLength != null) {
            this.focalLength = focalLength;
        }
        if (sensorW != null) {
            this.sensorW = sensorW;
        }
        if (sensorH != null) {
            this.sensorH = sensorH;
        }
        if (imageW != null) {
            this.imageW = imageW;
        }
        if (imageH != null) {
            this.imageH = imageH;
        }
        if (minShootInterval != null) {
            this.minShootInterval = minShootInterval;
        }
        if (customActionInfos != null) {
            this.customActionInfos = customActionInfos;
        }
    }

    public static WaylinePayloadInfo fromJson(String jsonString) {
        WaylinePayloadInfo tmpValueResult_ = new WaylinePayloadInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadName = jsonObj.getString("payloadName");
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.isPayloadPositionIndexSet = jsonObj.getBoolean("isPayloadPositionIndexSet");
            tmpValueResult_.payloadType = WaylinePayloadType.find(jsonObj.getInt("payloadType"));
            tmpValueResult_.payloadSubType = jsonObj.getInt("payloadSubType");
            tmpValueResult_.isSetThirdPartyCameraParam = jsonObj.getBoolean("isSetThirdPartyCameraParam");
            tmpValueResult_.focalLength = jsonObj.getDouble("focalLength");
            tmpValueResult_.sensorW = jsonObj.getDouble("sensorW");
            tmpValueResult_.sensorH = jsonObj.getDouble("sensorH");
            tmpValueResult_.imageW = jsonObj.getInt("imageW");
            tmpValueResult_.imageH = jsonObj.getInt("imageH");
            tmpValueResult_.minShootInterval = jsonObj.getDouble("minShootInterval");
            JSONArray customActionInfosJsonArr = jsonObj.getJSONArray("customActionInfos");
            for (int i = 0; i < customActionInfosJsonArr.length(); ++i) {
                tmpValueResult_.customActionInfos.add(WaylineCustomPayloadActionInfo.fromJson(customActionInfosJsonArr.getString(i)));
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
            json = new JSONObject();
            if (null != this.payloadName) {
                json.put("payloadName", (Object)this.payloadName);
            }
            if (null != this.payloadPositionIndex) {
                json.put("payloadPositionIndex", (Object)this.payloadPositionIndex);
            }
            if (null != this.isPayloadPositionIndexSet) {
                json.put("isPayloadPositionIndexSet", (Object)this.isPayloadPositionIndexSet);
            }
            if (null != this.payloadType) {
                json.put("payloadType", this.payloadType.value());
            }
            if (null != this.payloadSubType) {
                json.put("payloadSubType", (Object)this.payloadSubType);
            }
            if (null != this.isSetThirdPartyCameraParam) {
                json.put("isSetThirdPartyCameraParam", (Object)this.isSetThirdPartyCameraParam);
            }
            if (null != this.focalLength) {
                json.put("focalLength", (Object)this.focalLength);
            }
            if (null != this.sensorW) {
                json.put("sensorW", (Object)this.sensorW);
            }
            if (null != this.sensorH) {
                json.put("sensorH", (Object)this.sensorH);
            }
            if (null != this.imageW) {
                json.put("imageW", (Object)this.imageW);
            }
            if (null != this.imageH) {
                json.put("imageH", (Object)this.imageH);
            }
            if (null != this.minShootInterval) {
                json.put("minShootInterval", (Object)this.minShootInterval);
            }
            if (null != this.customActionInfos) {
                JSONArray json_arr_customActionInfos = new JSONArray();
                for (int i = 0; i < this.customActionInfos.size(); ++i) {
                    json_arr_customActionInfos.put((Object)this.customActionInfos.get(i).toJson());
                }
                json.put("customActionInfos", (Object)json_arr_customActionInfos);
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
        serializedLength += ByteStreamHelper.stringGetLength(this.payloadName);
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadPositionIndex);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isPayloadPositionIndexSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadType.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadSubType);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isSetThirdPartyCameraParam);
        serializedLength += ByteStreamHelper.doubleGetLength(this.focalLength);
        serializedLength += ByteStreamHelper.doubleGetLength(this.sensorW);
        serializedLength += ByteStreamHelper.doubleGetLength(this.sensorH);
        serializedLength += ByteStreamHelper.integerGetLength(this.imageW);
        serializedLength += ByteStreamHelper.integerGetLength(this.imageH);
        serializedLength += ByteStreamHelper.doubleGetLength(this.minShootInterval);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.customActionInfos);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.payloadName, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isPayloadPositionIndexSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadSubType, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isSetThirdPartyCameraParam, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.focalLength, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.sensorW, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.sensorH, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.imageW, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.imageH, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.minShootInterval, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.customActionInfos, serializedIndex);
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
        ByteResult<String> tmpPayloadName = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.payloadName = (String)tmpPayloadName.result;
        deserilizationIndex = tmpPayloadName.endIndex;
        ByteResult<Integer> tmpPayloadPositionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.payloadPositionIndex = (Integer)tmpPayloadPositionIndex.result;
        deserilizationIndex = tmpPayloadPositionIndex.endIndex;
        ByteResult<Boolean> tmpIsPayloadPositionIndexSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isPayloadPositionIndexSet = (Boolean)tmpIsPayloadPositionIndexSet.result;
        deserilizationIndex = tmpIsPayloadPositionIndexSet.endIndex;
        ByteResult<Integer> tmpPayloadType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.payloadType = WaylinePayloadType.find((Integer)tmpPayloadType.result);
        deserilizationIndex = tmpPayloadType.endIndex;
        ByteResult<Integer> tmpPayloadSubType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.payloadSubType = (Integer)tmpPayloadSubType.result;
        deserilizationIndex = tmpPayloadSubType.endIndex;
        ByteResult<Boolean> tmpIsSetThirdPartyCameraParam = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isSetThirdPartyCameraParam = (Boolean)tmpIsSetThirdPartyCameraParam.result;
        deserilizationIndex = tmpIsSetThirdPartyCameraParam.endIndex;
        ByteResult<Double> tmpFocalLength = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.focalLength = (Double)tmpFocalLength.result;
        deserilizationIndex = tmpFocalLength.endIndex;
        ByteResult<Double> tmpSensorW = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.sensorW = (Double)tmpSensorW.result;
        deserilizationIndex = tmpSensorW.endIndex;
        ByteResult<Double> tmpSensorH = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.sensorH = (Double)tmpSensorH.result;
        deserilizationIndex = tmpSensorH.endIndex;
        ByteResult<Integer> tmpImageW = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.imageW = (Integer)tmpImageW.result;
        deserilizationIndex = tmpImageW.endIndex;
        ByteResult<Integer> tmpImageH = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.imageH = (Integer)tmpImageH.result;
        deserilizationIndex = tmpImageH.endIndex;
        ByteResult<Double> tmpMinShootInterval = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.minShootInterval = (Double)tmpMinShootInterval.result;
        deserilizationIndex = tmpMinShootInterval.endIndex;
        ByteResult<List<WaylineCustomPayloadActionInfo>> tmpCustomActionInfos = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineCustomPayloadActionInfo.class);
        this.customActionInfos = (List)tmpCustomActionInfos.result;
        deserilizationIndex = tmpCustomActionInfos.endIndex;
        return deserilizationIndex;
    }

    public String getPayloadName() {
        return this.payloadName;
    }

    public void setPayloadName(String payloadName) {
        this.payloadName = payloadName;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public Boolean getIsPayloadPositionIndexSet() {
        return this.isPayloadPositionIndexSet;
    }

    public void setIsPayloadPositionIndexSet(Boolean isPayloadPositionIndexSet) {
        this.isPayloadPositionIndexSet = isPayloadPositionIndexSet;
    }

    public WaylinePayloadType getPayloadType() {
        return this.payloadType;
    }

    public void setPayloadType(WaylinePayloadType payloadType) {
        this.payloadType = payloadType;
    }

    public Integer getPayloadSubType() {
        return this.payloadSubType;
    }

    public void setPayloadSubType(Integer payloadSubType) {
        this.payloadSubType = payloadSubType;
    }

    public Boolean getIsSetThirdPartyCameraParam() {
        return this.isSetThirdPartyCameraParam;
    }

    public void setIsSetThirdPartyCameraParam(Boolean isSetThirdPartyCameraParam) {
        this.isSetThirdPartyCameraParam = isSetThirdPartyCameraParam;
    }

    public Double getFocalLength() {
        return this.focalLength;
    }

    public void setFocalLength(Double focalLength) {
        this.focalLength = focalLength;
    }

    public Double getSensorW() {
        return this.sensorW;
    }

    public void setSensorW(Double sensorW) {
        this.sensorW = sensorW;
    }

    public Double getSensorH() {
        return this.sensorH;
    }

    public void setSensorH(Double sensorH) {
        this.sensorH = sensorH;
    }

    public Integer getImageW() {
        return this.imageW;
    }

    public void setImageW(Integer imageW) {
        this.imageW = imageW;
    }

    public Integer getImageH() {
        return this.imageH;
    }

    public void setImageH(Integer imageH) {
        this.imageH = imageH;
    }

    public Double getMinShootInterval() {
        return this.minShootInterval;
    }

    public void setMinShootInterval(Double minShootInterval) {
        this.minShootInterval = minShootInterval;
    }

    public List<WaylineCustomPayloadActionInfo> getCustomActionInfos() {
        return this.customActionInfos;
    }

    public void setCustomActionInfos(List<WaylineCustomPayloadActionInfo> customActionInfos) {
        this.customActionInfos = customActionInfos;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylinePayloadInfo)) {
            return false;
        }
        WaylinePayloadInfo that = (WaylinePayloadInfo)o;
        return Objects.equals(this.payloadName, that.payloadName) && Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.isPayloadPositionIndexSet, that.isPayloadPositionIndexSet) && Objects.equals(this.payloadType, that.payloadType) && Objects.equals(this.payloadSubType, that.payloadSubType) && Objects.equals(this.isSetThirdPartyCameraParam, that.isSetThirdPartyCameraParam) && Objects.equals(this.focalLength, that.focalLength) && Objects.equals(this.sensorW, that.sensorW) && Objects.equals(this.sensorH, that.sensorH) && Objects.equals(this.imageW, that.imageW) && Objects.equals(this.imageH, that.imageH) && Objects.equals(this.minShootInterval, that.minShootInterval) && Objects.equals(this.customActionInfos, that.customActionInfos);
    }

    public int hashCode() {
        return Objects.hash(this.payloadName, this.payloadPositionIndex, this.isPayloadPositionIndexSet, this.payloadType, this.payloadSubType, this.isSetThirdPartyCameraParam, this.focalLength, this.sensorW, this.sensorH, this.imageW, this.imageH, this.minShootInterval, this.customActionInfos);
    }
}

