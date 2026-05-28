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

public class MappingStripMergedRegion
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer startIndex = 0;
    Integer endIndex = 0;

    public MappingStripMergedRegion() {
    }

    public MappingStripMergedRegion(Integer startIndex, Integer endIndex) {
        if (startIndex != null) {
            this.startIndex = startIndex;
        }
        if (endIndex != null) {
            this.endIndex = endIndex;
        }
    }

    public static MappingStripMergedRegion fromJson(String jsonString) {
        MappingStripMergedRegion tmpValueResult_ = new MappingStripMergedRegion();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.startIndex = jsonObj.getInt("startIndex");
            tmpValueResult_.endIndex = jsonObj.getInt("endIndex");
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
            if (null != this.startIndex) {
                json.put("startIndex", (Object)this.startIndex);
            }
            if (null != this.endIndex) {
                json.put("endIndex", (Object)this.endIndex);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.startIndex);
        return serializedLength += ByteStreamHelper.integerGetLength(this.endIndex);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.startIndex, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.endIndex, serializedIndex);
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
        ByteResult<Integer> tmpStartIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.startIndex = (Integer)tmpStartIndex.result;
        deserilizationIndex = tmpStartIndex.endIndex;
        ByteResult<Integer> tmpEndIndex = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.endIndex = (Integer)tmpEndIndex.result;
        deserilizationIndex = tmpEndIndex.endIndex;
        return deserilizationIndex;
    }

    public Integer getStartIndex() {
        return this.startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getEndIndex() {
        return this.endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MappingStripMergedRegion)) {
            return false;
        }
        MappingStripMergedRegion that = (MappingStripMergedRegion)o;
        return Objects.equals(this.startIndex, that.startIndex) && Objects.equals(this.endIndex, that.endIndex);
    }

    public int hashCode() {
        return Objects.hash(this.startIndex, this.endIndex);
    }
}

