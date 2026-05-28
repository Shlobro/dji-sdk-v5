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

public class BackgroundInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String path = "";
    Integer imageWidth = 0;
    Integer imageHeight = 0;

    public BackgroundInfo() {
    }

    public BackgroundInfo(String path, Integer imageWidth, Integer imageHeight) {
        if (path != null) {
            this.path = path;
        }
        if (imageWidth != null) {
            this.imageWidth = imageWidth;
        }
        if (imageHeight != null) {
            this.imageHeight = imageHeight;
        }
    }

    public static BackgroundInfo fromJson(String jsonString) {
        BackgroundInfo tmpValueResult_ = new BackgroundInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.path = jsonObj.getString("path");
            tmpValueResult_.imageWidth = jsonObj.getInt("imageWidth");
            tmpValueResult_.imageHeight = jsonObj.getInt("imageHeight");
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
            if (null != this.path) {
                json.put("path", (Object)this.path);
            }
            if (null != this.imageWidth) {
                json.put("imageWidth", (Object)this.imageWidth);
            }
            if (null != this.imageHeight) {
                json.put("imageHeight", (Object)this.imageHeight);
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
        serializedLength += ByteStreamHelper.stringGetLength(this.path);
        serializedLength += ByteStreamHelper.integerGetLength(this.imageWidth);
        return serializedLength += ByteStreamHelper.integerGetLength(this.imageHeight);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.path, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.imageWidth, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.imageHeight, serializedIndex);
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
        ByteResult<String> tmpPath = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.path = (String)tmpPath.result;
        deserilizationIndex = tmpPath.endIndex;
        ByteResult<Integer> tmpImageWidth = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.imageWidth = (Integer)tmpImageWidth.result;
        deserilizationIndex = tmpImageWidth.endIndex;
        ByteResult<Integer> tmpImageHeight = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.imageHeight = (Integer)tmpImageHeight.result;
        deserilizationIndex = tmpImageHeight.endIndex;
        return deserilizationIndex;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getImageWidth() {
        return this.imageWidth;
    }

    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    public Integer getImageHeight() {
        return this.imageHeight;
    }

    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackgroundInfo)) {
            return false;
        }
        BackgroundInfo that = (BackgroundInfo)o;
        return Objects.equals(this.path, that.path) && Objects.equals(this.imageWidth, that.imageWidth) && Objects.equals(this.imageHeight, that.imageHeight);
    }

    public int hashCode() {
        return Objects.hash(this.path, this.imageWidth, this.imageHeight);
    }
}

