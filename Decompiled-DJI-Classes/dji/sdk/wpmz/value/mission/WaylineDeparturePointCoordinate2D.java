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

public class WaylineDeparturePointCoordinate2D
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double x = 0.0;
    Double y = 0.0;

    public WaylineDeparturePointCoordinate2D() {
    }

    public WaylineDeparturePointCoordinate2D(Double x, Double y) {
        if (x != null) {
            this.x = x;
        }
        if (y != null) {
            this.y = y;
        }
    }

    public static WaylineDeparturePointCoordinate2D fromJson(String jsonString) {
        WaylineDeparturePointCoordinate2D tmpValueResult_ = new WaylineDeparturePointCoordinate2D();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.x = jsonObj.getDouble("x");
            tmpValueResult_.y = jsonObj.getDouble("y");
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
            if (null != this.x) {
                json.put("x", (Object)this.x);
            }
            if (null != this.y) {
                json.put("y", (Object)this.y);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.x);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.y);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.x, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.y, serializedIndex);
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
        ByteResult<Double> tmpX = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.x = (Double)tmpX.result;
        deserilizationIndex = tmpX.endIndex;
        ByteResult<Double> tmpY = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.y = (Double)tmpY.result;
        deserilizationIndex = tmpY.endIndex;
        return deserilizationIndex;
    }

    public Double getX() {
        return this.x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return this.y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineDeparturePointCoordinate2D)) {
            return false;
        }
        WaylineDeparturePointCoordinate2D that = (WaylineDeparturePointCoordinate2D)o;
        return Objects.equals(this.x, that.x) && Objects.equals(this.y, that.y);
    }

    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }
}

