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

public class WaylineMission
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double createTime = 0.0;
    Double updateTime = 0.0;
    String author = "";

    public WaylineMission() {
    }

    public WaylineMission(Double createTime, Double updateTime, String author) {
        if (createTime != null) {
            this.createTime = createTime;
        }
        if (updateTime != null) {
            this.updateTime = updateTime;
        }
        if (author != null) {
            this.author = author;
        }
    }

    public static WaylineMission fromJson(String jsonString) {
        WaylineMission tmpValueResult_ = new WaylineMission();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.createTime = jsonObj.getDouble("createTime");
            tmpValueResult_.updateTime = jsonObj.getDouble("updateTime");
            tmpValueResult_.author = jsonObj.getString("author");
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
            if (null != this.createTime) {
                json.put("createTime", (Object)this.createTime);
            }
            if (null != this.updateTime) {
                json.put("updateTime", (Object)this.updateTime);
            }
            if (null != this.author) {
                json.put("author", (Object)this.author);
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
        serializedLength += ByteStreamHelper.doubleGetLength(this.createTime);
        serializedLength += ByteStreamHelper.doubleGetLength(this.updateTime);
        return serializedLength += ByteStreamHelper.stringGetLength(this.author);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.createTime, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.updateTime, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.author, serializedIndex);
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
        ByteResult<Double> tmpCreateTime = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.createTime = (Double)tmpCreateTime.result;
        deserilizationIndex = tmpCreateTime.endIndex;
        ByteResult<Double> tmpUpdateTime = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.updateTime = (Double)tmpUpdateTime.result;
        deserilizationIndex = tmpUpdateTime.endIndex;
        ByteResult<String> tmpAuthor = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.author = (String)tmpAuthor.result;
        deserilizationIndex = tmpAuthor.endIndex;
        return deserilizationIndex;
    }

    public Double getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Double createTime) {
        this.createTime = createTime;
    }

    public Double getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Double updateTime) {
        this.updateTime = updateTime;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineMission)) {
            return false;
        }
        WaylineMission that = (WaylineMission)o;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.author, that.author);
    }

    public int hashCode() {
        return Objects.hash(this.createTime, this.updateTime, this.author);
    }
}

