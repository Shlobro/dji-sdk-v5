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

public class CameraFov
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double sensorWidth = 0.0;
    Double sensorHeight = 0.0;
    Double focalLength = 0.0;
    Double k1 = 0.0;
    Double k2 = 0.0;
    Double k3 = 0.0;
    Double p1 = 0.0;
    Double p2 = 0.0;

    public CameraFov() {
    }

    public CameraFov(Double sensorWidth, Double sensorHeight, Double focalLength, Double k1, Double k2, Double k3, Double p1, Double p2) {
        if (sensorWidth != null) {
            this.sensorWidth = sensorWidth;
        }
        if (sensorHeight != null) {
            this.sensorHeight = sensorHeight;
        }
        if (focalLength != null) {
            this.focalLength = focalLength;
        }
        if (k1 != null) {
            this.k1 = k1;
        }
        if (k2 != null) {
            this.k2 = k2;
        }
        if (k3 != null) {
            this.k3 = k3;
        }
        if (p1 != null) {
            this.p1 = p1;
        }
        if (p2 != null) {
            this.p2 = p2;
        }
    }

    public static CameraFov fromJson(String jsonString) {
        CameraFov tmpValueResult_ = new CameraFov();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.sensorWidth = jsonObj.getDouble("sensorWidth");
            tmpValueResult_.sensorHeight = jsonObj.getDouble("sensorHeight");
            tmpValueResult_.focalLength = jsonObj.getDouble("focalLength");
            tmpValueResult_.k1 = jsonObj.getDouble("k1");
            tmpValueResult_.k2 = jsonObj.getDouble("k2");
            tmpValueResult_.k3 = jsonObj.getDouble("k3");
            tmpValueResult_.p1 = jsonObj.getDouble("p1");
            tmpValueResult_.p2 = jsonObj.getDouble("p2");
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
            if (null != this.sensorWidth) {
                json.put("sensorWidth", (Object)this.sensorWidth);
            }
            if (null != this.sensorHeight) {
                json.put("sensorHeight", (Object)this.sensorHeight);
            }
            if (null != this.focalLength) {
                json.put("focalLength", (Object)this.focalLength);
            }
            if (null != this.k1) {
                json.put("k1", (Object)this.k1);
            }
            if (null != this.k2) {
                json.put("k2", (Object)this.k2);
            }
            if (null != this.k3) {
                json.put("k3", (Object)this.k3);
            }
            if (null != this.p1) {
                json.put("p1", (Object)this.p1);
            }
            if (null != this.p2) {
                json.put("p2", (Object)this.p2);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.sensorWidth);
        serializedLength += ByteStreamHelper.doubleGetLength(this.sensorHeight);
        serializedLength += ByteStreamHelper.doubleGetLength(this.focalLength);
        serializedLength += ByteStreamHelper.doubleGetLength(this.k1);
        serializedLength += ByteStreamHelper.doubleGetLength(this.k2);
        serializedLength += ByteStreamHelper.doubleGetLength(this.k3);
        serializedLength += ByteStreamHelper.doubleGetLength(this.p1);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.p2);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.sensorWidth, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.sensorHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.focalLength, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.k1, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.k2, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.k3, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.p1, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.p2, serializedIndex);
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
        ByteResult<Double> tmpSensorWidth = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.sensorWidth = (Double)tmpSensorWidth.result;
        deserilizationIndex = tmpSensorWidth.endIndex;
        ByteResult<Double> tmpSensorHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.sensorHeight = (Double)tmpSensorHeight.result;
        deserilizationIndex = tmpSensorHeight.endIndex;
        ByteResult<Double> tmpFocalLength = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.focalLength = (Double)tmpFocalLength.result;
        deserilizationIndex = tmpFocalLength.endIndex;
        ByteResult<Double> tmpK1 = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.k1 = (Double)tmpK1.result;
        deserilizationIndex = tmpK1.endIndex;
        ByteResult<Double> tmpK2 = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.k2 = (Double)tmpK2.result;
        deserilizationIndex = tmpK2.endIndex;
        ByteResult<Double> tmpK3 = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.k3 = (Double)tmpK3.result;
        deserilizationIndex = tmpK3.endIndex;
        ByteResult<Double> tmpP1 = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.p1 = (Double)tmpP1.result;
        deserilizationIndex = tmpP1.endIndex;
        ByteResult<Double> tmpP2 = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.p2 = (Double)tmpP2.result;
        deserilizationIndex = tmpP2.endIndex;
        return deserilizationIndex;
    }

    public Double getSensorWidth() {
        return this.sensorWidth;
    }

    public void setSensorWidth(Double sensorWidth) {
        this.sensorWidth = sensorWidth;
    }

    public Double getSensorHeight() {
        return this.sensorHeight;
    }

    public void setSensorHeight(Double sensorHeight) {
        this.sensorHeight = sensorHeight;
    }

    public Double getFocalLength() {
        return this.focalLength;
    }

    public void setFocalLength(Double focalLength) {
        this.focalLength = focalLength;
    }

    public Double getK1() {
        return this.k1;
    }

    public void setK1(Double k1) {
        this.k1 = k1;
    }

    public Double getK2() {
        return this.k2;
    }

    public void setK2(Double k2) {
        this.k2 = k2;
    }

    public Double getK3() {
        return this.k3;
    }

    public void setK3(Double k3) {
        this.k3 = k3;
    }

    public Double getP1() {
        return this.p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    public Double getP2() {
        return this.p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CameraFov)) {
            return false;
        }
        CameraFov that = (CameraFov)o;
        return Objects.equals(this.sensorWidth, that.sensorWidth) && Objects.equals(this.sensorHeight, that.sensorHeight) && Objects.equals(this.focalLength, that.focalLength) && Objects.equals(this.k1, that.k1) && Objects.equals(this.k2, that.k2) && Objects.equals(this.k3, that.k3) && Objects.equals(this.p1, that.p1) && Objects.equals(this.p2, that.p2);
    }

    public int hashCode() {
        return Objects.hash(this.sensorWidth, this.sensorHeight, this.focalLength, this.k1, this.k2, this.k3, this.p1, this.p2);
    }
}

