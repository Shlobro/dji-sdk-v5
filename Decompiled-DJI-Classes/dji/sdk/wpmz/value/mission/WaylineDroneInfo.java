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
import dji.sdk.wpmz.value.mission.WaylineDroneType;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineDroneInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineDroneType droneType = WaylineDroneType.UNKNOWN;
    Integer droneSubType = 0;

    public WaylineDroneInfo() {
    }

    public WaylineDroneInfo(WaylineDroneType droneType, Integer droneSubType) {
        if (droneType != null) {
            this.droneType = droneType;
        }
        if (droneSubType != null) {
            this.droneSubType = droneSubType;
        }
    }

    public static WaylineDroneInfo fromJson(String jsonString) {
        WaylineDroneInfo tmpValueResult_ = new WaylineDroneInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.droneType = WaylineDroneType.find(jsonObj.getInt("droneType"));
            tmpValueResult_.droneSubType = jsonObj.getInt("droneSubType");
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
            if (null != this.droneType) {
                json.put("droneType", this.droneType.value());
            }
            if (null != this.droneSubType) {
                json.put("droneSubType", (Object)this.droneSubType);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.droneType.value());
        return serializedLength += ByteStreamHelper.integerGetLength(this.droneSubType);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.droneType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.droneSubType, serializedIndex);
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
        ByteResult<Integer> tmpDroneType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.droneType = WaylineDroneType.find((Integer)tmpDroneType.result);
        deserilizationIndex = tmpDroneType.endIndex;
        ByteResult<Integer> tmpDroneSubType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.droneSubType = (Integer)tmpDroneSubType.result;
        deserilizationIndex = tmpDroneSubType.endIndex;
        return deserilizationIndex;
    }

    public WaylineDroneType getDroneType() {
        return this.droneType;
    }

    public void setDroneType(WaylineDroneType droneType) {
        this.droneType = droneType;
    }

    public Integer getDroneSubType() {
        return this.droneSubType;
    }

    public void setDroneSubType(Integer droneSubType) {
        this.droneSubType = droneSubType;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineDroneInfo)) {
            return false;
        }
        WaylineDroneInfo that = (WaylineDroneInfo)o;
        return Objects.equals(this.droneType, that.droneType) && Objects.equals(this.droneSubType, that.droneSubType);
    }

    public int hashCode() {
        return Objects.hash(this.droneType, this.droneSubType);
    }
}

