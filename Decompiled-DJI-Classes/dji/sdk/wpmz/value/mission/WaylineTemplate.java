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
import dji.sdk.wpmz.value.mission.WaylineCoordinateParam;
import dji.sdk.wpmz.value.mission.WaylinePayloadParam;
import dji.sdk.wpmz.value.mission.WaylineTemplateDepartureInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateMapping2DInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateMapping3DInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateMappingCylinderInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateMappingObjectInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateMappingPrismInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateMappingStripInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplateType;
import dji.sdk.wpmz.value.mission.WaylineTemplateWaypointInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineTemplate
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineTemplateType templateType = WaylineTemplateType.UNKNOWN;
    Integer templateId = 0;
    WaylineCoordinateParam coordinateParam;
    Double transitionalSpeed = 0.0;
    Boolean useGlobalTransitionalSpeed = false;
    Double autoFlightSpeed = 0.0;
    List<WaylinePayloadParam> payloadParam = new ArrayList<WaylinePayloadParam>();
    WaylineTemplateWaypointInfo waypointInfo;
    WaylineTemplateMapping2DInfo mapping2DInfo;
    WaylineTemplateMapping3DInfo mapping3DInfo;
    WaylineTemplateMappingStripInfo mappingStripInfo;
    WaylineTemplateMappingPrismInfo mappingPrismInfo;
    WaylineTemplateMappingCylinderInfo mappingCylinderInfo;
    WaylineTemplateDepartureInfo departureInfo;
    WaylineTemplateMappingObjectInfo mappingObjectInfo;

    public WaylineTemplate() {
    }

    public WaylineTemplate(WaylineTemplateType templateType, Integer templateId, WaylineCoordinateParam coordinateParam, Double transitionalSpeed, Boolean useGlobalTransitionalSpeed, Double autoFlightSpeed, List<WaylinePayloadParam> payloadParam, WaylineTemplateWaypointInfo waypointInfo, WaylineTemplateMapping2DInfo mapping2DInfo, WaylineTemplateMapping3DInfo mapping3DInfo, WaylineTemplateMappingStripInfo mappingStripInfo, WaylineTemplateMappingPrismInfo mappingPrismInfo, WaylineTemplateMappingCylinderInfo mappingCylinderInfo, WaylineTemplateDepartureInfo departureInfo, WaylineTemplateMappingObjectInfo mappingObjectInfo) {
        if (templateType != null) {
            this.templateType = templateType;
        }
        if (templateId != null) {
            this.templateId = templateId;
        }
        if (coordinateParam != null) {
            this.coordinateParam = coordinateParam;
        }
        if (transitionalSpeed != null) {
            this.transitionalSpeed = transitionalSpeed;
        }
        if (useGlobalTransitionalSpeed != null) {
            this.useGlobalTransitionalSpeed = useGlobalTransitionalSpeed;
        }
        if (autoFlightSpeed != null) {
            this.autoFlightSpeed = autoFlightSpeed;
        }
        if (payloadParam != null) {
            this.payloadParam = payloadParam;
        }
        if (waypointInfo != null) {
            this.waypointInfo = waypointInfo;
        }
        if (mapping2DInfo != null) {
            this.mapping2DInfo = mapping2DInfo;
        }
        if (mapping3DInfo != null) {
            this.mapping3DInfo = mapping3DInfo;
        }
        if (mappingStripInfo != null) {
            this.mappingStripInfo = mappingStripInfo;
        }
        if (mappingPrismInfo != null) {
            this.mappingPrismInfo = mappingPrismInfo;
        }
        if (mappingCylinderInfo != null) {
            this.mappingCylinderInfo = mappingCylinderInfo;
        }
        if (departureInfo != null) {
            this.departureInfo = departureInfo;
        }
        if (mappingObjectInfo != null) {
            this.mappingObjectInfo = mappingObjectInfo;
        }
    }

    public static WaylineTemplate fromJson(String jsonString) {
        WaylineTemplate tmpValueResult_ = new WaylineTemplate();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.templateType = WaylineTemplateType.find(jsonObj.getInt("templateType"));
            tmpValueResult_.templateId = jsonObj.getInt("templateId");
            tmpValueResult_.coordinateParam = WaylineCoordinateParam.fromJson(jsonObj.getJSONObject("coordinateParam").toString());
            tmpValueResult_.transitionalSpeed = jsonObj.getDouble("transitionalSpeed");
            tmpValueResult_.useGlobalTransitionalSpeed = jsonObj.getBoolean("useGlobalTransitionalSpeed");
            tmpValueResult_.autoFlightSpeed = jsonObj.getDouble("autoFlightSpeed");
            JSONArray payloadParamJsonArr = jsonObj.getJSONArray("payloadParam");
            for (int i = 0; i < payloadParamJsonArr.length(); ++i) {
                tmpValueResult_.payloadParam.add(WaylinePayloadParam.fromJson(payloadParamJsonArr.getString(i)));
            }
            tmpValueResult_.waypointInfo = WaylineTemplateWaypointInfo.fromJson(jsonObj.getJSONObject("waypointInfo").toString());
            tmpValueResult_.mapping2DInfo = WaylineTemplateMapping2DInfo.fromJson(jsonObj.getJSONObject("mapping2DInfo").toString());
            tmpValueResult_.mapping3DInfo = WaylineTemplateMapping3DInfo.fromJson(jsonObj.getJSONObject("mapping3DInfo").toString());
            tmpValueResult_.mappingStripInfo = WaylineTemplateMappingStripInfo.fromJson(jsonObj.getJSONObject("mappingStripInfo").toString());
            tmpValueResult_.mappingPrismInfo = WaylineTemplateMappingPrismInfo.fromJson(jsonObj.getJSONObject("mappingPrismInfo").toString());
            tmpValueResult_.mappingCylinderInfo = WaylineTemplateMappingCylinderInfo.fromJson(jsonObj.getJSONObject("mappingCylinderInfo").toString());
            tmpValueResult_.departureInfo = WaylineTemplateDepartureInfo.fromJson(jsonObj.getJSONObject("departureInfo").toString());
            tmpValueResult_.mappingObjectInfo = WaylineTemplateMappingObjectInfo.fromJson(jsonObj.getJSONObject("mappingObjectInfo").toString());
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
            if (null != this.templateType) {
                json.put("templateType", this.templateType.value());
            }
            if (null != this.templateId) {
                json.put("templateId", (Object)this.templateId);
            }
            if (null != this.coordinateParam) {
                json.put("coordinateParam", (Object)this.coordinateParam.toJson());
            }
            if (null != this.transitionalSpeed) {
                json.put("transitionalSpeed", (Object)this.transitionalSpeed);
            }
            if (null != this.useGlobalTransitionalSpeed) {
                json.put("useGlobalTransitionalSpeed", (Object)this.useGlobalTransitionalSpeed);
            }
            if (null != this.autoFlightSpeed) {
                json.put("autoFlightSpeed", (Object)this.autoFlightSpeed);
            }
            if (null != this.payloadParam) {
                JSONArray json_arr_payloadParam = new JSONArray();
                for (int i = 0; i < this.payloadParam.size(); ++i) {
                    json_arr_payloadParam.put((Object)this.payloadParam.get(i).toJson());
                }
                json.put("payloadParam", (Object)json_arr_payloadParam);
            }
            if (null != this.waypointInfo) {
                json.put("waypointInfo", (Object)this.waypointInfo.toJson());
            }
            if (null != this.mapping2DInfo) {
                json.put("mapping2DInfo", (Object)this.mapping2DInfo.toJson());
            }
            if (null != this.mapping3DInfo) {
                json.put("mapping3DInfo", (Object)this.mapping3DInfo.toJson());
            }
            if (null != this.mappingStripInfo) {
                json.put("mappingStripInfo", (Object)this.mappingStripInfo.toJson());
            }
            if (null != this.mappingPrismInfo) {
                json.put("mappingPrismInfo", (Object)this.mappingPrismInfo.toJson());
            }
            if (null != this.mappingCylinderInfo) {
                json.put("mappingCylinderInfo", (Object)this.mappingCylinderInfo.toJson());
            }
            if (null != this.departureInfo) {
                json.put("departureInfo", (Object)this.departureInfo.toJson());
            }
            if (null != this.mappingObjectInfo) {
                json.put("mappingObjectInfo", (Object)this.mappingObjectInfo.toJson());
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
        serializedLength += ByteStreamHelper.integerGetLength(this.templateType.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.templateId);
        serializedLength += ByteStreamHelper.getLength(this.coordinateParam, WaylineCoordinateParam.class);
        serializedLength += ByteStreamHelper.doubleGetLength(this.transitionalSpeed);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useGlobalTransitionalSpeed);
        serializedLength += ByteStreamHelper.doubleGetLength(this.autoFlightSpeed);
        serializedLength += ByteStreamHelper.arrayGetLength(this.payloadParam);
        serializedLength += ByteStreamHelper.getLength(this.waypointInfo, WaylineTemplateWaypointInfo.class);
        serializedLength += ByteStreamHelper.getLength(this.mapping2DInfo, WaylineTemplateMapping2DInfo.class);
        serializedLength += ByteStreamHelper.getLength(this.mapping3DInfo, WaylineTemplateMapping3DInfo.class);
        serializedLength += ByteStreamHelper.getLength(this.mappingStripInfo, WaylineTemplateMappingStripInfo.class);
        serializedLength += ByteStreamHelper.getLength(this.mappingPrismInfo, WaylineTemplateMappingPrismInfo.class);
        serializedLength += ByteStreamHelper.getLength(this.mappingCylinderInfo, WaylineTemplateMappingCylinderInfo.class);
        serializedLength += ByteStreamHelper.getLength(this.departureInfo, WaylineTemplateDepartureInfo.class);
        return serializedLength += ByteStreamHelper.getLength(this.mappingObjectInfo, WaylineTemplateMappingObjectInfo.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.templateType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.templateId, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.coordinateParam, serializedIndex, WaylineCoordinateParam.class);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.transitionalSpeed, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useGlobalTransitionalSpeed, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.autoFlightSpeed, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.payloadParam, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.waypointInfo, serializedIndex, WaylineTemplateWaypointInfo.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.mapping2DInfo, serializedIndex, WaylineTemplateMapping2DInfo.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.mapping3DInfo, serializedIndex, WaylineTemplateMapping3DInfo.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.mappingStripInfo, serializedIndex, WaylineTemplateMappingStripInfo.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.mappingPrismInfo, serializedIndex, WaylineTemplateMappingPrismInfo.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.mappingCylinderInfo, serializedIndex, WaylineTemplateMappingCylinderInfo.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.departureInfo, serializedIndex, WaylineTemplateDepartureInfo.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.mappingObjectInfo, serializedIndex, WaylineTemplateMappingObjectInfo.class);
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
        ByteResult<Integer> tmpTemplateType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.templateType = WaylineTemplateType.find((Integer)tmpTemplateType.result);
        deserilizationIndex = tmpTemplateType.endIndex;
        ByteResult<Integer> tmpTemplateId = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.templateId = (Integer)tmpTemplateId.result;
        deserilizationIndex = tmpTemplateId.endIndex;
        ByteResult<WaylineCoordinateParam> tmpCoordinateParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineCoordinateParam.class);
        this.coordinateParam = (WaylineCoordinateParam)tmpCoordinateParam.result;
        deserilizationIndex = tmpCoordinateParam.endIndex;
        ByteResult<Double> tmpTransitionalSpeed = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.transitionalSpeed = (Double)tmpTransitionalSpeed.result;
        deserilizationIndex = tmpTransitionalSpeed.endIndex;
        ByteResult<Boolean> tmpUseGlobalTransitionalSpeed = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useGlobalTransitionalSpeed = (Boolean)tmpUseGlobalTransitionalSpeed.result;
        deserilizationIndex = tmpUseGlobalTransitionalSpeed.endIndex;
        ByteResult<Double> tmpAutoFlightSpeed = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.autoFlightSpeed = (Double)tmpAutoFlightSpeed.result;
        deserilizationIndex = tmpAutoFlightSpeed.endIndex;
        ByteResult<List<WaylinePayloadParam>> tmpPayloadParam = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylinePayloadParam.class);
        this.payloadParam = (List)tmpPayloadParam.result;
        deserilizationIndex = tmpPayloadParam.endIndex;
        ByteResult<WaylineTemplateWaypointInfo> tmpWaypointInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTemplateWaypointInfo.class);
        this.waypointInfo = (WaylineTemplateWaypointInfo)tmpWaypointInfo.result;
        deserilizationIndex = tmpWaypointInfo.endIndex;
        ByteResult<WaylineTemplateMapping2DInfo> tmpMapping2DInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTemplateMapping2DInfo.class);
        this.mapping2DInfo = (WaylineTemplateMapping2DInfo)tmpMapping2DInfo.result;
        deserilizationIndex = tmpMapping2DInfo.endIndex;
        ByteResult<WaylineTemplateMapping3DInfo> tmpMapping3DInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTemplateMapping3DInfo.class);
        this.mapping3DInfo = (WaylineTemplateMapping3DInfo)tmpMapping3DInfo.result;
        deserilizationIndex = tmpMapping3DInfo.endIndex;
        ByteResult<WaylineTemplateMappingStripInfo> tmpMappingStripInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTemplateMappingStripInfo.class);
        this.mappingStripInfo = (WaylineTemplateMappingStripInfo)tmpMappingStripInfo.result;
        deserilizationIndex = tmpMappingStripInfo.endIndex;
        ByteResult<WaylineTemplateMappingPrismInfo> tmpMappingPrismInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTemplateMappingPrismInfo.class);
        this.mappingPrismInfo = (WaylineTemplateMappingPrismInfo)tmpMappingPrismInfo.result;
        deserilizationIndex = tmpMappingPrismInfo.endIndex;
        ByteResult<WaylineTemplateMappingCylinderInfo> tmpMappingCylinderInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTemplateMappingCylinderInfo.class);
        this.mappingCylinderInfo = (WaylineTemplateMappingCylinderInfo)tmpMappingCylinderInfo.result;
        deserilizationIndex = tmpMappingCylinderInfo.endIndex;
        ByteResult<WaylineTemplateDepartureInfo> tmpDepartureInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTemplateDepartureInfo.class);
        this.departureInfo = (WaylineTemplateDepartureInfo)tmpDepartureInfo.result;
        deserilizationIndex = tmpDepartureInfo.endIndex;
        ByteResult<WaylineTemplateMappingObjectInfo> tmpMappingObjectInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTemplateMappingObjectInfo.class);
        this.mappingObjectInfo = (WaylineTemplateMappingObjectInfo)tmpMappingObjectInfo.result;
        deserilizationIndex = tmpMappingObjectInfo.endIndex;
        return deserilizationIndex;
    }

    public WaylineTemplateType getTemplateType() {
        return this.templateType;
    }

    public void setTemplateType(WaylineTemplateType templateType) {
        this.templateType = templateType;
    }

    public Integer getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public WaylineCoordinateParam getCoordinateParam() {
        return this.coordinateParam;
    }

    public void setCoordinateParam(WaylineCoordinateParam coordinateParam) {
        this.coordinateParam = coordinateParam;
    }

    public Double getTransitionalSpeed() {
        return this.transitionalSpeed;
    }

    public void setTransitionalSpeed(Double transitionalSpeed) {
        this.transitionalSpeed = transitionalSpeed;
    }

    public Boolean getUseGlobalTransitionalSpeed() {
        return this.useGlobalTransitionalSpeed;
    }

    public void setUseGlobalTransitionalSpeed(Boolean useGlobalTransitionalSpeed) {
        this.useGlobalTransitionalSpeed = useGlobalTransitionalSpeed;
    }

    public Double getAutoFlightSpeed() {
        return this.autoFlightSpeed;
    }

    public void setAutoFlightSpeed(Double autoFlightSpeed) {
        this.autoFlightSpeed = autoFlightSpeed;
    }

    public List<WaylinePayloadParam> getPayloadParam() {
        return this.payloadParam;
    }

    public void setPayloadParam(List<WaylinePayloadParam> payloadParam) {
        this.payloadParam = payloadParam;
    }

    public WaylineTemplateWaypointInfo getWaypointInfo() {
        return this.waypointInfo;
    }

    public void setWaypointInfo(WaylineTemplateWaypointInfo waypointInfo) {
        this.waypointInfo = waypointInfo;
    }

    public WaylineTemplateMapping2DInfo getMapping2DInfo() {
        return this.mapping2DInfo;
    }

    public void setMapping2DInfo(WaylineTemplateMapping2DInfo mapping2DInfo) {
        this.mapping2DInfo = mapping2DInfo;
    }

    public WaylineTemplateMapping3DInfo getMapping3DInfo() {
        return this.mapping3DInfo;
    }

    public void setMapping3DInfo(WaylineTemplateMapping3DInfo mapping3DInfo) {
        this.mapping3DInfo = mapping3DInfo;
    }

    public WaylineTemplateMappingStripInfo getMappingStripInfo() {
        return this.mappingStripInfo;
    }

    public void setMappingStripInfo(WaylineTemplateMappingStripInfo mappingStripInfo) {
        this.mappingStripInfo = mappingStripInfo;
    }

    public WaylineTemplateMappingPrismInfo getMappingPrismInfo() {
        return this.mappingPrismInfo;
    }

    public void setMappingPrismInfo(WaylineTemplateMappingPrismInfo mappingPrismInfo) {
        this.mappingPrismInfo = mappingPrismInfo;
    }

    public WaylineTemplateMappingCylinderInfo getMappingCylinderInfo() {
        return this.mappingCylinderInfo;
    }

    public void setMappingCylinderInfo(WaylineTemplateMappingCylinderInfo mappingCylinderInfo) {
        this.mappingCylinderInfo = mappingCylinderInfo;
    }

    public WaylineTemplateDepartureInfo getDepartureInfo() {
        return this.departureInfo;
    }

    public void setDepartureInfo(WaylineTemplateDepartureInfo departureInfo) {
        this.departureInfo = departureInfo;
    }

    public WaylineTemplateMappingObjectInfo getMappingObjectInfo() {
        return this.mappingObjectInfo;
    }

    public void setMappingObjectInfo(WaylineTemplateMappingObjectInfo mappingObjectInfo) {
        this.mappingObjectInfo = mappingObjectInfo;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTemplate)) {
            return false;
        }
        WaylineTemplate that = (WaylineTemplate)o;
        return Objects.equals(this.templateType, that.templateType) && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.coordinateParam, that.coordinateParam) && Objects.equals(this.transitionalSpeed, that.transitionalSpeed) && Objects.equals(this.useGlobalTransitionalSpeed, that.useGlobalTransitionalSpeed) && Objects.equals(this.autoFlightSpeed, that.autoFlightSpeed) && Objects.equals(this.payloadParam, that.payloadParam) && Objects.equals(this.waypointInfo, that.waypointInfo) && Objects.equals(this.mapping2DInfo, that.mapping2DInfo) && Objects.equals(this.mapping3DInfo, that.mapping3DInfo) && Objects.equals(this.mappingStripInfo, that.mappingStripInfo) && Objects.equals(this.mappingPrismInfo, that.mappingPrismInfo) && Objects.equals(this.mappingCylinderInfo, that.mappingCylinderInfo) && Objects.equals(this.departureInfo, that.departureInfo) && Objects.equals(this.mappingObjectInfo, that.mappingObjectInfo);
    }

    public int hashCode() {
        return Objects.hash(this.templateType, this.templateId, this.coordinateParam, this.transitionalSpeed, this.useGlobalTransitionalSpeed, this.autoFlightSpeed, this.payloadParam, this.waypointInfo, this.mapping2DInfo, this.mapping3DInfo, this.mappingStripInfo, this.mappingPrismInfo, this.mappingCylinderInfo, this.departureInfo, this.mappingObjectInfo);
    }
}

