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
import dji.sdk.wpmz.value.mission.WaylineActionPanoShotSubModeType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class ActionPanoShotParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String actionUUID = "";
    Boolean useGlobalPayloadLensIndex = false;
    Integer payloadPositionIndex = 0;
    List<CameraLensType> payloadLensIndex = new ArrayList<CameraLensType>();
    WaylineActionPanoShotSubModeType subMode = WaylineActionPanoShotSubModeType.UNKNOWN;
    Boolean aircraftHeadingEnable = false;
    Double aircraftHeading = 0.0;

    public ActionPanoShotParam() {
    }

    public ActionPanoShotParam(String actionUUID, Boolean useGlobalPayloadLensIndex, Integer payloadPositionIndex, List<CameraLensType> payloadLensIndex, WaylineActionPanoShotSubModeType subMode, Boolean aircraftHeadingEnable, Double aircraftHeading) {
        if (actionUUID != null) {
            this.actionUUID = actionUUID;
        }
        if (useGlobalPayloadLensIndex != null) {
            this.useGlobalPayloadLensIndex = useGlobalPayloadLensIndex;
        }
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (payloadLensIndex != null) {
            this.payloadLensIndex = payloadLensIndex;
        }
        if (subMode != null) {
            this.subMode = subMode;
        }
        if (aircraftHeadingEnable != null) {
            this.aircraftHeadingEnable = aircraftHeadingEnable;
        }
        if (aircraftHeading != null) {
            this.aircraftHeading = aircraftHeading;
        }
    }

    public static ActionPanoShotParam fromJson(String jsonString) {
        ActionPanoShotParam tmpValueResult_ = new ActionPanoShotParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.actionUUID = jsonObj.getString("actionUUID");
            tmpValueResult_.useGlobalPayloadLensIndex = jsonObj.getBoolean("useGlobalPayloadLensIndex");
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            JSONArray payloadLensIndexJsonArr = jsonObj.getJSONArray("payloadLensIndex");
            for (int i = 0; i < payloadLensIndexJsonArr.length(); ++i) {
                tmpValueResult_.payloadLensIndex.add(CameraLensType.find(payloadLensIndexJsonArr.getInt(i)));
            }
            tmpValueResult_.subMode = WaylineActionPanoShotSubModeType.find(jsonObj.getInt("subMode"));
            tmpValueResult_.aircraftHeadingEnable = jsonObj.getBoolean("aircraftHeadingEnable");
            tmpValueResult_.aircraftHeading = jsonObj.getDouble("aircraftHeading");
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
            if (null != this.actionUUID) {
                json.put("actionUUID", (Object)this.actionUUID);
            }
            if (null != this.useGlobalPayloadLensIndex) {
                json.put("useGlobalPayloadLensIndex", (Object)this.useGlobalPayloadLensIndex);
            }
            if (null != this.payloadPositionIndex) {
                json.put("payloadPositionIndex", (Object)this.payloadPositionIndex);
            }
            if (null != this.payloadLensIndex) {
                JSONArray json_arr_payloadLensIndex = new JSONArray();
                for (int i = 0; i < this.payloadLensIndex.size(); ++i) {
                    json_arr_payloadLensIndex.put(this.payloadLensIndex.get(i).value());
                }
                json.put("payloadLensIndex", (Object)json_arr_payloadLensIndex);
            }
            if (null != this.subMode) {
                json.put("subMode", this.subMode.value());
            }
            if (null != this.aircraftHeadingEnable) {
                json.put("aircraftHeadingEnable", (Object)this.aircraftHeadingEnable);
            }
            if (null != this.aircraftHeading) {
                json.put("aircraftHeading", (Object)this.aircraftHeading);
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
        serializedLength += ByteStreamHelper.booleanGetLength(this.useGlobalPayloadLensIndex);
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadPositionIndex);
        serializedLength += 4;
        for (int i = 0; i < this.payloadLensIndex.size(); ++i) {
            serializedLength += ByteStreamHelper.integerGetLength(this.payloadLensIndex.get(i).value());
        }
        serializedLength += ByteStreamHelper.integerGetLength(this.subMode.value());
        serializedLength += ByteStreamHelper.booleanGetLength(this.aircraftHeadingEnable);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.aircraftHeading);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.actionUUID, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useGlobalPayloadLensIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        int arrlength = this.payloadLensIndex.size();
        ByteStreamHelper.intArrayTobyte(resultBytes, serializedIndex, arrlength);
        serializedIndex += 4;
        for (int i = 0; i < arrlength; ++i) {
            serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadLensIndex.get(i).value(), serializedIndex);
        }
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.subMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.aircraftHeadingEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.aircraftHeading, serializedIndex);
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
        ByteResult<Boolean> tmpUseGlobalPayloadLensIndex = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useGlobalPayloadLensIndex = (Boolean)tmpUseGlobalPayloadLensIndex.result;
        deserilizationIndex = tmpUseGlobalPayloadLensIndex.endIndex;
        ByteResult<Integer> tmpPayloadPositionIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.payloadPositionIndex = (Integer)tmpPayloadPositionIndex.result;
        deserilizationIndex = tmpPayloadPositionIndex.endIndex;
        this.payloadLensIndex = new ArrayList<CameraLensType>();
        int length = ByteBuffer.wrap(data, deserilizationIndex, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
        deserilizationIndex += 4;
        for (int i = 0; i < length; ++i) {
            ByteResult<Integer> member = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
            deserilizationIndex = member.endIndex;
            this.payloadLensIndex.add(CameraLensType.find((Integer)member.result));
        }
        ByteResult<Integer> tmpSubMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.subMode = WaylineActionPanoShotSubModeType.find((Integer)tmpSubMode.result);
        deserilizationIndex = tmpSubMode.endIndex;
        ByteResult<Boolean> tmpAircraftHeadingEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.aircraftHeadingEnable = (Boolean)tmpAircraftHeadingEnable.result;
        deserilizationIndex = tmpAircraftHeadingEnable.endIndex;
        ByteResult<Double> tmpAircraftHeading = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.aircraftHeading = (Double)tmpAircraftHeading.result;
        deserilizationIndex = tmpAircraftHeading.endIndex;
        return deserilizationIndex;
    }

    public String getActionUUID() {
        return this.actionUUID;
    }

    public void setActionUUID(String actionUUID) {
        this.actionUUID = actionUUID;
    }

    public Boolean getUseGlobalPayloadLensIndex() {
        return this.useGlobalPayloadLensIndex;
    }

    public void setUseGlobalPayloadLensIndex(Boolean useGlobalPayloadLensIndex) {
        this.useGlobalPayloadLensIndex = useGlobalPayloadLensIndex;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public List<CameraLensType> getPayloadLensIndex() {
        return this.payloadLensIndex;
    }

    public void setPayloadLensIndex(List<CameraLensType> payloadLensIndex) {
        this.payloadLensIndex = payloadLensIndex;
    }

    public WaylineActionPanoShotSubModeType getSubMode() {
        return this.subMode;
    }

    public void setSubMode(WaylineActionPanoShotSubModeType subMode) {
        this.subMode = subMode;
    }

    public Boolean getAircraftHeadingEnable() {
        return this.aircraftHeadingEnable;
    }

    public void setAircraftHeadingEnable(Boolean aircraftHeadingEnable) {
        this.aircraftHeadingEnable = aircraftHeadingEnable;
    }

    public Double getAircraftHeading() {
        return this.aircraftHeading;
    }

    public void setAircraftHeading(Double aircraftHeading) {
        this.aircraftHeading = aircraftHeading;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionPanoShotParam)) {
            return false;
        }
        ActionPanoShotParam that = (ActionPanoShotParam)o;
        return Objects.equals(this.actionUUID, that.actionUUID) && Objects.equals(this.useGlobalPayloadLensIndex, that.useGlobalPayloadLensIndex) && Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.payloadLensIndex, that.payloadLensIndex) && Objects.equals(this.subMode, that.subMode) && Objects.equals(this.aircraftHeadingEnable, that.aircraftHeadingEnable) && Objects.equals(this.aircraftHeading, that.aircraftHeading);
    }

    public int hashCode() {
        return Objects.hash(this.actionUUID, this.useGlobalPayloadLensIndex, this.payloadPositionIndex, this.payloadLensIndex, this.subMode, this.aircraftHeadingEnable, this.aircraftHeading);
    }
}

