/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.ByteResult;
import dji.sdk.wpmz.value.ByteStream;
import dji.sdk.wpmz.value.ByteStreamHelper;
import dji.sdk.wpmz.value.base.DJIValue;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineActionAccurateShootPhotoCameraStateInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double focal_distance = 0.0;
    Integer AF_position = 0;
    Integer cameraApertue = 0;
    Integer cameraLuminance = 0;
    Integer cameraObjectDistance = 0;
    Double cameraShutterTime = 0.0;
    Integer cameraISO = 0;
    Integer cameraEvBias = 0;

    public WaylineActionAccurateShootPhotoCameraStateInformation() {
    }

    public WaylineActionAccurateShootPhotoCameraStateInformation(Double focal_distance, Integer AF_position, Integer cameraApertue, Integer cameraLuminance, Integer cameraObjectDistance, Double cameraShutterTime, Integer cameraISO, Integer cameraEvBias) {
        if (focal_distance != null) {
            this.focal_distance = focal_distance;
        }
        if (AF_position != null) {
            this.AF_position = AF_position;
        }
        if (cameraApertue != null) {
            this.cameraApertue = cameraApertue;
        }
        if (cameraLuminance != null) {
            this.cameraLuminance = cameraLuminance;
        }
        if (cameraObjectDistance != null) {
            this.cameraObjectDistance = cameraObjectDistance;
        }
        if (cameraShutterTime != null) {
            this.cameraShutterTime = cameraShutterTime;
        }
        if (cameraISO != null) {
            this.cameraISO = cameraISO;
        }
        if (cameraEvBias != null) {
            this.cameraEvBias = cameraEvBias;
        }
    }

    public static WaylineActionAccurateShootPhotoCameraStateInformation fromJson(String jsonString) {
        WaylineActionAccurateShootPhotoCameraStateInformation tmpValueResult_ = new WaylineActionAccurateShootPhotoCameraStateInformation();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.focal_distance = jsonObj.getDouble("focal_distance");
            tmpValueResult_.AF_position = jsonObj.getInt("AF_position");
            tmpValueResult_.cameraApertue = jsonObj.getInt("cameraApertue");
            tmpValueResult_.cameraLuminance = jsonObj.getInt("cameraLuminance");
            tmpValueResult_.cameraObjectDistance = jsonObj.getInt("cameraObjectDistance");
            tmpValueResult_.cameraShutterTime = jsonObj.getDouble("cameraShutterTime");
            tmpValueResult_.cameraISO = jsonObj.getInt("cameraISO");
            tmpValueResult_.cameraEvBias = jsonObj.getInt("cameraEvBias");
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
            if (null != this.focal_distance) {
                json.put("focal_distance", (Object)this.focal_distance);
            }
            if (null != this.AF_position) {
                json.put("AF_position", (Object)this.AF_position);
            }
            if (null != this.cameraApertue) {
                json.put("cameraApertue", (Object)this.cameraApertue);
            }
            if (null != this.cameraLuminance) {
                json.put("cameraLuminance", (Object)this.cameraLuminance);
            }
            if (null != this.cameraObjectDistance) {
                json.put("cameraObjectDistance", (Object)this.cameraObjectDistance);
            }
            if (null != this.cameraShutterTime) {
                json.put("cameraShutterTime", (Object)this.cameraShutterTime);
            }
            if (null != this.cameraISO) {
                json.put("cameraISO", (Object)this.cameraISO);
            }
            if (null != this.cameraEvBias) {
                json.put("cameraEvBias", (Object)this.cameraEvBias);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.focal_distance);
        serializedLength += ByteStreamHelper.integerGetLength(this.AF_position);
        serializedLength += ByteStreamHelper.integerGetLength(this.cameraApertue);
        serializedLength += ByteStreamHelper.integerGetLength(this.cameraLuminance);
        serializedLength += ByteStreamHelper.integerGetLength(this.cameraObjectDistance);
        serializedLength += ByteStreamHelper.doubleGetLength(this.cameraShutterTime);
        serializedLength += ByteStreamHelper.integerGetLength(this.cameraISO);
        return serializedLength += ByteStreamHelper.integerGetLength(this.cameraEvBias);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.focal_distance, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.AF_position, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.cameraApertue, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.cameraLuminance, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.cameraObjectDistance, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.cameraShutterTime, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.cameraISO, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.cameraEvBias, serializedIndex);
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
        ByteResult<Double> tmpFocal_distance = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.focal_distance = (Double)tmpFocal_distance.result;
        deserilizationIndex = tmpFocal_distance.endIndex;
        ByteResult<Integer> tmpAF_position = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.AF_position = (Integer)tmpAF_position.result;
        deserilizationIndex = tmpAF_position.endIndex;
        ByteResult<Integer> tmpCameraApertue = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.cameraApertue = (Integer)tmpCameraApertue.result;
        deserilizationIndex = tmpCameraApertue.endIndex;
        ByteResult<Integer> tmpCameraLuminance = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.cameraLuminance = (Integer)tmpCameraLuminance.result;
        deserilizationIndex = tmpCameraLuminance.endIndex;
        ByteResult<Integer> tmpCameraObjectDistance = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.cameraObjectDistance = (Integer)tmpCameraObjectDistance.result;
        deserilizationIndex = tmpCameraObjectDistance.endIndex;
        ByteResult<Double> tmpCameraShutterTime = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.cameraShutterTime = (Double)tmpCameraShutterTime.result;
        deserilizationIndex = tmpCameraShutterTime.endIndex;
        ByteResult<Integer> tmpCameraISO = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.cameraISO = (Integer)tmpCameraISO.result;
        deserilizationIndex = tmpCameraISO.endIndex;
        ByteResult<Integer> tmpCameraEvBias = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.cameraEvBias = (Integer)tmpCameraEvBias.result;
        deserilizationIndex = tmpCameraEvBias.endIndex;
        return deserilizationIndex;
    }

    public Double getFocal_distance() {
        return this.focal_distance;
    }

    public void setFocal_distance(Double focal_distance) {
        this.focal_distance = focal_distance;
    }

    public Integer getAF_position() {
        return this.AF_position;
    }

    public void setAF_position(Integer AF_position) {
        this.AF_position = AF_position;
    }

    public Integer getCameraApertue() {
        return this.cameraApertue;
    }

    public void setCameraApertue(Integer cameraApertue) {
        this.cameraApertue = cameraApertue;
    }

    public Integer getCameraLuminance() {
        return this.cameraLuminance;
    }

    public void setCameraLuminance(Integer cameraLuminance) {
        this.cameraLuminance = cameraLuminance;
    }

    public Integer getCameraObjectDistance() {
        return this.cameraObjectDistance;
    }

    public void setCameraObjectDistance(Integer cameraObjectDistance) {
        this.cameraObjectDistance = cameraObjectDistance;
    }

    public Double getCameraShutterTime() {
        return this.cameraShutterTime;
    }

    public void setCameraShutterTime(Double cameraShutterTime) {
        this.cameraShutterTime = cameraShutterTime;
    }

    public Integer getCameraISO() {
        return this.cameraISO;
    }

    public void setCameraISO(Integer cameraISO) {
        this.cameraISO = cameraISO;
    }

    public Integer getCameraEvBias() {
        return this.cameraEvBias;
    }

    public void setCameraEvBias(Integer cameraEvBias) {
        this.cameraEvBias = cameraEvBias;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionAccurateShootPhotoCameraStateInformation)) {
            return false;
        }
        WaylineActionAccurateShootPhotoCameraStateInformation that = (WaylineActionAccurateShootPhotoCameraStateInformation)o;
        return Objects.equals(this.focal_distance, that.focal_distance) && Objects.equals(this.AF_position, that.AF_position) && Objects.equals(this.cameraApertue, that.cameraApertue) && Objects.equals(this.cameraLuminance, that.cameraLuminance) && Objects.equals(this.cameraObjectDistance, that.cameraObjectDistance) && Objects.equals(this.cameraShutterTime, that.cameraShutterTime) && Objects.equals(this.cameraISO, that.cameraISO) && Objects.equals(this.cameraEvBias, that.cameraEvBias);
    }

    public int hashCode() {
        return Objects.hash(this.focal_distance, this.AF_position, this.cameraApertue, this.cameraLuminance, this.cameraObjectDistance, this.cameraShutterTime, this.cameraISO, this.cameraEvBias);
    }
}

