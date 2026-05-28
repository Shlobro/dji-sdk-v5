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
import dji.sdk.wpmz.value.mission.WPMLParseError;
import java.util.Objects;
import org.json.JSONObject;

public class WPMLParseErrorMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WPMLParseError value = WPMLParseError.UNKNOWN;

    public WPMLParseErrorMsg() {
    }

    public WPMLParseErrorMsg(WPMLParseError value) {
        if (value != null) {
            this.value = value;
        }
    }

    public static WPMLParseErrorMsg fromJson(String jsonString) {
        WPMLParseErrorMsg tmpValueResult_ = new WPMLParseErrorMsg();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.value = WPMLParseError.find(jsonObj.getInt("value"));
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
            if (null != this.value) {
                json.put("value", this.value.value());
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
        return serializedLength += ByteStreamHelper.integerGetLength(this.value.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.value.value(), serializedIndex);
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
        ByteResult<Integer> tmpValue = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.value = WPMLParseError.find((Integer)tmpValue.result);
        deserilizationIndex = tmpValue.endIndex;
        return deserilizationIndex;
    }

    public WPMLParseError getValue() {
        return this.value;
    }

    public void setValue(WPMLParseError value) {
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
        if (!(o instanceof WPMLParseErrorMsg)) {
            return false;
        }
        WPMLParseErrorMsg that = (WPMLParseErrorMsg)o;
        return Objects.equals(this.value, that.value);
    }

    public int hashCode() {
        return Objects.hash(this.value);
    }
}

