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
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class ActionZoomParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer payloadPositionIndex = 0;
    List<CameraLensType> payloadLensIndex = new ArrayList<CameraLensType>();
    Double focalLength = 0.0;
    Boolean isUseFocalFactor = false;
    Double focalFactor = 0.0;

    public ActionZoomParam() {
    }

    public ActionZoomParam(Integer payloadPositionIndex, List<CameraLensType> payloadLensIndex, Double focalLength, Boolean isUseFocalFactor, Double focalFactor) {
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (payloadLensIndex != null) {
            this.payloadLensIndex = payloadLensIndex;
        }
        if (focalLength != null) {
            this.focalLength = focalLength;
        }
        if (isUseFocalFactor != null) {
            this.isUseFocalFactor = isUseFocalFactor;
        }
        if (focalFactor != null) {
            this.focalFactor = focalFactor;
        }
    }

    public static ActionZoomParam fromJson(String jsonString) {
        ActionZoomParam tmpValueResult_ = new ActionZoomParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            JSONArray payloadLensIndexJsonArr = jsonObj.getJSONArray("payloadLensIndex");
            for (int i = 0; i < payloadLensIndexJsonArr.length(); ++i) {
                tmpValueResult_.payloadLensIndex.add(CameraLensType.find(payloadLensIndexJsonArr.getInt(i)));
            }
            tmpValueResult_.focalLength = jsonObj.getDouble("focalLength");
            tmpValueResult_.isUseFocalFactor = jsonObj.getBoolean("isUseFocalFactor");
            tmpValueResult_.focalFactor = jsonObj.getDouble("focalFactor");
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
            if (null != this.focalLength) {
                json.put("focalLength", (Object)this.focalLength);
            }
            if (null != this.isUseFocalFactor) {
                json.put("isUseFocalFactor", (Object)this.isUseFocalFactor);
            }
            if (null != this.focalFactor) {
                json.put("focalFactor", (Object)this.focalFactor);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.payloadPositionIndex);
        serializedLength += 4;
        for (int i = 0; i < this.payloadLensIndex.size(); ++i) {
            serializedLength += ByteStreamHelper.integerGetLength(this.payloadLensIndex.get(i).value());
        }
        serializedLength += ByteStreamHelper.doubleGetLength(this.focalLength);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isUseFocalFactor);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.focalFactor);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        int arrlength = this.payloadLensIndex.size();
        ByteStreamHelper.intArrayTobyte(resultBytes, serializedIndex, arrlength);
        serializedIndex += 4;
        for (int i = 0; i < arrlength; ++i) {
            serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadLensIndex.get(i).value(), serializedIndex);
        }
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.focalLength, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isUseFocalFactor, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.focalFactor, serializedIndex);
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
        ByteResult<Double> tmpFocalLength = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.focalLength = (Double)tmpFocalLength.result;
        deserilizationIndex = tmpFocalLength.endIndex;
        ByteResult<Boolean> tmpIsUseFocalFactor = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isUseFocalFactor = (Boolean)tmpIsUseFocalFactor.result;
        deserilizationIndex = tmpIsUseFocalFactor.endIndex;
        ByteResult<Double> tmpFocalFactor = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.focalFactor = (Double)tmpFocalFactor.result;
        deserilizationIndex = tmpFocalFactor.endIndex;
        return deserilizationIndex;
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

    public Double getFocalLength() {
        return this.focalLength;
    }

    public void setFocalLength(Double focalLength) {
        this.focalLength = focalLength;
    }

    public Boolean getIsUseFocalFactor() {
        return this.isUseFocalFactor;
    }

    public void setIsUseFocalFactor(Boolean isUseFocalFactor) {
        this.isUseFocalFactor = isUseFocalFactor;
    }

    public Double getFocalFactor() {
        return this.focalFactor;
    }

    public void setFocalFactor(Double focalFactor) {
        this.focalFactor = focalFactor;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionZoomParam)) {
            return false;
        }
        ActionZoomParam that = (ActionZoomParam)o;
        return Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.payloadLensIndex, that.payloadLensIndex) && Objects.equals(this.focalLength, that.focalLength) && Objects.equals(this.isUseFocalFactor, that.isUseFocalFactor) && Objects.equals(this.focalFactor, that.focalFactor);
    }

    public int hashCode() {
        return Objects.hash(this.payloadPositionIndex, this.payloadLensIndex, this.focalLength, this.isUseFocalFactor, this.focalFactor);
    }
}

