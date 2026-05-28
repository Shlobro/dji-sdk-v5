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
import dji.sdk.wpmz.value.mission.WaylineActionOrientedShootPoint;
import dji.sdk.wpmz.value.mission.WaylineActionOrientedShootSize;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineActionOrientedPhotoTargetRect
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineActionOrientedShootPoint position;
    WaylineActionOrientedShootSize size;
    Double angle = 0.0;

    public WaylineActionOrientedPhotoTargetRect() {
    }

    public WaylineActionOrientedPhotoTargetRect(WaylineActionOrientedShootPoint position, WaylineActionOrientedShootSize size, Double angle) {
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

    public static WaylineActionOrientedPhotoTargetRect fromJson(String jsonString) {
        WaylineActionOrientedPhotoTargetRect tmpValueResult_ = new WaylineActionOrientedPhotoTargetRect();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.position = WaylineActionOrientedShootPoint.fromJson(jsonObj.getJSONObject("position").toString());
            tmpValueResult_.size = WaylineActionOrientedShootSize.fromJson(jsonObj.getJSONObject("size").toString());
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
        serializedLength += ByteStreamHelper.getLength(this.position, WaylineActionOrientedShootPoint.class);
        serializedLength += ByteStreamHelper.getLength(this.size, WaylineActionOrientedShootSize.class);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.angle);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.position, serializedIndex, WaylineActionOrientedShootPoint.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.size, serializedIndex, WaylineActionOrientedShootSize.class);
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
        ByteResult<WaylineActionOrientedShootPoint> tmpPosition = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionOrientedShootPoint.class);
        this.position = (WaylineActionOrientedShootPoint)tmpPosition.result;
        deserilizationIndex = tmpPosition.endIndex;
        ByteResult<WaylineActionOrientedShootSize> tmpSize = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionOrientedShootSize.class);
        this.size = (WaylineActionOrientedShootSize)tmpSize.result;
        deserilizationIndex = tmpSize.endIndex;
        ByteResult<Double> tmpAngle = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.angle = (Double)tmpAngle.result;
        deserilizationIndex = tmpAngle.endIndex;
        return deserilizationIndex;
    }

    public WaylineActionOrientedShootPoint getPosition() {
        return this.position;
    }

    public void setPosition(WaylineActionOrientedShootPoint position) {
        this.position = position;
    }

    public WaylineActionOrientedShootSize getSize() {
        return this.size;
    }

    public void setSize(WaylineActionOrientedShootSize size) {
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
        if (!(o instanceof WaylineActionOrientedPhotoTargetRect)) {
            return false;
        }
        WaylineActionOrientedPhotoTargetRect that = (WaylineActionOrientedPhotoTargetRect)o;
        return Objects.equals(this.position, that.position) && Objects.equals(this.size, that.size) && Objects.equals(this.angle, that.angle);
    }

    public int hashCode() {
        return Objects.hash(this.position, this.size, this.angle);
    }
}

