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
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootPoint;
import dji.sdk.wpmz.value.mission.WaylineActionAccurateShootSize;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineActionAccurateShootPhotoTargetRect
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineActionAccurateShootPoint position;
    WaylineActionAccurateShootSize size;
    Double angle = 0.0;

    public WaylineActionAccurateShootPhotoTargetRect() {
    }

    public WaylineActionAccurateShootPhotoTargetRect(WaylineActionAccurateShootPoint position, WaylineActionAccurateShootSize size, Double angle) {
        if (position != null) {
            this.position = position;
        }
        if (size != null) {
            this.size = size;
        }
        if (angle != null) {
            this.angle = angle;
        }
    }

    public static WaylineActionAccurateShootPhotoTargetRect fromJson(String jsonString) {
        WaylineActionAccurateShootPhotoTargetRect tmpValueResult_ = new WaylineActionAccurateShootPhotoTargetRect();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.position = WaylineActionAccurateShootPoint.fromJson(jsonObj.getJSONObject("position").toString());
            tmpValueResult_.size = WaylineActionAccurateShootSize.fromJson(jsonObj.getJSONObject("size").toString());
            tmpValueResult_.angle = jsonObj.getDouble("angle");
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
            if (null != this.position) {
                json.put("position", (Object)this.position.toJson());
            }
            if (null != this.size) {
                json.put("size", (Object)this.size.toJson());
            }
            if (null != this.angle) {
                json.put("angle", (Object)this.angle);
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
        serializedLength += ByteStreamHelper.getLength(this.position, WaylineActionAccurateShootPoint.class);
        serializedLength += ByteStreamHelper.getLength(this.size, WaylineActionAccurateShootSize.class);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.angle);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.position, serializedIndex, WaylineActionAccurateShootPoint.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.size, serializedIndex, WaylineActionAccurateShootSize.class);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.angle, serializedIndex);
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
        ByteResult<WaylineActionAccurateShootPoint> tmpPosition = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionAccurateShootPoint.class);
        this.position = (WaylineActionAccurateShootPoint)tmpPosition.result;
        deserilizationIndex = tmpPosition.endIndex;
        ByteResult<WaylineActionAccurateShootSize> tmpSize = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionAccurateShootSize.class);
        this.size = (WaylineActionAccurateShootSize)tmpSize.result;
        deserilizationIndex = tmpSize.endIndex;
        ByteResult<Double> tmpAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.angle = (Double)tmpAngle.result;
        deserilizationIndex = tmpAngle.endIndex;
        return deserilizationIndex;
    }

    public WaylineActionAccurateShootPoint getPosition() {
        return this.position;
    }

    public void setPosition(WaylineActionAccurateShootPoint position) {
        this.position = position;
    }

    public WaylineActionAccurateShootSize getSize() {
        return this.size;
    }

    public void setSize(WaylineActionAccurateShootSize size) {
        this.size = size;
    }

    public Double getAngle() {
        return this.angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionAccurateShootPhotoTargetRect)) {
            return false;
        }
        WaylineActionAccurateShootPhotoTargetRect that = (WaylineActionAccurateShootPhotoTargetRect)o;
        return Objects.equals(this.position, that.position) && Objects.equals(this.size, that.size) && Objects.equals(this.angle, that.angle);
    }

    public int hashCode() {
        return Objects.hash(this.position, this.size, this.angle);
    }
}

