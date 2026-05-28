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
import dji.sdk.wpmz.value.mission.WaylineActionSmartObliqueCycleMode;
import dji.sdk.wpmz.value.mission.WaylineActionSmartObliquePointInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class ActionStartSmartObliqueParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer payloadPositionIndex = 0;
    WaylineActionSmartObliqueCycleMode mode = WaylineActionSmartObliqueCycleMode.UNKNOWN;
    List<WaylineActionSmartObliquePointInfo> points = new ArrayList<WaylineActionSmartObliquePointInfo>();

    public ActionStartSmartObliqueParam() {
    }

    public ActionStartSmartObliqueParam(Integer payloadPositionIndex, WaylineActionSmartObliqueCycleMode mode, List<WaylineActionSmartObliquePointInfo> points) {
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (mode != null) {
            this.mode = mode;
        }
        if (points != null) {
            this.points = points;
        }
    }

    public static ActionStartSmartObliqueParam fromJson(String jsonString) {
        ActionStartSmartObliqueParam tmpValueResult_ = new ActionStartSmartObliqueParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.mode = WaylineActionSmartObliqueCycleMode.find(jsonObj.getInt("mode"));
            JSONArray pointsJsonArr = jsonObj.getJSONArray("points");
            for (int i = 0; i < pointsJsonArr.length(); ++i) {
                tmpValueResult_.points.add(WaylineActionSmartObliquePointInfo.fromJson(pointsJsonArr.getString(i)));
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
            if (null != this.mode) {
                json.put("mode", this.mode.value());
            }
            if (null != this.points) {
                JSONArray json_arr_points = new JSONArray();
                for (int i = 0; i < this.points.size(); ++i) {
                    json_arr_points.put((Object)this.points.get(i).toJson());
                }
                json.put("points", (Object)json_arr_points);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.mode.value());
        return serializedLength += ByteStreamHelper.arrayGetLength(this.points);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.mode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.points, serializedIndex);
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
        ByteResult<Integer> tmpMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.mode = WaylineActionSmartObliqueCycleMode.find((Integer)tmpMode.result);
        deserilizationIndex = tmpMode.endIndex;
        ByteResult<List<WaylineActionSmartObliquePointInfo>> tmpPoints = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineActionSmartObliquePointInfo.class);
        this.points = (List)tmpPoints.result;
        deserilizationIndex = tmpPoints.endIndex;
        return deserilizationIndex;
    }

    public Integer getPayloadPositionIndex() {
        return this.payloadPositionIndex;
    }

    public void setPayloadPositionIndex(Integer payloadPositionIndex) {
        this.payloadPositionIndex = payloadPositionIndex;
    }

    public WaylineActionSmartObliqueCycleMode getMode() {
        return this.mode;
    }

    public void setMode(WaylineActionSmartObliqueCycleMode mode) {
        this.mode = mode;
    }

    public List<WaylineActionSmartObliquePointInfo> getPoints() {
        return this.points;
    }

    public void setPoints(List<WaylineActionSmartObliquePointInfo> points) {
        this.points = points;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionStartSmartObliqueParam)) {
            return false;
        }
        ActionStartSmartObliqueParam that = (ActionStartSmartObliqueParam)o;
        return Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.mode, that.mode) && Objects.equals(this.points, that.points);
    }

    public int hashCode() {
        return Objects.hash(this.payloadPositionIndex, this.mode, this.points);
    }
}

