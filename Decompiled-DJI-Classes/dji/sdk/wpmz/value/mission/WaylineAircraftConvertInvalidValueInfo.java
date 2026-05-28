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

public class WaylineAircraftConvertInvalidValueInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String tag = "";
    String value = "";

    public WaylineAircraftConvertInvalidValueInfo() {
    }

    public WaylineAircraftConvertInvalidValueInfo(String tag, String value) {
        if (tag != null) {
            this.tag = tag;
        }
        if (value != null) {
            this.value = value;
        }
    }

    public static WaylineAircraftConvertInvalidValueInfo fromJson(String jsonString) {
        WaylineAircraftConvertInvalidValueInfo tmpValueResult_ = new WaylineAircraftConvertInvalidValueInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.tag = jsonObj.getString("tag");
            tmpValueResult_.value = jsonObj.getString("value");
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
            if (null != this.tag) {
                json.put("tag", (Object)this.tag);
            }
            if (null != this.value) {
                json.put("value", (Object)this.value);
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
        serializedLength += ByteStreamHelper.stringGetLength(this.tag);
        return serializedLength += ByteStreamHelper.stringGetLength(this.value);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.tag, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.value, serializedIndex);
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
        ByteResult<String> tmpTag = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.tag = (String)tmpTag.result;
        deserilizationIndex = tmpTag.endIndex;
        ByteResult<String> tmpValue = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.value = (String)tmpValue.result;
        deserilizationIndex = tmpValue.endIndex;
        return deserilizationIndex;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineAircraftConvertInvalidValueInfo)) {
            return false;
        }
        WaylineAircraftConvertInvalidValueInfo that = (WaylineAircraftConvertInvalidValueInfo)o;
        return Objects.equals(this.tag, that.tag) && Objects.equals(this.value, that.value);
    }

    public int hashCode() {
        return Objects.hash(this.tag, this.value);
    }
}

