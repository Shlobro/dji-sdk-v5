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

public class ActionFocusParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer payloadPositionIndex = 0;
    List<CameraLensType> payloadLensIndex = new ArrayList<CameraLensType>();
    Boolean isPointFocus = false;
    Double focus_x = 0.0;
    Double focus_y = 0.0;
    Double width = 0.0;
    Double height = 0.0;
    Boolean isInfiniteFocus = false;

    public ActionFocusParam() {
    }

    public ActionFocusParam(Integer payloadPositionIndex, List<CameraLensType> payloadLensIndex, Boolean isPointFocus, Double focus_x, Double focus_y, Double width, Double height, Boolean isInfiniteFocus) {
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (payloadLensIndex != null) {
            this.payloadLensIndex = payloadLensIndex;
        }
        if (isPointFocus != null) {
            this.isPointFocus = isPointFocus;
        }
        if (focus_x != null) {
            this.focus_x = focus_x;
        }
        if (focus_y != null) {
            this.focus_y = focus_y;
        }
        if (width != null) {
            this.width = width;
        }
        if (height != null) {
            this.height = height;
        }
        if (isInfiniteFocus != null) {
            this.isInfiniteFocus = isInfiniteFocus;
        }
    }

    public static ActionFocusParam fromJson(String jsonString) {
        ActionFocusParam tmpValueResult_ = new ActionFocusParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            JSONArray payloadLensIndexJsonArr = jsonObj.getJSONArray("payloadLensIndex");
            for (int i = 0; i < payloadLensIndexJsonArr.length(); ++i) {
                tmpValueResult_.payloadLensIndex.add(CameraLensType.find(payloadLensIndexJsonArr.getInt(i)));
            }
            tmpValueResult_.isPointFocus = jsonObj.getBoolean("isPointFocus");
            tmpValueResult_.focus_x = jsonObj.getDouble("focus_x");
            tmpValueResult_.focus_y = jsonObj.getDouble("focus_y");
            tmpValueResult_.width = jsonObj.getDouble("width");
            tmpValueResult_.height = jsonObj.getDouble("height");
            tmpValueResult_.isInfiniteFocus = jsonObj.getBoolean("isInfiniteFocus");
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
            if (null != this.isPointFocus) {
                json.put("isPointFocus", (Object)this.isPointFocus);
            }
            if (null != this.focus_x) {
                json.put("focus_x", (Object)this.focus_x);
            }
            if (null != this.focus_y) {
                json.put("focus_y", (Object)this.focus_y);
            }
            if (null != this.width) {
                json.put("width", (Object)this.width);
            }
            if (null != this.height) {
                json.put("height", (Object)this.height);
            }
            if (null != this.isInfiniteFocus) {
                json.put("isInfiniteFocus", (Object)this.isInfiniteFocus);
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
        serializedLength += ByteStreamHelper.booleanGetLength(this.isPointFocus);
        serializedLength += ByteStreamHelper.doubleGetLength(this.focus_x);
        serializedLength += ByteStreamHelper.doubleGetLength(this.focus_y);
        serializedLength += ByteStreamHelper.doubleGetLength(this.width);
        serializedLength += ByteStreamHelper.doubleGetLength(this.height);
        return serializedLength += ByteStreamHelper.booleanGetLength(this.isInfiniteFocus);
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
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isPointFocus, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.focus_x, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.focus_y, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.width, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.height, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isInfiniteFocus, serializedIndex);
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
        ByteResult<Boolean> tmpIsPointFocus = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isPointFocus = (Boolean)tmpIsPointFocus.result;
        deserilizationIndex = tmpIsPointFocus.endIndex;
        ByteResult<Double> tmpFocus_x = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.focus_x = (Double)tmpFocus_x.result;
        deserilizationIndex = tmpFocus_x.endIndex;
        ByteResult<Double> tmpFocus_y = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.focus_y = (Double)tmpFocus_y.result;
        deserilizationIndex = tmpFocus_y.endIndex;
        ByteResult<Double> tmpWidth = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.width = (Double)tmpWidth.result;
        deserilizationIndex = tmpWidth.endIndex;
        ByteResult<Double> tmpHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.height = (Double)tmpHeight.result;
        deserilizationIndex = tmpHeight.endIndex;
        ByteResult<Boolean> tmpIsInfiniteFocus = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isInfiniteFocus = (Boolean)tmpIsInfiniteFocus.result;
        deserilizationIndex = tmpIsInfiniteFocus.endIndex;
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

    public Boolean getIsPointFocus() {
        return this.isPointFocus;
    }

    public void setIsPointFocus(Boolean isPointFocus) {
        this.isPointFocus = isPointFocus;
    }

    public Double getFocus_x() {
        return this.focus_x;
    }

    public void setFocus_x(Double focus_x) {
        this.focus_x = focus_x;
    }

    public Double getFocus_y() {
        return this.focus_y;
    }

    public void setFocus_y(Double focus_y) {
        this.focus_y = focus_y;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Boolean getIsInfiniteFocus() {
        return this.isInfiniteFocus;
    }

    public void setIsInfiniteFocus(Boolean isInfiniteFocus) {
        this.isInfiniteFocus = isInfiniteFocus;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionFocusParam)) {
            return false;
        }
        ActionFocusParam that = (ActionFocusParam)o;
        return Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.payloadLensIndex, that.payloadLensIndex) && Objects.equals(this.isPointFocus, that.isPointFocus) && Objects.equals(this.focus_x, that.focus_x) && Objects.equals(this.focus_y, that.focus_y) && Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height) && Objects.equals(this.isInfiniteFocus, that.isInfiniteFocus);
    }

    public int hashCode() {
        return Objects.hash(this.payloadPositionIndex, this.payloadLensIndex, this.isPointFocus, this.focus_x, this.focus_y, this.width, this.height, this.isInfiniteFocus);
    }
}

