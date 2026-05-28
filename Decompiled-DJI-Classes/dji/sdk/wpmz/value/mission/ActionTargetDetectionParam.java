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
import dji.sdk.wpmz.value.mission.CameraLensType;
import dji.sdk.wpmz.value.mission.TargetDetectionAlarmActionParam;
import dji.sdk.wpmz.value.mission.TargetDetectionIrColorPalette;
import dji.sdk.wpmz.value.mission.TargetDetectionIrGainMode;
import dji.sdk.wpmz.value.mission.TargetDetectionTargetParam;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class ActionTargetDetectionParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String actionUUID = "";
    Integer payloadPositionIndex = 0;
    Boolean useGlobalPayloadLensIndex = false;
    List<CameraLensType> payloadLensIndex = new ArrayList<CameraLensType>();
    TargetDetectionIrGainMode irGainMode = TargetDetectionIrGainMode.UNKNOWN;
    TargetDetectionIrColorPalette irColorPalette = TargetDetectionIrColorPalette.UNKNOWN;
    List<TargetDetectionTargetParam> targetParam = new ArrayList<TargetDetectionTargetParam>();
    String identificationAreaFileName = "";
    String identificationAreaId = "";
    String customTitle = "";
    String customText = "";
    List<TargetDetectionAlarmActionParam> alarmActionParam = new ArrayList<TargetDetectionAlarmActionParam>();

    public ActionTargetDetectionParam() {
    }

    public ActionTargetDetectionParam(String actionUUID, Integer payloadPositionIndex, Boolean useGlobalPayloadLensIndex, List<CameraLensType> payloadLensIndex, TargetDetectionIrGainMode irGainMode, TargetDetectionIrColorPalette irColorPalette, List<TargetDetectionTargetParam> targetParam, String identificationAreaFileName, String identificationAreaId, String customTitle, String customText, List<TargetDetectionAlarmActionParam> alarmActionParam) {
        if (actionUUID != null) {
            this.actionUUID = actionUUID;
        }
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (useGlobalPayloadLensIndex != null) {
            this.useGlobalPayloadLensIndex = useGlobalPayloadLensIndex;
        }
        if (payloadLensIndex != null) {
            this.payloadLensIndex = payloadLensIndex;
        }
        if (irGainMode != null) {
            this.irGainMode = irGainMode;
        }
        if (irColorPalette != null) {
            this.irColorPalette = irColorPalette;
        }
        if (targetParam != null) {
            this.targetParam = targetParam;
        }
        if (identificationAreaFileName != null) {
            this.identificationAreaFileName = identificationAreaFileName;
        }
        if (identificationAreaId != null) {
            this.identificationAreaId = identificationAreaId;
        }
        if (customTitle != null) {
            this.customTitle = customTitle;
        }
        if (customText != null) {
            this.customText = customText;
        }
        if (alarmActionParam != null) {
            this.alarmActionParam = alarmActionParam;
        }
    }

    public static ActionTargetDetectionParam fromJson(String jsonString) {
        ActionTargetDetectionParam tmpValueResult_ = new ActionTargetDetectionParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.actionUUID = jsonObj.getString("actionUUID");
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.useGlobalPayloadLensIndex = jsonObj.getBoolean("useGlobalPayloadLensIndex");
            JSONArray payloadLensIndexJsonArr = jsonObj.getJSONArray("payloadLensIndex");
            for (int i = 0; i < payloadLensIndexJsonArr.length(); ++i) {
                tmpValueResult_.payloadLensIndex.add(CameraLensType.find(payloadLensIndexJsonArr.getInt(i)));
            }
            tmpValueResult_.irGainMode = TargetDetectionIrGainMode.find(jsonObj.getInt("irGainMode"));
            tmpValueResult_.irColorPalette = TargetDetectionIrColorPalette.find(jsonObj.getInt("irColorPalette"));
            JSONArray targetParamJsonArr = jsonObj.getJSONArray("targetParam");
            for (int i = 0; i < targetParamJsonArr.length(); ++i) {
                tmpValueResult_.targetParam.add(TargetDetectionTargetParam.fromJson(targetParamJsonArr.getString(i)));
            }
            tmpValueResult_.identificationAreaFileName = jsonObj.getString("identificationAreaFileName");
            tmpValueResult_.identificationAreaId = jsonObj.getString("identificationAreaId");
            tmpValueResult_.customTitle = jsonObj.getString("customTitle");
            tmpValueResult_.customText = jsonObj.getString("customText");
            JSONArray alarmActionParamJsonArr = jsonObj.getJSONArray("alarmActionParam");
            for (int i = 0; i < alarmActionParamJsonArr.length(); ++i) {
                tmpValueResult_.alarmActionParam.add(TargetDetectionAlarmActionParam.fromJson(alarmActionParamJsonArr.getString(i)));
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
            if (null != this.actionUUID) {
                json.put("actionUUID", (Object)this.actionUUID);
            }
            if (null != this.payloadPositionIndex) {
                json.put("payloadPositionIndex", (Object)this.payloadPositionIndex);
            }
            if (null != this.useGlobalPayloadLensIndex) {
                json.put("useGlobalPayloadLensIndex", (Object)this.useGlobalPayloadLensIndex);
            }
            if (null != this.payloadLensIndex) {
                JSONArray json_arr_payloadLensIndex = new JSONArray();
                for (i = 0; i < this.payloadLensIndex.size(); ++i) {
                    json_arr_payloadLensIndex.put(this.payloadLensIndex.get(i).value());
                }
                json.put("payloadLensIndex", (Object)json_arr_payloadLensIndex);
            }
            if (null != this.irGainMode) {
                json.put("irGainMode", this.irGainMode.value());
            }
            if (null != this.irColorPalette) {
                json.put("irColorPalette", this.irColorPalette.value());
            }
            if (null != this.targetParam) {
                JSONArray json_arr_targetParam = new JSONArray();
                for (i = 0; i < this.targetParam.size(); ++i) {
                    json_arr_targetParam.put((Object)this.targetParam.get(i).toJson());
                }
                json.put("targetParam", (Object)json_arr_targetParam);
            }
            if (null != this.identificationAreaFileName) {
                json.put("identificationAreaFileName", (Object)this.identificationAreaFileName);
            }
            if (null != this.identificationAreaId) {
                json.put("identificationAreaId", (Object)this.identificationAreaId);
            }
            if (null != this.customTitle) {
                json.put("customTitle", (Object)this.customTitle);
            }
            if (null != this.customText) {
                json.put("customText", (Object)this.customText);
            }
            if (null != this.alarmActionParam) {
                JSONArray json_arr_alarmActionParam = new JSONArray();
                for (i = 0; i < this.alarmActionParam.size(); ++i) {
                    json_arr_alarmActionParam.put((Object)this.alarmActionParam.get(i).toJson());
                }
                json.put("alarmActionParam", (Object)json_arr_alarmActionParam);
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
        serializedLength += ByteStreamHelper.stringGetLength(this.actionUUID);
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadPositionIndex);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useGlobalPayloadLensIndex);
        serializedLength += 4;
        for (int i = 0; i < this.payloadLensIndex.size(); ++i) {
            serializedLength += ByteStreamHelper.integerGetLength(this.payloadLensIndex.get(i).value());
        }
        serializedLength += ByteStreamHelper.integerGetLength(this.irGainMode.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.irColorPalette.value());
        serializedLength += ByteStreamHelper.arrayGetLength(this.targetParam);
        serializedLength += ByteStreamHelper.stringGetLength(this.identificationAreaFileName);
        serializedLength += ByteStreamHelper.stringGetLength(this.identificationAreaId);
        serializedLength += ByteStreamHelper.stringGetLength(this.customTitle);
        serializedLength += ByteStreamHelper.stringGetLength(this.customText);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.alarmActionParam);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.actionUUID, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useGlobalPayloadLensIndex, serializedIndex);
        int arrlength = this.payloadLensIndex.size();
        ByteStreamHelper.intArrayTobyte(resultBytes, serializedIndex, arrlength);
        serializedIndex += 4;
        for (int i = 0; i < arrlength; ++i) {
            serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadLensIndex.get(i).value(), serializedIndex);
        }
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.irGainMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.irColorPalette.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.targetParam, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.identificationAreaFileName, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.identificationAreaId, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.customTitle, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.customText, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.alarmActionParam, serializedIndex);
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
        ByteResult<String> tmpActionUUID = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.actionUUID = (String)tmpActionUUID.result;
        deserilizationIndex = tmpActionUUID.endIndex;
        ByteResult<Integer> tmpPayloadPositionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.payloadPositionIndex = (Integer)tmpPayloadPositionIndex.result;
        deserilizationIndex = tmpPayloadPositionIndex.endIndex;
        ByteResult<Boolean> tmpUseGlobalPayloadLensIndex = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useGlobalPayloadLensIndex = (Boolean)tmpUseGlobalPayloadLensIndex.result;
        deserilizationIndex = tmpUseGlobalPayloadLensIndex.endIndex;
        this.payloadLensIndex = new ArrayList<CameraLensType>();
        int length = ByteBuffer.wrap(data, deserilizationIndex, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
        deserilizationIndex += 4;
        for (int i = 0; i < length; ++i) {
            ByteResult<Integer> member = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
            deserilizationIndex = member.endIndex;
            this.payloadLensIndex.add(CameraLensType.find((Integer)member.result));
        }
        ByteResult<Integer> tmpIrGainMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.irGainMode = TargetDetectionIrGainMode.find((Integer)tmpIrGainMode.result);
        deserilizationIndex = tmpIrGainMode.endIndex;
        ByteResult<Integer> tmpIrColorPalette = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.irColorPalette = TargetDetectionIrColorPalette.find((Integer)tmpIrColorPalette.result);
        deserilizationIndex = tmpIrColorPalette.endIndex;
        ByteResult<List<TargetDetectionTargetParam>> tmpTargetParam = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, TargetDetectionTargetParam.class);
        this.targetParam = (List)tmpTargetParam.result;
        deserilizationIndex = tmpTargetParam.endIndex;
        ByteResult<String> tmpIdentificationAreaFileName = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.identificationAreaFileName = (String)tmpIdentificationAreaFileName.result;
        deserilizationIndex = tmpIdentificationAreaFileName.endIndex;
        ByteResult<String> tmpIdentificationAreaId = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.identificationAreaId = (String)tmpIdentificationAreaId.result;
        deserilizationIndex = tmpIdentificationAreaId.endIndex;
        ByteResult<String> tmpCustomTitle = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.customTitle = (String)tmpCustomTitle.result;
        deserilizationIndex = tmpCustomTitle.endIndex;
        ByteResult<String> tmpCustomText = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.customText = (String)tmpCustomText.result;
        deserilizationIndex = tmpCustomText.endIndex;
        ByteResult<List<TargetDetectionAlarmActionParam>> tmpAlarmActionParam = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, TargetDetectionAlarmActionParam.class);
        this.alarmActionParam = (List)tmpAlarmActionParam.result;
        deserilizationIndex = tmpAlarmActionParam.endIndex;
        return deserilizationIndex;
    }

    public String getActionUUID() {
        return this.actionUUID;
    }

    public void setActionUUID(String actionUUID) {
        this.actionUUID = actionUUID;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public Boolean getUseGlobalPayloadLensIndex() {
        return this.useGlobalPayloadLensIndex;
    }

    public void setUseGlobalPayloadLensIndex(Boolean useGlobalPayloadLensIndex) {
        this.useGlobalPayloadLensIndex = useGlobalPayloadLensIndex;
    }

    public List<CameraLensType> getPayloadLensIndex() {
        return this.payloadLensIndex;
    }

    public void setPayloadLensIndex(List<CameraLensType> payloadLensIndex) {
        this.payloadLensIndex = payloadLensIndex;
    }

    public TargetDetectionIrGainMode getIrGainMode() {
        return this.irGainMode;
    }

    public void setIrGainMode(TargetDetectionIrGainMode irGainMode) {
        this.irGainMode = irGainMode;
    }

    public TargetDetectionIrColorPalette getIrColorPalette() {
        return this.irColorPalette;
    }

    public void setIrColorPalette(TargetDetectionIrColorPalette irColorPalette) {
        this.irColorPalette = irColorPalette;
    }

    public List<TargetDetectionTargetParam> getTargetParam() {
        return this.targetParam;
    }

    public void setTargetParam(List<TargetDetectionTargetParam> targetParam) {
        this.targetParam = targetParam;
    }

    public String getIdentificationAreaFileName() {
        return this.identificationAreaFileName;
    }

    public void setIdentificationAreaFileName(String identificationAreaFileName) {
        this.identificationAreaFileName = identificationAreaFileName;
    }

    public String getIdentificationAreaId() {
        return this.identificationAreaId;
    }

    public void setIdentificationAreaId(String identificationAreaId) {
        this.identificationAreaId = identificationAreaId;
    }

    public String getCustomTitle() {
        return this.customTitle;
    }

    public void setCustomTitle(String customTitle) {
        this.customTitle = customTitle;
    }

    public String getCustomText() {
        return this.customText;
    }

    public void setCustomText(String customText) {
        this.customText = customText;
    }

    public List<TargetDetectionAlarmActionParam> getAlarmActionParam() {
        return this.alarmActionParam;
    }

    public void setAlarmActionParam(List<TargetDetectionAlarmActionParam> alarmActionParam) {
        this.alarmActionParam = alarmActionParam;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionTargetDetectionParam)) {
            return false;
        }
        ActionTargetDetectionParam that = (ActionTargetDetectionParam)o;
        return Objects.equals(this.actionUUID, that.actionUUID) && Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.useGlobalPayloadLensIndex, that.useGlobalPayloadLensIndex) && Objects.equals(this.payloadLensIndex, that.payloadLensIndex) && Objects.equals(this.irGainMode, that.irGainMode) && Objects.equals(this.irColorPalette, that.irColorPalette) && Objects.equals(this.targetParam, that.targetParam) && Objects.equals(this.identificationAreaFileName, that.identificationAreaFileName) && Objects.equals(this.identificationAreaId, that.identificationAreaId) && Objects.equals(this.customTitle, that.customTitle) && Objects.equals(this.customText, that.customText) && Objects.equals(this.alarmActionParam, that.alarmActionParam);
    }

    public int hashCode() {
        return Objects.hash(this.actionUUID, this.payloadPositionIndex, this.useGlobalPayloadLensIndex, this.payloadLensIndex, this.irGainMode, this.irColorPalette, this.targetParam, this.identificationAreaFileName, this.identificationAreaId, this.customTitle, this.customText, this.alarmActionParam);
    }
}

