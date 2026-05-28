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
import dji.sdk.wpmz.value.mission.WaylinePayloadFocusMode;
import dji.sdk.wpmz.value.mission.WaylinePayloadMeteringMode;
import dji.sdk.wpmz.value.mission.WaylinePayloadRate;
import dji.sdk.wpmz.value.mission.WaylinePayloadReturnMode;
import dji.sdk.wpmz.value.mission.WaylinePayloadScanningMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylinePayloadParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer payloadPositionIndex = 0;
    Boolean isPayloadPositionIndexSet = false;
    WaylinePayloadFocusMode focusMode = WaylinePayloadFocusMode.UNKNOWN;
    WaylinePayloadMeteringMode meteringMode = WaylinePayloadMeteringMode.UNKNOWN;
    Boolean dewarpingEnable = false;
    Boolean isDewarpingEnableSet = false;
    WaylinePayloadReturnMode returnMode = WaylinePayloadReturnMode.UNKNOWN;
    WaylinePayloadRate samplingRate = WaylinePayloadRate.UNKNOWN;
    WaylinePayloadScanningMode scanningMode = WaylinePayloadScanningMode.UNKNOWN;
    Boolean modelColoringEnable = false;
    Boolean isModelColoringEnableSet = false;
    List<CameraLensType> imageFormat = new ArrayList<CameraLensType>();

    public WaylinePayloadParam() {
    }

    public WaylinePayloadParam(Integer payloadPositionIndex, Boolean isPayloadPositionIndexSet, WaylinePayloadFocusMode focusMode, WaylinePayloadMeteringMode meteringMode, Boolean dewarpingEnable, Boolean isDewarpingEnableSet, WaylinePayloadReturnMode returnMode, WaylinePayloadRate samplingRate, WaylinePayloadScanningMode scanningMode, Boolean modelColoringEnable, Boolean isModelColoringEnableSet, List<CameraLensType> imageFormat) {
        if (payloadPositionIndex != null) {
            this.payloadPositionIndex = payloadPositionIndex;
        }
        if (isPayloadPositionIndexSet != null) {
            this.isPayloadPositionIndexSet = isPayloadPositionIndexSet;
        }
        if (focusMode != null) {
            this.focusMode = focusMode;
        }
        if (meteringMode != null) {
            this.meteringMode = meteringMode;
        }
        if (dewarpingEnable != null) {
            this.dewarpingEnable = dewarpingEnable;
        }
        if (isDewarpingEnableSet != null) {
            this.isDewarpingEnableSet = isDewarpingEnableSet;
        }
        if (returnMode != null) {
            this.returnMode = returnMode;
        }
        if (samplingRate != null) {
            this.samplingRate = samplingRate;
        }
        if (scanningMode != null) {
            this.scanningMode = scanningMode;
        }
        if (modelColoringEnable != null) {
            this.modelColoringEnable = modelColoringEnable;
        }
        if (isModelColoringEnableSet != null) {
            this.isModelColoringEnableSet = isModelColoringEnableSet;
        }
        if (imageFormat != null) {
            this.imageFormat = imageFormat;
        }
    }

    public static WaylinePayloadParam fromJson(String jsonString) {
        WaylinePayloadParam tmpValueResult_ = new WaylinePayloadParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.payloadPositionIndex = jsonObj.getInt("payloadPositionIndex");
            tmpValueResult_.isPayloadPositionIndexSet = jsonObj.getBoolean("isPayloadPositionIndexSet");
            tmpValueResult_.focusMode = WaylinePayloadFocusMode.find(jsonObj.getInt("focusMode"));
            tmpValueResult_.meteringMode = WaylinePayloadMeteringMode.find(jsonObj.getInt("meteringMode"));
            tmpValueResult_.dewarpingEnable = jsonObj.getBoolean("dewarpingEnable");
            tmpValueResult_.isDewarpingEnableSet = jsonObj.getBoolean("isDewarpingEnableSet");
            tmpValueResult_.returnMode = WaylinePayloadReturnMode.find(jsonObj.getInt("returnMode"));
            tmpValueResult_.samplingRate = WaylinePayloadRate.find(jsonObj.getInt("samplingRate"));
            tmpValueResult_.scanningMode = WaylinePayloadScanningMode.find(jsonObj.getInt("scanningMode"));
            tmpValueResult_.modelColoringEnable = jsonObj.getBoolean("modelColoringEnable");
            tmpValueResult_.isModelColoringEnableSet = jsonObj.getBoolean("isModelColoringEnableSet");
            JSONArray imageFormatJsonArr = jsonObj.getJSONArray("imageFormat");
            for (int i = 0; i < imageFormatJsonArr.length(); ++i) {
                tmpValueResult_.imageFormat.add(CameraLensType.find(imageFormatJsonArr.getInt(i)));
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
            if (null != this.isPayloadPositionIndexSet) {
                json.put("isPayloadPositionIndexSet", (Object)this.isPayloadPositionIndexSet);
            }
            if (null != this.focusMode) {
                json.put("focusMode", this.focusMode.value());
            }
            if (null != this.meteringMode) {
                json.put("meteringMode", this.meteringMode.value());
            }
            if (null != this.dewarpingEnable) {
                json.put("dewarpingEnable", (Object)this.dewarpingEnable);
            }
            if (null != this.isDewarpingEnableSet) {
                json.put("isDewarpingEnableSet", (Object)this.isDewarpingEnableSet);
            }
            if (null != this.returnMode) {
                json.put("returnMode", this.returnMode.value());
            }
            if (null != this.samplingRate) {
                json.put("samplingRate", this.samplingRate.value());
            }
            if (null != this.scanningMode) {
                json.put("scanningMode", this.scanningMode.value());
            }
            if (null != this.modelColoringEnable) {
                json.put("modelColoringEnable", (Object)this.modelColoringEnable);
            }
            if (null != this.isModelColoringEnableSet) {
                json.put("isModelColoringEnableSet", (Object)this.isModelColoringEnableSet);
            }
            if (null != this.imageFormat) {
                JSONArray json_arr_imageFormat = new JSONArray();
                for (int i = 0; i < this.imageFormat.size(); ++i) {
                    json_arr_imageFormat.put(this.imageFormat.get(i).value());
                }
                json.put("imageFormat", (Object)json_arr_imageFormat);
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
        serializedLength += ByteStreamHelper.booleanGetLength(this.isPayloadPositionIndexSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.focusMode.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.meteringMode.value());
        serializedLength += ByteStreamHelper.booleanGetLength(this.dewarpingEnable);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isDewarpingEnableSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.returnMode.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.samplingRate.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.scanningMode.value());
        serializedLength += ByteStreamHelper.booleanGetLength(this.modelColoringEnable);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isModelColoringEnableSet);
        serializedLength += 4;
        for (int i = 0; i < this.imageFormat.size(); ++i) {
            serializedLength += ByteStreamHelper.integerGetLength(this.imageFormat.get(i).value());
        }
        return serializedLength;
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.payloadPositionIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isPayloadPositionIndexSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.focusMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.meteringMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.dewarpingEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isDewarpingEnableSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.returnMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.samplingRate.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.scanningMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.modelColoringEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isModelColoringEnableSet, serializedIndex);
        int arrlength = this.imageFormat.size();
        ByteStreamHelper.intArrayTobyte(resultBytes, serializedIndex, arrlength);
        serializedIndex += 4;
        for (int i = 0; i < arrlength; ++i) {
            serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.imageFormat.get(i).value(), serializedIndex);
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
        ByteResult<Boolean> tmpIsPayloadPositionIndexSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isPayloadPositionIndexSet = (Boolean)tmpIsPayloadPositionIndexSet.result;
        deserilizationIndex = tmpIsPayloadPositionIndexSet.endIndex;
        ByteResult<Integer> tmpFocusMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.focusMode = WaylinePayloadFocusMode.find((Integer)tmpFocusMode.result);
        deserilizationIndex = tmpFocusMode.endIndex;
        ByteResult<Integer> tmpMeteringMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.meteringMode = WaylinePayloadMeteringMode.find((Integer)tmpMeteringMode.result);
        deserilizationIndex = tmpMeteringMode.endIndex;
        ByteResult<Boolean> tmpDewarpingEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.dewarpingEnable = (Boolean)tmpDewarpingEnable.result;
        deserilizationIndex = tmpDewarpingEnable.endIndex;
        ByteResult<Boolean> tmpIsDewarpingEnableSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isDewarpingEnableSet = (Boolean)tmpIsDewarpingEnableSet.result;
        deserilizationIndex = tmpIsDewarpingEnableSet.endIndex;
        ByteResult<Integer> tmpReturnMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.returnMode = WaylinePayloadReturnMode.find((Integer)tmpReturnMode.result);
        deserilizationIndex = tmpReturnMode.endIndex;
        ByteResult<Integer> tmpSamplingRate = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.samplingRate = WaylinePayloadRate.find((Integer)tmpSamplingRate.result);
        deserilizationIndex = tmpSamplingRate.endIndex;
        ByteResult<Integer> tmpScanningMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.scanningMode = WaylinePayloadScanningMode.find((Integer)tmpScanningMode.result);
        deserilizationIndex = tmpScanningMode.endIndex;
        ByteResult<Boolean> tmpModelColoringEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.modelColoringEnable = (Boolean)tmpModelColoringEnable.result;
        deserilizationIndex = tmpModelColoringEnable.endIndex;
        ByteResult<Boolean> tmpIsModelColoringEnableSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isModelColoringEnableSet = (Boolean)tmpIsModelColoringEnableSet.result;
        deserilizationIndex = tmpIsModelColoringEnableSet.endIndex;
        this.imageFormat = new ArrayList<CameraLensType>();
        int length = ByteBuffer.wrap(data, deserilizationIndex, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
        deserilizationIndex += 4;
        for (int i = 0; i < length; ++i) {
            ByteResult<Integer> member = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
            deserilizationIndex = member.endIndex;
            this.imageFormat.add(CameraLensType.find((Integer)member.result));
        }
        return deserilizationIndex;
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

    public WaylinePayloadFocusMode getFocusMode() {
        return this.focusMode;
    }

    public void setFocusMode(WaylinePayloadFocusMode focusMode) {
        this.focusMode = focusMode;
    }

    public WaylinePayloadMeteringMode getMeteringMode() {
        return this.meteringMode;
    }

    public void setMeteringMode(WaylinePayloadMeteringMode meteringMode) {
        this.meteringMode = meteringMode;
    }

    public Boolean getDewarpingEnable() {
        return this.dewarpingEnable;
    }

    public void setDewarpingEnable(Boolean dewarpingEnable) {
        this.dewarpingEnable = dewarpingEnable;
    }

    public Boolean getIsDewarpingEnableSet() {
        return this.isDewarpingEnableSet;
    }

    public void setIsDewarpingEnableSet(Boolean isDewarpingEnableSet) {
        this.isDewarpingEnableSet = isDewarpingEnableSet;
    }

    public WaylinePayloadReturnMode getReturnMode() {
        return this.returnMode;
    }

    public void setReturnMode(WaylinePayloadReturnMode returnMode) {
        this.returnMode = returnMode;
    }

    public WaylinePayloadRate getSamplingRate() {
        return this.samplingRate;
    }

    public void setSamplingRate(WaylinePayloadRate samplingRate) {
        this.samplingRate = samplingRate;
    }

    public WaylinePayloadScanningMode getScanningMode() {
        return this.scanningMode;
    }

    public void setScanningMode(WaylinePayloadScanningMode scanningMode) {
        this.scanningMode = scanningMode;
    }

    public Boolean getModelColoringEnable() {
        return this.modelColoringEnable;
    }

    public void setModelColoringEnable(Boolean modelColoringEnable) {
        this.modelColoringEnable = modelColoringEnable;
    }

    public Boolean getIsModelColoringEnableSet() {
        return this.isModelColoringEnableSet;
    }

    public void setIsModelColoringEnableSet(Boolean isModelColoringEnableSet) {
        this.isModelColoringEnableSet = isModelColoringEnableSet;
    }

    public List<CameraLensType> getImageFormat() {
        return this.imageFormat;
    }

    public void setImageFormat(List<CameraLensType> imageFormat) {
        this.imageFormat = imageFormat;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylinePayloadParam)) {
            return false;
        }
        WaylinePayloadParam that = (WaylinePayloadParam)o;
        return Objects.equals(this.payloadPositionIndex, that.payloadPositionIndex) && Objects.equals(this.isPayloadPositionIndexSet, that.isPayloadPositionIndexSet) && Objects.equals(this.focusMode, that.focusMode) && Objects.equals(this.meteringMode, that.meteringMode) && Objects.equals(this.dewarpingEnable, that.dewarpingEnable) && Objects.equals(this.isDewarpingEnableSet, that.isDewarpingEnableSet) && Objects.equals(this.returnMode, that.returnMode) && Objects.equals(this.samplingRate, that.samplingRate) && Objects.equals(this.scanningMode, that.scanningMode) && Objects.equals(this.modelColoringEnable, that.modelColoringEnable) && Objects.equals(this.isModelColoringEnableSet, that.isModelColoringEnableSet) && Objects.equals(this.imageFormat, that.imageFormat);
    }

    public int hashCode() {
        return Objects.hash(this.payloadPositionIndex, this.isPayloadPositionIndexSet, this.focusMode, this.meteringMode, this.dewarpingEnable, this.isDewarpingEnableSet, this.returnMode, this.samplingRate, this.scanningMode, this.modelColoringEnable, this.isModelColoringEnableSet, this.imageFormat);
    }
}

