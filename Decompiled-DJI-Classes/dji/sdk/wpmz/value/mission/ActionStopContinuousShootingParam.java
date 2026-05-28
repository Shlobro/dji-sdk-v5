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

public class ActionStopContinuousShootingParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer payloadPositionIndex = 0;
    List<CameraLensType> payloadLensIndex = new ArrayList<CameraLensType>();

    public ActionStopContinuousShootingParam() {
    }

    public ActionStopContinuousShootingParam(Integer payloadPositionIndex, List<CameraLensType> payloadLensIndex) {
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (payloadLensIndex != null) {
            this.payloadLensIndex = payloadLensIndex;
        }
    }

    public static ActionStopContinuousShootingParam fromJson(String jsonString) {
        ActionStopContinuousShootingParam tmpValueResult_ = new ActionStopContinuousShootingParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            JSONArray payloadLensIndexJsonArr = jsonObj.getJSONArray("payloadLensIndex");
            for (int i = 0; i < payloadLensIndexJsonArr.length(); ++i) {
                tmpValueResult_.payloadLensIndex.add(CameraLensType.find(payloadLensIndexJsonArr.getInt(i)));
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
        return serializedLength;
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

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionStopContinuousShootingParam)) {
            return false;
        }
        ActionStopContinuousShootingParam that = (ActionStopContinuousShootingParam)o;
        return Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.payloadLensIndex, that.payloadLensIndex);
    }

    public int hashCode() {
        return Objects.hash(this.payloadPositionIndex, this.payloadLensIndex);
    }
}

