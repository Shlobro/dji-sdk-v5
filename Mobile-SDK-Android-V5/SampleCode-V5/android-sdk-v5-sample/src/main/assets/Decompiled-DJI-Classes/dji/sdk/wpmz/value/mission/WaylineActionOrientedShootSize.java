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

public class WaylineActionOrientedShootSize
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer width = 0;
    Integer height = 0;

    public WaylineActionOrientedShootSize() {
    }

    public WaylineActionOrientedShootSize(Integer width, Integer height) {
        if (width != null) {
            this.width = width;
        }
        if (height != null) {
            this.height = height;
        }
    }

    public static WaylineActionOrientedShootSize fromJson(String jsonString) {
        WaylineActionOrientedShootSize tmpValueResult_ = new WaylineActionOrientedShootSize();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.width = jsonObj.getInt("width");
            tmpValueResult_.height = jsonObj.getInt("height");
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
            if (null != this.width) {
                json.put("width", (Object)this.width);
            }
            if (null != this.height) {
                json.put("height", (Object)this.height);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.width);
        return serializedLength += ByteStreamHelper.integerGetLength(this.height);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.width, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.height, serializedIndex);
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
        ByteResult<Integer> tmpWidth = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.width = (Integer)tmpWidth.result;
        deserilizationIndex = tmpWidth.endIndex;
        ByteResult<Integer> tmpHeight = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.height = (Integer)tmpHeight.result;
        deserilizationIndex = tmpHeight.endIndex;
        return deserilizationIndex;
    }

    public Integer getWidth() {
        return this.width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineActionOrientedShootSize)) {
            return false;
        }
        WaylineActionOrientedShootSize that = (WaylineActionOrientedShootSize)o;
        return Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height);
    }

    public int hashCode() {
        return Objects.hash(this.width, this.height);
    }
}

