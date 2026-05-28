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

public class WaylineOverlap
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer orthoLidarOverlapH = 0;
    Boolean isOrthoLidarOverlapHSet = false;
    Integer orthoLidarOverlapW = 0;
    Boolean isOrthoLidarOverlapWSet = false;
    Integer orthoCameraOverlapH = 0;
    Boolean isOrthoCameraOverlapHSet = false;
    Integer orthoCameraOverlapW = 0;
    Boolean isOrthoCameraOverlapWSet = false;
    Integer inclinedLidarOverlapH = 0;
    Boolean isInclinedLidarOverlapHSet = false;
    Integer inclinedLidarOverlapW = 0;
    Boolean isInclinedLidarOverlapWSet = false;
    Integer inclinedCameraOverlapH = 0;
    Boolean isInclinedCameraOverlapHSet = false;
    Integer inclinedCameraOverlapW = 0;
    Boolean isInclinedCameraOverlapWSet = false;

    public WaylineOverlap() {
    }

    public WaylineOverlap(Integer orthoLidarOverlapH, Boolean isOrthoLidarOverlapHSet, Integer orthoLidarOverlapW, Boolean isOrthoLidarOverlapWSet, Integer orthoCameraOverlapH, Boolean isOrthoCameraOverlapHSet, Integer orthoCameraOverlapW, Boolean isOrthoCameraOverlapWSet, Integer inclinedLidarOverlapH, Boolean isInclinedLidarOverlapHSet, Integer inclinedLidarOverlapW, Boolean isInclinedLidarOverlapWSet, Integer inclinedCameraOverlapH, Boolean isInclinedCameraOverlapHSet, Integer inclinedCameraOverlapW, Boolean isInclinedCameraOverlapWSet) {
        if (orthoLidarOverlapH != null) {
            this.orthoLidarOverlapH = orthoLidarOverlapH;
        }
        if (isOrthoLidarOverlapHSet != null) {
            this.isOrthoLidarOverlapHSet = isOrthoLidarOverlapHSet;
        }
        if (orthoLidarOverlapW != null) {
            this.orthoLidarOverlapW = orthoLidarOverlapW;
        }
        if (isOrthoLidarOverlapWSet != null) {
            this.isOrthoLidarOverlapWSet = isOrthoLidarOverlapWSet;
        }
        if (orthoCameraOverlapH != null) {
            this.orthoCameraOverlapH = orthoCameraOverlapH;
        }
        if (isOrthoCameraOverlapHSet != null) {
            this.isOrthoCameraOverlapHSet = isOrthoCameraOverlapHSet;
        }
        if (orthoCameraOverlapW != null) {
            this.orthoCameraOverlapW = orthoCameraOverlapW;
        }
        if (isOrthoCameraOverlapWSet != null) {
            this.isOrthoCameraOverlapWSet = isOrthoCameraOverlapWSet;
        }
        if (inclinedLidarOverlapH != null) {
            this.inclinedLidarOverlapH = inclinedLidarOverlapH;
        }
        if (isInclinedLidarOverlapHSet != null) {
            this.isInclinedLidarOverlapHSet = isInclinedLidarOverlapHSet;
        }
        if (inclinedLidarOverlapW != null) {
            this.inclinedLidarOverlapW = inclinedLidarOverlapW;
        }
        if (isInclinedLidarOverlapWSet != null) {
            this.isInclinedLidarOverlapWSet = isInclinedLidarOverlapWSet;
        }
        if (inclinedCameraOverlapH != null) {
            this.inclinedCameraOverlapH = inclinedCameraOverlapH;
        }
        if (isInclinedCameraOverlapHSet != null) {
            this.isInclinedCameraOverlapHSet = isInclinedCameraOverlapHSet;
        }
        if (inclinedCameraOverlapW != null) {
            this.inclinedCameraOverlapW = inclinedCameraOverlapW;
        }
        if (isInclinedCameraOverlapWSet != null) {
            this.isInclinedCameraOverlapWSet = isInclinedCameraOverlapWSet;
        }
    }

    public static WaylineOverlap fromJson(String jsonString) {
        WaylineOverlap tmpValueResult_ = new WaylineOverlap();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.orthoLidarOverlapH = jsonObj.getInt("orthoLidarOverlapH");
            tmpValueResult_.isOrthoLidarOverlapHSet = jsonObj.getBoolean("isOrthoLidarOverlapHSet");
            tmpValueResult_.orthoLidarOverlapW = jsonObj.getInt("orthoLidarOverlapW");
            tmpValueResult_.isOrthoLidarOverlapWSet = jsonObj.getBoolean("isOrthoLidarOverlapWSet");
            tmpValueResult_.orthoCameraOverlapH = jsonObj.getInt("orthoCameraOverlapH");
            tmpValueResult_.isOrthoCameraOverlapHSet = jsonObj.getBoolean("isOrthoCameraOverlapHSet");
            tmpValueResult_.orthoCameraOverlapW = jsonObj.getInt("orthoCameraOverlapW");
            tmpValueResult_.isOrthoCameraOverlapWSet = jsonObj.getBoolean("isOrthoCameraOverlapWSet");
            tmpValueResult_.inclinedLidarOverlapH = jsonObj.getInt("inclinedLidarOverlapH");
            tmpValueResult_.isInclinedLidarOverlapHSet = jsonObj.getBoolean("isInclinedLidarOverlapHSet");
            tmpValueResult_.inclinedLidarOverlapW = jsonObj.getInt("inclinedLidarOverlapW");
            tmpValueResult_.isInclinedLidarOverlapWSet = jsonObj.getBoolean("isInclinedLidarOverlapWSet");
            tmpValueResult_.inclinedCameraOverlapH = jsonObj.getInt("inclinedCameraOverlapH");
            tmpValueResult_.isInclinedCameraOverlapHSet = jsonObj.getBoolean("isInclinedCameraOverlapHSet");
            tmpValueResult_.inclinedCameraOverlapW = jsonObj.getInt("inclinedCameraOverlapW");
            tmpValueResult_.isInclinedCameraOverlapWSet = jsonObj.getBoolean("isInclinedCameraOverlapWSet");
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
            if (null != this.orthoLidarOverlapH) {
                json.put("orthoLidarOverlapH", (Object)this.orthoLidarOverlapH);
            }
            if (null != this.isOrthoLidarOverlapHSet) {
                json.put("isOrthoLidarOverlapHSet", (Object)this.isOrthoLidarOverlapHSet);
            }
            if (null != this.orthoLidarOverlapW) {
                json.put("orthoLidarOverlapW", (Object)this.orthoLidarOverlapW);
            }
            if (null != this.isOrthoLidarOverlapWSet) {
                json.put("isOrthoLidarOverlapWSet", (Object)this.isOrthoLidarOverlapWSet);
            }
            if (null != this.orthoCameraOverlapH) {
                json.put("orthoCameraOverlapH", (Object)this.orthoCameraOverlapH);
            }
            if (null != this.isOrthoCameraOverlapHSet) {
                json.put("isOrthoCameraOverlapHSet", (Object)this.isOrthoCameraOverlapHSet);
            }
            if (null != this.orthoCameraOverlapW) {
                json.put("orthoCameraOverlapW", (Object)this.orthoCameraOverlapW);
            }
            if (null != this.isOrthoCameraOverlapWSet) {
                json.put("isOrthoCameraOverlapWSet", (Object)this.isOrthoCameraOverlapWSet);
            }
            if (null != this.inclinedLidarOverlapH) {
                json.put("inclinedLidarOverlapH", (Object)this.inclinedLidarOverlapH);
            }
            if (null != this.isInclinedLidarOverlapHSet) {
                json.put("isInclinedLidarOverlapHSet", (Object)this.isInclinedLidarOverlapHSet);
            }
            if (null != this.inclinedLidarOverlapW) {
                json.put("inclinedLidarOverlapW", (Object)this.inclinedLidarOverlapW);
            }
            if (null != this.isInclinedLidarOverlapWSet) {
                json.put("isInclinedLidarOverlapWSet", (Object)this.isInclinedLidarOverlapWSet);
            }
            if (null != this.inclinedCameraOverlapH) {
                json.put("inclinedCameraOverlapH", (Object)this.inclinedCameraOverlapH);
            }
            if (null != this.isInclinedCameraOverlapHSet) {
                json.put("isInclinedCameraOverlapHSet", (Object)this.isInclinedCameraOverlapHSet);
            }
            if (null != this.inclinedCameraOverlapW) {
                json.put("inclinedCameraOverlapW", (Object)this.inclinedCameraOverlapW);
            }
            if (null != this.isInclinedCameraOverlapWSet) {
                json.put("isInclinedCameraOverlapWSet", (Object)this.isInclinedCameraOverlapWSet);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.orthoLidarOverlapH);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isOrthoLidarOverlapHSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.orthoLidarOverlapW);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isOrthoLidarOverlapWSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.orthoCameraOverlapH);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isOrthoCameraOverlapHSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.orthoCameraOverlapW);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isOrthoCameraOverlapWSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.inclinedLidarOverlapH);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isInclinedLidarOverlapHSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.inclinedLidarOverlapW);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isInclinedLidarOverlapWSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.inclinedCameraOverlapH);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isInclinedCameraOverlapHSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.inclinedCameraOverlapW);
        return serializedLength += ByteStreamHelper.booleanGetLength(this.isInclinedCameraOverlapWSet);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.orthoLidarOverlapH, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isOrthoLidarOverlapHSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.orthoLidarOverlapW, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isOrthoLidarOverlapWSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.orthoCameraOverlapH, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isOrthoCameraOverlapHSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.orthoCameraOverlapW, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isOrthoCameraOverlapWSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.inclinedLidarOverlapH, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isInclinedLidarOverlapHSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.inclinedLidarOverlapW, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isInclinedLidarOverlapWSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.inclinedCameraOverlapH, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isInclinedCameraOverlapHSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.inclinedCameraOverlapW, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isInclinedCameraOverlapWSet, serializedIndex);
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
        ByteResult<Integer> tmpOrthoLidarOverlapH = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.orthoLidarOverlapH = (Integer)tmpOrthoLidarOverlapH.result;
        deserilizationIndex = tmpOrthoLidarOverlapH.endIndex;
        ByteResult<Boolean> tmpIsOrthoLidarOverlapHSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isOrthoLidarOverlapHSet = (Boolean)tmpIsOrthoLidarOverlapHSet.result;
        deserilizationIndex = tmpIsOrthoLidarOverlapHSet.endIndex;
        ByteResult<Integer> tmpOrthoLidarOverlapW = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.orthoLidarOverlapW = (Integer)tmpOrthoLidarOverlapW.result;
        deserilizationIndex = tmpOrthoLidarOverlapW.endIndex;
        ByteResult<Boolean> tmpIsOrthoLidarOverlapWSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isOrthoLidarOverlapWSet = (Boolean)tmpIsOrthoLidarOverlapWSet.result;
        deserilizationIndex = tmpIsOrthoLidarOverlapWSet.endIndex;
        ByteResult<Integer> tmpOrthoCameraOverlapH = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.orthoCameraOverlapH = (Integer)tmpOrthoCameraOverlapH.result;
        deserilizationIndex = tmpOrthoCameraOverlapH.endIndex;
        ByteResult<Boolean> tmpIsOrthoCameraOverlapHSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isOrthoCameraOverlapHSet = (Boolean)tmpIsOrthoCameraOverlapHSet.result;
        deserilizationIndex = tmpIsOrthoCameraOverlapHSet.endIndex;
        ByteResult<Integer> tmpOrthoCameraOverlapW = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.orthoCameraOverlapW = (Integer)tmpOrthoCameraOverlapW.result;
        deserilizationIndex = tmpOrthoCameraOverlapW.endIndex;
        ByteResult<Boolean> tmpIsOrthoCameraOverlapWSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isOrthoCameraOverlapWSet = (Boolean)tmpIsOrthoCameraOverlapWSet.result;
        deserilizationIndex = tmpIsOrthoCameraOverlapWSet.endIndex;
        ByteResult<Integer> tmpInclinedLidarOverlapH = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.inclinedLidarOverlapH = (Integer)tmpInclinedLidarOverlapH.result;
        deserilizationIndex = tmpInclinedLidarOverlapH.endIndex;
        ByteResult<Boolean> tmpIsInclinedLidarOverlapHSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isInclinedLidarOverlapHSet = (Boolean)tmpIsInclinedLidarOverlapHSet.result;
        deserilizationIndex = tmpIsInclinedLidarOverlapHSet.endIndex;
        ByteResult<Integer> tmpInclinedLidarOverlapW = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.inclinedLidarOverlapW = (Integer)tmpInclinedLidarOverlapW.result;
        deserilizationIndex = tmpInclinedLidarOverlapW.endIndex;
        ByteResult<Boolean> tmpIsInclinedLidarOverlapWSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isInclinedLidarOverlapWSet = (Boolean)tmpIsInclinedLidarOverlapWSet.result;
        deserilizationIndex = tmpIsInclinedLidarOverlapWSet.endIndex;
        ByteResult<Integer> tmpInclinedCameraOverlapH = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.inclinedCameraOverlapH = (Integer)tmpInclinedCameraOverlapH.result;
        deserilizationIndex = tmpInclinedCameraOverlapH.endIndex;
        ByteResult<Boolean> tmpIsInclinedCameraOverlapHSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isInclinedCameraOverlapHSet = (Boolean)tmpIsInclinedCameraOverlapHSet.result;
        deserilizationIndex = tmpIsInclinedCameraOverlapHSet.endIndex;
        ByteResult<Integer> tmpInclinedCameraOverlapW = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.inclinedCameraOverlapW = (Integer)tmpInclinedCameraOverlapW.result;
        deserilizationIndex = tmpInclinedCameraOverlapW.endIndex;
        ByteResult<Boolean> tmpIsInclinedCameraOverlapWSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isInclinedCameraOverlapWSet = (Boolean)tmpIsInclinedCameraOverlapWSet.result;
        deserilizationIndex = tmpIsInclinedCameraOverlapWSet.endIndex;
        return deserilizationIndex;
    }

    public Integer getOrthoLidarOverlapH() {
        return this.orthoLidarOverlapH;
    }

    public void setOrthoLidarOverlapH(Integer orthoLidarOverlapH) {
        this.orthoLidarOverlapH = orthoLidarOverlapH;
    }

    public Boolean getIsOrthoLidarOverlapHSet() {
        return this.isOrthoLidarOverlapHSet;
    }

    public void setIsOrthoLidarOverlapHSet(Boolean isOrthoLidarOverlapHSet) {
        this.isOrthoLidarOverlapHSet = isOrthoLidarOverlapHSet;
    }

    public Integer getOrthoLidarOverlapW() {
        return this.orthoLidarOverlapW;
    }

    public void setOrthoLidarOverlapW(Integer orthoLidarOverlapW) {
        this.orthoLidarOverlapW = orthoLidarOverlapW;
    }

    public Boolean getIsOrthoLidarOverlapWSet() {
        return this.isOrthoLidarOverlapWSet;
    }

    public void setIsOrthoLidarOverlapWSet(Boolean isOrthoLidarOverlapWSet) {
        this.isOrthoLidarOverlapWSet = isOrthoLidarOverlapWSet;
    }

    public Integer getOrthoCameraOverlapH() {
        return this.orthoCameraOverlapH;
    }

    public void setOrthoCameraOverlapH(Integer orthoCameraOverlapH) {
        this.orthoCameraOverlapH = orthoCameraOverlapH;
    }

    public Boolean getIsOrthoCameraOverlapHSet() {
        return this.isOrthoCameraOverlapHSet;
    }

    public void setIsOrthoCameraOverlapHSet(Boolean isOrthoCameraOverlapHSet) {
        this.isOrthoCameraOverlapHSet = isOrthoCameraOverlapHSet;
    }

    public Integer getOrthoCameraOverlapW() {
        return this.orthoCameraOverlapW;
    }

    public void setOrthoCameraOverlapW(Integer orthoCameraOverlapW) {
        this.orthoCameraOverlapW = orthoCameraOverlapW;
    }

    public Boolean getIsOrthoCameraOverlapWSet() {
        return this.isOrthoCameraOverlapWSet;
    }

    public void setIsOrthoCameraOverlapWSet(Boolean isOrthoCameraOverlapWSet) {
        this.isOrthoCameraOverlapWSet = isOrthoCameraOverlapWSet;
    }

    public Integer getInclinedLidarOverlapH() {
        return this.inclinedLidarOverlapH;
    }

    public void setInclinedLidarOverlapH(Integer inclinedLidarOverlapH) {
        this.inclinedLidarOverlapH = inclinedLidarOverlapH;
    }

    public Boolean getIsInclinedLidarOverlapHSet() {
        return this.isInclinedLidarOverlapHSet;
    }

    public void setIsInclinedLidarOverlapHSet(Boolean isInclinedLidarOverlapHSet) {
        this.isInclinedLidarOverlapHSet = isInclinedLidarOverlapHSet;
    }

    public Integer getInclinedLidarOverlapW() {
        return this.inclinedLidarOverlapW;
    }

    public void setInclinedLidarOverlapW(Integer inclinedLidarOverlapW) {
        this.inclinedLidarOverlapW = inclinedLidarOverlapW;
    }

    public Boolean getIsInclinedLidarOverlapWSet() {
        return this.isInclinedLidarOverlapWSet;
    }

    public void setIsInclinedLidarOverlapWSet(Boolean isInclinedLidarOverlapWSet) {
        this.isInclinedLidarOverlapWSet = isInclinedLidarOverlapWSet;
    }

    public Integer getInclinedCameraOverlapH() {
        return this.inclinedCameraOverlapH;
    }

    public void setInclinedCameraOverlapH(Integer inclinedCameraOverlapH) {
        this.inclinedCameraOverlapH = inclinedCameraOverlapH;
    }

    public Boolean getIsInclinedCameraOverlapHSet() {
        return this.isInclinedCameraOverlapHSet;
    }

    public void setIsInclinedCameraOverlapHSet(Boolean isInclinedCameraOverlapHSet) {
        this.isInclinedCameraOverlapHSet = isInclinedCameraOverlapHSet;
    }

    public Integer getInclinedCameraOverlapW() {
        return this.inclinedCameraOverlapW;
    }

    public void setInclinedCameraOverlapW(Integer inclinedCameraOverlapW) {
        this.inclinedCameraOverlapW = inclinedCameraOverlapW;
    }

    public Boolean getIsInclinedCameraOverlapWSet() {
        return this.isInclinedCameraOverlapWSet;
    }

    public void setIsInclinedCameraOverlapWSet(Boolean isInclinedCameraOverlapWSet) {
        this.isInclinedCameraOverlapWSet = isInclinedCameraOverlapWSet;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineOverlap)) {
            return false;
        }
        WaylineOverlap that = (WaylineOverlap)o;
        return Objects.equals(this.orthoLidarOverlapH, that.orthoLidarOverlapH) && Objects.equals(this.isOrthoLidarOverlapHSet, that.isOrthoLidarOverlapHSet) && Objects.equals(this.orthoLidarOverlapW, that.orthoLidarOverlapW) && Objects.equals(this.isOrthoLidarOverlapWSet, that.isOrthoLidarOverlapWSet) && Objects.equals(this.orthoCameraOverlapH, that.orthoCameraOverlapH) && Objects.equals(this.isOrthoCameraOverlapHSet, that.isOrthoCameraOverlapHSet) && Objects.equals(this.orthoCameraOverlapW, that.orthoCameraOverlapW) && Objects.equals(this.isOrthoCameraOverlapWSet, that.isOrthoCameraOverlapWSet) && Objects.equals(this.inclinedLidarOverlapH, that.inclinedLidarOverlapH) && Objects.equals(this.isInclinedLidarOverlapHSet, that.isInclinedLidarOverlapHSet) && Objects.equals(this.inclinedLidarOverlapW, that.inclinedLidarOverlapW) && Objects.equals(this.isInclinedLidarOverlapWSet, that.isInclinedLidarOverlapWSet) && Objects.equals(this.inclinedCameraOverlapH, that.inclinedCameraOverlapH) && Objects.equals(this.isInclinedCameraOverlapHSet, that.isInclinedCameraOverlapHSet) && Objects.equals(this.inclinedCameraOverlapW, that.inclinedCameraOverlapW) && Objects.equals(this.isInclinedCameraOverlapWSet, that.isInclinedCameraOverlapWSet);
    }

    public int hashCode() {
        return Objects.hash(this.orthoLidarOverlapH, this.isOrthoLidarOverlapHSet, this.orthoLidarOverlapW, this.isOrthoLidarOverlapWSet, this.orthoCameraOverlapH, this.isOrthoCameraOverlapHSet, this.orthoCameraOverlapW, this.isOrthoCameraOverlapWSet, this.inclinedLidarOverlapH, this.isInclinedLidarOverlapHSet, this.inclinedLidarOverlapW, this.isInclinedLidarOverlapWSet, this.inclinedCameraOverlapH, this.isInclinedCameraOverlapHSet, this.inclinedCameraOverlapW, this.isInclinedCameraOverlapWSet);
    }
}

