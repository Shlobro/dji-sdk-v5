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

public class WaylineActionAccurateShootPoint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer x = 0;
    Integer y = 0;

    public WaylineActionAccurateShootPoint() {
    }

    public WaylineActionAccurateShootPoint(Integer x, Integer y) {
        if (x != null) {
            this.x = x;
        }
        if (y != null) {
            this.y = y;
        }
    }

    public static WaylineActionAccurateShootPoint fromJson(String jsonString) {
        WaylineActionAccurateShootPoint tmpValueResult_ = new WaylineActionAccurateShootPoint();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.x = jsonObj.getInt("x");
            tmpValueResult_.y = jsonObj.getInt("y");
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
        serializedLength += ByteStreamHelper.integerGetLength(this.x);
        return serializedLength += ByteStreamHelper.integerGetLength(this.y);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.x, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.y, serializedIndex);
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
        ByteResult<Integer> tmpX = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.x = (Integer)tmpX.result;
        deserilizationIndex = tmpX.endIndex;
        ByteResult<Integer> tmpY = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.y = (Integer)tmpY.result;
        deserilizationIndex = tmpY.endIndex;
        return deserilizationIndex;
    }

    public Integer getX() {
        return this.x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return this.y;
    }

    public void setY(Integer y) {
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
        if (!(o instanceof WaylineActionAccurateShootPoint)) {
            return false;
        }
        WaylineActionAccurateShootPoint that = (WaylineActionAccurateShootPoint)o;
        return Objects.equals(this.x, that.x) && Objects.equals(this.y, that.y);
    }

    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }
}

